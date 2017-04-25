package Exam_09Mart.models;

public class HeavyHardwareComponent extends HardwareComponent {

    public HeavyHardwareComponent(String name, int capacity, int memory) {
        super(name, "Heavy");
        this.setCapacity(capacity);
        this.setMemory(memory);
    }

    @Override
    public void setCapacity(int capacity) {
        int heavyHarCap = capacity * 2;
        super.setCapacity(heavyHarCap);
    }

    @Override
    public void setMemory(int memory) {
        int heavyHarMem = memory - (memory / 4);
        super.setMemory(heavyHarMem);
    }
}
