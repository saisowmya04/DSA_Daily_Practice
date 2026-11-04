package Trees;

public class MaximumNode {
	
	public static int maxNode(TreeNode root) {
		
		//base condition
		if(root==null) {
			return Integer.MIN_VALUE;
		}
		int leftMax=maxNode(root.left);
		int rightMax=maxNode(root.right);
		
		return Math.max(root.val, Math.max(leftMax, rightMax));
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
		
		System.out.println("Maximum Node: "+maxNode(root));

	}

}
