public class Transport {
    private String brand;
    private String model;
    private String color;
    private final int year;
    private final String country;
    private int maxSpeed;

    public Transport(String brand, String model, String color, int year, String country, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.country = country;
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        String Default = "default";
        if (brand == null || brand.equals("")) {
            this.brand = Default;
        } else {
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        String Default = "default";
        if (model == null || model.equals("")) {
            this.model = Default;
        } else {
            this.model = model;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        String Default = "default";
        String DefaultColour = "Белый";
        if (color == null || color.equals("")) {
            this.color = DefaultColour;
        } else {
            this.color = color;
        }
    }

    public int getYear() {
        return year;
    }



    public String getCountry() {
        return country;
    }



    public int getMaxSpeed() {
        if(maxSpeed<=0){
            this.maxSpeed=1;
        }
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                '}';
    }



    }

