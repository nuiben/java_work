// Smartphone.java
public class Smartphone implements GPS, Radio {
    public void getPosition() {
        System.out.println("I am here");
    }

    public void startRadio() {
        System.out.println("Start Radio");
    }

    public void stopRadio() {
        System.out.println("Stop Radio");
    }

    public static void main(String[] args) {
        Smartphone obj = new Smartphone();
        obj.startRadio();
        obj.stopRadio();
        obj.getPosition();
    }
}