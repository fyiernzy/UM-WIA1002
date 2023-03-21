package Lab7.Q3;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	
	public void run() {
		String exp = "4+5*7"; 
		// (5*4+8)/7+2 // 4+5*7
		BinaryTree<Character> tree = new BinaryTree<>();
		for(char ch : exp.toCharArray()) {
			if(ch != '(' && ch != ')')
				tree.add(ch);
		}
		
		System.out.println("The number of element in the tree : " + tree.getSize());
		System.out.print("The tree elements - INORDER : ");
		tree.inOrder();
		System.out.print("The tree elements - PREORDER : ");
		tree.preOrder();
		System.out.print("The tree elements - POSTRDER : ");
		tree.postOrder();
		System.out.print("The tree elements - LEVEL ORDER : ");
		tree.levelOrder();
		
	}
}
