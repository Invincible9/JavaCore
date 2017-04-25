package InterfacesAndAbstraction_Exercises.MilitaryElite_08.interfaces;

import InterfacesAndAbstraction_Exercises.MilitaryElite_08.models.Missions;

import java.util.Set;

/**
 * Created by Mihail on 3/18/2017.
 */
public interface Commando_Interface extends SpecialisedSoldier_Interface {

    void addMission(Missions missions);
    Set<Missions> getMissionsSet();
}
