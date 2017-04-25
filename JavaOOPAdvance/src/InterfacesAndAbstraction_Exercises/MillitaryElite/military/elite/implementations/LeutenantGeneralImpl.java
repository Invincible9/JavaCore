package InterfacesAndAbstraction_Exercises.MillitaryElite.military.elite.implementations;

import InterfacesAndAbstraction_Exercises.MillitaryElite.military.elite.interfaces.LeutenantGeneral;
import InterfacesAndAbstraction_Exercises.MillitaryElite.military.elite.interfaces.Private;

import java.util.ArrayList;
import java.util.Collection;

public class LeutenantGeneralImpl extends PrivateImpl implements LeutenantGeneral {
    private Collection<Private> privates;

    public LeutenantGeneralImpl(int id, String firstName, String lastName, double salary, Collection<Private> privates) {
        super(id, firstName, lastName, salary);
        this.setPrivates(privates);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString()).append(System.lineSeparator());
        sb.append("Privates:").append(System.lineSeparator());
        this.getPrivates().forEach(p -> sb.append("  ").append(p).append(System.lineSeparator()));
        return sb.toString();
    }

    @Override
    public Collection<Private> getPrivates() {
        return this.privates;
    }

    private void setPrivates(Collection<Private> privates) {
        if (privates != null) {
            this.privates = new ArrayList<>(privates);
            return;
        }

        this.privates = new ArrayList<>();
    }
}
