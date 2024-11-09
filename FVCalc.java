// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);		
		int years = Integer.parseInt(args[2]);	
		double futureValue_temp = currentValue * Math.pow(rate/100 + 1,years);
		int futureValue = (int)futureValue_temp;
		System.out.println("After " + years + " years, " + currentValue + "$ saved at a" + rate + "%" + "will yield $" + futureValue);
	}
}