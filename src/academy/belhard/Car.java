package academy.belhard;

public class Car extends Vehicle {
    private int doorsCount;
    private final String NAME_OF_VEHICLE= "Машина";

    Car (int wheelCount, int doorsCount){
        super(wheelCount);
        this.doorsCount=doorsCount;
    }
    @Override
    void printInfo () {
        System.out.println("Транспортное средство: "+NAME_OF_VEHICLE+" - Количество дверей: "+doorsCount+" - Количество колес: "+wheelCount);
    }

}


//        Создайте класс Car (наследник класса Vehicle)
//        Добавьте в класс Car поле doorsCount (private int) и создайте конструктор с 2-мя аргументами
//        (wheelCount и doorsCount)
//        Реализуйте в классе Car метод printInfo() - должен выводить на экран информацию о машине
//        (Пример вывода: “Транспортное средство: Машина - Количество дверей: 5 - Количество колес: 4”)
//        Создайте класс Motorcycle (наследник класса Vehicle)
//        Добавьте в класс Motorcycle поле maxSpeed (private int) и создайте конструктор с 2-мя аргументами
//        (wheelCount и maxSpeed)
//        Реализуйте в классе Motorcycle метод printInfo() - должен выводить на экран информацию о мотоцикле
//        (Пример вывода: “Транспортное средство: Мотоцикл- Количество дверей: 0 - Количество колес: 2”)
//        Создайте интерфейс Costable и в него добавьте метод getCost() с возвращаемым типом int
//        Реализуйте интерфейс Costable для класса Car (реализация на ваше усмотрение). Добавить информацию
//        о цене в метод printInfo()
//        Для реализации работы программы создайте по 2 экземпляра классов Car и Motorcycle.
//        Продемонстрировать работу каждого из методов классов и вывести результат на консоль
