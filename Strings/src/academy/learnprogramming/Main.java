package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        //byte*
        //short*
        //int***
        //long**
        //float
        //double***
        //char**
        //boolean***

        //String is a datatype (not primitive but a Class)
        //String can contain a sequence of characters, limited my Max value of int
        String myString = "This is a string";
        System.out.println("MyString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("MyString is equal to " + myString);
        myString = myString + " \u00A9 2019";
        System.out.println("MyString is equal to " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("numberString is equal to " + numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);
        // THe int is transformed into and string
        double doubleNumber = 120.47d;
        lastString = lastString +doubleNumber;
        System.out.println("LastString is equal to " + lastString);
        //Strings are Immutable
        //when you add things to a string, it actually creates a new string
        //StringBuffer is more efficient than what we have done
        //StringBuffer are mutable
        //String can be treated as a 9th primitive data type
        //BUT IT IS　NOT, it is a class
    }
}
