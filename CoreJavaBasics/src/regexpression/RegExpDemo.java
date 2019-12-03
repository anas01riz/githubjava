package regexpression;
import java.util.regex.*;

public class RegExpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//first way to write regular expression
		//Pattern pt = Pattern.compile("hello");
		//Matcher mt = pt.matcher("hello");
		//System.out.println(mt.matches()); //true
		/*
		Matcher mt1 = pt.matcher("Hello");
		System.out.println(mt1.matches()); //false
		*/
		
	//second way to write regular expression
		//System.out.println(Pattern.compile("hello").matcher("hello").matches()); //true
		
	//third way to write regular expression
		//System.out.println(Pattern.matches("hello","hello")); //true
		
//		Pattern pt1 = Pattern.compile("world");
//		Matcher mt1 = pt1.matcher("hello world");
//		while(mt1.find())
//		{
//			System.out.println(mt1.start()); //6
//			System.out.println(mt1.end()); //11
//		}
//		Pattern pt2 = Pattern.compile("\\d\\d\\d-\\d\\d\\d-\\d\\d\\d\\d");
		//Pattern pt3 = Pattern.compile("\\d+-\\d+-\\d+"); - another way
		//Pattern pt3 = Pattern.compile("\\d{3}-\\d{3}-\\d{3}"); - another way
//		Matcher mt2 = pt2.matcher("213-897-4521");
//		System.out.println(mt2.matches()); //true
//		
//		Pattern pt3 = Pattern.compile("\\d{3}.\\d{3}.\\d.\\d");
		//Pattern pt3 = Pattern.compile("\\d{1,3}.\\d{1,3}.\\d{1,3}.\\d{1,3}");//another method minimum 1 and maximum 3
//		Matcher mt3 = pt3.matcher("192.168.1.1");
//		System.out.println(mt3.matches()); //true
		
//		Pattern pt4 = Pattern.compile("[a-f0-9]{3,4}::[a-f0-9]{3,4}::[a-f0-9]{3,4}::[a-f0-9]{3,4}");
//		Matcher mt4 = pt4.matcher("fe80::f5b9::9a9::1574");
//		System.out.println(mt4.matches()); //true
		
		Pattern pt5 = Pattern.compile("\\w+.\\d+@\\w+.\\w+");
		//[a-z]+.[0-9]+@[a-z]+.[a-z]+
		Matcher mt5 = pt5.matcher("user.123@gmail.com");
		System.out.println(mt5.matches()); //true
		System.out.println(mt5.group()); //user.123@gmail.com
		System.out.println(mt5.group(2));
		
//		Pattern pt6 = Pattern.compile("[a-z]+.+?");
//		Matcher mt6 = pt6.matcher("mr & mr.");
//		System.out.println(mt6.matches()); //true
//		
//		Pattern pt7 = Pattern.compile("(\\d{3})-(\\d{8})");
//		Matcher mt7 = pt7.matcher("022-45872361");
//		System.out.println(mt7.matches()); //true
//		System.out.println(mt7.group());  //022-45872361
//		System.out.println(mt7.group(1)); //022
//		System.out.println(mt7.group(2)); //45872361
//		
//		Pattern pt8 = Pattern.compile("\\d{3}.\\d{3}.\\d{4}");
//		Matcher mt8 = pt8.matcher("215.368.2557");
//		System.out.println(mt8.matches()); //true
//		
//		//single pattern
//		Pattern pt9 = Pattern.compile("\\d{3}[.-]\\d{3}[.-]\\d{4}");
//		Matcher mt9 = pt9.matcher("215.368.2557");
//		Matcher mt10 = pt9.matcher("218-368-2557");
//		System.out.println(mt9.matches()); //true
//		System.out.println(mt10.matches()); //true
//		
//		Pattern pt10 = Pattern.compile("http.?"); //.?- zero or one character in end
//		Matcher mt11 = pt10.matcher("https");
//		Matcher mt12 = pt10.matcher("http:");
//		System.out.println(mt11.matches()); //true
//		System.out.println(mt12.matches()); //true
//		
//		System.out.println("customer care example");
//		String str1 = "0124-2641407 / 020-26231407 / 1860 233 1407";
//		Pattern pt11 = Pattern.compile("(\\d{4}-\\d{7}) / (\\d{3}-\\d{8}) / (\\d{4} \\d{3} \\d{4})");
//		Matcher mt13 = pt11.matcher(str1);
//		System.out.println(mt13.matches()); //true
//		System.out.println(mt13.group()); //0124-2641407 / 020-26231407 / 1860 233 1407
//		System.out.println(mt13.group(1)); //0124-2641407
//		System.out.println(mt13.group(2)); //020-26231407
//		System.out.println(mt13.group(3)); //1860 233 1407
//		
	}
}
