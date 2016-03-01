package project1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public abstract class List extends DirectedGraph
{
	ArrayList<Edge> [] AL;
	public int[] adjacentVertices(int i)
	{
		int [] temp = new int[AL[i].size()];
		int hold =0;
		for(int y=0; y<vertexCount; y++)
		{
			if(existsEdge(i,y))
			{
				temp[hold]=y;
				hold++;
			}
		}
		return temp;
	}
	public boolean areAdjacent(int i, int j)
	{
		return existsEdge(i,j);
	}
	public boolean existsEdge(int i , int j)
	{
		Edge e = new Edge(i,j,1);
		for(int u=0; u<AL[i].size(); u++)
		{
			if((AL[i].get(u)).equals(e))
			{
				return true;
			}
		}
		return false;
		//return (AL[i].contains(e)); didn't work because of .equals
	}
	public void putEdge(int i, int j, int w)
	{		
		if(!existsEdge(i,j))
		{
			Edge e = new Edge(i,j,w);
			AL[i].add(e);
			edgeCount ++;
			inDegree[j]+=1;
			outDegree[i]+=1;
		}
	}
	public void removeEdge(int i, int j)
	{
		//AL[i].remove(e);  this doesn't work because the .equals doesn't link with.contains or .remove
		if(existsEdge(i,j))
		{
			Edge e = new Edge(i,j,1);
			for(int u=0; u<AL[i].size(); u++)
			{
				if((AL[i].get(u)).equals(e))
				{
					e = AL[i].get(u);
				}
			}
			AL[i].remove(e);
			edgeCount--;
			inDegree[j]-=1;
			outDegree[i]-=1;
		}
	}
	public void createList(String x)
	{		
		File file = new File(x);
		Scanner myFileIn;
		{
			try
			{
				myFileIn= new Scanner(file);
				vertexCount = myFileIn.nextInt();
				AL=new ArrayList[vertexCount];
				for(int i=0; i<vertexCount;i++)
				{
					AL[i]= new ArrayList();
					
				}
				outDegree = new int[vertexCount];
				inDegree = new int[vertexCount];
				while(myFileIn.hasNext())
				{
					int source = myFileIn.nextInt();
					int dest = myFileIn.nextInt();
					int w = myFileIn.nextInt();
					Edge a = new Edge (source,dest,w);
					putEdge(a);
				}
				myFileIn.close();
			}catch (FileNotFoundException e)
			{
				System.out.println("File: "+ x + " is not found");
			}
		}
	}
}

