public class CircularList{
	private CircNode cursor;
	private int size = 0;

	public CircularList(){

	}
	/**returns the integer most recently added to the list*/
	public CircNode get(){
		return cursor;
	}

	/**adds a new value to the circular list*/
	public void add(int value){
		CircNode newnode = new CircNode(value);

		if(size == 0){
			newnode.setPrevious(newnode);
			newnode.setNext(newnode);
			cursor = newnode;
		}
		else if (size = 1){
			cursor.setNext(newnode);
			cursor.setPrevious(newnode);

			newnode.setNext(cursor);
			newnode.setPrevious(cursor);
			cursor = newnode;
		}
		else{
			cursor.getNext().setPrevious(newnode);
			newnode.setNext(cursor.getNext());

			cursor.setNext(newnode);
			newnode.setPrevious(cursor);

			cursor = newnode;
		}

		size++;
	}
}