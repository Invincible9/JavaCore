package EncapsulationExercises_Lection5.AnimalFarm_03;

/**
 * Created by Mihail on 2/24/2017.
 */
public class Chicken {
    private String name;
    private Integer age;
    private String productPerDay;

    public Chicken(String name, Integer age) {
        this.setName(name);
        this.setAge(age);
        calculateProductPerDay();
    }

    public void setName(String name) {
        if (name.length() < 1 || name.equals("null") || name.equals(" ")) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    public void setAge(Integer age) {
        if (age < 0 || age > 15) {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    public String getProductPerDay() {
        return productPerDay;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setProductPerDay(String productPerDay) {
        this.productPerDay = productPerDay;
    }

    private void calculateProductPerDay() {
        if (this.getAge() >= 0 && this.getAge() < 6) {
            this.productPerDay = "2";
        } else if (this.getAge() >= 6 && this.getAge() < 12) {
            this.productPerDay = "1";
        } else {
            this.productPerDay = "0.75";
        }
    }

    @Override
    public String toString() {
        return String.format("Chicken %s (age %d) can produce %s eggs per day.", this.getName(), this.getAge(), this.getProductPerDay());
    }
}