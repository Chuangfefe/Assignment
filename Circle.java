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
		System.out.print("1)圓形 2)橢圓形：");
		int option = op.nextInt();
		if(option==1)
		{
			ArrayList<Circle> a=new ArrayList<Circle>();
			while(true)
			{
				System.out.println("請連續輸入圓"+count+" 半徑：(-1:exit)");
				double r = op.nextDouble();
				if(r==-1)break;
				a.add(new Circle(r));
				count++;
			}
			System.out.print("請輸入編號：");
			int i = op.nextInt();
			System.out.println("圓半徑："+ a.get(i-1).r);
			System.out.print("請輸入角度：");
			double angle=op.nextDouble();
			System.out.println("弧度 = "+a.get(i-1).Arc(angle)+" ; 面積 = "+a.get(i-1).Pie(angle));
		}
		
		if(option==2)
		{
			ArrayList<Oval> a=new ArrayList<Oval>();
			while(true)
			{
				System.out.println("請連續輸入橢圓"+count+" 半徑a、半徑b：(-1:exit)");
				double r1 = op.nextDouble();
				double r2 = op.nextDouble();
				if(r1==-1 || r2==-1)break;
				a.add(new Oval(r1, r2));
				count++;
			}
			System.out.print("請輸入編號：");
			int i = op.nextInt();
			System.out.println("橢圓半徑："+ a.get(i-1).r+"、"+ a.get(i-1).r2+"面積 = "+a.get(i-1).area());
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