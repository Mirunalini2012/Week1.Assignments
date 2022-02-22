package week1.day1.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range=8;
		int firstNum=0,secNum=1,sum=0;
		System.out.println(firstNum);
		System.out.println(secNum);
		for(int i=1; i<=range; i++) 
		{
			sum= firstNum + secNum;
			//System.out.println("sum " +sum);
			firstNum = secNum;
			//System.out.println("first num " +firstNum);
			secNum = sum;
			//System.out.println("second num " +secNum);
			System.out.println(sum);
		}
		
		

	}

}
