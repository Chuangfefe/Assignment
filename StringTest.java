import java.util.*;
import java.io.*;

class StringTest{
	public static void main(String[] args) throws Exception{
		
		HashMap<String, Integer> letter=new HashMap<String, Integer>();
		Scanner op=new Scanner(System.in);
		
		fileToText(letter);
		while(true)
		{
			System.out.print("1)新增 2)查詢 -1)存檔退出：");
			int option=op.nextInt();
			
			if(option==-1)
			{
				textToFile(letter);
				break;
			}
			
			switch(option)
			{
				case 1:
					System.out.println("請輸入一整行英文句子：");
					String sentence=op.nextLine(); //讀上一個換行
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
					System.out.print("請輸入欲搜尋字符：");
					String search=op.next();
					if(letter.get(search)==null)
						System.out.println("Not Find!!");
					else
						System.out.println("出現次數："+letter.get(search));
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