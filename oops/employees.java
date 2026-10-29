public class employees {
    public static void main(String[] args) {
    //     Employee E1=new Employee();
    //     E1.setters("Nandu", 21, 25000.0f);
    //   System.out.println("Nandu has annual salary :"+E1.calculateAnnualSalary(25000.0f));
    Employee E1=new Employee(21,"Nandu",25000.0f);
    System.out.println(E1.getName()+" has annual salary :"+E1.calculateAnnualSalary());

    }
}
class Employee{
    private int id;
    private String name;
    private float salary;

     Employee(int id ,String name,float salary) {
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    

    // public void setters(String name,int id ,float salary){
    //     this.name=name;
    //     this.id=id;
    //     this.salary=salary;
    // }
    float calculateAnnualSalary(){
        return 12*salary;
    }
    String getName(){
        return name;
    }
}
