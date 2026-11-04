package Trees;

public class TreeNode {
	
	int val;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int val) {
		this.val=val;
		this.left=null;
		this.right=null;
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
		
		System.out.println(root.left);
		System.out.println(root.left.val);
		System.out.println(root.right.right.val);
	

	}

}
