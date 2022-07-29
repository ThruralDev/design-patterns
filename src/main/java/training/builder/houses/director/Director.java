package training.builder.houses.director;

import training.builder.houses.builders.Builder;
import training.builder.houses.houses.HouseType;

public class Director {
    // Builder Interface is passed as constructor.
    public void constructHouseA(Builder builder){
        builder.buildHouseType(HouseType.HOUSE_A);
        builder.buildWalls(4);
        builder.buildWindows(8);
        builder.buildDoors(2);
        builder.buildLevel(1);
        builder.buildRoof(1);
    }

    public void constructHouseB(Builder builder){
        builder.buildHouseType(HouseType.HOUSE_B);
        builder.buildWalls(8);
        builder.buildWindows(1);
        builder.buildDoors(1);
        builder.buildLevel(2);
        builder.buildRoof(1);
    }
}
