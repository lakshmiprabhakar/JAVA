import java.util.Scanner;
class Student_{
    String name,grade;
    double overall_percentage;
    Student_(String name,String grade,double overall_percentage){
        this.name=name;
        this.grade=grade;
        this.overall_percentage=overall_percentage;
    }
    
}
class Sports extends Student_{
    String Sport_name;
    int rating;
    Sports(String Sport_name,int rating,String name,String grade,double overall_percentage){
        super(name,grade,overall_percentage);
        this.Sport_name=Sport_name;
        this.rating=rating;
    }

}
class Result extends Sports{
    Result(String name,int rating,String Sport_name,String grade,double overall_percentage){
        super(Sport_name, rating,name, grade, overall_percentage);
    }
    void show(){
        System.out.print("\nName = "+name);
        System.out.print("\nGrade = "+grade);
        System.out.print("\nSports Name = "+Sport_name);
        System.out.print("\nRating out of 10 = "+rating);
        System.out.print("\nOverall Percentage = "+overall_percentage+"%");
        
    }
}


public class Score {
    public static void main(String args[]){
        Scanner sn=new Scanner(System.in);

        System.out.print("Enter Student name = ");
        String name=sn.nextLine();
        System.out.print("\nEnter Grade = ");
        String grade=sn.nextLine();
        System.out.print("\nEnter Sports name = ");
        String sport_name=sn.nextLine();
        System.out.print("\nEnter Rating out of 10 = ");
        int rating=sn.nextInt();
        System.out.print("\nEnter Overall Percentage = ");
        double overall_percentage=sn.nextDouble();

        Result re=new Result(name, rating, sport_name, grade, overall_percentage);

        re.show();


    } 
}

//output-------------------

javac Score.java
java Score
Enter Student name = yooo

Enter Grade = B+

Enter Sports name = cricket

Enter Rating out of 10 = 7

Enter Overall Percentage = 79

Name = yooo
Grade = B+
Sports Name = cricket
Rating out of 10 = 7
Overall Percentage = 79.0%
