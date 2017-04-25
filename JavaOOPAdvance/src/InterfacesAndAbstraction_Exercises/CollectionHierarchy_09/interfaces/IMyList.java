package InterfacesAndAbstraction_Exercises.CollectionHierarchy_09.interfaces;

/**
 * Created by Mihail on 3/19/2017.
 */
public interface IMyList extends IAddRemoveCollection{
    void add(String element);
    int Used();
    void printElements();
}
