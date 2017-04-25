package JavaOOPBasicExamPreparation09Mart2017.software;

import JavaOOPBasicExamPreparation09Mart2017.abstraction.SoftwareComponent;

/**
 * Created by Mihail on 3/11/2017.
 */
public class ExpressSoftwareComponent extends SoftwareComponent {

    private static final String SOFTWARE_TYPE = "Express";
    private static final int DELIMITER = 2;

    public ExpressSoftwareComponent(String name, int capacityConsumption, int capacityMemory) {
        super(name, SOFTWARE_TYPE, capacityConsumption, capacityMemory);
    }

    @Override
    public int getCapacity() {
        return super.getCapacityConsumption();
    }

    @Override
    public int getMemory() {
        return this.calcMemoryConsumption(super.getMemoryConsumption());
    }

    private int calcMemoryConsumption(int memory) {
        return memory * DELIMITER;
    }
}
