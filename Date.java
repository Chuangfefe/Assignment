import java.io.*;
import java.util.Scanner;
import java.util.*;

class Date {
	int year, month, day;
	public Date(int y, int m, int d)
	{
		this.year = y;
		this.month = m;
		this.day = d;
	}
	public void check()
	{
		if(year>1910 && (month<13 && month>0) && (day<32 && day>0))
		{
			if(((month==4 || month==6 || month==9 || month==11) && day==31) || (month==2 && day>29))
				System.out.println("日期錯誤!!!");
			else
				System.out.println(year+"年"+month+"月"+day+"日");
		}
		else
			System.out.println("日期錯誤!!!");
	}
	
	public static void main(String[] args) {
		System.out.println("請輸入西元 yyyy/mm/dd:");
		Scanner op=new Scanner(System.in);
		String[] ce=op.next().split("/");
		Date temp=new Date(Integer.parseInt(ce[0]), Integer.parseInt(ce[1]), Integer.parseInt(ce[2]));
		temp.check();
	}
}