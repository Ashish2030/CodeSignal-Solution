public class Main {
    public static boolean reachNextLevel(int experience, int threshold, int reward) {
        if (experience + reward >= threshold) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // Example usage
        int experience = 100;
        int threshold = 200;
        int reward = 50;
        boolean result = reachNextLevel(experience, threshold, reward);
        System.out.println("Result: " + result);
    }
}
