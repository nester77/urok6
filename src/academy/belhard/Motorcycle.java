package academy.belhard;

public class Motorcycle extends Vehicle{
    private int maxSpeed;
    private final String NAME_OF_VEHICLE= "Мотоцикл";

     Motorcycle (int weelCount, int maxSpeed) {
         super(weelCount);
         this.maxSpeed=maxSpeed;
     }
    @Override
    protected void printInfo() {
        System.out.println("Транспортное средство: "+NAME_OF_VEHICLE+" - Количество дверей: 0"+" - Количество колес: "+wheelCount);
    }
}
