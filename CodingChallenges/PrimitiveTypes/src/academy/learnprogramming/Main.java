package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
    	//my answer 2nd time
//    	byte num1 = (byte)10;
//    	short num2 = (short)20;
//    	int num3 = 50;
//    	long total = 50000L + 10* ((long)num1 + (long)num2 + (long)num3);
//    	System.out.println(total);
		//my answer and lecture 1st time
	byte ChallengeByte = 10;
	short ChallengeShort = 20;
	int ChallengeInt = 50;

	long ChallengeLong = 50000L + 10L *(ChallengeByte+ChallengeShort+ChallengeInt);
	System.out.println(ChallengeLong);

	short ShortTotal = (short)
			(1000 + 10 * (ChallengeByte+ChallengeShort+ChallengeInt));

	System.out.println(ShortTotal);
    }
}
