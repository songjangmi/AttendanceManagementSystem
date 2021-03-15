

import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double f;
		double c;
		
		
		Scanner input=new Scanner(System.in);
		System.out.print("È­¾¾¿Âµµ¸¦ ÀÔ·ÂÇÏ½Ã¿À:");
		f=input.nextDouble();
		
		c=(double)5/9*(f-32);
		System.out.print("¼·¾¾¿Âµµ:"+c);
		
		
	}

}