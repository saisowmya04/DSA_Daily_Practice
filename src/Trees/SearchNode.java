package Trees;

public class SearchNode {
	
	public static boolean searchNode(TreeNode root,int target) {
		
		//base condition
		if(root==null) {
			return false;
			
		}
		if(root.val==target) {
			return true;
		}
		return searchNode(root.left,target)||searchNode(root.right,target);
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
		
		int target=17;
		if(searchNode(root,target)) {
			System.out.println("found element " +target);
		}
		else {
			System.out.println("No element found");
		}
	}

}
