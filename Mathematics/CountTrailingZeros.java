public class CountTrailingZeros{

	public static int countTrailingZeros(int num){
	    // countTrailingZeros for factorial number
	    int res=0;
	    for(int i=5;i<=num;i=i*5){
	        res=res+(num/i);
	    }
	    return res;
	}

	public static void main(String[] args){
		
		System.out.println(countTrailing(5));	
		
	}


}