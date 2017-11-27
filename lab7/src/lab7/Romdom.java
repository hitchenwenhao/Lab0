package lab7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Romdom {

	static String randomWalk(){
		 String random;
	     int result1 = new Random().nextInt(graph.size);
	     random=graph.arr_[result1];
	     int m,j=0,a,b,number=0;
	     int k=0;
	     String txt[]=new String [graph.size+2];
	     m=graph.indexofword(random);
	     random=graph.arr_[result1];
	     System.out.println(result1);
	     int A[][]=new int [graph.size][graph.size];
	     for(a=0;a<graph.size;a++)
	     {
	    	 for(b=0;b<graph.size;b++)
	    	 {
	    		 A[a][b]=graph.adjmatrix[a][b];
	    	 }
	     }
	    while (k!=graph.size-1)
	     {
	    	for(j=0;j<graph.size-1;j++)
	    	{
	    		if(A[m][j]==1)
	    		{
	    			txt[number]=graph.arr_[j];
	    			System.out.print(graph.arr_[j]+"->");
	    			A[m][j]=A[m][j]+1;
	    			m=j;
	    			number++;
	    			continue;
	    		 }
	    	}
	    	k=j;
	     }
	    System.out.println(graph.arr_[j]);
	    StringBuffer s = new StringBuffer();
	    for(int i = 0; i < number; i++)
	    	{ 
	    	s.append(txt[i]+" ");
	    	}
	    try{
	    	FileWriter output =new FileWriter("C://Users//94936//Desktop//random.txt");
	    	BufferedWriter bw=new BufferedWriter(output);
	    	bw.write(s.toString());
	    	bw.close();
	    	}catch(IOException e){
	    	e.printStackTrace();
	    	}
	    return null;//Ëæ»úÓÎ×ß*/
	    }
}
