public class Bus extends Transport {
    private int doors;
    private int route;
    private String emergencyExit;

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = Integer.parseInt(route);
    }

    public String getEmergencyExit() {
        return emergencyExit;
    }

    public void setEmergencyExit(String emergencyExit) {
        this.emergencyExit = emergencyExit;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", color='" + getColor() + '\'' +
                ", year=" + getYear() +
                ", country='" + getCountry() + '\'' +
                ", maxSpeed='" + getMaxSpeed()+'\''+
                "doors=" + doors +
                ", route=" + route +
                ", emergencyExit='" + emergencyExit + '\'' +
                '}';
    }

    public Bus(String brand, String model, String color, int year, String country, int maxSpeed, int doors, int route, String emergencyExit) {
        super(brand, model, color, year, country, maxSpeed);
        this.doors=doors;
        this.route=route;
        this.emergencyExit=emergencyExit;




    }
}
