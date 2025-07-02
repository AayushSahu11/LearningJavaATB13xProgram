package exe_04_Operators;

public class Lab021_Logial_Operators
{
    public static void main(String[] args) {

         boolean a = true;
        System.out.println(!a); // note of a , ! is NOT Operator

        boolean b = true;
        System.out.println(!!b);  // !! double marks means double NOT

        boolean c = true || false; // || means OR operator , true or false
        System.out.println(!c);
    }
} // &&  means AND Operator
