package Exam_09Mart.commands;

public interface iTheSystem {

	void registerPowerHardware(String name, int capacity, int memory);
	void registerHeavyHardware(String name, int capacity, int memory);
	void registerExpressSoftware(String hardwareComponentName, String name, int capacity, int memory);
	void registerLightSoftware(String hardwareComponentName, String name, int capacity, int memory);
	void releaseSoftwareComponent(String hardwareComponentName, String softwareComponentName);
	void analyze();
	void split();

}
