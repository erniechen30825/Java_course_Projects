package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
    printMegaBytesAndKiloBytes(1023);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int megabytes = kiloBytes / 1024;
        int remaining = kiloBytes % 1024;
        if (kiloBytes >= 0){
                System.out.println( kiloBytes
                        + " KB = "
                        + megabytes
                        +" MB"
                        + " and "
                        + remaining
                        +" KB");
        }else{
            System.out.println("Invalid Value");
        }
    }
}
