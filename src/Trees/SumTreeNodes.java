package Trees;

public class SumTreeNodes {
	
	public static int sumNodes(TreeNode root) {
		
		//base condition
		if(root==null) {
			return 0;
		}
		return root.val+sumNodes(root.left)+sumNodes(root.right);
	}
	
	
	public static void main(String args[]) {
		TreeNode root=new TreeNode(2);
		root.left=new TreeNode(4);
		root.right=new TreeNode(6);
		root.left.left=new TreeNode(7);
		root.left.right=new TreeNode(9);
		root.right.left=new TreeNode(5);
		root.right.left.left=new TreeNode(3);
		root.right.left.right=new TreeNode(1);
		
		System.out.println("Sum: "+sumNodes(root));
	}

}
