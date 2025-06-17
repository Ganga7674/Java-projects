public class Main4 {
    public static void main(String[] args) {
        int age = 25;
        boolean hasID = true;

        if (age >= 18) {
            if (hasID) {
                System.out.println("Access granted.");
            } else {
                System.out.println("ID required.");
            }
        } else {
            System.out.println("You must be 18 or older.");
        }
    }
}
