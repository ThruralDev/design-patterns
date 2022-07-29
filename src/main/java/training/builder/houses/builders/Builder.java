package training.builder.houses.builders;

import training.builder.houses.houses.HouseType;

public interface Builder {

    void buildHouseType(HouseType type);

    void buildWalls(Integer n);

    void buildWindows(Integer n);

    void buildDoors(Integer n);

    void buildRoof(Integer n);

    void buildLevel(Integer n);
}