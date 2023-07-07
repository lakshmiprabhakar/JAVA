import java.util.Scanner;
class Shapes{
        Scanner sn=new Scanner(System.in);
        
        void area(){
             System.out.print("\nArea of Shapes ");
    }
}

class Rectangles extends Shapes{
    int length,breadth;

    Rectangles(){
        System.out.print("\nEnter length and breadth : ");
        length=sn.nextInt();
        breadth=sn.nextInt();
    }
    @Override
    void area(){
        //super.area(); to use overrided method(parent)
         System.out.print("\nArea of Rectangle : "+(length*breadth));
        }
}

class Circles extends Shapes{
    double radius;
    Circles(){
        System.out.print("\nEnter radius of circle : ");
        radius=sn.nextDouble();
    }
    @Override
    void area(){
        System.out.print("\nArea of Circle : "+(3.14*radius*radius));
    }
}

class Squares extends Shapes{
    int side;
    Squares(){
        System.out.print("\nEnter the side of Sqr : ");
        side=sn.nextInt();
    }
    @Override
    void area(){
        System.out.print("\nArea of the square: "+(side*side));
    }
}
public class ShapesOverride {
    public static void main(String args[]){
        Rectangles re=new Rectangles();
        Circles ci=new Circles();
        Squares sq=new Squares();
        re.area();
        ci.area();
        sq.area();
    }
}
