package project1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AdjacencyMatrix extends DirectedGraph
{
	int[][] amdg; 
	public boolean existsEdge(int i, int j)
	{
		return (amdg[i][j]>0);
	}
	public void putEdge(int i, int j, int w)
	{
		if(amdg[i][j]==0)
		{
			amdg[i][j]=w;
			outDegree[i]+=1;
			inDegree[j]+=1;
			edgeCount+=1;
		}
	}
	public void removeEdge(int i, int j)
	{
		if(amdg[i][j]>0)
		{
			amdg[i][j]=0;
			outDegree[i]-=1;
			inDegree[j]-=1;
			edgeCount-=1;
		}
	}
	public boolean areAdjacent(int i, int j)
	{
		return existsEdge(i,j);
	}
	public int[] adjacentVertices(int i)
	{
		int count=0;
		for(int y=0; y<vertexCount; y++)
		{
			if(existsEdge(i,y))
			{
				count++;
			}
		}
		int [] temp = new int[count];
		count=0;
		for(int y=0; y<vertexCount; y++)
		{
			if(existsEdge(i,y))
			{
				temp[count]=y;
				count++;
			}
		}
		return temp;
	}
	public void createMatrix(String x)
	{		
		File fileIn = new File(x);
		Scanner myFileIn;
		{
			try
			{
				myFileIn= new Scanner(fileIn);
				vertexCount = myFileIn.nextInt();
				amdg= new int[vertexCount][vertexCount];
				outDegree = new int[vertexCount];
				inDegree = new int[vertexCount];
				while(myFileIn.hasNext())
				{
					int source = myFileIn.nextInt();
					int dest = myFileIn.nextInt();
					int w = myFileIn.nextInt();
					Edge e= new Edge(source,dest,w);
					putEdge(e);
				}
				myFileIn.close();
			}catch (FileNotFoundException e)
			{
				System.out.println("File: "+ x + " is not found");
			}
		}
	}
}
