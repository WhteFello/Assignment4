package week2.day1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="civic";
		String reversename = "";
		char[] charArray=name.toCharArray();
		for(int i=charArray.length-1;i>=0;i--) {
			reversename=reversename+charArray[i];
		}
		System.out.println(reversename);
		if(reversename.equals(name)) {
			System.out.println("civic is a Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}
