import java.util.*;
import java.io.*;

class StringTest{
	public static void main(String[] args) throws Exception{
		
		HashMap<String, Integer> letter=new HashMap<String, Integer>();
		Scanner op=new Scanner(System.in);
		
		fileToText(letter);
		while(true)
		{
			System.out.print("1)�s�W 2)�d�� -1)�s�ɰh�X�G");
			int option=op.nextInt();
			
			if(option==-1)
			{
				textToFile(letter);
				break;
			}
			
			switch(option)
			{
				case 1:
					System.out.println("�п�J�@���^��y�l�G");
					String sentence=op.nextLine(); //Ū�W�@�Ӵ���
					sentence=op.nextLine();
					String[] token=sentence.split("[,;\\s\\.]+");
					
					for(String i:token)
					{
						i=i.toLowerCase();
						if(i.matches("[a-z]+"))
						{
							if(letter.get(i)==null)
								letter.put(i,1);
							else
								letter.put(i,letter.get(i)+1);
						}
					}
					break;
				
				case 2:
					System.out.print("�п�J���j�M�r�šG");
					String search=op.next();
					if(letter.get(search)==null)
						System.out.println("Not Find!!");
					else
						System.out.println("�X�{���ơG"+letter.get(search));
					break;
			}
		}
	}
	
	public static void fileToText(HashMap a) throws Exception{
		try {
			FileReader fr=new FileReader("1.txt");
			BufferedReader br=new BufferedReader(fr);
			String line;
			while ((line=br.readLine()) != null)
			{
				String[] token=line.split(":");
				a.put(token[0], Integer.parseInt(token[1]));
			}
		}
		catch (IOException e) {return;}
	}
	
	public static void textToFile(HashMap a) throws Exception{
		FileWriter fw=new FileWriter("1.txt");
		for(Object key:a.keySet())
			fw.write(key + ":" + a.get(key)+"\n");
		fw.close();
	}
}