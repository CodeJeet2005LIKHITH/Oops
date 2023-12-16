public class finalizeKeyWord {
    public static void main(String[] args) {
        Students obj;
        for(int i=0; i < 1000000000; i++){
            obj = new Students("PandeyJi");
        }
    }

}
class Students{
    String Name;

    public Students(String name){
        System.out.println("Object created");
        this.Name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is Destroyed");
    }
}
