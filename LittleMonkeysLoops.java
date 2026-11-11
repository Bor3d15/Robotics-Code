public class LittleMonkeysLoops {
    public static void main(String[] args) {
        int initialMonkeys = 5; // Initialized variable 

        // Title for section 1 
        System.out.println("=== 1. For Loop: The Nursery Ryhyme Coutdown ===");

        // for loop to coundown from starting number to 1
        for (int i = initialMonkeys; i >= 1; i--) {
            System.out.println(i + "little monkeys jumping on the bed,");
            System.out.println("One fell off and bumped their head!");
            System.out.println("Mama called the doctor and the doctor said,");
            System.out.println("\"No more monkeys jumping on the bed!\"\n");
        } 

        // Title for section 2 
        System.out.println("=== 2. While Loop: Doctor's Checkup Routine ===");

        // Use a while loop to count up 
        int doctorCount = 1;
        while (doctorCount <= initialMonkeys) {
            System.out.println("Doctor is examining monkey #" + doctorCount + "... All cleared!");
            doctorCount++; 
        }
        System.out.println(); 

        // Title for section 3
        System.out.println("=== 3. Do-While Loop: Bedtime Verification ===");

        // do-while for a checkup and it should executes at least once
        int bedCount = initialMonkeys;
        do {
            System.out.println("Tucking in monkey #" + bedCount + "... Fast asleep!");
            bedCount--;
        } while (bedCount >=1);
    }
}
