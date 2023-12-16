package StaticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    public Human(int age,String Name,int salary,boolean married){
        this.age = age;
        this.name = Name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }
}

