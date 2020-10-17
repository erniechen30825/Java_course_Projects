package academy.learnprogramming;

public class Main {
	// this is the challenge in section 3 - 39
    public static void main(String[] args) {
    	//second time
    	double var1 = 20.00d;
    	double var2 = 80.00;
    	double var3 = (var1 + var2)*100.00;
    	double remainder = var3 % 40.00;
    	boolean check = (remainder == 0)? true:false;
    	System.out.println("The results of checking is:" + check);
    	if(!check){
    		System.out.println("Got some reminder");
		}
//    	first time
//	double MyVar =  20.00d ;
//	double SecVar = 80.00d;
//	double thirVar = (MyVar + SecVar) * 100.00d ;
//	double remainder = thirVar % 40.00d;
//	boolean ZeroOrNot = (remainder == 0) ? true : false;
//	System.out.println(ZeroOrNot);
//	if (!ZeroOrNot){
//		System.out.println("Got some remainder ");
//	}
    }
}
