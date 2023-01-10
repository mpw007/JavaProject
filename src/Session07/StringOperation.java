package Session07;

public class StringOperation {
	public static void main(String[] args) {
		String s="Hello Java"; //index h=0,e=1, l=2,l=3,o=4
		String s1="Hello java";
		
		System.out.println(s.charAt(4));  //char at 4th index
		System.out.println(s.length());   //length of string=5
		System.out.println(s.toLowerCase()); //to lower case "hello"
		System.out.println(s.toUpperCase());   //HELLO
		System.out.println(s.replace('o', 'a'));  //replece charecter
		System.out.println(s.indexOf('l'));  // index of l char
		System.out.println(s.substring(2));  //llo
		System.out.println(s.substring(1, 4)); //start index 0,1.. and end index 1,2..
		System.out.println(s.isEmpty());  //return boolean value
		System.out.println(s.contains("Java")); //check string present or not
		System.out.println(s.trim());
		System.out.println(s.startsWith("Hell")); //checck strat with string
		System.out.println(s.startsWith("Java", 6)); //string strat with specified index
		System.out.println(s.endsWith("Java"));
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s.concat(s1));
		
	}

}
