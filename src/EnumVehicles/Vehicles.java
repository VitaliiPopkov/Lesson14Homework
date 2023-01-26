package EnumVehicles;

public enum Vehicles {
    CAR("Car", 35000, "green"), TRUCK("Truck", 40000, "red"), MOTO("Motorcycle" +
            " ", 15000, "Black"),
    ;
    private String nameVehicles;
    private int costOfTheVehicles;
    private String color;

    Vehicles(String nameVehicles, int costOfTheVehicles, String color) {
        this.nameVehicles = nameVehicles;
        this.costOfTheVehicles = costOfTheVehicles;
        this.color = color;
    }

    public String getNameVehicles() {
        return nameVehicles;
    }

    public int getCostOfTheVehicles() {
        return costOfTheVehicles;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return nameVehicles + " " + costOfTheVehicles + " " + getColor();
    }
}
