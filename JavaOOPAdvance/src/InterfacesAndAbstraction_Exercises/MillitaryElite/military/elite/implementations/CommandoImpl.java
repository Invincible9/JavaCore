package InterfacesAndAbstraction_Exercises.MillitaryElite.military.elite.implementations;

import InterfacesAndAbstraction_Exercises.MillitaryElite.military.elite.interfaces.Commando;
import InterfacesAndAbstraction_Exercises.MillitaryElite.military.elite.interfaces.Mission;

import java.util.ArrayList;
import java.util.Collection;


public class CommandoImpl extends SpecialisedSoldierImpl implements Commando {
    private Collection<Mission> missions;

    public CommandoImpl(int id, String firstName, String lastName, double salary, String corps,
                        Collection<Mission> missions) {
        super(id, firstName, lastName, salary, corps);
        this.setMissions(missions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString()).append(System.lineSeparator());
        sb.append("Missions:").append(System.lineSeparator());
        this.getMissions().forEach(m -> sb.append("  ").append(m).append(System.lineSeparator()));
        return sb.toString();
    }

    @Override
    public Collection<Mission> getMissions() {
        return this.missions;
    }

    private void setMissions(Collection<Mission> missions) {
        if (missions != null) {
            this.missions = new ArrayList<>(missions);
            return;
        }
        this.missions = new ArrayList<>();
    }
}
