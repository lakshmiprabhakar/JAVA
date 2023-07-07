import java.util.Scanner;
interface Order{
    Scanner sn=new Scanner(System.in);
    void calculate();
}

class Products implements Order{
    int product_id,quantity,unit_price,total,net_amount;
    String product_name;
    void SetData(){
        System.out.print("\nEnter product ID : ");
        product_id=sn.nextInt();
        sn.nextLine();
        System.out.print("\nEnter product Name : ");
        product_name=sn.nextLine();
        System.out.print("\nEnter product Quantity : ");
        quantity=sn.nextInt();
        System.out.print("\nEnter Unit price : ");
        unit_price=sn.nextInt();
    }

    public void calculate(){
        total=quantity*unit_price;
    }
    void showBill(){

        System.out.println(""+product_id+"\t\t"+product_name+"\t\t"+quantity+"\t\t"+unit_price+"\t\t"+total);
    }
}


public class Bill{
    public static void main(String args[]){
        Scanner sn=new Scanner(System.in);
        int num,net_amount=0;
        String date;
        System.out.print("How many products : ");
        num=sn.nextInt();
        System.out.print("\nEnter Date : ");
        sn.nextLine();
        date=sn.nextLine();
        Products pro[]=new Products[num];

        for(int i=0;i<num;i++){
            System.out.print("\nEnter product "+(i+1)+"\n__________________________\n");
            pro[i]=new Products();
            pro[i].SetData();
            pro[i].calculate();
            net_amount+=pro[i].total;
        }
        System.out.print("OrderNo: #"+(int)(Math.random()*8000)+1000);
        System.out.print("\nDate:"+date);
        System.out.println("\nProduct ID     Product Name    Quantity     Unit Price     Total ");
        System.out.println("-----------------------------------------------------------------");
        for(int i=0;i<num;i++){
            pro[i].showBill();
        }
        System.out.print("\t\t\tNet.Amount : "+net_amount+"\n\n");

    }
    
}
