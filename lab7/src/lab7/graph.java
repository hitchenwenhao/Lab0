package lab7;

import java.io.FileInputStream;
import java.io.IOException;

public class graph {
	public static String txtStr;
	public static int size=1;
	public static int [][]adjmatrix;
	public static String[]arr;
	public static String[]arr_;
	
	public  static void creat() throws IOException{
		FileInputStream rf = new FileInputStream("C://Users//94936//Desktop//tete.txt");
		byte[] buffer = new byte[rf.available()];	//��ȡ���ļ�β����̬��������
		while(rf.read(buffer)!=-1)
		{
		//	System.out.print(new String(buffer));
			continue;
		}
		txtStr = new String(buffer);
		rf.close();
		System.out.println(txtStr);
		String str0=txtStr.replaceAll("\n", " ");
		String str1 = str0.replaceAll("[\\pP\\p{Punct}]", "");   
        String reg = "[^a-zA-Z ]";
        String str2=str1.replaceAll(reg, "");
        String str3=str2.toLowerCase();
        String [] arr = str3.split("\\s+");   //arr�е�Ԫ���������ı��ļ��е�ÿ�����ʣ����ظ���
        int textsize,i,j,k,l;
        textsize=arr.length;                   //textsizeΪ��������ĳ���              
        int flag;
        arr_=new String [100];
        arr_[0]=arr[0];                  
        for(j=1;j<textsize;j++)
        	{flag=1;
        	for(k=0;k<j;k++)
        		if(arr[k].equals(arr[j]))
        			{flag=0;break;}
            if(flag==1)                             //arr_Ϊ��˳������ظ����ʹ��ɵ�����
            	{size+=1;arr_[size-1]=arr[j];}}    //flag��ǵ��������еĵ�j�������Ƿ���֮ǰ�ĵ������ظ�
                          //size���������������ظ��ĵĵ��ʸ���
        
        for(l=0;l<size;l++){
        	System.out.println(arr_[l]);
        }
        adjmatrix=new int [size][size];             
        for(i=0;i<textsize-1;i++)
        {
        	int m,n;
        	m=indexofword(arr[i]);
        	n=indexofword(arr[i+1]);
        	adjmatrix[m][n]+=1;	
        }
	}
	
	public static int indexofword(String word)
    {
    	int i;
    	for(i=0;i<size;i++)
    	{
    		if(arr_[i].equals(word)==true)
    			return i;
    	}
    	return -1;
    } //չʾ����ͼ
	
	static boolean  Edge_Existed(int index_1,int index_2)
	{
		if(adjmatrix[index_1][index_2]>0)
			return true;
		else
			return false;
	} 

}
