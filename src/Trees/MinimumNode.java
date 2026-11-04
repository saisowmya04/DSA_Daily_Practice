package Trees;

public class MinimumNode {
	
	public static int minNode(TreeNode root) {
		
		//base condition
		if(root==null) {
			return Integer.MAX_VALUE;
		}
		int leftMin=minNode(root.left);
		int rightMin=minNode(root.right);
		
		return Math.min(root.val, Math.min(leftMin, rightMin));
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
		
		System.out.println("Minimum Node: "+minNode(root));

	}

}
