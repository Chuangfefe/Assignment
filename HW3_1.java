import java.io.*;
import java.util.Scanner;
import java.util.*;

class HW3_1 {
   public static void main(String[] args) 
   {
       System.out.print("輸入一行英文句子：");
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
	   
	   System.out.print("幾位學生：");
	   int num=op.nextInt();
	   for(int i=0; i<num; i++)
	   {
		   System.out.print("輸入學生"+(i+1)+"姓名：");
		   String name=op.next();
		   System.out.print("輸入學生"+(i+1)+"成績：");
		   int score=op.nextInt();
		   student.put(name,score);
	   }
	   
	    System.out.print("輸入要搜尋的學生姓名：");
		String search_name=op.next();
		if(student.get(search_name)==null)
			 System.out.println("Not Find!!");
		 else
			  System.out.println("成績："+student.get(search_name));
	   
	   System.out.println("==================================================================");
	   
   }
}
