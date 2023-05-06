    public class Car extends Vehicle 
    {
        Car(int pMax, String pColor) {
            super("blue");
            this.maxPassengers = pMax;
        }

        public void main(String[] args) {
            Car car = new Car(6, "red");
            System.out.print(car.color);
        }
    }