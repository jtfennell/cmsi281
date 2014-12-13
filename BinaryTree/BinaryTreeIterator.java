import java.util.AbstractCollection;
import java.util.Iterator;

public class BinaryTreeIterator implements Iterator {
	private BinaryTree targetTree;
	private int numberOfNodesSeen = 0;
	private BinaryTree currentNode;

	public BinaryTreeIterator (BinaryTree targetTree){
		this.targetTree = targetTree;

		if (targetTree.size() >= 1) {
			currentNode = targetTree.getLeftMost();
		}
	}

	public boolean hasNext () {

		boolean hasNext = false;

		if (targetTree.size() < 2) {
			hasNext = false;
		}else if (targetTree) {

		}

		return hasNext;
	}

	public BinaryTree next() {
		BinaryTree nextTreeNode = new BinaryTree();

		return nextTreeNode;
	}

	public void remove() {
		
	}
}