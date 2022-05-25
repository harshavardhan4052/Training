package client.cts.salary;
import java.util.*;
public class UniqueChar {
	public static void main(String[] args) {
		int count[]=new int[250];
		System.out.println("Enter the sentence:");
		Scanner sc = new Scanner(System.in);
        String sc1 = sc.nextLine();
        System.out.println(sc1);
        for (int i=0;i<sc1.length();i++) {
        	char ch = sc1.charAt(i);
        	count[ch]++;
        }
	 for (int i = 0; i < sc1.length(); i++) {
         char chh = sc1.charAt(i);
         if (count[chh] == 1) {
             System.out.println(sc1.charAt(i));
         }
         	else {
            	 System.out.println("Invalid Sentence");
             }
         }
	}
}




