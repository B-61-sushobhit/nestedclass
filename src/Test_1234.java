class a1 {
    int a;
     public a1(int a)
    {
        System.out.println("first constructor" +a);
    }
}
class a2 {
    int b,c;
     public a2(int b,int c)
    {
        System.out.println("second constructor" +b+ " "+c);

    }
}
class a3{
    int ta,tb,tc;
    public a3(int ta,int tb,int tc)
    {
        System.out.println("third constructor"+ta+" "+tb+" "+tc);
    }}

public class Test_1234 {
    public static void main(String[] args) {
        a3 obj=new a3(12,24,67);
    }
}
