import java.util.Scanner;

class Publisher{
    String pub_name;

    Publisher(String pub_name){
        this.pub_name=pub_name;
    }
}
class Book extends Publisher{
    String book_name;
    int book_price;

    Book(String book_name,int book_price,String pub_name){
        super(pub_name);
        this.book_name=book_name;
        this.book_price=book_price;
    }
}


class Literature extends Book{
    String lit_category;

    Literature(String lit_category,String pub_name,String book_name,int book_price){
        super(book_name,book_price,pub_name);
        this.lit_category = lit_category;  
    }
}

class Fiction extends Literature {
    String fic_author;

    Fiction(String lit_category,String pub_name,String book_name,int book_price, String fic_author){
        super(lit_category,pub_name,book_name,book_price);
        this.fic_author=fic_author;
    }
}

class ShowDetails extends Fiction{
    ShowDetails(String lit_category,String pub_name,String book_name,int book_price,String fic_author){
        
    }
}


public class Books {
    
}
