public class PracticeProblem {
	public static void main(String args[]) {

	}

	public static int calculate(int num1, int num2, char operator) {
		int result = 0;
		switch (operator) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			case '%':
				result = num1 % num2;
				break;
			case '^':
				result = (int) Math.pow(num1, num2);
				break;
		}
		return result;
	}
	final static int  MAXIMUM=10;
	public static boolean totalWordChecker(String word){
			
			boolean answer= false;
			for (int i =0; i <word.length();i++){
				if (32<=int(word[i])<=64 || <int(word[i]))
			}
							answer = true;
			
			return answer;
		}
}

