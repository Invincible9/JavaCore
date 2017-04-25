package JavaOOPBasicExamPreparation09Mart2017;

import JavaOOPBasicExamPreparation09Mart2017.abstraction.HardwareComponent;
import JavaOOPBasicExamPreparation09Mart2017.hardware.HeavyHardwareComponent;
import JavaOOPBasicExamPreparation09Mart2017.hardware.PowerHardwareComponent;
import JavaOOPBasicExamPreparation09Mart2017.software.ExpressSoftwareComponent;
import JavaOOPBasicExamPreparation09Mart2017.software.LightSoftwareComponent;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Mihail on 3/11/2017.
 */
public class TheSystem {

    private Map<String, HardwareComponent> hardwareComponents;

    public TheSystem() {
        this.hardwareComponents = new LinkedHashMap<>();
    }

    public void registerPowerHardware(String name, int capacity, int memory) {
        PowerHardwareComponent powerHardwareComponent = new PowerHardwareComponent(name, capacity, memory);
        this.hardwareComponents.put(name, powerHardwareComponent);
    }

    public void registerHeavyHardware(String name, int capacity, int memory) {
        HeavyHardwareComponent heavyHardwareComponent = new HeavyHardwareComponent(name, capacity, memory);
        this.hardwareComponents.put(name, heavyHardwareComponent);
    }

    public void registerExpressSoftware(String hardwareComponentName, String name, int capacity, int memory) {
        if (this.hardwareComponents.containsKey(hardwareComponentName)) {
            ExpressSoftwareComponent expressSoftwareComponent = new ExpressSoftwareComponent(name, capacity, memory);
            this.hardwareComponents.get(hardwareComponentName).registerSoftwareComponent(expressSoftwareComponent);
        }
    }

    public void registerLightSoftware(String hardwareComponentName, String name, int capacity, int memory) {
        if (this.hardwareComponents.containsKey(hardwareComponentName)) {
            LightSoftwareComponent lightSoftwareComponent = new LightSoftwareComponent(name, capacity, memory);
            this.hardwareComponents.get(hardwareComponentName).registerSoftwareComponent(lightSoftwareComponent);
        }
    }

    public void releaseSoftwareComponent(String hardwareComponentName, String softwareComponentName) {
        if(this.hardwareComponents.containsKey(hardwareComponentName)){
            this.hardwareComponents.get(hardwareComponentName).releaseSoftComponent(softwareComponentName);
        }
    }

    public String analyze() {
        return "";
    }

    public String split() {
        return "";
    }


}
