package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	boolean gameOver = true ;
	int score = 400 ;
	int levelCompleted = 5;
	int bonus = 100;
//	if (score < 5000 && score > 1000) {
//		System.out.println("Your score was less than 5000 but more than 1000");
//	}else if (score < 1000){
//		System.out.println("Your score was less thant 1000");
//	}
//	else {
//		System.out.println("This was executed");
//	}
		if(gameOver ){
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Yout final score was " +finalScore);
		}
		//Challenge:
		//Print out second score on screen with the following
		//score == 10000
		//levelCompleted == 8
		//bonus == 200
		//first printout still displays
		int newscore = 10000;
		int newlevelCompleted = 8;
		int newbonus = 200;
		if(gameOver ){
			int newfinalScore = newscore + (newlevelCompleted * newbonus);
			System.out.println("Second score was " + newfinalScore);
		}
    }
}
