package lambdasStreams;
import java.util.*;
import java.util.stream.*;

interface Predicate{
	boolean test(String s);
}

class CheckPallindrome{
	public static boolean isPallindrome(String s){
		int n=s.length();
		return IntStream.range(0,n/2).allMatch(i->s.charAt(i)==s.charAt(n-i- 1));
	}
}

public class PallindromeStrings {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of List:");
		int n=sc.nextInt();
		System.out.println("Enter elements in List");
		String str[]=new String[n];
		for(int i=0;i<n;i++)
				str[i]=sc.next();
		List<String> result=PallindromeStrings.getpallindromes(str,CheckPallindrome::isPallindrome);
		System.out.println("The palindromes in the list are:");
		result.forEach(System.out::println);
		sc.close();
	}
	
	public static List<String> getpallindromes(String[] str,Predicate p){
		List<String> res=new ArrayList<String>();
		for(String s:str)
			if(p.test(s))
				res.add(s);
		return res;
	}
}

