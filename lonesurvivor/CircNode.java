/**A custom node for a doubly-linked, circular list of integers */
public class CircNode{
    private CircNode previousNode;
    private CircNode nextNode;
    private int value;
    

    public CircNode(int value, CircNode previousNode, CircNode nextNode){
        this.value = value;
        this.previousNode = previousNode;
        this.nextNode = nextNode;
    }

    public CircNode(int value){
        this.value = value;
    }

    /**Returns the pointer to the previous node in the list*/
    public CircNode getPrevious(){
        return previousNode;
    }

    /**Changes the reference to the previous node in the list*/
    public void setPrevious(CircNode newPreviousNode){
        previousNode = newPreviousNode;
    }

    /**Returns the pointer to the next node in the list */
    public CircNode getNext(){
        return nextNode;
    }

    /**changes the reference to the next node in the list*/
    public void setNext(CircNode newNextNode){
        nextNode = newNextNode;
    }

    /**returns the value of a node*/
    public int value(){
        return value;
    }
}