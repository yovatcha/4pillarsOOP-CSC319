//Inheritance คือการสืบทอดคุณสมบัติของคลาสหรือ Interface จากคลาสหรือ Interface อื่น ๆ
// Define the Superclass
class Superclass {
    private int dataA;
    protected int dataB;
    public int dataC;

    // สร้าง constructor ของ Superclass
    public Superclass(int dataA, int dataB, int dataC) {
        this.dataA = dataA;
        this.dataB = dataB;
        this.dataC = dataC;
    }

    // Getter method for dataA
    public int getDataA() {
        return dataA;
    }

    // Setter method for dataA
    public void setDataA(int dataA) {
        this.dataA = dataA;
    }
}

class Subclass extends Superclass {
    Subclass(int dataA, int dataB, int dataC) {
        // call contractor ของ Superclass
        super(dataA, dataB, dataC);
    }

    // เพิ่ม method ที่เป็นของ Subclass
    public int getSum() {
        // สามารถเข้าถึง dataB และ dataC ได้จาก Subclass
        return getDataA() + this.dataB + this.dataC;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Subclass obj = new Subclass(1, 2, 3);

        System.out.println(obj.getSum());
    }
}
