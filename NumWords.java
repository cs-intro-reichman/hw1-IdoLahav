// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		int ones;
        int tens;
        int hundreds;
        int x = Integer.parseInt(args[0]);
        
        if (x >= 100){
            ones = x%10;
            x = x/10;
            tens = x%10;
            x = x/10;
            hundreds = x;
            }
            else {
                hundreds = 0;
                if (x >= 10){
                    ones = x%10;
                    x = x/10;
                    tens = x%10;
                }
                    else{
                        tens = 0;
                        ones = x%10;
                    }
                }
        System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");
	}
}
