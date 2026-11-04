package Trees;

public class CountTreeNodes {
	
	public static int countNodes(TreeNode root) {
		
		//base condition
		if(root==null) {
			return 0;
		}
		return 1+countNodes(root.left)+countNodes(root.right);
	}

	public static void main(String[] args) {
		TreeNode root=new TreeNode(2);
		root.left=new TreeNode(4);
		root.right=new TreeNode(6);
		root.left.left=new TreeNode(7);
		root.left.right=new TreeNode(9);
		root.right.left=new TreeNode(5);
		root.right.left.left=new TreeNode(3);
		root.right.left.right=new TreeNode(1);
		
		System.out.println("Nodes count: "+countNodes(root));

	}

}
