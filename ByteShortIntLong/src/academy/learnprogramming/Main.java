package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int myValue = 1000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue );
        System.out.println("Integer Maximum Value = " + myMaxIntValue );
        //overflow and underflow
        //will not get the wanted number if busted
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));

//        int myMaxIntTest = 2147483648;
        // will be too large
        int myMaxIntTest = 2_147_483_647;
// the "_" just adds readibility
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue) ;
        System.out.println("Byte Maximum Value = " + myMaxByteValue) ;
//not used that frequently
        //byte occupies 8 bites
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue) ;
        System.out.println("Short Maximum Value = " + myMaxShortValue) ;
        //Short occupies 16 bites
//You can replace keywords by using Edit-> find ->replace
        long myLongValue = 100L ;
        //need to add L behind to declare long
        //L has 64 bytes
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue) ;
        System.out.println("Long Maximum Value = " + myMaxLongValue) ;
        //without the L, Java treats the number by default as int
//        long bigLongLiteralValue = 2_147_483_648;
        //will cause error
        long bigLongLiteralValue = 2_147_483_648L;

        //Casting
        int myTotal = (myMinIntValue / 2);
        //default number is set at int so need to use casting
        byte myNewByteValue = (byte)(myMinByteValue / 2);
        // will get error if did not specify the (byte) <- this is casting
        //Casting: transforming variables into another type
        short myNewShortValue = (short)( myMinShortValue / 2);
        //generally always use int unless specific reasons(suggestion)
    }
}

