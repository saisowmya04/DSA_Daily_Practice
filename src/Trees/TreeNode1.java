package Trees;

public class TreeNode1 {
	
	int val;
	TreeNode1 left;
	TreeNode1 right;
	
	public TreeNode1(int val) {
		this.val=val;
		this.left=null;
		this.right=null;
	}
	
	
	public static void main(String[] args) {
		TreeNode1 root=new TreeNode1(2);
		root.left=new TreeNode1(4);
		root.right=new TreeNode1(1);
		root.left.left=new TreeNode1(3);
		root.left.right=new TreeNode1(5);
		root.right.left=new TreeNode1(7);
		root.right.right=new TreeNode1(9);
		
		System.out.println(root.left);
		System.out.println(root.left.val);
		System.out.println(root.right.right.val);
	
	}

}
