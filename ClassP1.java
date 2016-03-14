import java.io.*;
import java.util.Scanner;
import java.util.*;

class ClassP1{
	public static void main(String []args){
		ArrayList<String> sA = new ArrayList<String>();
		while(true)
		{
			String s;
			System.out.println("Please input an English sentence (-1 : exit)");
			Scanner op = new Scanner(System.in);
			s = op.nextLine();
			if(s.equals("-1"))
				break;
			else
				sA.add(s);
		}
		
		ArrayList<String> letter = new ArrayList<String>();
		
		for(String i:sA)
		{
			String[] tokens = i.split(",| ");
			for(String j:tokens)
			{
				j=j.toLowerCase();
				if(j.matches("[a-z]+"))
				{
					int index = letter.indexOf(j);
					if(index==-1)
						letter.add(j);
				}
			}
		}
		Collections.sort(letter);
		for(String str:letter)
			System.out.println(str);
	}
}