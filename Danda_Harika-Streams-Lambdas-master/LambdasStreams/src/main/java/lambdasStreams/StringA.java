package lambdasStreams;

import java.util.*;
import java.util.stream.*;

public class StringA {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of List:");
		int n=sc.nextInt();
		System.out.println("Enter elements in List");
		String str[]=new String[n];
		for(int i=0;i<n;i++)
				str[i]=sc.next();
		List<String> result=getStrings(str);
		System.out.println("The list containing strings of length 3 and starting with a:"+result);
		sc.close();
	}
	public static List<String> getStrings(String str[]){		
		Stream<String> strStream=Arrays.stream(str);
		List<String> r=strStream.filter(s->(s.length()==3 && s.startsWith("a"))).collect(Collectors.toList());
		return r;
	}
}
