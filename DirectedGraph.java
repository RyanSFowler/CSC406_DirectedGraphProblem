package project1;


public abstract class DirectedGraph extends Graph {
	int[] outDegree;
	int[] inDegree;
	public int inDegree(int i){
		return inDegree[i];
	}
	public int outDegree(int i){
		return outDegree[i];
	}
}
