/**to add:
-in catch statement- check to see if argument is one of the acceptable operators. throw new IllegalArgumentException() if it isn't

  */

public class ExpressionEvaluator{

	public static void main(String[] args) {
		CustomizedStack stack = new CustomizedStack();
		int currentValue = 0;

		for (int i = 0; i < args.length ; i++ ) {
			//tries to parse the argument into an integer. If no exception is thrown, the arg is an integer
			try{
				int parsedInt = nextInteger.parseInt(args[i]);
				stack.push(parsedInt);
			}
			//if a number format exception is thrown, the argument is checked to see if it is an operator, and evaluted if it is.
			catch (NumberFormatException e){
				if (isOperator(args[i])) {
					
				}
				value1 = stack.pop();
				value2 = stack.pop();
				stack.push(evaluate(value1, value2, args[i]));
			}
		}
	}

	public static boolean isOperator(String s){
		boolean isOneCharacter = s.length == 1;
		boolean isAddOperator = s.charAt(0).equals('+');
		boolean isSubtractOperator = s.charAt(0).equals('-');
		boolean isMultiplyOperator = s.charAt(0).equals('x');
		boolean isDivideOperator = s.charAt(0).equals('/')
		boolean isModOperator = s.charAt(0).equals('%');

		return (isOneCharacter &&(isAddOperator || isSubtractOperator || isMultiplyOperator || isDivideOperator || isModOperator));
	}
}