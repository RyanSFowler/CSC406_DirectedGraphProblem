/**
 * Ryan Fowler
 * CSC406
 * Spring 2016
 * Project 1
 * Assigned 1/26/2016
 * Due 2/11/2016
 */

package project1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public abstract class Graph
{
	protected int edgeCount;
	protected int vertexCount;
	public int numVertices()
	{
		return vertexCount;
	}
	public int numEdges()
	{
		return edgeCount;
	}
	public boolean existsEdge(Edge e)
	{
		return existsEdge(e.getSource(),e.getDestination());
	}
	public void putEdge(Edge e)
	{
		putEdge(e.getSource(),e.getDestination(),e.getWeight());
	}
	public void removeEdge(Edge e)
	{
		removeEdge(e.getSource(),e.getDestination());
	}
	public abstract boolean existsEdge(int i,int j);
	public abstract void putEdge(int i,int j, int w);
	public abstract void removeEdge(int i, int j);
	
}
