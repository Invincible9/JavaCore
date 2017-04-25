package InterfacesAndAbstraction_Exercises.MilitaryElite_08.models;

import InterfacesAndAbstraction_Exercises.MilitaryElite_08.abstraction.Private;
import InterfacesAndAbstraction_Exercises.MilitaryElite_08.interfaces.LeutenantGeneral_Interface;

import java.util.*;

/**
 * Created by Mihail on 3/18/2017.
 */
public class LeutenantGeneral extends Private implements LeutenantGeneral_Interface {
    private Set<Private> privateSet;

    public LeutenantGeneral(int id, String firstName, String lastName, Double salary) {
        super(id, firstName, lastName, salary);
        this.privateSet = new HashSet<>();
    }

    @Override
    public void addElement(Private person) {
        if (this.privateSet == null) {
            throw new IllegalArgumentException("Invalid person");
        }
        this.privateSet.add(person);
    }

    public void setPrivateSet(Set<Private> privateSet) {
        this.privateSet = privateSet;
    }

    @Override
    public Set<Private> getPrivateSet() {
        return Collections.unmodifiableSet(this.privateSet);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Name: %s %s Id: %d Salary: %.2f\n", super.getFirstName(), super.getLastName(),
                super.getId(), super.getSalary()));
        sb.append("Privates:\n");
        for (Private aPrivate : privateSet) {
            sb.append(String.format("  Name: %s %s Id: %d Salary: %.2f\n", aPrivate.getFirstName(), aPrivate.getLastName(),
                    aPrivate.getId(), aPrivate.getSalary()));
        }
        return sb.toString().trim();
    }

}
