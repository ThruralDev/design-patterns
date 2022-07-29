package training.builder.houses;

import training.builder.houses.builders.HouseBuilder;
import training.builder.houses.director.Director;
import training.builder.houses.houses.House;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        // Initialize House Builder.
        HouseBuilder builder = new HouseBuilder();

        director.constructHouseA(builder);

        House houseA = builder.getResult();
        System.out.println("House build with following attributes:\n" + houseA.getHouse());

        director.constructHouseB(builder);

        House houseB = builder.getResult();
        System.out.println("House build with following attributes:\n" + houseB.getHouse());
    }

}
