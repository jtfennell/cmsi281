import java.util.Collection;

public class BinaryTree implements Collection {
	private TreeNode root = null;
	private TreeNode parentNode = null;
	private TreeNode leftMostNode = null;
	private boolean containsNodes = false;
	
	public BinaryTree() {

	}

	public BinaryTree (Object rootData) {
		root = new TreeNode(rootData);
		containsNodes = true;
	}

	public static createFromData(Object rootData, BinaryTree leftSubtree, BinaryTree rightSubtree) {
		root = new TreeNode(rootData);

		root.setLeftSubtree(leftSubtree);
		root.setRightSubtree(rightSubtree);

		this.containsNodes = leftSubtree.containsNodes() || rightSubtree.containsNodes();
		this.leftMostNode = leftSubtree.getLeftMost();
	}

	/**
	 Adds a new node to the binary tree. Returns true if the tree changed as a result of the add.
	*/
	public boolean add(Object objectToAdd) {
		if (root == null) {
			root = new TreeNode();
			root.setData(objectToAdd);
			leftMostNode = root;
			containsNodes = true;
		}else {
			newleftSubtree = new BinaryTree(objectToAdd);
			newleftSubtree.
		}
	}

	/**
	Adds each of the elements in a collection to the tree.
	*/
	public boolean addAll(objectsToAdd) {
		for (Object objectsToAdd : objectsToAdd){
			this.add(objectToAdd);
		}
		containsNodes = true;
	}

	/**
	Removes all of the nodes from the tree.
	*/
	public void clear() {
		for (Object objectsToAdd : objectsToAdd){
			this.remove(objectToAdd);
		}
		containsNodes = false;

	}

	/**
	Returns true if the tree contains the specified element.
	*/
	public boolean contains(Object o) {

	}

	/**
	Returns true if the tree contains all of the elements in a collection.
	*/
	public boolean containsAll(Collection c){

	}

	/**
	Compares two trees to determine if they are equivalent.
	*/
	public boolean equals(BinaryTree treeToCompare) {

	}

	/**
	Returns the hashcode value for the tree.
	*/
	public int hashCode() {

	}

	/**
	Returns true if the tree contains no nodes.
	*/
	public boolean isEmpty() {

	}

	/**
	Returns a preorder iterator over the tree.
	*/
	public Iterator iterator() {
		return new BinaryTreeIterator(this);
	}

	/**
	Removes a single node containing an instance of the specified object. Returns true if the collection changed as a result.
	*/
	public boolean remove() {

	}

	/**
	Removes the nodes from the tree that are objects contained within the specified collection.
	*/
	public boolean removeAll() {

	}

	/** 
	Retains only the elements in this collection that are in the specified collection.
	*/
	public boolean retainAll() {

	}

	/**
	Returns the number of nodes currently in the tree.
	*/
	public int size() {

	}

	/**
	Converts the binary tree into an array.
	*/
	public Object[] toArray() {

	}

	/**
	Converts the binary tree into an array.
	*/
	public <T>T[] toArray() {

	}

	/**
	Returns whether or not the tree contains any nodes
	*/
	public boolean containsNodes() {
		return containsNodes;
	}

	public BinaryTree getLeftMost() {
		return leftMostNode;
	}

	public void setParent(BinaryTree parentNode){
		this.parentNode = parentNode;
	}
}
    
