package JavaOOPBasicExamPreparation09Mart2017.abstraction;

/**
 * Created by Mihail on 3/11/2017.
 */
public abstract class SoftwareComponent extends Component {

    private int capacityConsumption;
    private int memoryConsumption;

    public SoftwareComponent(String name, String type, int capacityConsumption, int capacityMemory) {
        super(name, type);
        this.capacityConsumption = capacityConsumption;
        this.memoryConsumption = capacityMemory;
    }

    public int getCapacityConsumption() {
        return capacityConsumption;
    }

    public int getMemoryConsumption() {
        return memoryConsumption;
    }

    protected void setCapacityConsumption(int capacityConsumption) {
        this.capacityConsumption = capacityConsumption;
    }

    protected void setMemoryConsumption(int memoryConsumption) {
        this.memoryConsumption = memoryConsumption;
    }
}
