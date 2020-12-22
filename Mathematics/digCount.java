public class digCount{
    
    // Iterative approach
	public static int digitCount(int num){
		int res=0;
		while (num>0){
			num=num/10;
			res++;
		}
		return res;
	}

    public static void main(String[] args){
    		System.out.println(digitCount(1234));
    }

}