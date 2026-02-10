public class User {
    private final String interest;
    private final String level;

    public User(String interest, String level) {
        this.interest = normalize(interest);
        this.level = normalize(level);
    }

    public String getInterest() {
        return interest;
    }

    public String getLevel() {
        return level;
    }

    private String normalize(String value) {
        return value == null ? "" : value.trim().toLowerCase();
    }
}
