import java.util.Collection;
import java.util.Iterator;

public class BinaryTree implements Collection {
	private Object rootData = null;
	private BinaryTree leftSubtree = null;
	private BinaryTree rightSubtree = null;
	private BinaryTree parent = null;
	private BinaryTree leftMostNode = null;
	private boolean containsNodes = false;
	private int numberOfNodes = 0;
	
	public BinaryTree() {

	}

	public BinaryTree (Object rootData) {
		this.rootData = rootData;
		containsNodes = true;
		numberOfNodes = 1;
	}

	public void setLeftMost(BinaryTree leftMostNode){
		this.leftMostNode = leftMostNode;
	}

	public static BinaryTree createFromData(Object rootData, BinaryTree leftSubtree, BinaryTree rightSubtree) {
		BinaryTree newTree = new BinaryTree(rootData);

		newTree.setLeftSubtree(leftSubtree);
		newTree.setRightSubtree(rightSubtree);

		newTree.containsNodes = leftSubtree.containsNodes() || rightSubtree.containsNodes();
		newTree.leftMostNode = leftSubtree.getLeftMost();

		return newTree;
	}

	/**Sets the left Subtree attached to the root node*/
	public void setLeftSubtree(BinaryTree leftSubtree) {
		this.leftSubtree = leftSubtree;
	}

	/**Sets the right subtree attached to the root node*/
	public void setRightSubtree(BinaryTree rightSubtree) {
		this.rightSubtree = rightSubtree;
	}

	/**Adds a new node to the binary tree. Returns true if the tree changed as a result of the add.*/
	public boolean add(Object objectToAdd) {
		if (rootData == null) {
			rootData = objectToAdd;
			leftMostNode = this;
			containsNodes = true;
		} else {
			BinaryTree newleftMost = new BinaryTree(objectToAdd);
			newleftMost.setParent(leftMostNode);
			leftMostNode.setLeftSubtree(newleftMost);

		}
		numberOfNodes++;

		//tree will always change when a new node is added
		return true;
	}

	/**Adds each of the elements in a collection to the tree.*/
	public boolean addAll(Collection objectsToAdd) {
		for (Object objectToAdd : objectsToAdd){
			add(objectToAdd);
		}
		containsNodes = true;

		//tree will always change when a new node is added
		return true;
	}

	/**Removes all of the nodes from the tree.*/
	public void clear() {
		leftSubtree = null;
		rightSubtree = null;
	}

	/**Returns true if the tree contains the specified element.*/
	public boolean contains(Object o) {
		throw new UnsupportedOperationException();
		/**
		for (Object node : this) {
			if (node.getData.equals(o)) {
				return true;
			}
		}
		*/
	}

	/**Returns true if the tree contains all of the elements in a collection.*/
	public boolean containsAll(Collection c){
		boolean containsAll = false;



		return containsAll;
	}

	/**Compares two trees to determine if they are equivalent.*/
	public boolean equals(BinaryTree treeToCompare) {
		boolean treesEqual = false;



		return treesEqual;
	}

	/**Returns the hashcode value for the tree.*/
	public int hashCode() {
		throw new UnsupportedOperationException();
	}

	/**Returns true if the tree contains no nodes.*/
	public boolean isEmpty() {
		return rootData == null;
	}

	/**Returns a preorder iterator over the tree.*/
	public Iterator iterator() {
		return new BinaryTreeIterator(this);
	}

	/**Removes a single node containing an instance of the specified object. Returns true if the collection changed as a result.*/
	public boolean remove(Object objectToRemove) {
		leftMostNode = leftMostNode.getParent();

		//tree will always change when a new node is added
		return true;
	}

	/**Removes the nodes from the tree that are objects contained within the specified collection.*/
	public boolean removeAll() {
		boolean treeChanged = false;

		return treeChanged;
	}

	/**Returns the number of nodes currently in the tree.*/
	public int size() {
		return numberOfNodes;
	}

	/**Converts the binary tree into an array.*/
	public Object[] toArray() {
		BinaryTree[] result = new BinaryTree[numberOfNodes];
	
		return result;
	}

	/**Converts the binary tree into an array.*/
	public Object[] toArray(Object[] a) {
		BinaryTree[] result = new BinaryTree[numberOfNodes];

		return result;
	}

	/**Returns whether or not the tree contains any nodes*/
	public boolean containsNodes() {
		return containsNodes;
	}

	/**Keeps all nodes in the tree who's data is also in the passed in Collection, removing the rest*/
	public boolean retainAll(Collection c) {
		throw new UnsupportedOperationException();
	}

	/**Removes all nodes in the tree who's data is also in the passed in collection*/
	public boolean removeAll(Collection c) {
		throw new UnsupportedOperationException();
	}

	/**Returns a reference to the left-most node in the tree, for the purpose of adding a new node*/
	public BinaryTree getLeftMost() {
		return leftMostNode;
	}

	/**Changes the parent node of the given node*/
	public void setParent(BinaryTree parent){
		this.parent = parent;
	}

	/**Returns the private data contained within the node*/
	public Object getData() {
		return rootData;
	}

	/**Returns a reference to the parent node*/
	public BinaryTree getParent(){
		return parent;
	}
}  