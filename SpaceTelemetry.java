
public class SpaceTelemetry {
    public static void main(String[] args) {
        byte RoverID = 0b11010; // Sector 26
        int R_ID = RoverID; // Type casts the RoverID to an int

        int Status = 0x2D; // 45 
        long Distance = 573400000; // Meters

        float batterylevel = 76.5f;
        float powerConsumed = (100 - batterylevel);

        double ob_speed = 583.74; // km/h 
        int hud_speed = (int) ob_speed;
        int tick = 1; // For the mission cycle  
        ++tick; // Increment
        char signalGrade = 'B'; 
        boolean oxygenOK = true; 

        boolean isSystemFunctioning = (batterylevel > 20.0f && oxygenOK == true); 

        // Execution
        System.out.println("==================================================");
        System.out.println("             MARS ROVER TELEMETRY HUB             ");
        System.out.println("==================================================");
        System.out.println("Mission Cycle             : " + tick);
        System.out.println("Sector ID (Binary 0b11010): " + R_ID); 
        System.out.println("System Hex Status         : " + Status);
        System.out.println("Distance Traveled         : " + Distance);
        System.out.println("Signal Grade              : " + signalGrade);
        System.out.println("--------------------------------------------------");
        System.out.println("Orbital Speed (Exact)     : " + ob_speed + " km/h");
        System.out.println("HUD Display Speed (int)   : " + hud_speed + " km/h");
        System.out.println("Power Consumed            : " + powerConsumed + "%");
        System.out.println("System Nominal            : " + isSystemFunctioning);    

    }
}
