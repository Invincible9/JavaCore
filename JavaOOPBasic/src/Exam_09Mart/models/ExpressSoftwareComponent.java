package Exam_09Mart.models;

public class ExpressSoftwareComponent extends SoftwareComponent {

    public ExpressSoftwareComponent(String name, int capacity, int memory) {
        super(name, "Express");
        this.setCapacity(capacity);
        this.setMemory(memory);
    }

    @Override
    public void setMemory(int memory) {
        int expressSofMem = memory * 2;
        super.setMemory(expressSofMem);
    }
}
