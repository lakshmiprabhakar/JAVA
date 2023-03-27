import java.util.Scanner;

class evenOrodd {
    int a;

    void setValue() {
        System.out.print("Enter the number : ");
        Scanner sn = new Scanner(System.in);
        a = sn.nextInt();

    }

    void check() {
        if (a == 0) {
            System.out.println("zero");
        } else if (a % 2 == 0) {
            System.out.println(a + " is even");
        } else {
            System.out.println(a + " is odd");
        }
    }
}

class checkEvenodOdd {
    public static void main(String args[]) {
        evenOrodd obj = new evenOrodd();
        obj.setValue();
        obj.check();
    }
}
