package week2.day1;

public class OddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="nadeem";
		char[] letter =word.toCharArray();
		int length = letter.length;
		for(int i=0;i<length;i++) {
			if(i%2!=0) {
				String strcpy="";
				strcpy=strcpy+letter[i];
				System.out.println(strcpy.toUpperCase());
			}
			else {
				System.out.println(letter[i]);
			}
		}
	}

}
