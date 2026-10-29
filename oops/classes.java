class Person{
        String name;
        int age;
        // static int count;
        // public Person(){
        //     count++;
        //     System.out.println("HII My name is Ansh");
        // }
        public Person(int age,String name){
            this.name=name;
            this.age=age;
        }
        void walk(){
            System.out.println(name +" is walking.");
        }
        // void eat(){
        //     System.out.println(name +" is eating.");
        // }
        void walk(int steps){
            System.out.println(name+" walked "+steps);
        }
    }
    class Developer extends Person{
        public Developer(int age,String name){
            super(age,name);
        }
        // run time polymorphism.
        @Override
         void walk(){
            System.out.println("Developer "+ name +" is walking.");
        }
    }
public class classes {
    
   
    public static void main(String args[]){
    //    Person p1=new Person();
    //    p1.name="Ansh";
    //    p1.age=20;
    //    System.out.println(p1.name+" has age "+p1.age);
    //    p1.walk();
    //    p1.eat();
       Person p2=new Person(48,"Nicolas Vendore");
    //    p2.name="Nicolas";
    //    p2.age=48;
       p2.walk();
       p2.walk(3);
    //    System.out.println(Person.count);
    Developer d1=new Developer(23, "Crystene");
    d1.walk(200);
    d1.walk();
    // encapsulation obj=new encapsulation();
    // obj.dowork();
    }
}
