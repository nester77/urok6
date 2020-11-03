package academy.belhard;

public abstract class Vehicle {

   protected int wheelCount;

   Vehicle (int wheelCount) {
      this.wheelCount=wheelCount;
   }

   protected abstract void printInfo();

}
