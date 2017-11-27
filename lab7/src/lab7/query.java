package lab7;

public class query {

	static int[] queryBridgeWords(String word1, String word2) {
		int index_1,index_2;
		int BridgeWordsNum=0; 
		int [] BridgeWordsIndex=new int[5];
		int size=graph.size;
		index_1=graph.indexofword(word1);
		index_2=graph.indexofword(word2);
		if (index_1==-1 || index_2==-1)
		{
			return BridgeWordsIndex;
		}
		int index;
		for(index=0;index<size;index++)
		{
			if(index!=index_1 && index!=index_2)
				if(graph.Edge_Existed(index_1,index)) 
					if(graph.Edge_Existed(index,index_2))
					{
						BridgeWordsIndex[BridgeWordsNum+1]=index;
						BridgeWordsNum+=1;
					}
		} 
		BridgeWordsIndex[0]=BridgeWordsNum;
		return BridgeWordsIndex;
}//查询桥接词
	
	static String printBridgeWords(String word1, String word2){
		int i;
		String s1;
		int index_1,index_2;
		index_1=graph.indexofword(word1);
		index_2=graph.indexofword(word2);
		if (index_1==-1 || index_2==-1)
		{
			if(index_1==-1 && index_2==-1)
			{
				System.out.println("No \'"+word1+"\' and \'"+ word2+"\' in the graph!");
				s1="No \'"+word1+"\' and \'"+ word2+"\' in the graph!";
				return s1;
			}
			else if(index_1==-1)
			{
			System.out.println("No \'"+word1+"\' in the graph!");
			s1="No \'"+word1+"\' in the graph!";
			return s1;
			
			}
			else
			{
				System.out.println("No \'"+word2+"\' in the graph!");
				s1="No \'"+word2+"\' in the graph!";
				return s1;
			}
		}
		else if(queryBridgeWords(word1,word2)[0]==0)
		{
			System.out.println("No bridge words from \'"+word1+"\' to \'"+word2+"\'!");
			s1="No bridge words from \'"+word1+"\' to \'"+word2+"\'!";
			return s1;
		}
		else  {
			System.out.println("The bridge words from \'"+word1+"\' to \'"+word2+"\' are:");
			s1="The bridge words from \'"+word1+"\' to \'"+word2+"\' are:";
			for(i=1;i<=queryBridgeWords(word1,word2)[0];i++)
				{
					if(i<queryBridgeWords(word1,word2)[0]){
						System.out.println(graph.arr_[queryBridgeWords(word1,word2)[i]]+ ", and ");
					    s1=s1+graph.arr_[queryBridgeWords(word1,word2)[i]]+ ", and ";
					    }
					else{
						System.out.println(graph.arr_[queryBridgeWords(word1,word2)[i]]+".");
						s1=s1+graph.arr_[queryBridgeWords(word1,word2)[i]]+".";
						
					}
				}
			System.out.println(s1);
			return s1;
			}
		
		
	}//输出桥接词
}
