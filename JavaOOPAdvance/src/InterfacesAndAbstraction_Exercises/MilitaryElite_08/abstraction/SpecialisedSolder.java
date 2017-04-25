package InterfacesAndAbstraction_Exercises.MilitaryElite_08.abstraction;

import InterfacesAndAbstraction_Exercises.MilitaryElite_08.interfaces.SpecialisedSoldier_Interface;

/**
 * Created by Mihail on 3/18/2017.
 */
public abstract class SpecialisedSolder extends Private implements SpecialisedSoldier_Interface {

    private String corps;

    public SpecialisedSolder(int id, String firstName, String lastName, Double salary, String corps) {
        super(id, firstName, lastName, salary);
        this.setCorps(corps);
    }

    public void setCorps(String corps) {
        if (!corps.equals("Airforces") && !corps.equals("Marines")) {
            throw new IllegalArgumentException("Wrong corps type!");
        }
        this.corps = corps;
    }

    @Override
    public String getCorps() {
        return this.corps;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Corps: %s\n", this.corps);
    }
}
