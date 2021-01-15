package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String numberAsString = "2018.125";
        System.out.println("numberAsString = " + numberAsString);
//        int number =  Integer.parseInt(numberAsString);
        double  number =  Double.parseDouble(numberAsString);

        System.out.println("number = " + number);
        // will automatically view the number as string -> 20181
        numberAsString +=1;
        // Actually add the number
        number += 1;
        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);
    }
}
