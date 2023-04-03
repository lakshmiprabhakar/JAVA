import java.util.Arrays;
import java.util.Scanner;

class setStrings {
    Scanner s = new Scanner(System.in);
    int a;
    String arr[];

    setStrings() {
        System.out.print("enter size of the array  : ");
        a = s.nextInt();
        arr = new String[a];
        System.out.println("enter elements : ");
        for (int i = 0; i < a; i++) {
            arr[i] = s.next();
        }
    }

    void showStrings() {
        System.out.print("strings :  ");
        for (int i = 0; i < a; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.print("\nsorted strings : ");
        for (int i = 0; i < a; i++) {
            Arrays.sort(arr);
            System.out.print(arr[i] + " ");
        }

    }
}

public class SortStrings {
    public static void main(String args[]) {
        setStrings obj = new setStrings();
        obj.showStrings();
    }

}
