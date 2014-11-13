public class CircNode{
	private CircNode previousNode;
	private CircNode nextNode;
	private int value;
	private boolean isValid = true;

	public CircNode(int value, CircNode previousNode, CircNode nextNode){
		this.value = value;
		this.previousNode = previousNode;
		this.nextNode = nextNode;
	}

	public CircNode(int value){
		this.value = value;
	}

	public CircNode getPrevious(){
		return previousNode;
	}

	public void setPrevious(CircNode newPreviousNode){
		previousNode = newPreviousNode;
	}

	public CircNode getNext(){
		return nextNode;
	}

	public void setNext(CircNode newNextNode){
		nextNode = newNextNode;
	}

	public int value(){
		return value;
	}

	public void makeInvalid(){
		isValid = false;
	}
	public boolean isValid(){
		return isValid;
	}
}