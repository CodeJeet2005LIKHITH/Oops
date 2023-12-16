public class Lect1 {
    public static void main(String[] args) {
        Student Likhith = new Student("Likhith",21,39.23f);
        Student Rahul = new Student(Likhith);
        Student Himanshu = Likhith;
//        System.out.println(Rahul.marks);
//        System.out.println(Likhith);
//        Likhith.changeName("Kunal");
//        Likhith.greeting();
        System.out.println(Himanshu.marks);
        Student Pandey = new Student();
        System.out.println(Pandey.Name);



    }


}
class Student{
    String Name;
    int roll_no;
    float marks;

    void greeting(){
        System.out.println("Hi " + this.Name);
    }
    void changeName(String Name){
        this.Name = Name;
    }
    Student(String Name,int roll_no,float marks){
        this.Name = Name;
        this.roll_no = roll_no;
        this.marks = marks;
    }
    Student(Student RandomStudent){
        this.Name = RandomStudent.Name;
        this.roll_no = RandomStudent.roll_no;
        this.marks = RandomStudent.marks;
    }
    Student(){
        this("Rahul Pandey",29,99.999f);
    }

}
