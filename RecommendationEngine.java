import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecommendationEngine {
    private final List<Rule> rules = new ArrayList<>();

    public RecommendationEngine(String rulesFilePath) {
        loadRulesFromFile(rulesFilePath);
    }

    private void loadRulesFromFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineNumber = 0;
            while ((line = reader.readLine()) != null) {
                lineNumber++;
                line = line.trim();
                if (line.isEmpty() || line.startsWith("#")) {
                    continue;
                }

                String[] parts = line.split("\\|", -1);
                if (parts.length != 4) {
                    System.out.println("Skipping invalid rule at line " + lineNumber + ": " + line);
                    continue;
                }

                rules.add(new Rule(parts[0], parts[1], parts[2], parts[3]));
            }
        } catch (IOException ex) {
            System.out.println("Could not load rules file: " + ex.getMessage());
        }
    }

    public List<Rule> getRecommendations(User user) {
        if (user == null) {
            return Collections.emptyList();
        }

        List<Rule> matches = new ArrayList<>();
        for (Rule rule : rules) {
            if (rule.matches(user)) {
                matches.add(rule);
            }
        }
        return matches;
    }

    public int getRuleCount() {
        return rules.size();
    }
}
