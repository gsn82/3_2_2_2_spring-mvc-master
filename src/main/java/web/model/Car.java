package web.model;


public class Car {

    private String model;
    private int horsepower;
    private int series;

    public Car() {
    }

    public Car(String model, int horsepower, int series) {
        this.model = model;
        this.horsepower = horsepower;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}