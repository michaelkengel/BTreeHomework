
public class Driver {

	public static void main(String[] args) {
		BinaryTree Tree = new BinaryTree();
		
		// Building tree here
		
		Tree.addNode(57);
		Tree.addNode(34);
		Tree.addNode(68);
		Tree.addNode(22);
		Tree.addNode(44);
		Tree.addNode(64);
		Tree.addNode(78);
		Tree.addNode(75);
		Tree.addNode(65);
		Tree.addNode(41);
		System.out.println("Added all nodes \n");
		
		System.out.println("In Order:");
		Tree.inOrderTraversal(Tree.root);
		System.out.println("\n");
		System.out.println("Post Order:");
		Tree.postOrderTraversal(Tree.root);
		System.out.println("\n");
		System.out.println("Pre Order");
		Tree.preOrderTraversal(Tree.root);
	}
}
