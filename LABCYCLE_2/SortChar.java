import java.util.Arrays;
import java.util.Scanner;

class SortChar {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String str;
        System.out.print("enter the string : ");
        str = s.next();
        char array[] = str.toCharArray();
        Arrays.sort(array);
        str = new String(array);
        System.out.print(str);
    }

}
