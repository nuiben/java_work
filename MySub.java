  public class MySub extends SuperA {

    public MySub() {
      System.out.print("-b" + a);
      System.out.print("-b" + b);
      System.out.print("-b" + getB());
    }

    public static void main(String[] args){
      MySub mySub = new MySub();
    }
  }