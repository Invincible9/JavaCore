package InterfacesAndAbstraction_Exercises.MilitaryElite_08.interfaces;

import InterfacesAndAbstraction_Exercises.MilitaryElite_08.abstraction.Private;

import java.util.Set;

/**
 * Created by Mihail on 3/18/2017.
 */
public interface LeutenantGeneral_Interface extends Private_Interface{

    void addElement(Private p);
    Set<Private> getPrivateSet();
}
