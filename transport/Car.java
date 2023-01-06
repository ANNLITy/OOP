public class Car {
    private final String brand;
    private final String model;
    private final double engineVolume;
    private final String color;
    private final int year;
    private final String country;

    private String transmission;

    private final String body;

    private int number;

    private final int places;

    private Boolean rubber;

    public String getTransmission() {
        return transmission;
    }

    public String getBody() {
        return body;
    }

    public int getPlaces() {
        return places;
    }

    public int getNumber() {
        return number;
    }

    public Boolean getRubber() {
        return rubber;
    }

    public String getBrand() {
        return brand;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setRubber(Boolean rubber) {
        this.rubber = rubber;
    }

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
        this.transmission="АКПП";
        this.body="Седан";
        this.number=555;
        this.places=5;
        this.rubber= Boolean.valueOf("Летняя" );


        }
public static class Key {
        private final boolean remoteRunEngine;
        private final boolean withoutKeyAccess;
        public Key(boolean remoteRunEngine, boolean withoutKeyAccess){
            this.remoteRunEngine= remoteRunEngine;
            this.withoutKeyAccess=withoutKeyAccess;
        }
        public Key() {
            this(false,false);
        }

    public boolean isRemoteRunEngine() {
        return remoteRunEngine;
    }

    public boolean isWithoutKeyAccess() {
        return withoutKeyAccess;
    }
}


    }

