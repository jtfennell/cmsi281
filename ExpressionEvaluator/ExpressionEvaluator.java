public class ExpressionEvaluator {
    /**Evaluates expression in reverse Polish notation. Uses operators +, -, x, /, %*/
	public static void main(String[] args) {
        int numOfInts = 0;
        int numOfOperators = 0;

        //error checking to make sure all arguments are either operators or integers
        for (int i = 0;i < args.length ;i++ ) {

            if (isOperator(args[i])) {
                if (numOfInts == 0) {
                    throw new IllegalArgumentException("Attempts to pop empty stack");
                }
               else if (numOfInts > 1) {
                   numOfInts--;
               }
            } else {
                try{
                    Integer.parseInt(args[i]);
                    numOfInts++;
                }
                catch (NumberFormatException e){
                    throw new IllegalArgumentException("Non-operator string detected");
                }
            }
        }

        CustomizedStack stack = new CustomizedStack();
		int result;

        //tries to parse the argument into an integer. If no exception is thrown, the arg is an integer and is pushed to the stack
		for (int i = 0; i < args.length ; i++ ) {           
            try{
				int parsedInt = Integer.parseInt(args[i]);
				stack.push(parsedInt);
			}
			//if a number format exception is thrown, then the argument is an operator and expression is evaluated
            //if there is only 1 item in the stack, the operator does nothing to the stack
			catch (NumberFormatException e) {
				if (stack.size() > 1) {
					int value1 = stack.pop();
					int value2 = stack.pop();

    				if (args[i].equals("+")) {
                        stack.push(value2 + value1);
                    } else if (args[i].equals("-")){
                        stack.push(value2 - value1);
                    } else if (args[i].equals("x")){
                        stack.push(value2 * value1);
                    } else if(args[i].equals("/")){
                        stack.push(value2 / value1);
                    } else if (args[i].equals("%")){
                        stack.push(value2 % value1);
                    }			
                }
			}
		}
        System.out.println(stack.pop());
	}

	public static boolean isOperator(String s){
		boolean isOneCharacter = s.length() == 1;
		boolean isAddOperator = s.equals("+");
		boolean isSubtractOperator = s.equals("-");
		boolean isMultiplyOperator = s.equals("x");
		boolean isDivideOperator = s.equals("/");
		boolean isModOperator = s.equals("%");

		return (isOneCharacter &&(isAddOperator || isSubtractOperator || isMultiplyOperator || isDivideOperator || isModOperator));
	}
}