package academy.learnprogramming;

public class Main {
	// this is the challenge in section 3 - 39
    public static void main(String[] args) {
	double MyVar =  20.00d ;
	double SecVar = 80.00d;
	double thirVar = (MyVar + SecVar) * 100.00d ;
	double remainder = thirVar % 40.00d;
	boolean ZeroOrNot = (remainder == 0) ? true : false;
	System.out.println(ZeroOrNot);
	if (!ZeroOrNot){
		System.out.println("Got some remainder ");
	}
    }
}
