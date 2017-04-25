package JavaOOPBasicExamPreparation09Mart2017.abstraction;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Mihail on 3/11/2017.
 */
public abstract class HardwareComponent extends Component {

    private int maximumCapacity;
    private int maximumMemory;
    private Map<String, SoftwareComponent> registerSoftComp;

    public HardwareComponent(String name, String type, int maximumCapacity, int maximumMemory) {
        super(name, type);
        this.maximumCapacity = maximumCapacity;
        this.maximumMemory = maximumMemory;
        this.registerSoftComp = new LinkedHashMap<>();
    }

    public int getMaximumCapacity() {
        return maximumCapacity;
    }

    public int getMaximumMemory() {
        return maximumMemory;
    }

    public void registerSoftwareComponent(SoftwareComponent softwareComponent) {
        if (this.hasCapacityAndMemory(softwareComponent)) {
            this.registerSoftComp.putIfAbsent(softwareComponent.getName(), softwareComponent);
        }
    }

    public void releaseSoftComponent(String component){
        if(this.registerSoftComp.containsKey(component)){
            this.registerSoftComp.remove(component);
        }
    }

    private boolean hasCapacityAndMemory(SoftwareComponent component) {
        return component.getCapacity() <= this.availableCapacity() && component.getMemory() <= this.availableMemory();
    }

    private int availableCapacity() {
        return this.getCapacity() - this.registerSoftComp.values().stream().mapToInt(Component::getCapacity).sum();
    }

    private int availableMemory() {
        return this.getMemory() - this.registerSoftComp.values().stream().mapToInt(Component::getMemory).sum();
    }


}
