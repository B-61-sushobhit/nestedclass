interface i1
{

    void m1();// or we can also write public abstract void m1();

}

//class one implements i1{
//    @Override
//    public void m1() {
//        System.out.println("hiii");
//    }
//}
public class Testing {
    public static void main(String[] args) {
       i1 obj = new i1()
       {
           @Override
           public void m1() {
               System.out.println("welcome to java");

           }
       };
       obj.m1();
    }
}
