/*
(Estimate p) p can be computed using the following series:

m(i) = 4(1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + ... + (((-1)^i + 1) / (2i - 1)))

Write a method that returns m(i) for a given i and write a test program that displays
the following table:
*/
public class Exercise_06_14 {
	/** Main Method */
	public static void main(String[] args) {
		// Display the header
        System.out.printf("%1s%10s\n", "i", "m(i)");
        System.out.println("-------------");
        
        // Display the table
        
        double start = 1.0;
        double end = 901;
        
        for(double n = start; n <= end; n += 100) {
            
            System.out.printf("%-7.0f%1.4f\n", n, computePi(n));
        }    
    }

	/** Method estimatePI */
	public static double estimatePI(double num) {
		double sum = 0;
	
        for (double i = 1; i <= num; i ++) {
            sum += Math.pow(-1, i + 1) / (2 * i - 1);
		}
	
        return sum *= 4;
	}
}