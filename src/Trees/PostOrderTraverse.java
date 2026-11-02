package Trees;

public class PostOrderTraverse {
	
	public static void postOrder(TreeNode root) {
		
		//base condition
		if(root==null) {
			return;
		}
		
		//sub problem(left,right,root)
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.val+"->");
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
		
		postOrder(root);

	}

}
