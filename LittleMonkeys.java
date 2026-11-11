public class LittleMonkeys {
    public static void main(String[] args) {
        int monkeyCount = 7;
        boolean isJumping = true;

        // Ternary Operator to determine the state
        String state = isJumping ? "jumping on the bed!" : "not jumping on the bed."; 

        // Printing the state 
        System.out.println(monkeyCount + " little monkeys are " + state);

        // If-else statment 
        if (monkeyCount == 0) {
            System.out.println("There are no monkeys!");
        } else if (!isJumping) {
            System.out.println("No one's jumping right now."); 
        } else if (monkeyCount > 0 && isJumping) {
            System.out.println("One fell off and bumped their head! Mama called the doctor, and the doctor said:");
        }

        // Switch 
            switch (monkeyCount) {
                case 1:
                    System.out.println("\"Put that little monkey right to bed!\"");
                    break;
                case 7:
                    System.out.println("\"No more monkeys jumping on the bed!\"");
                    break;
                default: // Runs when their are no matches found
                    System.out.println("\"No more monkeys jumping on the bed!\"");
                    break;
            }
    }
    
}
