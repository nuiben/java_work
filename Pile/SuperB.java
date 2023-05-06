public class SuperB {
  protected int a = 2;
  protected int b = 3;

  public SuperB() {
    a += 1;
    b += 2;
    System.out.print("-b" + b);
  }

  public SuperB(int i) {
    this();
    b -= 1;
    System.out.print("-b" + a);
    a -= 1;
  }

  public int getB(){
    this.a += 2;
    this.b += 4;
    return b - a;
  }
}