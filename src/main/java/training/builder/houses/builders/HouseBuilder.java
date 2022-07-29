package training.builder.houses.builders;

import training.builder.houses.houses.House;
import training.builder.houses.houses.HouseType;

public class HouseBuilder implements Builder {
    private HouseType type;
    private int walls;
    private int windows;
    private int doors;
    private int levels;
    private int roofs;

    @Override
    public void buildHouseType(HouseType type) {
        this.type = type;
    }

    @Override
    public void buildWalls(Integer n) {
        this.walls = n;
    }

    @Override
    public void buildWindows(Integer n) {
        this.windows = n;
    }

    @Override
    public void buildDoors(Integer n) {
        this.doors = n;
    }

    @Override
    public void buildRoof(Integer n) {
        this.roofs = n;
    }

    @Override
    public void buildLevel(Integer n) {
        this.levels = n;
    }

    public House getResult() {
        return new House(type, walls, windows, roofs, levels, doors);
    }
}
