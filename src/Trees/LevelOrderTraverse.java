package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraverse {

	public static void levelOrder(TreeNode1 root) {
		
		//create empty queue implements with linkedlist
		Queue<TreeNode1> queue=new LinkedList();
		
		//add root node to queue
		queue.add(root);
		
		//remove or popup elements until the queue is empty
		while(!queue.isEmpty()) {
			//remove the node
			TreeNode1 treeNode=queue.poll();
			
			//print the node which is removed from queue
			System.out.print(treeNode.val+"->");
			
			//add children to queue if exist
			if(treeNode.left!=null) {
				
				queue.add(treeNode.left);
			}
			
			if(treeNode.right!=null) {
				
				queue.add(treeNode.right);
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		
		
		TreeNode1 root=new TreeNode1(2);
		root.left=new TreeNode1(4);
		root.right=new TreeNode1(1);
		root.left.left=new TreeNode1(3);
		root.left.right=new TreeNode1(5);
		root.right.left=new TreeNode1(7);
		root.right.right=new TreeNode1(9);
		
		System.out.println("============== level order traversal ============");
		levelOrder(root);
	}

}
