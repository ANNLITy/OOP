public class Car {
    public String brand;
    public String model;
    public double engineVolume;
    public String color;
    public int year;
    public String country;

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                '}';
    }


    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        String Default = "default";
        String DefaultColour = "Белый";
        if (brand == null || brand.equals("")) {
            this.brand = Default;
        }else {
            this.brand = brand;
        }
        if (model == null || model.equals("")) {
            this.model = Default;
        }else {
            this.model = model;
        }
        if (engineVolume<=0){
            this.engineVolume=1.5;
        }else {
            this.engineVolume = engineVolume;
        }
        if (color == null || color.equals("")) {
            this.color = DefaultColour;
        }else {
            this.color = color;
        }
        if (year<=0){
            this.year=2000;
        }else {
            this.year = year;
        }
        if (country == null || country.equals("")) {
            this.country = Default;
        }else {
            this.country = country;
        }
        }


    }

