package InheritanceExercises_Exercises_Lection_06.MordorsCrueltyPlan_04;

/**
 * Created by Mihail on 3/2/2017.
 */
public class ConsumedFood {

    private int happinessPoints;

    public int getHappinessPoints() {
        return this.happinessPoints;
    }

    public void calcPoints(String food) {
        switch (food.toLowerCase()) {
            case "cram":
                this.happinessPoints += 2;
                break;
            case "lembas":
                this.happinessPoints += 3;
                break;
            case "apple":
                this.happinessPoints += 1;
                break;
            case "melon":
                this.happinessPoints += 1;
                break;
            case "honeycake":
                this.happinessPoints += 5;
                break;
            case "mushrooms":
                this.happinessPoints -= 10;
                break;
            default:
                this.happinessPoints -= 1;
                break;
        }
    }


}
