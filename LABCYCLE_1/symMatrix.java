import java.util.Scanner;

class Matrix {
    int m;
    int a[][];
    int flag;

    Scanner s = new Scanner(System.in);

    void setValue() {
        System.out.println("Enter size of the matrix : ");
        m = s.nextInt();
        a = new int[m][m];
    }

    void setMatrix() {
        System.out.println("Enter values of matrix : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = s.nextInt();
            }
        }
    }

    void checkMatrix() {
        flag = 1; 
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] != a[j][i]) {
                    flag = 0; 
                    break; 
                }
            }
            if (flag == 0) {
                break; 
            }
        }

        if (flag == 0) {
            System.out.println("Asymmetric");
        } else {
            System.out.println("Symmetric");
        }
    }
}

class symMatrix {
    public static void main(String args[]) {
        Matrix m = new Matrix();
        m.setValue();
        m.setMatrix();
        m.checkMatrix();
    }
}
