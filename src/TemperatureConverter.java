

import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double f;
		double c;
		
		
		Scanner input=new Scanner(System.in);
		System.out.print("ȭ���µ��� �Է��Ͻÿ�:");
		f=input.nextDouble();
		
		c=(double)5/9*(f-32);
		System.out.print("�����µ�:"+c);
		
		
	}

}