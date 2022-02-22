package week1.day1.assignments;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		int sumAns = obj.addNum(10, 20, 30);
		int subAns = obj.subNum(100, 20);
		double mulAns = obj.mulNum(10, 20);
		float divAns = obj.divNum(10, 2);
		
		System.out.println("Addition " +sumAns);
		System.out.println("Subtraciton " +subAns);
		System.out.println("Mulitiplication " +mulAns);
		System.out.println("Division " +divAns);
		
		
		

	}

}
