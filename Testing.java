import java.text.NumberFormat;
import java.util.Arrays;

public class Testing ;
    
	public static void main(String[] args) {
        String s = args[0];
        int left = 0;
        int right = s.length() - 1;
        while ((s.charAt(left) == s.charAt(right)) && (left < right)) {
        left++;
        right--;
        }
        if (left < right) {
        System.out.println(s + " is not a palindrome");
        } else {
        System.out.println(s + " is a palindrome");
        }
    } 
        // Complete the program's code here:


        // casting from double to int 




//double x = Double.parseDouble(args[0]);
//int rounded = (int) (x + 0.5);
//System.out.println(rounded);

// casting from double to int
