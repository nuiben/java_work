public class MySuper {
  protected int a = 4;
  protected int b;

  public MySuper() {
    myMethod();
  }

  void myMethod() {
    b = a;
    a++;
    System.out.println("y" + a);
  }
}