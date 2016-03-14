import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

class HW2_1 {
	public static void main(String[] args){
		
		Scanner op = new Scanner(System.in);
		
		System.out.print("4�I23��45���13�I54��23�������`��ơG");
		int hour = (13-4);
		int minute = (54-23);
		int second = (23-45);
		int sum = (hour*60*60)+(minute*60)+second;
		System.out.println(sum+"��");
		
		System.out.println("=======================================================");
		
		System.out.println("��l�Ƥ@�ӼƦr�}�C�A��X�Ҧ����Ʀr���`�M�P����!!");
		int[] number = new int[10];
		Random ran = new Random();
		for(int i=0; i<10; i++) number[i]=ran.nextInt(100)+1;
		
		int total = 0;
		for(int j:number) total+=j;
		System.out.println("�`�M�G"+total);
		
		double average = (double)total/10;
		System.out.println("�`�M�G"+average);
		
		System.out.println("=======================================================");
		
		System.out.print("��J�m�W�G");
		String name, date;
		name = op.next();
		System.out.print("��J�褸�ͤ� yyyy/mm/zz�G ");
		date = op.next();
		String[] birth = date.split("/");
		int year = Integer.parseInt(birth[0])-1911;
		int month = Integer.parseInt(birth[1]);
		int day = Integer.parseInt(birth[2]);
		System.out.println("�m�W�G"+name+"   �ͤ�G"+year+"/"+month+"/"+day);
		
		System.out.println("=======================================================");
		
		double f1,f2;
		int option;
		
		while(true)
		{
			System.out.print("�п�J2�Ӥp�ơG");
			f1=op.nextDouble();
			f2=op.nextDouble();
			System.out.print("1)�[ 2)�� 3)�� 4)�� 5)exit�G");
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
						System.out.println("���Ƥ���0");
					else
						System.out.println(f1+"/"+f2+"="+(f1/f2));
					break;
			}
		}
		
		System.out.println("=======================================================");
		
		System.out.print("�п�J�褸���~���G");
		int ce=op.nextInt();
		System.out.println("�|�~�G");
		for(int i=1911; i<=ce; i++)
		{
			if((i%400==0) || (i%4==0 && i%100!=0))
				System.out.print(i+"   ");
		}
		
		System.out.println("\n=======================================================");
		
		ArrayList<String> student = new ArrayList<String>();
		ArrayList<Integer> score = new ArrayList<Integer>();
		System.out.print("�п�J�ǥͼơG");
		int count=op.nextInt();
		for(int i=1; i<=count;)
		{
			try{
				System.out.print("�п�J�ǥ�"+i+"�m�W�G");
				student.add(op.next());
				System.out.print("�п�J�ǥ�"+i+"���Z�G");
				score.add(op.nextInt());
				i++;
			}
			catch(Exception e){
				student.remove(i-1);
				System.out.println(e);
				String no = op.next();
			}
		}
		
		System.out.print("��J�n�j�M���ǥͽs���G");
		int id=op.nextInt();
		System.out.println("�ǥͩm�W�G"+student.get(id-1)+"   �ǥͦ��Z:"+score.get(id-1));
		
		System.out.println("=======================================================");
	}
}