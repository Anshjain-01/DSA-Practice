public class extendss {
    public static void main(String args[]){
            car c1=new car();
            
    }

}
class Vehicle{
    private String name;
    String driverName;
    
    void setname(String name ,String driverName){
        this.name=name;
        this.driverName=driverName;
    }
    void start(){
        System.out.println("The car"+name +"is started");
    }
}
class car extends Vehicle{
    void drive(){
        System.out.println("The driver name :"+driverName+"is driving the car ");
    }
}