import java.util.List;
import java.util.Scanner;

public class Main {
    private static final String RULES_FILE = "data/rules.txt";

    public static void main(String[] args) {
        RecommendationEngine engine = new RecommendationEngine(RULES_FILE);
        Scanner scanner = new Scanner(System.in);

        System.out.println("============================================");
        System.out.println(" Rule-Based Recommendation System (Java)");
        System.out.println("============================================");
        System.out.println("Loaded rules: " + engine.getRuleCount());

        boolean keepRunning = true;
        while (keepRunning) {
            showMenu();
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    runRecommendationFlow(engine, scanner);
                    break;
                case "2":
                    printDomainHints();
                    break;
                case "0":
                    keepRunning = false;
                    System.out.println("Thanks for using the recommendation system.");
                    break;
                default:
                    System.out.println("Invalid option. Please choose 1, 2, or 0.");
            }
        }
      
        scanner.close();
    }

    private static void showMenu() {
        System.out.println();
        System.out.println("Choose an option:");
        System.out.println("1. Get recommendations");
        System.out.println("2. View example input values");
        System.out.println("0. Exit");
        System.out.print("Enter choice: ");
    }

    private static void runRecommendationFlow(RecommendationEngine engine, Scanner scanner) {
        System.out.print("Enter interest (e.g., programming, backend, data-science): ");
        String interest = scanner.nextLine();

        System.out.print("Enter level (beginner/intermediate/advanced): ");
        String level = scanner.nextLine();

        User user = new User(interest, level);
        List<Rule> recommendations = engine.getRecommendations(user);

        System.out.println();
        if (recommendations.isEmpty()) {
            System.out.println("No direct match found for your input.");
            System.out.println("Tip: Try values shown in the example input menu.");
            return;
        }

        System.out.println("Recommended items:");
        for (int i = 0; i < recommendations.size(); i++) {
            Rule rule = recommendations.get(i);
            System.out.println((i + 1) + ". " + rule.getRecommendation());
            System.out.println("   Reason: " + rule.getReason());
        }
    }

    private static void printDomainHints() {
        System.out.println();
        System.out.println("Example Interests:");
        System.out.println("- programming");
        System.out.println("- movies");
        System.out.println("- books");
        System.out.println("- fitness");
        System.out.println("- travel");
        System.out.println("- food");
        System.out.println("- music");
        System.out.println("- career");
        System.out.println("- finance");
        System.out.println("- gaming");
        System.out.println("- language-learning");
        System.out.println("- home-decor");
        System.out.println();
        System.out.println("Example Levels:");
        System.out.println("- beginner");
        System.out.println("- intermediate");
        System.out.println("- advanced");
    }
}
