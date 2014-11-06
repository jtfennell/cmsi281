public class StackNode{
	StackNode previousNode;
	int value;

	/**Constructor that sets both the value and the previous Node */
	public StackNode(int value, StackNode previousNode){
		this.value = value;
		this.previousNode = previousNode;
	}
	/**Constructor that sets only the value of the Node*/
	public StackNode (int value){
		this.value = value;
	}
	/**Instantiates an empty stack*/
	public StackNode(){

	}

	/**Sets the reference to the previous Node*/
	public void setPrevious(StackNode previousNode){
		this.previousNode = previousNode;
	}
	
	/**Returns the reference to the node underneath in the stack*/
	public StackNode getPrevious(){
	return previousNode;
	}
	/**returns the integer value of the Node*/
	public int value(){
		return value;
	}

}