package Graphs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Graph {
	
	int adjMatrix[][];
	int vertices;
	
	//create different connections to passno of vertices
	public Graph(int vertices) {
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
	
	//display the vertices
	public void display() {
		for(int i=0;i<vertices;i++) {
			for(int j=0;j<vertices;j++) {
				System.out.print(adjMatrix[i][j]+" ");
			}
			System.out.println();
		}
	}

	
	
	public static void main(String[] args) {
		Graph g=new Graph(5);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 3);
		g.addEdge(2, 4);
		
		
		
		System.out.println("--------- display graph matrix ------------");
		g.display();
		
		
		
		

	}

}
