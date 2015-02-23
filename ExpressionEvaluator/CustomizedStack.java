public class CustomizedStack {
	private StackNode topOfStack = new StackNode();
	private int itemsInStack = 0;

	/**Instantiates an empty stack*/
	public CustomizedStack(){
	}

	/**Adds a new number to the top of the stack*/
	public void push(int nodeValue) {
		StackNode newTop = new StackNode(nodeValue);

		if (itemsInStack > 0) {
			newTop.setPrevious(topOfStack);
		} else {
			newTop.setPrevious(null);
		}

		topOfStack = newTop;
		itemsInStack++;
	}

	/**Removes the top value from the stack and returns it */
	public int pop() throws IndexOutOfBoundsException {
		if (itemsInStack == 0) {
			throw new IndexOutOfBoundsException();
		}

		StackNode topNode = topOfStack;
		topOfStack = topOfStack.getPrevious();
		itemsInStack--;
		
		return topNode.value();
	}

	public int size() {
		return itemsInStack;
	}
}
