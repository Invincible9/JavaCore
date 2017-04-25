package InterfacesAndAbstraction_Exercises.MilitaryElite_08.interfaces;

import InterfacesAndAbstraction_Exercises.MilitaryElite_08.models.Repairs;

import java.util.Set;

/**
 * Created by Mihail on 3/18/2017.
 */
public interface Engineer_Interface extends SpecialisedSoldier_Interface {

    void addRepairs(Repairs repairs);
    Set<Repairs> getRepairsSet();
}
