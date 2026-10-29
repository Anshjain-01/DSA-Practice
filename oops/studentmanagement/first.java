class student{
    private String name;
    private int roll_number;
    private float marks;
    
      public void setdata(String name,int roll_number,float marks){
        this.name=name;
        this.roll_number=roll_number;
        this.marks=marks;
      }
      public void getdata(){
        System.out.println("The name of the student is :"+name);
        System.out.println("The roll number of the student is :"+roll_number);
        System.out.println("The marks of the student is :"+marks);
      }
}
// class display extends student{
      
// }
class first{
    public static void main(String[] args) {
        student s1=new student();
     s1.setdata("ANSH", 220, 95);
        s1.getdata();
    }
}
