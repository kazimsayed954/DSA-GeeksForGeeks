public class LCM{

	public static void main(String[] args) {
		System.out.println(naivedLCM(4,6));
		System.out.println(LCM(4,6));
	}
	
	public static int naivedLCM(int a,int b){
	    //naive approach
	    int res=Math.max(a,b);
	    while(true){
	        if(res%a==0 && res%b==0){
	            return res;
	           
	        }
	         res++;
	    }
	   
	}
	
	public static int GCD(int a,int b){
	    if(b==0)
	        return a;
	   return GCD(b,a%b);
	}
	
	public static int LCM(int a,int b){
	    //Optimised approach
	    //formula :- a X b = GCD(a,b) X LCM(a,b)
	    
	    return (a*b)/GCD(a,b);
	}
}