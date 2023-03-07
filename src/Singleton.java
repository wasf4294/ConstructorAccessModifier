
//클래스와 생성자의 접근제어자가 다른경우.



final public class Singleton {          //final을 사용한 이유는 생성자가 private이면 상속불가능하다.
    private static Singleton s = new Singleton();       //private는 같은 클래스안에서 사용가능하다.
                                                        //같은 클래스안에서도 상속 불가능하다.
    private Singleton(){
            //...
    }

    public static Singleton getInstance(){
        if (s==null)
            s = new Singleton();
        return s;
    }
    class SingletonTest{
        public static void main(String[] args) {
            Singleton s1 = new Singleton();//같은 클래스 안에서의 접근은 가능하다.
        }
    }
}
class SingletonLast{
    public static void main(String[] args) {
/*        Singleton s2 = new Singleton();     다른 클래스라 접근 불가능하다.*/

        //해결.
        Singleton s = Singleton.getInstance();      //접근가능하다.
    }
}
