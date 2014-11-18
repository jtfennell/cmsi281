/**Custom implementation of a Circular List that stores integer elements*/
public class CircularList{
	private CircNode cursor;
	private int size = 0;

	public CircularList(){

	}

	/**returns the integer indicated by the cursor*/
	public int get(){
		return cursor.value();
	}

	/**adds a new value to the circular list*/
	public boolean add(int value){
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
		//collection will have always changed, as the circular list accepts duplicates
		return true;
	}

	/**removes the integer indicated by the current position of the cursor*/
	public void remove(){
		if (size == 0) {
			throw new NullPointerException("There are no items in the list");
		}
		else if (size == 1){
			cursor = null;
		}
		else{
			CircNode previous = cursor.getPrevious();
			CircNode next = cursor.getNext();

			next.setPrevious(previous);
			previous.setNext(next);

			cursor = previous;
		}
		size--;
	}

	/**returns the number of elements in the circular list*/
	public int size(){
		return size;
	}
}