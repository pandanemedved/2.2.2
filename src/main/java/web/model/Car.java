package web.model;


public class Car {
    private String name;
    private int serial;
    private int mileage;

    public Car(String name, int serial, int mileage) {
        this.mileage = mileage;
        this.name = name;
        this.serial = serial;
    }

    public String getName() {
        return name;
    }

    public int getSerial() {
        return serial;
    }

    public int getMileage() {
        return mileage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
