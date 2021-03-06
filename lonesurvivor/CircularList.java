/**Custom implementation of a Circular List that stores integer elements*/
public class CircularList {
    private CircNode cursor;
    private int size = 0;

    public CircularList(){

    }

    /**Returns the integer indicated by the cursor*/
    public int get() {
        return cursor.value();
    }

    /**Adds a new value to the circular list*/
    public boolean add(int value) {
        CircNode newnode = new CircNode(value);

        if(size == 0) {
            newnode.setPrevious(newnode);
            newnode.setNext(newnode);
            cursor = newnode;
        } else if (size == 1) {
            cursor.setNext(newnode);
            cursor.setPrevious(newnode);

            newnode.setNext(cursor);
            newnode.setPrevious(cursor);
            cursor = newnode;
        } else {
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

    /**Removes the integer indicated by the current position of the cursor*/
    public boolean remove() {
        if (size == 0) {
            throw new NullPointerException("There are no items in the list");
        } else if (size == 1) {
            cursor = null;
        } else {
            CircNode previous = cursor.getPrevious();
            CircNode next = cursor.getNext();

            next.setPrevious(previous);
            previous.setNext(next);

            cursor = next;
        }
        
        size--;

        //collection will have always changed as long as there is at least one item in the list
        return true;
    }

    /**Eeturns the number of elements in the circular list*/
    public int size() {
        return size;
    }

    /**Moves the cursor to the next node in the list */
    public void advanceCursor() {
        cursor = cursor.getNext();
    }
}