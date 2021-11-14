/* Anonympous nested class
abstract
interface
if you do not the behaviour
declare method with abstract modifier
if a class is having abstract method then
it is mandatory to create the class with
*/

abstract class Result
{
 abstract public void calculateResult();

}
//class Second extends Result
//{
//    public void calculateResult()
//    {
//        System.out.println("welcome to GLA");
//    }
//}


public class TestAnonymousclass {
    public static void main(String[] args) {
        Result obj1=new Result()
        {
            @Override
            public void calculateResult() {
                System.out.println("hello");
            }
        };
        Result obj2=new Result(){
            @Override
            public void calculateResult() {
                System.out.println("hello hi");
            }
        };
        Result obj3= new Result(){
            @Override
            public void calculateResult() {
                System.out.println("hi!");
            }
        };
    }
}
