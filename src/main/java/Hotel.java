public class Hotel {
    
    private String name;
    private int classification, regular_daily_fee, regular_weekend_fee, rewards_daily_fee, rewards_weekend_fee;

    public Hotel(String name, int classification, int regular_daily_fee, int regular_weekend_fee, int rewards_daily_fee, int rewards_weekend_fee) {

        this.name = name;
        this.classification = classification;
        this.regular_daily_fee = regular_daily_fee;
        this.regular_weekend_fee = regular_weekend_fee;
        this.rewards_daily_fee = rewards_daily_fee;
        this.rewards_weekend_fee = rewards_weekend_fee;
    }

    public String getName() {
        return name;
    }

    public int getClassification() {
        return classification;
    }

    public int getRegularDailyFee() {
        return regular_daily_fee;
    }

    public int getRegularWeekendFee() {
        return regular_weekend_fee;
    }

    public int getRewardsDailyFee() {
        return rewards_daily_fee;
    }

    public int getRewardsWeekendFee() {
        return rewards_weekend_fee;
    }

    public void setClassification(int classification) {
        this.classification = classification;
    }

    public void setRegularDailyFee(int regular_daily_fee) {
        this.regular_daily_fee = regular_daily_fee;
    }

    public void setRegularWeekendFee(int regular_weekend_fee) {
        this.regular_weekend_fee = regular_weekend_fee;
    }

    public void setRewardsDailyFee(int rewards_daily_fee) {
        this.rewards_daily_fee = rewards_daily_fee;
    }

    public void setRewardsWeekendFee(int rewards_weekend_fee) {
        this.rewards_weekend_fee = rewards_weekend_fee;
    }

    @Override
    public String toString() {
        return getName();
    }
}