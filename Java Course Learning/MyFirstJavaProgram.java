public class MyFirstJavaProgram {
    
    // Outputting in Java
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

}

// Enums in Java
class FreshJuice {
    enum FreshJuiceSize{ SMALL, MEDIUM, LARGE }
    FreshJuiceSize size;
}

class FreshJuiceTest {

public static void main(String args[]) {
    FreshJuice juice = new FreshJuice();
    juice.size = FreshJuice.FreshJuiceSize.MEDIUM ;

    System.out.println("Size: " + juice.size);
    }
}

// Variables in Java
class JavaVariable {
    // Declare three integers
    int a, b, c;
    double pi = 3.142;
    char d = 'd';

    // Constructor to initialize
    public JavaVariable() {
        a = 10;
        b = 20;
        c = 0; 
    }
}
