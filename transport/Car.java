public class Car extends Transport {
    private String transmission;

    private final String body;

    private int number;

    private final int places;

    public Car(String brand, String model, String color, int year, String country, int maxSpeed, double engineVolume, String body, int places, String transmission, int number, String rubber) {
        super(brand, model, color, year, country, maxSpeed);

        this.body = body;
        this.places = places;
        this.transmission=transmission;
        this.number=number;
        this.rubber=rubber;
    }

    private String rubber;

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

    public String getRubber() {
        return rubber;
    }


    public void setTransmission(String transmission) {
        String Default = "АКПП";
        if (transmission == null || transmission.equals("")) {
            this.transmission = Default;
        } else {
            this.transmission = transmission;
        }
    }


    public void setNumber(int number) {
        this.number = number;
    }

    public void setRubber(String rubber) {
        this.rubber = rubber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", color='" + getColor() + '\'' +
                ", year=" + getYear() +
                ", country='" + getCountry() + '\'' +
                ", maxSpeed='" + getMaxSpeed()+'\''+
                ", transmission='" + transmission + '\'' +
                ", body='" + body + '\'' +
                ", number=" + number + '\'' +
                ", places=" + places + '\'' +
                ", rubber=" + rubber + '\'' +
                '}';
    }


    public static class Key {
        private final boolean remoteRunEngine;
        private final boolean withoutKeyAccess;

        public Key(boolean remoteRunEngine, boolean withoutKeyAccess) {
            this.remoteRunEngine = remoteRunEngine;
            this.withoutKeyAccess = withoutKeyAccess;
        }

        public Key() {
            this(false, false);
        }

        public boolean isRemoteRunEngine() {
            return remoteRunEngine;
        }

        public boolean isWithoutKeyAccess() {
            return withoutKeyAccess;
        }
    }
}


