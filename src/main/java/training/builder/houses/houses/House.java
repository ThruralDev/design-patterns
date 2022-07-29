package training.builder.houses.houses;

public class House {
    private final HouseType houseType;
    private final int doors;
    private final int walls;
    private final int roofs;
    private final int levels;

    private final int windows;

    public HouseType getHouseType() {
        return houseType;
    }

    public String getHouse() {
        return
                "houseType=" + houseType +
                "\ndoors=" + doors +
                "\nwalls=" + walls +
                "\nroofs=" + roofs +
                "\nlevels=" + levels +
                "\nwindows=" + windows;
    }

    public House(HouseType houseType, int doors, int walls, int roofs, int levels, int windows) {
        this.houseType = houseType;
        this.doors = doors;
        this.walls = walls;
        this.roofs = roofs;
        this.levels = levels;
        this.windows = windows;
    }
}
