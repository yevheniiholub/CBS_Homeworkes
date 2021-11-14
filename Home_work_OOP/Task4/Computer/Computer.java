package Home_work_OOP.Task4.Computer;

public class Computer {
    private String cpuName;
    private String gpuName;
    private int sizeOfRAMInGB;
    private int sizeOfHHDInTB;

    // Конструктор з інінціалізацією кожної змінної класу
    public Computer(String newCPUName, String newGPUName, int newSizeOfRAMInGB, int newSizeOfHHDInTB){
        this.cpuName = newCPUName;
        this.gpuName = newGPUName;
        this.sizeOfRAMInGB = newSizeOfRAMInGB;
        this.sizeOfHHDInTB = newSizeOfHHDInTB;
    }

    //
    // Геттери для кожної змінної класу
    //

    public String getCpuName() {
        return cpuName;
    }

    public String getGpuName() {
        return gpuName;
    }

    public int getSizeOfRAMInGB() {
        return sizeOfRAMInGB;
    }

    public int getSizeOfHHDInTB() {
        return sizeOfHHDInTB;
    }
}
