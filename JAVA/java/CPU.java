public class CPU {
    
    double price;

    class Processor {
        int cores;
        String manufacturer;

        Processor(int cores, String manufacturer) {
            this.cores = cores;
            this.manufacturer = manufacturer;
        }
    }

    static class RAM {
        int memory;
        String manufacturer;

        RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }
    }

    public static void main(String[] args) {
        CPU cpu = new CPU();
        CPU.Processor processor = cpu.new Processor(4, "Intel");
        CPU.RAM ram = new CPU.RAM(8, "Western Digital");

        System.out.println("Processor Information:");
        System.out.println("Cores: " + processor.cores);
        System.out.println("Manufacturer: " + processor.manufacturer);

        System.out.println("\nRAM Information:");
        System.out.println("Memory: " + ram.memory + "GB");
        System.out.println("Manufacturer: " + ram.manufacturer);
    }
}
