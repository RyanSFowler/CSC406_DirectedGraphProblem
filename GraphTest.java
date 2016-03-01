package project1;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class GraphTest {
	public static void main(String[] args) 
	{	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter a input File: ");
		String inputFile = scanner.next();
		System.out.println("Please Enter a output File: ");
		String outputFile = scanner.next();
		System.out.println("Is your graph weighted?:(y for yes)");
		String w = scanner.next();
		if(w == "y")
		{
			WDMG m = new WDMG(inputFile);
			WDLG l = new WDLG(inputFile);
			
			try {

				File fileOut= new File(outputFile);

				// if file doesnt exists, then create it
				if (!fileOut.exists()) {
					fileOut.createNewFile();
				}

				FileWriter fw = new FileWriter(fileOut.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write("Test of the Adjacency Matrix \n");
				bw.write("Number of vertices: "+ m.numVertices() +"\n");
				bw.write("Number of edges: "+ m.numEdges()+"\n");
				for(int i=0; i< m.numVertices(); i++)
				{
					bw.write("The in degree of vertex "+ i + " is "+ m.inDegree(i)+"\n");
					bw.write("The out degree of vertex "+ i + " is "+ m.outDegree(i)+"\n");
					bw.write("The vertices adjacent to "+ i +" are "+ Arrays.toString(m.adjacentVertices(i))+ "\n");
				}
				bw.write("4 and 1 are adjacent: "+ m.areAdjacent(4, 1)+"\n");
				bw.write("3 and 1 are adjacent: "+ m.areAdjacent(3, 1)+"\n");
				bw.write("1 and 3 are adjacent: "+ m.areAdjacent(1,3)+"\n");
				bw.write("------Now we will remove some edges----------"+"\n");
				bw.write("Remove the edge between 4 and 1"+"\n");
				m.removeEdge(4, 1);
				bw.write("Remove the edge between 1 and 3"+"\n");
				m.removeEdge(1, 3);
				bw.write("Number of edges: "+ m.numEdges()+"\n");
				for(int i=0; i< m.numVertices(); i++)
				{
					bw.write("The in degree of vertex "+ i + " is "+ m.inDegree(i)+"\n");
					bw.write("The out degree of vertex "+ i + " is "+ m.outDegree(i)+"\n");
					bw.write("The vertices adjacent to "+ i +" are "+ Arrays.toString(m.adjacentVertices(i))+ "\n");
				}
				bw.write("4 and 1 are adjacent: "+ m.areAdjacent(4, 1)+"\n");
				bw.write("3 and 1 are adjacent: "+ m.areAdjacent(3, 1)+"\n");
				bw.write("1 and 3 are adjacent: "+ m.areAdjacent(1,3)+"\n");
				bw.write("___________________________________________________\n");
				bw.write("Test of the List\n");
				bw.write("Number of vertices: "+ l.numVertices() +"\n");
				bw.write("Number of edges: "+ l.numEdges()+"\n");
				for(int i=0; i< l.numVertices(); i++)
				{
					bw.write("The in degree of vertex "+ i + " is "+ l.inDegree(i)+"\n");
					bw.write("The out degree of vertex "+ i + " is "+ l.outDegree(i)+"\n");
					bw.write("The vertices adjacent to "+ i +" are "+ Arrays.toString(l.adjacentVertices(i))+ "\n");
				}
				bw.write("4 and 1 are adjacent: "+ l.areAdjacent(4, 1)+"\n");
				bw.write("3 and 1 are adjacent: "+ l.areAdjacent(3, 1)+"\n");
				bw.write("1 and 3 are adjacent: "+ l.areAdjacent(1,3)+"\n");
				bw.write("----------Now we will remove some edges---------------"+"\n");
				bw.write("Remove the edge between 4 and 1"+"\n");
				l.removeEdge(4,1);
				bw.write("Remove the edge between 1 and 3"+"\n");
				l.removeEdge(1, 3);
				bw.write("Number of edges: "+ l.numEdges()+"\n");
				for(int i=0; i< l.numVertices(); i++)
				{
					bw.write("The in degree of vertex "+ i + " is "+ l.inDegree(i)+"\n");
					bw.write("The out degree of vertex "+ i + " is "+ l.outDegree(i)+"\n");
					bw.write("The vertices adjacent to "+ i +" are "+ Arrays.toString(l.adjacentVertices(i))+ "\n");
				}
				bw.write("4 and 1 are adjacent: "+ l.areAdjacent(4, 1)+"\n");
				bw.write("3 and 1 are adjacent: "+ l.areAdjacent(3, 1)+"\n");
				bw.write("1 and 3 are adjacent: "+ l.areAdjacent(1,3)+"\n");
				
				
				bw.close();

				System.out.println("Done");

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else
		{
			UWDMG m = new UWDMG(inputFile);
			UWDLG l = new UWDLG(inputFile);
			
			try {

				File fileOut= new File(outputFile);

				// if file doesnt exists, then create it
				if (!fileOut.exists()) {
					fileOut.createNewFile();
				}

				FileWriter fw = new FileWriter(fileOut.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write("Test of the Adjacency Matrix \n");
				bw.write("Number of vertices: "+ m.numVertices() +"\n");
				bw.write("Number of edges: "+ m.numEdges()+"\n");
				for(int i=0; i< m.numVertices(); i++)
				{
					bw.write("The in degree of vertex "+ i + " is "+ m.inDegree(i)+"\n");
					bw.write("The out degree of vertex "+ i + " is "+ m.outDegree(i)+"\n");
					bw.write("The vertices adjacent to "+ i +" are "+ Arrays.toString(m.adjacentVertices(i))+ "\n");
				}
				bw.write("4 and 1 are adjacent: "+ m.areAdjacent(4, 1)+"\n");
				bw.write("3 and 1 are adjacent: "+ m.areAdjacent(3, 1)+"\n");
				bw.write("1 and 3 are adjacent: "+ m.areAdjacent(1,3)+"\n");
				bw.write("------Now we will remove some edges----------"+"\n");
				bw.write("Remove the edge between 4 and 1"+"\n");
				m.removeEdge(4, 1);
				bw.write("Remove the edge between 1 and 3"+"\n");
				m.removeEdge(1, 3);
				bw.write("Number of edges: "+ m.numEdges()+"\n");
				for(int i=0; i< m.numVertices(); i++)
				{
					bw.write("The in degree of vertex "+ i + " is "+ m.inDegree(i)+"\n");
					bw.write("The out degree of vertex "+ i + " is "+ m.outDegree(i)+"\n");
					bw.write("The vertices adjacent to "+ i +" are "+ Arrays.toString(m.adjacentVertices(i))+ "\n");
				}
				bw.write("4 and 1 are adjacent: "+ m.areAdjacent(4, 1)+"\n");
				bw.write("3 and 1 are adjacent: "+ m.areAdjacent(3, 1)+"\n");
				bw.write("1 and 3 are adjacent: "+ m.areAdjacent(1,3)+"\n");
				bw.write("___________________________________________________\n");
				bw.write("Test of the List\n");
				bw.write("Number of vertices: "+ l.numVertices() +"\n");
				bw.write("Number of edges: "+ l.numEdges()+"\n");
				for(int i=0; i< l.numVertices(); i++)
				{
					bw.write("The in degree of vertex "+ i + " is "+ l.inDegree(i)+"\n");
					bw.write("The out degree of vertex "+ i + " is "+ l.outDegree(i)+"\n");
					bw.write("The vertices adjacent to "+ i +" are "+ Arrays.toString(l.adjacentVertices(i))+ "\n");
				}
				bw.write("4 and 1 are adjacent: "+ l.areAdjacent(4, 1)+"\n");
				bw.write("3 and 1 are adjacent: "+ l.areAdjacent(3, 1)+"\n");
				bw.write("1 and 3 are adjacent: "+ l.areAdjacent(1,3)+"\n");
				bw.write("----------Now we will remove some edges---------------"+"\n");
				bw.write("Remove the edge between 4 and 1"+"\n");
				l.removeEdge(4,1);
				bw.write("Remove the edge between 1 and 3"+"\n");
				l.removeEdge(1, 3);
				bw.write("Number of edges: "+ l.numEdges()+"\n");
				for(int i=0; i< l.numVertices(); i++)
				{
					bw.write("The in degree of vertex "+ i + " is "+ l.inDegree(i)+"\n");
					bw.write("The out degree of vertex "+ i + " is "+ l.outDegree(i)+"\n");
					bw.write("The vertices adjacent to "+ i +" are "+ Arrays.toString(l.adjacentVertices(i))+ "\n");
				}
				bw.write("4 and 1 are adjacent: "+ l.areAdjacent(4, 1)+"\n");
				bw.write("3 and 1 are adjacent: "+ l.areAdjacent(3, 1)+"\n");
				bw.write("1 and 3 are adjacent: "+ l.areAdjacent(1,3)+"\n");
				
				
				bw.close();

				System.out.println("Done");

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}