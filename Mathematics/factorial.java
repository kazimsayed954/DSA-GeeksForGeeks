public class factorial{
	
	public static int factorialIter(int num){
		int fact=1;
		for(int start=2; start<=num; start++){
			fact*=i;
		}
		return fact;
	}

	public static int factorialRecur(int num){
		if(num==0)
			return 1;
		
		return num*factorialRecur(num-1);
	}

	public static void main(String[] args){
		System.out.println(factorialIter(5));
		System.out.println(factorialRecur(5));
	}
}