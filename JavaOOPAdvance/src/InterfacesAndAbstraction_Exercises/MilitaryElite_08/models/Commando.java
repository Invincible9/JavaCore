package InterfacesAndAbstraction_Exercises.MilitaryElite_08.models;

import InterfacesAndAbstraction_Exercises.MilitaryElite_08.abstraction.SpecialisedSolder;
import InterfacesAndAbstraction_Exercises.MilitaryElite_08.interfaces.Commando_Interface;


import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Mihail on 3/18/2017.
 */
public class Commando extends SpecialisedSolder implements Commando_Interface {
    private Set<Missions> missionsSet;

    public Commando(int id, String firstName, String lastName, Double salary, String corps) {
        super(id, firstName, lastName, salary, corps);
        this.missionsSet = new HashSet<>();
    }

    @Override
    public void addMission(Missions missions){
        if(this.missionsSet == null){
            throw new IllegalArgumentException("Invalid mission");
        }
        this.missionsSet.add(missions);
    }

    public void setMissionsSet(Set<Missions> missionsSet) {
        this.missionsSet = missionsSet;
    }

    @Override
    public Set<Missions> getMissionsSet() {
        return Collections.unmodifiableSet(this.missionsSet);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("  Name: %s %s Id: %d Salary: %.2f\n", super.getFirstName(), super.getLastName(),
                super.getId(), super.getSalary()));
        sb.append(String.format("Corps: %s\n", super.getCorps()));
        sb.append("Missions:\n");
        for (Missions missions : missionsSet) {
            sb.append(String.format("  Name: %s State: %s\n", missions.getCodeName(), missions.getState()));
        }

        return sb.toString().trim();
    }

}
