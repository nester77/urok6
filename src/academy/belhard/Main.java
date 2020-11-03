package academy.belhard;

public class Main {

    public static void main(String[] args) {

	Vehicle vehicle1 = new Car(4,4,20000);
	Vehicle vehicle2 = new Car(4,2,50000);
	Vehicle vehicle3 = new Motorcycle(2,320);
	Vehicle vehicle4 = new Motorcycle(3,180);

	vehicle1.printInfo();
	vehicle2.printInfo();
	vehicle3.printInfo();
	vehicle4.printInfo();
    }
}
