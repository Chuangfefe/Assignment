import java.io.*;
import java.util.Scanner;
import java.util.*;

class Circle {
	double r;
	Circle(double r){ this.r = r; }
	
	double Arc(double angle){return (this.r*3.14*angle/180);}
	double Pie(double angle){return (this.r*this.r*3.14*angle/360);}
	
	public static void main(String[] args) {
		Scanner op=new Scanner(System.in);
		int count=1;
		System.out.print("1)��� 2)���ΡG");
		int option = op.nextInt();
		if(option==1)
		{
			ArrayList<Circle> a=new ArrayList<Circle>();
			while(true)
			{
				System.out.println("�гs���J��"+count+" �b�|�G(-1:exit)");
				double r = op.nextDouble();
				if(r==-1)break;
				a.add(new Circle(r));
				count++;
			}
			System.out.print("�п�J�s���G");
			int i = op.nextInt();
			System.out.println("��b�|�G"+ a.get(i-1).r);
			System.out.print("�п�J���סG");
			double angle=op.nextDouble();
			System.out.println("���� = "+a.get(i-1).Arc(angle)+" ; ���n = "+a.get(i-1).Pie(angle));
		}
		
		if(option==2)
		{
			ArrayList<Oval> a=new ArrayList<Oval>();
			while(true)
			{
				System.out.println("�гs���J���"+count+" �b�|a�B�b�|b�G(-1:exit)");
				double r1 = op.nextDouble();
				double r2 = op.nextDouble();
				if(r1==-1 || r2==-1)break;
				a.add(new Oval(r1, r2));
				count++;
			}
			System.out.print("�п�J�s���G");
			int i = op.nextInt();
			System.out.println("���b�|�G"+ a.get(i-1).r+"�B"+ a.get(i-1).r2+"���n = "+a.get(i-1).area());
		}
		
	}
}

class Oval extends Circle{
	public double r2;
	Oval(double r,double r2)
	{	
		super(r);
		this.r2=r2;
	}
	public double area()
	{
		return 3.14*super.r*this.r2 ;
	}
}