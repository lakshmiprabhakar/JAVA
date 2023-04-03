import java.util.Scanner;

class setArr {
    Scanner s = new Scanner(System.in);
    int n, flag = 0, i;
    int arr[];
    int search;

    void arrOp() {
        System.out.print("enter size : ");
        n = s.nextInt();
        arr = new int[n];
        System.out.println("\nenter elements : ");
        for (i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.print("array : ");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    void search() {
        System.out.print("\nenter search element : ");
        search = s.nextInt();
        for (i = 0; i < n; i++) {
            if (arr[i] == search) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println(search + " is found at location " + i);
        } else {
            System.out.println("element not found...");
        }
    }

}

class searchArray {
    public static void main(String args[]) {
        setArr set = new setArr();
        set.arrOp();
        set.search();
    }

}
