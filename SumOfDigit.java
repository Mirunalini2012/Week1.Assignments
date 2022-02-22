package week1.day1.assignments;

public class SumOfDigit {

	public static void main(String[] args) {
		int input=123;
		int sum=0, remaninder=0;
		while(input>0)
		{
			remaninder = input % 10;
			//System.out.println(remaninder);
			sum =  sum + remaninder;
			//System.out.println(sum);
			input = input/10;
			//System.out.println(input);
								
		}
		System.out.println("The sum of is " +sum);

	}

}
