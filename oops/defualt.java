public class defualt {
    public static void main(String args[]){
           Book b=new Book();
    }
}
class Book{
    private String title;
    private int price;
     
    Book(){
        this("Sherlock",890);
        System.out.println("The price of the book of the title as "+title +" is "+price);
    }

    Book(String title,int price){
       this.title=title;
       this.price=price;

    }
}