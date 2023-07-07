import java.util.Scanner;
class setYear{
	Scanner s = new Scanner(System.in);
	int start;
	int end;
	
	setYear() {
		System.out.println("Enter start year : ");
		start=s.nextInt();
		System.out.println("Enter end year : ");
		end=s.nextInt();	
	}
	void checkYear() {
		System.out.println("Leap years b/w " + start + " and " + end + " are : " );
		for(int i = start; i<=end; i++){
		   if(i%4==0 && i%100!=0 || i%400==0){
		      System.out.println(i + "\t");
		    } 
		
		}
	
	}

}
public class LeapYear {
	public static void main(String args[]) {
		setYear obj= new setYear();
		obj.checkYear();
	
	}


}
