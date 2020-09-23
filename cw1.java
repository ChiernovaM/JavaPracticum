import java.util.Scanner;

public class cw1 {    
    public static void main(String[] args) {        
        Scanner in = new Scanner(System.in);
        System.out.println("Input the number of digits: ");
        int x = in.nextInt();
        System.out.println("Input digits: ");
        int[] digits = new int[x];
        for(int i = 0; i < digits.length; i++) {
            digits[i] = in.nextInt();
        }    
    	int min_ = digits[0];
        int max_ = digits[0];
        for(int i = 0; i < digits.length; i++) {
        	if(digits[i] < min_) 
                min_ = digits[i];
            if(digits[i] > max_) 
                max_ = digits[i];
        }
        System.out.println("Max: " + max_);
        System.out.println("Min: " + min_);            
    }    
}