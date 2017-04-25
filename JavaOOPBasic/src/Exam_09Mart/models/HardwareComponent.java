package Exam_09Mart.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class HardwareComponent extends Component {

    private List<SoftwareComponent> components;

    protected HardwareComponent(String name, String type) {
        super(name, type);
        this.components = new ArrayList<>();
    }

    public void registerSoftwareComponent(SoftwareComponent softwareComponent){
        this.components.add(softwareComponent);
    }

    public int getCapacityTaken(){
        int capacityTaken = 0;
        for (SoftwareComponent component : components) {
            capacityTaken += component.getCapacity();
        }

        return capacityTaken;
    }

    public int getMemoryTaken(){
        int memoryTaken = 0;
        for (SoftwareComponent component : components) {
            memoryTaken += component.getMemory();
        }

        return memoryTaken;
    }

    public void releaseSoftwareComponent(SoftwareComponent softwareComponent){
        this.components.remove(softwareComponent);
    }

    public List<SoftwareComponent> getComponents() {
        return Collections.unmodifiableList(this.components);
    }
}
