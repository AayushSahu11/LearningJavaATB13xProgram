package exe_01_Java_Basic;

public class Lab013_Printf
{
    public static void main(String[] args) {

        int a = 10;
        System.out.print("Print Command Print without the new Line");
        System.out.println("Printlm print the new line.");
        System.out.println("Hello World");

        System.out.println(a);
        System.out.printf("Your variable name is %d" ,a);

        // To use with Print F-
        // %d -> use for int, byte, long, short, - data types
        // %s -> String
        // %f-> float, double
        // %b -> boolean
        int b = 20;
        System.out.println("---");
        System.out.printf("%d + %d",a,b);


    }
}
