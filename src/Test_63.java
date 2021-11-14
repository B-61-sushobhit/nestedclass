class first
{
    int num1;
    public first()

    {//super();
        System.out.println("first constructor");
    }
}
class second1 extends first {
    second1()
    {//super();
        System.out.println("second constructor");
    }
}
class third extends second1{
    third()
    {//super();
        System.out.println("third constructor");
    }
}


public class Test_63 {
    public static void main(String[] args) {
        third obj=new third();//invocation is bottom to up side and execution is  top to bottom

    }

}
