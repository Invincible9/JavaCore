package JavaOOPBasicExamPreparation09Mart2017.hardware;

import JavaOOPBasicExamPreparation09Mart2017.abstraction.HardwareComponent;

/**
 * Created by Mihail on 3/11/2017.
 */
public class PowerHardwareComponent extends HardwareComponent {

    private static final String HARDWARE_TYPE = "Power";
    private static final int DELIMITER = 4;
    private static final int MULTIPLY = 3;

    public PowerHardwareComponent(String name, int maximumCapacity, int maximumMemory) {
        super(name, HARDWARE_TYPE, maximumCapacity, maximumMemory);
    }

    @Override
    public int getCapacity() {
        return this.calcCapacity(super.getMaximumCapacity());
    }

    @Override
    public int getMemory() {
        return this.calcMemory(super.getMaximumMemory());
    }

    private int calcCapacity(int capacity) {
        return capacity - ((capacity * MULTIPLY) / DELIMITER);
    }

    private int calcMemory(int memory) {
        return memory + ((memory * MULTIPLY) / DELIMITER);
    }
}
