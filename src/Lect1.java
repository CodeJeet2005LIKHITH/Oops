public class Lect1 {
    public static void main(String[] args) {
        Student Likhith = new Student("Likhith",21,39.23f);
        System.out.println(Likhith);

    }


}
class Student{
    String Name;
    int roll_no;
    float marks;

    Student(String Name,int roll_no,float marks){
        this.Name = Name;
        this.roll_no = roll_no;
        this.marks = marks;
    }

}
