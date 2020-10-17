package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);
        //double takes double space(64bits) and therefore is more precise
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        //double is accepted as a default
        float myFloatValue =  5f / 3f;
        //casting is also available, but overall double is more recommended
        double myDoubleValue = 5d / 3d;
        //you don't need to specify the "d" because double is assumed as default
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        //double is actually faster than float in terms of processing, including libraries such as math
        //default: int and double
        //will not use float from now on

        double pound = 200d;
        double kilo = pound * 0.45359237d;
        System.out.println(kilo);
        //you can still use the _ symbol such as : 3_000_000.4_567
        //when you need more precise calculations
        // both float and double are not useful
        //There is a class called BigDecimal for that
        // precise calculations calcuations should not use float/double
        //general calculations are fine


    }
}
