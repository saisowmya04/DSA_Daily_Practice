package Trees;

public class BST {
	
	
	public static TreeNode insert(TreeNode root, int value) {
		if(root==null) {
			return new TreeNode(value);
		}
		if(value<root.val) {
			root.left=insert(root.left,value);
		}
		if(value>root.val) {
			root.right=insert(root.right,value);
		}
		return root;
	}
	
	//to get the sorted order we should write inorder traversal 
	public static void inOrder(TreeNode root) {
		//base condition
		if(root==null) {
			return;
		}
		//subfunctions
		inOrder(root.left);
		System.out.print(root.val+"->");
		inOrder(root.right);
	}

	public static void main(String[] args) {
		
		TreeNode root=null;
		root=insert(root,50);
		root=insert(root,30);
		root=insert(root,70);
		root=insert(root,20);
		root=insert(root,40);
		root=insert(root,60);
		root=insert(root,80);
		System.out.println("InOrder traversal");
		inOrder(root);
		
		
		
	}

}
