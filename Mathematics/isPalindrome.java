public class isPalindrome{

	public static boolean isPalin(int num){
		int rev=0;
		int temp=num;
		while(temp!=0){
			int lastDig=temp%10;
			rev=rev*10 + lastDig;
			temp=temp/10;
		}

			return (rev==num);
	}

	public static void main(String[] args){
		System.out.println(isPalin(7557))
	}
}
