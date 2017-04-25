package InheritanceExercises_Exercises_Lection_06.Person_01;

/**
 * Created by Mihail on 3/1/2017.
 */
public class Child extends Person {


    public Child(String name, int age) {
        super(name, age);
    }

    @Override
    protected void setAge(int age) throws IllegalArgumentException {
        if(age > 15){
            throw new IllegalArgumentException("Child's age must be lesser than 15!");
        }
        super.setAge(age);
    }


}
