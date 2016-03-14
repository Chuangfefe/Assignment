import java.io.*;
import java.util.Scanner;
import java.util.*;

class Shape{
	double width, height;
	public Shape(double w, double h){
		this.width = w;
		this.height = h;
	}
	public double area() {return (width*height)/2;}
}

class Circle extends Shape{
	public Circle(double r) {super(r,r);}
	public double area() {return 3.14*width*height;}
}

class Rectangle extends Shape{
	public Rectangle(double w, double h) {super(w,h);}
	public double area() {return width*height;}
}

class Oval extends Shape{
	public Oval(double w, double h) {super(w,h);}
	public double area() {return 3.14*width*height;}
}

class ShapeTest{
	public static void main(String[] args){
		int option;
		Scanner op=new Scanner(System.in);
		int[] record=new int[10]; 
		ArrayList<Shape> graph=new ArrayList<Shape>();
		int count=0;
		while(true)
		{
			System.out.print("1)圓形 2)橢圓形 3)矩形 4)三角形 -1)exit：");
			option=op.nextInt();
			if(option==-1) break;
			switch(option)
			{
				case(1):
					System.out.print("Input r : ");
					graph.add(new Circle(op.nextDouble()));
					break;
				case(2):
					System.out.print("Input a & b : ");
					graph.add(new Oval(op.nextDouble(), op.nextDouble()));
					break;
				case(3):
					System.out.print("Input width & height : ");
					graph.add(new Rectangle(op.nextDouble(), op.nextDouble()));
					break;
				case(4):
					System.out.print("Input width & height : ");
					graph.add(new Shape(op.nextDouble(), op.nextDouble()));
					break;
			}
			record[count++]=option;
		}
		
		System.out.print("Result：");
		for(int i=0; i<count; i++)
		{
			switch(record[i])
			{
				case(1):
					System.out.println((i+1)+" 圓形面積："+graph.get(i).area());
					break;
				case(2):
					System.out.println((i+1)+" 橢圓形面積："+graph.get(i).area());
					break;
				case(3):
					System.out.println((i+1)+" 矩形面積："+graph.get(i).area());
					break;
				case(4):
					System.out.println((i+1)+" 三角形面積："+graph.get(i).area());
					break;
			}
		}
	}
}