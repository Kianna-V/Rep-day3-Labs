
public class ConditionalBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean firstCondition = false;
		boolean secondCondition = true;
		
		
		// if-statement condition has to = true for it to execute its
		// lines of code
		if(firstCondition) { // first conditon is false - will not execute lines of code inside if-statement
			System.out.println("inside the if-statement");
		
			if(secondCondition) {
				System.out.println("inside of the nested if-statement");
			} 
		}else if(secondCondition) { // secondCondition = true - therefore 5 is printed
			System.out.println(5);
		} else {
			System.out.println("inside of the else - statement");
		}
		
		System.out.println("outside of the if-statement"); // 
	
	
	
	}
}
