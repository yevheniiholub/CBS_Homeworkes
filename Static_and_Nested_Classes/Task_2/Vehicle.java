package Static_and_Nested_Classes.Task_2;

public class Vehicle {
    public void print(){
        System.out.println("Vehicle print");
    }

    public class Wheel {
        public void print(){
            System.out.println("Wheel print");
        }
    }

    public class Door {
        public void print(){
            System.out.println("Door print");
        }
    }
}
