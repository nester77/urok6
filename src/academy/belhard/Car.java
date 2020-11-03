package academy.belhard;

public class Car extends Vehicle implements Costable{
    private int doorsCount;
    private int cost;
    private final String NAME_OF_VEHICLE= "Машина";

    Car (int wheelCount, int doorsCount, int cost){
        super(wheelCount);
        this.doorsCount=doorsCount;
        this.cost=cost;
    }
    @Override
    protected void printInfo() {
        System.out.println("Транспортное средство: "+NAME_OF_VEHICLE+" - Количество дверей: "+doorsCount+" - Количество колес: "+wheelCount+" - Цена: "+getCost());
    }

    @Override
    public int getCost () {
        return cost;
    }

}
