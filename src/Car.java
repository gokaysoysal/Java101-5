class Car {
    String type;
    String model;
    String color;
    int speed;
    int speedLimit;

    Car(String model, int speed, String color, String type){
        this.model = model;
        this.speed = speed;
        this.color = color;
        this.type = type;
        this.speedLimit = 180;
    }

    void increaseSpeed(int increment) {
        if ((speed + increment) < speedLimit) {
            speed += increment;
        }
    }

    void decreaseSpeed(int decrease) {
        if (speed > 0) {
            speed -= decrease;
        }
    }

    void printSpeed() {
        System.out.println(model + " Hiziniz: " + speed);
    }
    void printInfo(){
        System.out.println("Model \t: " + this.model);
        System.out.println("Color \t: " + this.color);
        System.out.println("Type \t: " + this.type);
        System.out.println("Speed \t: " + this.speed);
        System.out.println("--------------------------");

    }
}
