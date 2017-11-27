package lab7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOput {
	public static String txtStr;
	public static int size=1;
	public static int [][]adjmatrix;
	public static String[]arr;
	public static String[]arr_;
	public static String s1="";
    public static String s2="";
    public static String s3="";
    public static String s4="";
    public static String newtxt="";

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		graph.creat();
        show.showDirectedGraph();
        System.out.println("****************menu******************");
        System.out.println("Please enter the frist words you want to inquire:");
        try{
        	BufferedReader in1 =new BufferedReader(new InputStreamReader (System.in));
        	s1=in1.readLine();
        	}catch(IOException e){}
        System.out.println("Please enter the second words you want to inquire:");
        try{
        	BufferedReader in2 =new BufferedReader(new InputStreamReader (System.in));
        	s2=in2.readLine();
        	}catch(IOException e){}
        String s11=query.printBridgeWords(s1,s2);
        System.out.println(s11);
        
 
        System.out.println("Please enter the newtxt:");
        try{
        	BufferedReader newtxt_ =new BufferedReader(new InputStreamReader (System.in));
        	newtxt=newtxt_.readLine();
        	}catch(IOException e){}
        String s12=NewText.generateNewText(newtxt); 
        System.out.println(s12);
        
	    System.out.println("Please enter the starting point of shortest path that you want to query:");
	   	try{
       		BufferedReader in3 =new BufferedReader(new InputStreamReader (System.in));
       		s3=in3.readLine();
       		}catch(IOException e){}
	   System.out.println("Please enter the ending point of shortest path that you want to query:");
	   try{
       		BufferedReader in4 =new BufferedReader(new InputStreamReader (System.in));
       		s4=in4.readLine();
       		}catch(IOException e){}
	   
	  shortest.calcShortestPath(s3,s4);
	  Romdom.randomWalk();

	}

}
