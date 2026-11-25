package Week5;

public class Motor {

    // Instance variables
    private String brand;
    private double speed;
    private boolean isRunning;

    // Constructor
    public Motor(String brand, double speed, boolean isRunning) {
        this.brand = brand;
        this.speed = speed;
        this.isRunning = isRunning;
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public double getSpeed() {
        return speed;
    }

    public boolean isRunning() {
        return isRunning;
    }

    // Setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Set speed only if motor is running
    public void setSpeed(double speed) {
        if (isRunning) {
            if (speed >= 0) {
                this.speed = speed;
                System.out.println(brand + " speed set to " + speed + " RPM.");
            } else {
                System.out.println("Speed cannot be negative.");
            }
        } else {
            System.out.println(brand + " is currently stopped. Start the motor before setting speed.");
        }
    }

    // Start motor
    public void run() {
        if (!isRunning) {
            isRunning = true;
            System.out.println(brand + " motor started.");
        } else {
            System.out.println(brand + " motor is already running.");
        }
    }

    // Stop motor
    public void stop() {
        if (isRunning) {
            isRunning = false;
            speed = 0.0;
            System.out.println(brand + " motor stopped.");
        } else {
            System.out.println(brand + " motor is already stopped.");
        }
    }

    // Display motor infor
    public void displayInfo() {
        System.out.println("--- " + brand + " Motor Status ---");

        if (isRunning) {
            System.out.println("Status: RUNNING");
        } else {
            System.out.println("Status: STOPPED");
        }

        System.out.println("Speed: " + speed + " RPM");
        System.out.println("-----------------------------");
    }
}


