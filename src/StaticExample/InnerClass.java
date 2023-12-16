package StaticExample;

public class InnerClass {
    static class Student{
         String name;

         Student(String Name){
            this.name = Name;
        }


    }

    public static void main(String[] args) {
        Student Likhith = new Student("Tiwari Ji");


        Student Rahul = new Student("Pandey Ji");


        System.out.println(Likhith.name);
        System.out.println(Rahul.name);
    }

}
