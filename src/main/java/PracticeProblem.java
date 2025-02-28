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
			case'*':
				result= num1*num2;
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
	public static boolean totalWordsChecker(String word){
		String[] wordArr =word.split("[^A-Za-z_']+");
		return wordArr.length<=MAXIMUM;	
		
	}

 public static String minString(String word, String word2, String word3){
	word=word.toLowerCase();
	word2=word2.toLowerCase();
	word3=word3.toLowerCase();
	int num= word.compareTo(word2);
	int num2= word3.compareTo(word2);
	if(num>0 && num2>0){
		return word2;
	} 
	else if(num2<num){
		return word3;
	}
	else{
		return word;
	}
 }
}
