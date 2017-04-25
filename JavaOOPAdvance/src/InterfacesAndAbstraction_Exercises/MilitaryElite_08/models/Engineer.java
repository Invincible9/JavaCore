package InterfacesAndAbstraction_Exercises.MilitaryElite_08.models;

import InterfacesAndAbstraction_Exercises.MilitaryElite_08.abstraction.SpecialisedSolder;
import InterfacesAndAbstraction_Exercises.MilitaryElite_08.interfaces.Engineer_Interface;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Mihail on 3/18/2017.
 */
public class Engineer extends SpecialisedSolder implements Engineer_Interface {
    private Set<Repairs> repairsSet;

    public Engineer(int id, String firstName, String lastName, Double salary, String corps) {
        super(id, firstName, lastName, salary, corps);
        this.repairsSet = new HashSet<>();
    }

    @Override
    public void addRepairs(Repairs repairs){
        if(this.repairsSet == null){
            throw new IllegalArgumentException("Invalid repair");
        }

        this.repairsSet.add(repairs);
    }

    public void setRepairsSet(Set<Repairs> repairsSet) {
        this.repairsSet = repairsSet;
    }

    @Override
    public Set<Repairs> getRepairsSet() {
        return Collections.unmodifiableSet(this.repairsSet);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Name: %s %s Id: %d Salary: %.2f\n", super.getFirstName(), super.getLastName(),
                super.getId(), super.getSalary()));
        sb.append(String.format("Corps: %s\n", super.getCorps()));
        sb.append("Repairs:\n");
        for (Repairs repairs : repairsSet) {
            sb.append(String.format("  Part Name: %s Hours Worked: %d\n", repairs.getPartName(), repairs.getHoursWorked()));
        }
        return sb.toString().trim();
    }
}
