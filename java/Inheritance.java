public class Inheritance {
    public static void main(String[] args) {
        Car car = new Car();
        car.honk();
        System.out.println(car.brand);
        System.out.println(car.getName());
        car.setModelName("Focus");
        System.out.println(car.getName());
    }
}

class Vehicle {
    protected String brand = "Ford";

    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}

class Car extends Vehicle {
    private String modelName = "Mustang";

    public String getName() {
        return brand + " " + modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
}