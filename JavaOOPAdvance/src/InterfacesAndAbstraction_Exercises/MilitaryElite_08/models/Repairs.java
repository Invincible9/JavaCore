package InterfacesAndAbstraction_Exercises.MilitaryElite_08.models;

import InterfacesAndAbstraction_Exercises.MilitaryElite_08.interfaces.Repairs_Interface;

/**
 * Created by Mihail on 3/18/2017.
 */
public class Repairs implements Repairs_Interface {

    private String partName;
    private int hoursWorked;

    public Repairs(String partName, int hoursWorked) {
        this.setPartName(partName);
        this.setHoursWorked(hoursWorked);
    }

    private void setPartName(String partName) {
        this.partName = partName;
    }

    private void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String getPartName() {
        return this.partName;
    }

    @Override
    public int getHoursWorked() {
        return this.hoursWorked;
    }
}
