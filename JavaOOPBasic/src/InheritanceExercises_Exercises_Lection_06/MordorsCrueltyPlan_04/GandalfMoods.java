package InheritanceExercises_Exercises_Lection_06.MordorsCrueltyPlan_04;

/**
 * Created by Mihail on 3/2/2017.
 */
public class GandalfMoods extends ConsumedFood {
    private String mood;

    public String getMood() {
        return this.mood;
    }

    public void setMood() {
        if (this.getHappinessPoints() < -5) {
            this.mood = "Angry";
        } else if (this.getHappinessPoints() >= -5 && this.getHappinessPoints() < 0) {
            this.mood = "Sad";
        } else if (this.getHappinessPoints() >= 0 && this.getHappinessPoints() <= 15) {
            this.mood = "Happy";
        } else if (this.getHappinessPoints() > 15) {
            this.mood = "JavaScript";
        }
    }

}
