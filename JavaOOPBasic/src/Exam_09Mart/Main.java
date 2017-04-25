//package Exam_09Mart;
//
//import sistemSplit.commands.TheSystem;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class Main {
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
//
//        TheSystem system = new TheSystem();
//        while (true) {
//            String input = console.readLine();
//            if ("System Split".equals(input)) {
//                system.split();
//                break;
//            }
//
//            String[] commandArgs = input.split("\\(|\\)");
//            String command = commandArgs[0];
//
//            if (!command.equals("Analyze")) {
//                String[] paramArgs = commandArgs[1].split(", ");
//                switch (command) {
//                    case "RegisterPowerHardware":
//                        String nameP = paramArgs[0];
//                        int capacityP = Integer.parseInt(paramArgs[1]);
//                        int memoryP = Integer.parseInt(paramArgs[2]);
//                        system.registerPowerHardware(nameP, capacityP, memoryP);
//                        break;
//                    case "RegisterHeavyHardware":
//                        String nameH = paramArgs[0];
//                        int capacityH = Integer.parseInt(paramArgs[1]);
//                        int memoryH = Integer.parseInt(paramArgs[2]);
//                        system.registerHeavyHardware(nameH, capacityH, memoryH);
//                        break;
//                    case "RegisterExpressSoftware":
//                        String hardName = paramArgs[0];
//                        String softName = paramArgs[1];
//                        int capacityE = Integer.parseInt(paramArgs[2]);
//                        int memoryE = Integer.parseInt(paramArgs[3]);
//                        system.registerExpressSoftware(hardName,softName, capacityE, memoryE);
//                        break;
//                    case "RegisterLightSoftware":
//                        String hardNameL = paramArgs[0];
//                        String softNameL = paramArgs[1];
//                        int capacityL = Integer.parseInt(paramArgs[2]);
//                        int memoryL = Integer.parseInt(paramArgs[3]);
//                        system.registerLightSoftware(hardNameL, softNameL, capacityL, memoryL);
//                        break;
//                    case "ReleaseSoftwareComponent":
//                        String hardNameR = paramArgs[0];
//                        String softNameR = paramArgs[1];
//                        system.releaseSoftwareComponent(hardNameR, softNameR);
//                        break;
//                }
//            } else {
//                system.analyze();
//            }
//        }
//    }
//}
