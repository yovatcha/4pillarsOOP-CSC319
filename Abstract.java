// Abstract class คือ class ที่มี abstract method ซึ่งจะให้ subclass ไปimplement
// โดยไม่สามารถสร้าง object จาก abstract class ได้
abstract class AbstractClass {
    private int data;

    public AbstractClass(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    // Abstract method จะบังคับให้ subclass implement
    public abstract void printData();

}

// ConcreateCalss สืบทอด
class ConcreteClass extends AbstractClass {
    public ConcreteClass(int data) {
        super(data);
    }

    // Implement abstract method
    @Override
    public void printData() {
        System.out.println("Data in ConcreteClass is " + getData());
    }
}

public class Abstract {
    public static void main(String[] args) {
        // สร้าง object ด้วยการประกาศเป็น AbstractClass หรือ ConcreateClass
        AbstractClass a = new ConcreteClass(10);
        ConcreteClass b = new ConcreteClass(20);
        // call printData จะ invoke printData ของ ConcreteClass
        a.printData();
        b.printData();
    }
}