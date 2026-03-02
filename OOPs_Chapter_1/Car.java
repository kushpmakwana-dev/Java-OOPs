package OOPs_Chapter_1;

public class Car {
    EngineType engine;
    int price;
    int numberOfSeats;

    public Car(EngineType engine, int price, int numberOfSeats) {
        this.engine = engine;
        this.price = price;
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", price=" + price +
                ", numberOfSeats=" + numberOfSeats +
                '}';
    }
}
