public class LoneSurvivor{

	public static void main(String[] args) {
		CircularList players = new CircularList();
		int numPlayers;
		int passesPerTurn;
		int survivor;

		if (args.length != 2) {
			throw new IllegalArgumentException();
		}

		try{
			numPlayers = Integer.parseInt(args[0]);	
			passesPerTurn = Integer.parseInt(args[1]);
		}
		catch (NumberFormatException e){
			throw new IllegalArgumentException();
		}

		//if there is only 1 player, they automatically are the survivor
		if (numPlayers == 1) {
			survivor = 0;
		}

		//if there are only 2 players, the winner is the mod 2 of the passes per turn
		else if (numPlayers == 2) {
			if (passesPerTurn % 2 == 0){
				survivor = 1;
			}
			//if there is only one player, then that player is the survivor
			else{
				survivor = 0;
			}
		}
		else{
			for (int i = 0; i < numPlayers; i++ ) {
				players.add(i);
			}
			//resets the cursor to the first item entered
				players.advanceCursor();

			while (players.size() > 1){
				for (int i = 0; i < passesPerTurn ; i++) {
					players.advanceCursor();
				}
				players.remove();
			}

			survivor = players.get();
		}
		System.out.println(survivor);
	}
}