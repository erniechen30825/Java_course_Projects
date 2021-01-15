package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int count = 1;
        while(count != 6){
            System.out.println("Count value is " + count);
            count++;
        }
        //Same as above
//        for (int i =1; i <7; i++){
//            System.out.println("Count value is " + i);
//        }
        //while loop
        count = 1;
        while(true){
            if(count == 6){
                break;
            }System.out.println("Count value is  " + count);
            count++;
        }

        //do-while
        // the do-while loop will execute at least once
//        count = 6;
//        do{
//            System.out.println("Count value was " + count);
//            count++;
//            if(count > 100){
//                break;
//            }
//        }

//        while(count != 6);
//        int number = 4;
//        int finishNumber = 20;
//        while(number <= finishNumber){
//            number++;
//            if(!isEvenNumber(number)){
//                continue;
//            }
//            System.out.println("Even number " + number);
//        }

        // modify the code above
        // Make it also record the even numbers it has found
        // break once 5 are found
        // at the end display the total number of even numbers found
        int number = 4;
        int finishNumber = 20;
        count = 0;
        int total = 0;
        while(number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }else
                { count++;
                total += number ;
                System.out.println("Even number " + number);
                if(count >=5){
                    break;
                }
            }

        }
        System.out.println("Total is " + total);

    }
    // challenge
    // create a method isEvenNumber that takes a paramter of type int
    // Its purpose is to determine if the argument passed to the method is an even number or not.
    // return true if an even number, otherwise return false
    public static boolean isEvenNumber(int num){
        if(num % 2 == 0){
            return true;
        }return false;
    }
}
