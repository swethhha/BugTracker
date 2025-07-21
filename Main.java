public class Main {
    public static void main(String[] args) {
        System.out.println("Bug Tracker Backend is running in Java");

        // Backend functionality: Displaying bug status
        String[] bugs = {
            "Bug 1: UI not responsive",
            "Bug 2: API request failing",
            "Bug 3: Authentication issue"
        };

        System.out.println("\nBug List:");
        for (String bug : bugs) {
            System.out.println(bug);
        }

        // Simulate bug resolution status
        System.out.println("\nBug Resolution Status:");
        for (String bug : bugs) {
            System.out.println(bug + " - Status: Pending");
        }
    }
}
