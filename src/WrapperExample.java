public class WrapperExample {
    public static void main(String[] args) {
//        int a = 10;We know it wont work
//        int b = 20;

        Integer a = 10;
        Integer b = 20;
        swap(a,b);
        System.out.println(a + " " + b);
//        but why it is not swapping ?
//        Integer Class is a final Class

    }
    static void swap(int a,int b){
        int temp = a;
        a = b;
        b  = temp;
    }
}
