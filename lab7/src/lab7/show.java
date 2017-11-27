package lab7;

public class show {
	
	public static void showDirectedGraph(){
  		int i,j; 
  		for(i=0;i<graph.size;i++)
          	for(j=0;j<graph.size;j++)
          	{
          		if (graph.adjmatrix[i][j]!=0)
          			System.out.println(graph.arr_[i]+"->"+graph.arr_[j]);
          	}
  	}

}
