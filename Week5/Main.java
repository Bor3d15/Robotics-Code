package Week5;
public class Main {
    public static void main(String[] args) {
        // Create motor objects
        Motor motor1 = new Motor("SparkMAX", 0.0, false);
        Motor motor2 = new Motor("Falcon", 0.0, false); 
        
        // Test motor 1
        System.out.println("=== TESTING MOTOR 1 ===");

        motor1.displayInfo();

        motor1.setSpeed(2500.5);

        motor1.run();

        motor1.setSpeed(2500.5);

        motor1.displayInfo();

        motor1.stop();

        motor1.displayInfo();

        motor1.setBrand("SparkMAX V2");
        System.out.println("Updated brand: " + motor1.getBrand());

        // Test Motor 2 
        System.out.println("\n=== TESTING MOTOR 2 ===");

        motor2.displayInfo();

        motor2.setSpeed(1800.5);

        motor2.run();

        motor2.setSpeed(1800.5);

        motor2.displayInfo();

        motor2.stop();

        motor2.displayInfo();

        motor2.setBrand("Falcon V2");
        System.out.println("Updated brand: " + motor2.getBrand());

        // Execution
        System.out.println("\n=== TESTING GETTERS ===");

        System.out.println("Motor 1 Brand: " + motor1.getBrand());
        System.out.println("Motor 1 Speed: " + motor1.getSpeed());
        System.out.println("Motor 1 Running: " + motor1.isRunning());

        System.out.println("Motor 2 Brand: " + motor2.getBrand());
        System.out.println("Motor 2 Speed: " + motor2.getSpeed());
        System.out.println("Motor 2 Running: " + motor2.isRunning());
    }
}