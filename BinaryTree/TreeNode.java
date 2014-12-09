public class TreeNode {
	private Object nodeData;
	private BinaryTree leftSubtree;
	private BinaryTree rightSubtree;

	public TreeNode (Object nodeData) {
		this.nodeData = nodeData;
	}

	public void setData (Object nodeData) {
		this.nodeData = nodeData;
	}

	public void setLeftSubtree (BinaryTree leftSubtree) {
		this.leftSubtree = leftSubtree;
	}

	public void setRightSubtree (BinaryTree rightSubtree) {
		this.rightSubtree = rightSubtree;
	}
}