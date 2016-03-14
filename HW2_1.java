import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

class HW2_1 {
	public static void main(String[] args){
		
		Scanner op = new Scanner(System.in);
		
		System.out.print("4點23分45秒到13點54分23秒之間的總秒數：");
		int hour = (13-4);
		int minute = (54-23);
		int second = (23-45);
		int sum = (hour*60*60)+(minute*60)+second;
		System.out.println(sum+"秒");
		
		System.out.println("=======================================================");
		
		System.out.println("初始化一個數字陣列，算出所有的數字的總和與平均!!");
		int[] number = new int[10];
		Random ran = new Random();
		for(int i=0; i<10; i++) number[i]=ran.nextInt(100)+1;
		
		int total = 0;
		for(int j:number) total+=j;
		System.out.println("總和："+total);
		
		double average = (double)total/10;
		System.out.println("總和："+average);
		
		System.out.println("=======================================================");
		
		System.out.print("輸入姓名：");
		String name, date;
		name = op.next();
		System.out.print("輸入西元生日 yyyy/mm/zz： ");
		date = op.next();
		String[] birth = date.split("/");
		int year = Integer.parseInt(birth[0])-1911;
		int month = Integer.parseInt(birth[1]);
		int day = Integer.parseInt(birth[2]);
		System.out.println("姓名："+name+"   生日："+year+"/"+month+"/"+day);
		
		System.out.println("=======================================================");
		
		double f1,f2;
		int option;
		
		while(true)
		{
			System.out.print("請輸入2個小數：");
			f1=op.nextDouble();
			f2=op.nextDouble();
			System.out.print("1)加 2)減 3)乘 4)除 5)exit：");
			option=op.nextInt();
			
			if(option==5)
				break;
			
			switch(option)
			{
				case(1):
					System.out.println(f1+"+"+f2+"="+(f1+f2));
					break;
				case(2):
					System.out.println(f1+"-"+f2+"="+(f1-f2));
					break;
				case(3):
					System.out.println(f1+"*"+f2+"="+(f1*f2));
					break;
				case(4):
					if( -0.001<f2 && f2<0.0001)
						System.out.println("除數不為0");
					else
						System.out.println(f1+"/"+f2+"="+(f1/f2));
					break;
			}
		}
		
		System.out.println("=======================================================");
		
		System.out.print("請輸入西元的年份：");
		int ce=op.nextInt();
		System.out.println("閏年：");
		for(int i=1911; i<=ce; i++)
		{
			if((i%400==0) || (i%4==0 && i%100!=0))
				System.out.print(i+"   ");
		}
		
		System.out.println("\n=======================================================");
		
		ArrayList<String> student = new ArrayList<String>();
		ArrayList<Integer> score = new ArrayList<Integer>();
		System.out.print("請輸入學生數：");
		int count=op.nextInt();
		for(int i=1; i<=count;)
		{
			try{
				System.out.print("請輸入學生"+i+"姓名：");
				student.add(op.next());
				System.out.print("請輸入學生"+i+"成績：");
				score.add(op.nextInt());
				i++;
			}
			catch(Exception e){
				student.remove(i-1);
				System.out.println(e);
				String no = op.next();
			}
		}
		
		System.out.print("輸入要搜尋的學生編號：");
		int id=op.nextInt();
		System.out.println("學生姓名："+student.get(id-1)+"   學生成績:"+score.get(id-1));
		
		System.out.println("=======================================================");
	}
}