public class finalKeyword {
    public static void main(String[] args) {
        final int INCREASE = 2;
//        INCREASE = 3;
//        Giving an Error
//        Always initialize while declaring variable
        final int DECREASE;
        DECREASE = 5;

        final A LIKHITH = new A("CV LIKHITH");
        LIKHITH.Name = "Himanshu Pandey";
//        LIKHITH = new A(); You cannot do it when a non primitive is final you cannot reassign it but you change the values of instance variables



    }


}
class A{
//        final int num;
//        cant do this you should initialzie this  variable when declaration

    String Name =  "LIKHITH";
    int roll = 21;

    A(String Name){
        this.Name = Name;
    }

}
