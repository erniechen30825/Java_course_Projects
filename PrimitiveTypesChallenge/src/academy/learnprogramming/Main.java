package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
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
