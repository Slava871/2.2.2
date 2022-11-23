package web.model;

public class Car {
    private int series;

    private String color;

    private int maxSpeed;

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Car(int series, String color, int maxSpeed) {
        this.series = series;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

}
