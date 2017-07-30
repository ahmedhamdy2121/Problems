/*
Porblem statement here:
Super Reduced String 
https://www.hackerrank.com/challenges/reduced-string
*/
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution
{

	static String super_reduced_string(String s)
	{
		// Complete this function
		if (s == null || s.length() == 0 || s.equals("Empty String"))
			return "Empty String";
		StringBuilder result = new StringBuilder();
		List<Character> sc = s.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
		boolean flag = false;
		for (int i = 0; i < sc.size() - 1; i++)
		{
			if (sc.get(i) == sc.get(i + 1))
			{
				sc.remove(i);
				sc.remove(i);
				i--;
				flag = true;
			}
		}
		sc.forEach(entry -> result.append(entry));
		if (flag) return super_reduced_string(result.toString());
		else return result.length() == 0 ? "Empty String" : result.toString();
	}

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String s = in.next();
		in.close();
		String result = super_reduced_string(s);
		System.out.println(result);
	}
}
