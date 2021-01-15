package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    Car porsche =  new Car(); //can be treated as data type
//        Car holden = new Car();
//        System.out.println("Model is " + porsche.getModel());
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());
    }
}
