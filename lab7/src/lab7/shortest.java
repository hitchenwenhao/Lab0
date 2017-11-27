package lab7;

public class shortest {
	static String calcShortestPath(String word1, String word2) {
		int size=graph.size;
		int A[][]=new int [size][size];
		String B[]=new String [size+1];
		String C[][]=new String [100][100];
		int number[]=new int [100];
		int path[][]=new int [size][size];
		int i,j,k,num=0;
		int index_1,index_2;
		index_1=graph.indexofword(word1);
		index_2=graph.indexofword(word2);
	    for(i=0;i<size;i++)
	    {
           for (j=0;j<size;j++)
           {
        	   if(graph.adjmatrix[i][j]!=0)
        	   {
        		   A[i][j]=graph.adjmatrix[i][j];
        	   }
        	   else
        	   {
        		   A[i][j]=100;
        	   }
        	   if (A[i][j] < 100) {
   		    	path[i][j] = i;
   		       }
   		       else {
   		       path[i][j] = -1;
   		       }
		   }
	    }
	    for(k=0;k<size;k++)
	    {
	       for(i=0;i<size;i++)
	      {
	         for(j=0;j<size;j++)
	         {
	             if(A[i][j]>(A[i][k]+A[k][j]))
	             {
	                   A[i][j]=A[i][k]+A[k][j];
	                   path [i][j]=k;
	        	 }
		     }
	 	  }
	    }
	    if(word2 == null || word2.isEmpty())
	    {
	    	int index=0;
	    	for(i=0;i<size;i++)
	    	{
	    		j=i;
	    		k=0;
	    		if(path[index_1][i]==-1)
			    {
			    	System.out.println("Sorry,there is no path between "+word1+" and "+graph.arr_[i]);
			    	number[index]=k;
			    	index++;
			    	continue;
			    }
	    		else
	    		{
	    			while (true)	
	    			{
	    				if(graph.arr_[path[index_1][i]].equals(graph.arr_[index_1])==false)
	    				{
	    					C[j][k]=graph.arr_[path[index_1][i]];
	    					i=path[index_1][i];
	    					k++;
	    				}
	    				else
	    				{
	    					break;
	    				}
	    			}
	    			i=j;
	    		}
    			number[index]=k;
    			index++;	
	    		}
	    	
	    	for(i=0;i<size;i++)
	    	{
	    		//System.out.print(number[i]);
	    		if(path[index_1][i]!=-1)
	    		{
	    		System.out.print(word1+"->");
	    		}
	    	for(j=number[i]-1;j>=0;j--)
	    		{
	    		if(path[index_1][i]!=-1)
	    		{
	    			System.out.print(C[i][j]+"->");
	    		}
	    		}
	    	if(path[index_1][i]!=-1)
	    	{
	    		System.out.println(graph.arr_[i]);
	    	}
	    	}
	 
	    }
	    else
	    {
	    	if(path[index_1][index_2]==-1)
		    {
		    	System.out.println("Sorry,there is no path between two points!");
		    	return null;
		    }
		    else 
		    {
		    	while(path[index_1][index_2]!=index_1)
		    	{
		    		B[num]=graph.arr_[path[index_1][index_2]];
		    		index_2=path[index_1][index_2];
		    		num++;
		    	}
		    	System.out.print(word1+"->");
		    	for(j=num-1;j>=0;j--)
		    	{
		    		System.out.print(B[j]+"->");
		    	}
		    	System.out.println(word2);
		    }
		   }
	    return null;
}

}
