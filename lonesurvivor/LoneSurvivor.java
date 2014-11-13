public class LoneSurvivor{

	public static void main(String[] args) {
		int players;
		int passesPerTurn;
		CircNode firstNode = new CircNode(0);
		CircNode lastNode = firstNode;
		CircNode cursor = firstNode;
		int survivor = 0;

		if (args.length != 2) {
			throw new IllegalArgumentException();
		}

		try{
			players = Integer.parseInt(args[0]);	
			passesPerTurn = Integer.parseInt(args[1]);
		}
		catch (NumberFormatException e){
			throw new IllegalArgumentException();
		}

		//if there is only 1 player, they automatically are the survivor
		if (players == 1) {
			survivor = 1;
		}
		else if (players == 2) {
			if (passesPerTurn % 2 == 0){
				survivor = 1;
			}
			else{
				survivor = 0;
			}
		}
		else{
			for (int i = 1; i < players; i++ ) {
				CircNode newPlayerNode = new CircNode(i);
				
				lastNode.setNext(newPlayerNode);
				newPlayerNode.setPrevious(lastNode);
				lastNode = newPlayerNode;
				
				if (i == players - 1) {
					newPlayerNode.setNext(firstNode);
					firstNode.setPrevious(newPlayerNode);
				}
			}
			

			//gun is passed until all players eliminated
			while(players > 1){
				int passesThisTurn = 0;
				
				while(passesThisTurn < passesPerTurn){
					cursor = cursor.getNext();
					if (cursor.isValid()) {
						passesThisTurn++;
					}
					if (passesThisTurn == passesPerTurn) {
						cursor.makeInvalid();
						players--;
						//find next valid player, point the cursor to them
					}
				}
			}
		}
		System.out.println(survivor);
	}
}