package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int highscore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highscore);
        highscore =  calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highscore);
        int first = 1500;
        int sec = 900;
        int thir = 400;
        int forth = 50;
        displayHighScorePosition("Alex",calculateHighScorePosition(first));
        displayHighScorePosition("Bob",calculateHighScorePosition(sec));
        displayHighScorePosition("Casper",calculateHighScorePosition(thir));
        displayHighScorePosition("Dan",calculateHighScorePosition(forth));

    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if(gameOver ){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            //System.out.println("Your final score was " +finalScore);
            return finalScore;
        }
        return - 1;
    }
    //challenge
    //1.create method displayHighScorePosition
    //Input: name , position in  high score table
    //Output: print name + managed to get + position + on high score table
    //2. create method calculateHighScorePosition
    // Input : score
    // Output: position
    // citeria : >1000 : 1, >500 and <= 1000:2, >100 and <500:3, <100:4
    public static void displayHighScorePosition( String name, int position){
        System.out.println( name + " managed to get position " + position + " on the high score table.");
    }
    // void method also called procedures

    public static int calculateHighScorePosition( int score){
        int position = 4;
        if (score >= 1000) {
            position = 1;
        }else if(score >= 500){
            position = 2;
        }else if (score >= 100){
            position = 3;
        }
        return  position;
        }
        //if (score >= 1000){
        //    return 1;
        //}else if(score >= 500 ){
        //    return 2;
        //}else if(score >= 100 ){
        //    return 3;
        //}
        //return 4;
    }



