package InterfacesAndAbstraction_Exercises.MilitaryElite_08.models;

import InterfacesAndAbstraction_Exercises.MilitaryElite_08.abstraction.Soldier;
import InterfacesAndAbstraction_Exercises.MilitaryElite_08.interfaces.Spy_Interface;

/**
 * Created by Mihail on 3/18/2017.
 */
public class Spy extends Soldier implements Spy_Interface {

    private String codeNumber;

    public Spy(int id, String firstName, String lastName, String codeNumber) {
        super(id, firstName, lastName);
        this.setCodeNumber(codeNumber);
    }

    public void setCodeNumber(String codeNumber) {
        this.codeNumber = codeNumber;
    }

    @Override
    public String getCodeNumber() {
        return this.codeNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Name: %s %s Id: %d\n", super.getFirstName(), super.getLastName(), super.getId()));
        sb.append(String.format("CodeNumber: %s\n", this.getCodeNumber()));
        return sb.toString().trim();
    }
}
