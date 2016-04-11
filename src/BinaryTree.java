public class BinaryTree {

	Node root;
	int numOfNodes;

	// Instantiate
	public BinaryTree(){
		root = null;
		numOfNodes = 0;
	}
	
	// Add node method
	public boolean addNode(int numToAdd){
		
		Node newNodeToAdd = new Node();
		newNodeToAdd.setData(numToAdd);
		
		if (root == null){
			root = newNodeToAdd;
			numOfNodes++;
			System.out.println("Set head");
		}
		else{
			// Run search first
			
			if (searchTree(numToAdd, root)){
				System.out.println("Already in tree");
				return false;
			}
			
			Node walker = new Node();
			walker = root;
	
			while (walker != null){
				if (numToAdd > walker.getData()){
					if (walker.getRightChild() == null){
						walker.setRightChild(newNodeToAdd);
						numOfNodes++;
						return true;
					}
					else walker = walker.getRightChild();
				}
				else{
					if (walker.getLeftChild() == null){
						walker.setLeftChild(newNodeToAdd);
						numOfNodes++;
						return true;
					}
					else walker = walker.getLeftChild();
				}
			}		
		}
		return false;
	}

	// Search tree
	public boolean searchTree(int numToFind, Node walker){
		if (walker == null){
			return false;
		}
		if (numToFind == walker.getData()){
			System.out.println("Found");
			return true;
		}
		else {
			if (numToFind > walker.getData()){
				return searchTree(numToFind, walker.getRightChild());
			}
			else{
				return searchTree(numToFind, walker.getLeftChild());
			}
		}
	}

	
	public void inOrderTraversal(Node n){
		// This method will visit left node, node, then right node
		if (n == null){
			return;
		}
		inOrderTraversal(n.getLeftChild());
		System.out.println(n.getData());
		inOrderTraversal(n.getRightChild());	
	}
	
	public void postOrderTraversal(Node n){
		// This method will visit the children before the node
		if (n == null){
			return;
		}
		inOrderTraversal(n.getLeftChild());
		inOrderTraversal(n.getRightChild());
		System.out.println(n.getData());
	}
	
	public void preOrderTraversal(Node n){
		// This method will print root, then left tree followed by right 
		// Left to right
		if (n == null){
			return;
		}
		System.out.println(n.getData());
		inOrderTraversal(n.getLeftChild());
		inOrderTraversal(n.getRightChild());
	}
	
	
		
}
