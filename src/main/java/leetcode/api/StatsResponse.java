package leetcode.api;

public class StatsResponse {
    private final String status;
    private final String message;
    private final int totalSolved;
    private final int easySolved;
    private final int totalEasy;
    private final int mediumSolved;
    private final int totalMedium;
    private final int hardSolved;
    private final int totalHard;
    private final float acceptanceRate;
    private final int ranking;
    private final int contributionPoints;
    private final int reputation;

    public StatsResponse(String status, String message, int totalSolved, int easySolved, int totalEasy, int mediumSolved, int totalMedium, int hardSolved, int totalHard, float acceptanceRate, int ranking, int contributionPoints, int reputation) {
        this.status = status;
        this.message = message;
        this.totalSolved = totalSolved;
        this.easySolved = easySolved;
        this.totalEasy = totalEasy;
        this.mediumSolved = mediumSolved;
        this.totalMedium = totalMedium;
        this.hardSolved = hardSolved;
        this.totalHard = totalHard;
        this.acceptanceRate = acceptanceRate;
        this.ranking = ranking;
        this.contributionPoints = contributionPoints;
        this.reputation = reputation;
    }

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public int getTotalSolved() {
        return totalSolved;
    }

    public int getEasySolved() {
        return easySolved;
    }

    public int getTotalEasy() {
        return totalEasy;
    }

    public int getMediumSolved() {
        return mediumSolved;
    }

    public int getTotalMedium() {
        return totalMedium;
    }

    public int getHardSolved() {
        return hardSolved;
    }

    public int getTotalHard() {
        return totalHard;
    }

    public float getAcceptanceRate() {
        return acceptanceRate;
    }

    public int getRanking() {
        return ranking;
    }

    public int getContributionPoints() {
        return contributionPoints;
    }

    public int getReputation() {
        return reputation;
    }
}
