class Superclass {
    private int dataA;
    protected int dataB;
    public int dataC;

    public Superclass(int dataA, int dataB, int dataC) {
        this.dataA = dataA;
        this.dataB = dataB;
        this.dataC = dataC;
    }

    // function ดั้งเดิมของ method "sumData" ใน Superclass
    public int sumData() {
        return dataA + dataB + dataC;
    }

    public int getDataA() {
        return dataA;
    }

    public void setDataA(int dataA) {
        this.dataA = dataA;
    }
}

// สืบทอดจาก Superclass
class Subclass extends Superclass {
    Subclass(int dataA, int dataB, int dataC) {
        super(dataA, dataB, dataC);
    }

    // เปลี่ยนแปลงพฤติกรรมของ method "sumData"
    @Override
    public int sumData() {
        return getDataA() + this.dataB + this.dataC + 10;
    }
}

public class Polymophism2 {
    public static void main(String[] args) {
        Superclass a = new Subclass(10, 30, 50);
        Superclass b = new Superclass(10, 30, 50);
        // Polymophism ของ Superclass และ Subclass
        System.out.println(a.sumData());
        // 100
        System.out.println(b.sumData());
        // 90
    }
}
