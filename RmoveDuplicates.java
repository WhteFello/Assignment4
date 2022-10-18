package week2.day1;

public class RmoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="We learn java during the java session";
		String[] sp =text.split(" ");
		for(int i=0;i<sp.length;i++) {
			for(int j=i+1;j<sp.length;j++) {
				if(sp[i].equals(sp[j])) {
					sp[j]="";
				}
			}
			System.out.print(" "+sp[i]);
		}
	}

}
