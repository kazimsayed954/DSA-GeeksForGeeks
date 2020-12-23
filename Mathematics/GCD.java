public class GCD{

	public static void main(String[] args) {
	    
	    System.out.println(GCD(10,15));
	    System.out.println(euclideanAlgoGCD(10,15));
	    System.out.println(optimisedEuclideanAlgoGCD(10,15));
	
	}
	
	public static int GCD(int a,int b){
	    //Naive approach
	    int res=Math.min(a,b);
	    while(res>0){
	        if(a%res==0  && b%res==0){
	            break;
	        }
	        res--;
	    }
	    return res;
	    
	}
	
	public static int euclideanAlgoGCD(int a ,int b){
	    //Euclidean Algorithm 
	    while(a!=b){
	        if(a>b)
	            a=a-b;
	        else
	            b=b-a;
	    }
	        return a;
	    
	}
	
	public static int optimisedEuclideanAlgoGCD(int a,int b){
	    //Euclidean Algorithm recursive approach
	    if(b==0){
	        return a;
	    }
	    return optimisedEuclideanAlgoGCD(b,a%b);
	}
}