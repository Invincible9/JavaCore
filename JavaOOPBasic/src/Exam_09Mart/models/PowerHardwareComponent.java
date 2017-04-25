package Exam_09Mart.models;

public class PowerHardwareComponent extends HardwareComponent {

    public PowerHardwareComponent(String name, int capacity, int memory) {
        super(name, "Power");
        this.setCapacity(capacity);
        this.setMemory(memory);
    }

    @Override
    public void setCapacity(int capacity) {
        int powerHardCap = capacity - ((capacity * 3) / 4);
        super.setCapacity(powerHardCap);
    }

    @Override
    public void setMemory(int memory) {
        int powerHardMem = memory + ((memory * 3) / 4);
        super.setMemory(powerHardMem);
    }
}
