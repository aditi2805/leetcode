package java_example;

public class FormatExample {
    // formatter syntax: "%<-><width><.><precision><s/S/f/d/t>"
    // use - to left align
    // use width to fix the width of the string
    // use precision to define decimal number accuracy
    // s -> string
    // S -> uppercase STRING
    // f -> floating point
    // d -> integers
    // t -> time

    public static void formatNames() {
        System.out.printf("My name is %s. I study in %s", "Aditi", "VITB");

        // to print in uppercase, use %S
        System.out.printf("My name is %s. I study in %s", "Aditi", "VITB");

        // to provide width
        System.out.printf("%-20s %s\n", "Aditi", "Verma");
        System.out.printf("%-20s %s\n", "Aditiya", "Vermaa");
        System.out.printf("%-20s %s\n", "Aditiiiiiiiiiiii", "Vermaaaaa");
    }

    public static void formatNames1() {
        System.out.printf("My name is %s. I study in %s", "Aditi", "VITB");
        // output:
        // My name is Aditi. I study in VITB
    }
    public static void formatNames2() {
        // to print in uppercase, use %S
        System.out.printf("My name is %S. I study in %s", "Aditi", "VITB");
        // output:
        // My name is ADITI. I study in VITB
        // to provide width
        System.out.printf("%-20s %s\n", "Aditi", "Verma");
        System.out.printf("%-20s %s\n", "Aditiya", "Vermaa");
        System.out.printf("%-20s %s\n", "Aditiiiiiiiiiiii", "Vermaaaaa");
    }

    public static void formatNames3() {
        // to provide width(right aligned) - use %<width>s
        System.out.printf("%20s %s\n", "Aditi", "Verma");
        System.out.printf("%20s %s\n", "Aditiya", "Vermaa");
        System.out.printf("%20s %s\n", "Aditiiiiiiiiiiii", "Vermaaaaa");
        // output
        //             Aditi Verma
        //           Aditiya Vermaa
        //  Aditiiiiiiiiiiii Vermaaaaa
    }

    public static void formatNames4() {
        // to provide width(left aligned) - use %-<width>s
        System.out.printf("%-20s %s\n", "Aditi", "Verma");
        System.out.printf("%-20s %s\n", "Aditiya", "Vermaa");
        System.out.printf("%-20s %s\n", "Aditiiiiiiiiiiii", "Vermaaaaa");
        // output
        // Aditi                Verma
        // Aditiya              Vermaa
        // Aditiiiiiiiiiiii     Vermaaaaa
    }

    public static void formatIntegers() {
        System.out.printf("11/3 is equal to %d\n", 11/3);
        // 11/3 is equal to 3
    }

    public static void formatDecimals() {
        System.out.printf("11/3 is equal to %.3f\n", 11.0/3);
        // 11/3 is equal to 3.667
    }

    public static void formatIntegersWithPadding() {
        System.out.printf("13 with padding is %03d\n", 13);
        // 13 with padding is 013
        System.out.printf("13 with padding is %05d\n", 13);
        // 13 with padding is 00013
    }
}
