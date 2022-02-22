package week1.day1.assignments;

public class PrimeNumber {

	public static void main(String[] args) {
		int input=17;
		boolean flag= false;
		
		for(int i=2; i<input; i++) {
			if(input%2==0)
			{
				flag=true;
				break;
			}
		
		}
		
		if(flag==false)
		{
			
			System.out.println(+input+ " is a Prime number");
		}
		else {
			System.out.println(+input+ " Not a Prime number");
		}
	}

}
