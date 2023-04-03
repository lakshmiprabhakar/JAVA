import java.util.Scanner;
public class OddEven{
    public static void main(String args[]){
     int a;
     Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number to check odd or even: ");
     a=sc.nextInt();
     if(a%2==0)
     {
       System.out.println(a+ "is even");
     }
     else
     {
       System.out.println(a+ "is odd");
     }
     }
}     
