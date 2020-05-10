package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    // Operands are literals and variables manipulated by an operator
        //Expressions are  combing variables, literals methods and operators
        int result = 1 + 2; //1+2=3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("prviousResult =  " + previousResult);
        result = result - 1;
        //Comments are ignored by computers and to help describe something
        //also used for disabling code
        System.out.println("3 - 1  =  " + result);
        System.out.println("prviousResult =  " + previousResult);
        //the previousResult variable is not effected by the change in result variable becasue it was declared before the change

        result = result*10; // 2*10=20
        System.out.println("2 * 10 = " + result);
        result = result /5 ;
        System.out.println("20 / 5 = " + result);
        result = result % 3 ;
        System.out.println("4 % 3 = " + result);

        // result = result + 1;
        result ++; // 1 + 1 = 2;
        System.out.println("1 + 1 = " + result);
        result --; // 2 - 1 = 1;
        System.out.println("2 - 1 = " + result);
        result *= 10 ; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        // result = result - 2;
        result -= 2 ; // 10 - 2  = 8;
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;
        if (isAlien != true) {
            System.out.println("It is not an alien ! ");
            System.out.println("And I am scared of aliens");
            //if-then statement should always use a code block!!
        }
        int topScore = 80 ;
        if (topScore < 100){
            System.out.println("You got the high score !");
        }
        int secondTopScore =  81;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100 ");
        }

        int newValue = 50;
        if(newValue == 50){
            System.out.println(" This is true");
        }
        boolean isCar = false;
        if (isCar){
            System.out.println("This is not supposed to happen");
        }
        // when using not operators "!" is more recommended
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar){
            System.out.println("wasCar is true");
        }
        //Ternary Operator " ? "
        //example:
        // int ageOfClient = 20
        // boolean isEighteenOrOver =  (ageOfClient == 20)? true : false;
        // Operand 1 : Condition, must return true or false;
        // Operand 2 : true, the value to assign to variable  if condition is true
        // Operand 3 : false, the value to assign to variable if condition is false
    }
        
}
