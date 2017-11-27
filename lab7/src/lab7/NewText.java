package lab7;

public class NewText {
	
	static String generateNewText(String inputText) {
		 int i,length;
		 String s2="";
		 String [] newtxt = inputText.split("\\s+");
		 length=newtxt.length;
		 for(i=0;i<length-1;i++) 
		 {
			 System.out.print(newtxt[i]+" ");
			 s2=s2+newtxt[i]+" ";
			 if(graph.indexofword(newtxt[i])!=-1)
			{
				 if (query.queryBridgeWords(newtxt[i],newtxt[i+1])[0]>=1)
				 {
					 System.out.print(graph.arr_[query.queryBridgeWords(newtxt[i],newtxt[i+1])[1]]+" ");
					 s2=s2+graph.arr_[query.queryBridgeWords(newtxt[i],newtxt[i+1])[1]]+" ";
				 
				 }
			 }
		  } 
		 System.out.println(newtxt[length-1]); 
		 s2=s2+newtxt[length-1];
		 
		 return s2;
	}//根据bridge word生成新文本

}
