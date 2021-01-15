package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//	// write your code here
//        int value = 1;
//        if(value == 1){
//            System.out.println("Value was 1");
//        }else if(value == 2){
//            System.out.println("Value was 2");
//        }else{
//            System.out.println("Was not 1 or 2");
//        }

        int switchValue = 5;
        // if -else is more flexible
        // switch can only compare one variable
        switch(switchValue){
            case 1 :
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was a 3,4 or a 5");
                System.out.println("Was actually" + switchValue);
                break; // used to close out the statement
                // or else it will execute all the way to the default(if there were no breaks)
            default:
                System.out.println("Was not 1 or 2");
                break;// the last break is not actually necessary because it is the last one anyway
        }
        //challenge
        // Create a new swtich statement using char instead of int
        // Create a switch statement testing for A,B,C,D or E
        // display a message if any of these are found and then break
        // Add a default wich dsplays a meesage saying not found
        char x = 'A';
        switch (x){
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("A,B,C,D or E was found");
                System.out.println("Actually " + x + " was found");
                break;
            default:
                System.out.println("None of the desired result was found");
        }
        // Starting from Corretta 7, String data types are also allowed in
        // Switch statements
        String month = "JANUARy";
        switch(month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "Feburary":
                System.out.println("Feb");
                break;
            default:
                System.out.println("Could not found the desired results");
        }
    }
}
