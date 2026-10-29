public class students {
    public static void main(String args[]){
        student st1=new student();
        st1.name="Ansh";
        st1.roll_number=220;
        st1.marks=98.2f;
         student st2=new student();
         st2.name="Nandu";
         st2.roll_number=216;
         st2.marks=99.1f;
         st1.display();
         st2.display();
    }
}
class student{
    String name;
    int roll_number;
    float marks;
    void display(){
        System.out.println(name+" with roll number : "+roll_number +" has marks : "+marks);
    }
}
// better approach
// public class Students {
//     public static void main(String[] args) {

//         Student st1 = new Student("Ansh", 220, 98.2f);
//         Student st2 = new Student("Nandu", 216, 99.1f);

//         st1.display();
//         st2.display();
//     }
// }

// class Student {
//     private String name;
//     private int rollNumber;
//     private float marks;

//     // Constructor
//     Student(String name, int rollNumber, float marks) {
//         this.name = name;
//         this.rollNumber = rollNumber;
//         this.marks = marks;
//     }

//     void display() {
//         System.out.println(
//             name + " with roll number : " + rollNumber + " has marks : " + marks
//         );
//     }
// }