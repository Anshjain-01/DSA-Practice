public class abstraction {
    public static void main(String args[]){
          audi a1=new audi();
          a1.price=32000;
          a1.start();
          bmw b1=new bmw();
          b1.price=a1.price+89000;
          b1.start();
    }
}
class audi extends car{
    @Override
    void start(){
        System.out.println("Audi is starting of the price :"+price);
    }
}
class bmw extends car{
    @Override
    void start(){
        System.out.println("bmw is starting of the price :"+price);
    }
}
abstract class car{
    int price;
   abstract void start();
}