public class encapsulation {
    public static void main(String args[]){
           laptop l1= new laptop();
           l1.setPrice(31);
           System.out.println(l1.getPrice());
           l1.setRam(32);
           System.out.println(l1.getRam());
    }
    // public void dowork(){
    //     System.out.println("working this class");
    // }
}
class laptop{
    int ram;
    private int price;
    
    public void setPrice(int price){
        boolean isAdmin=true;
        if(!isAdmin){
            System.out.println("you can not set the price");
        }else{
            this.price=price;
        }
       
    }
    public int getPrice(){
       return price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}
