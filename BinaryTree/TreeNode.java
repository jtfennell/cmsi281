public class TreeNode {
	private Object value;
	private TreeNode leftChild = null;
	private TreeNode rightChild = null;
	private TreeNode parentNode = null;

	public TreeNode (Object value) {

	}

	public void setRightChild (TreeNode rightChild) {
		this.rightChild = rightChild;
	}

	public void setLeftChild (TreeNode rightChild) {
		this.leftChild = leftChild;
	}

	public TreeNode getParent () {
		return parentNode;
	}
}