package Exam_09Mart.models;

public class LightSoftwareComponent extends SoftwareComponent {

    public LightSoftwareComponent(String name, int capacity, int memory) {
        super(name, "Light");
        this.setCapacity(capacity);
        this.setMemory(memory);
    }

    @Override
    public void setCapacity(int capacity) {
        int lightSoftCom = capacity + (capacity / 2);
        super.setCapacity(lightSoftCom);
    }

    @Override
    public void setMemory(int memory) {
        int lightSoftMem = memory - (memory / 2);
        super.setMemory(lightSoftMem);
    }
}
