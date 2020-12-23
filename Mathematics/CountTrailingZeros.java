public class CountTrailingZeros{

	public static int countTrailingZeros(int num){
	    // countTrailingZeros for factorial number
	    int res=0;
	    for(int i=5;i<=num;i=i*5){
	        res=res+(num/i);
	    }
	    return res;
	}

	public static long nonConvinientMethodCountTrailingZeros(int num){
	    long fact=1;
	    int count=0;
	    for(int i=2;i<=num;i++){
	        fact*=i;
	    }
	    
	    while(fact%10==0){
	        count++;
	        fact=fact/10;
	    }
	    return count;
	}


	public static void main(String[] args){

		System.out.println(countTrailing(5));
		System.out.println(nonConvinientMethodCountTrailingZeros(10));	
		
	}


}