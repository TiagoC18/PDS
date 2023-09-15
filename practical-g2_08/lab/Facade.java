package lab;

// Subsystem components
class CPU {
    public void processData() {
        System.out.println("Processing data...");
    }
}

class Memory {
    public void load() {
        System.out.println("Loading data into memory...");
    }
}

class HardDrive {
    public void readData() {
        System.out.println("Reading data from hard drive...");
    }
}

// Facade class
class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void startComputer() {
        System.out.println("Starting computer...");
        cpu.processData();
        memory.load();
        hardDrive.readData();
        System.out.println("Computer started successfully.");
    }
}

// Client code
public class Facade {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.startComputer();
    }
}
