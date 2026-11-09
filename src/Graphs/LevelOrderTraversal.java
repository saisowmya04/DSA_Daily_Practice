package Graphs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class LevelOrderTraversal {
	
	int adjMatrix[][];
	int vertices;
	
	//create different connections to pass no of vertices
	public LevelOrderTraversal(int vertices) {
		this.vertices=vertices;
		adjMatrix=new int[vertices+1][vertices+1];
	}
	
	//create edge
	public void addEdge(int i,int j) {
		adjMatrix[i][j]=1;
		adjMatrix[j][i]=1;
	}
	
	//remove edge
	public void removeEdge(int i, int j) {
		adjMatrix[i][j]=0;
		adjMatrix[j][i]=0;
	}
	
	//add new vertex
	public void addVertex() {
		int newAdjMatrix[][]=new int[vertices+1][vertices+1];
		for(int i=0;i<vertices;i++) {
			for(int j=0;j<vertices;j++) {
				newAdjMatrix[i][j]=adjMatrix[i][j];
				
			}
			adjMatrix=newAdjMatrix;
			vertices++;
		}
	}
	
	//remove vertex
	public void removeVertex(int v) {
		int newAdjMatrix[][]=new int[vertices-1][vertices-1];
		for(int i=0;i<vertices;i++) {
			for(int j=0;j<vertices;j++) {
				if(i!=v && j!=v) {
					newAdjMatrix[i][j]=adjMatrix[i][j];
				}
			}
			adjMatrix=newAdjMatrix;
			vertices--;
		}
	}

	public void levelOrder(int startVertex) {
		Queue<Integer> queue=new LinkedList<>();
		Set<Integer> visited=new HashSet();
		
		queue.add(startVertex);
		visited.add(startVertex);
		
		while(!queue.isEmpty()) {
			
			int currentVertex=queue.poll();
			System.out.print(currentVertex+" ");
			
			//add all unvisited vertices
			for(int i=0;i<vertices;i++) {
				if(adjMatrix[currentVertex][i] == 1 && !visited.contains(i)) {
					queue.add(i);
					visited.add(i);
				}
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		LevelOrderTraversal lt=new LevelOrderTraversal(8);
		lt.addEdge(1,2);
		lt.addEdge(1,3);
		lt.addEdge(1,4);
		lt.addEdge(2,3);
		lt.addEdge(2,7);
		lt.addEdge(4,5);
		lt.addEdge(4,6);
		lt.addEdge(5,6);
		lt.addEdge(6,4);
		lt.addEdge(6,5);
		lt.addEdge(7,2);
		
		System.out.println("level order traversal");
		lt.levelOrder(1);
		
		
		

	}

}
