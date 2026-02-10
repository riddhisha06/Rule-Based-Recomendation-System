public class Rule {
    private final String interest;
    private final String level;
    private final String recommendation;
    private final String reason;

    public Rule(String interest, String level, String recommendation, String reason) {
        this.interest = normalize(interest);
        this.level = normalize(level);
        this.recommendation = recommendation == null ? "" : recommendation.trim();
        this.reason = reason == null ? "" : reason.trim();
    }

    public boolean matches(User user) {
        if (user == null) {
            return false;
        }
        return interest.equals(user.getInterest()) && level.equals(user.getLevel());
    }

    public String getRecommendation() {
        return recommendation;
    }

    public String getReason() {
        return reason;
    }

    private String normalize(String value) {
        return value == null ? "" : value.trim().toLowerCase();
    }
}
