import java.io.*;
import java.util.Scanner;
import java.util.*;

class HW3_1 {
   public static void main(String[] args) 
   {
       System.out.print("��J�@��^��y�l�G");
	   Scanner op=new Scanner(System.in);
	   String input=op.nextLine();
	   String[] token=input.split("[,;.\\s]+");
	   //String[] token=input.split(",| |\\.");
	   int sum=0;
	   
	   for(String i:token)
	   {
			i=i.toLowerCase();
			if(i.matches("[a-z]+"))
				System.out.println(i);
			else
				sum+=Integer.parseInt(i);
	   }
	   System.out.println(sum);
	   
	   System.out.println("==================================================================");
	   
	   HashMap student=new HashMap();
	   
	   System.out.print("�X��ǥ͡G");
	   int num=op.nextInt();
	   for(int i=0; i<num; i++)
	   {
		   System.out.print("��J�ǥ�"+(i+1)+"�m�W�G");
		   String name=op.next();
		   System.out.print("��J�ǥ�"+(i+1)+"���Z�G");
		   int score=op.nextInt();
		   student.put(name,score);
	   }
	   
	    System.out.print("��J�n�j�M���ǥͩm�W�G");
		String search_name=op.next();
		if(student.get(search_name)==null)
			 System.out.println("Not Find!!");
		 else
			  System.out.println("���Z�G"+student.get(search_name));
	   
	   System.out.println("==================================================================");
	   
   }
}
