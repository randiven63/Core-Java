/*write a java code to toggle the case in the given stringBuffer.
Input:I am Sample
Output:i AM sAMPLE*/

import java.util.*;
public class main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		StringBuffer sb=new StringBuffer(str);
		int str_len=sb.length();
		for(int i=0;i<str_len;i++)
		{
			char ch=sb.charAt(i);
			if(ch>='a'&& ch<='z')
			{
				int offset=ch-'a';
				ch=(char)('A'+ offset);
			}
			else if(ch>='A'&& ch<='Z')
			{
				int offset=ch-'A';
				ch=(char)('a'+ offset);
			}
			sb.setCharAt(i,ch);
		}
		System.out.println(sb);
	}

}
