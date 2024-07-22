package Activities;

interface Addable{
	int add(int num1, int num2);
}
public class Activity12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addable ad1, ad2;
		ad1 = (num1, num2) -> (num1 + num2);
		System.out.println("Result of ad1 :" +ad1.add(15, 30));
		
		ad2 = (int a, int b) -> {
		    return (a + b);
		};
		
		System.out.println("Result of ad2 : " +ad2.add(90, 20));
		
		

	}

}
