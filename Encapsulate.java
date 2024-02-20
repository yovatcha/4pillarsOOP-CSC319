// วิธีการ Encapsulate คือการป้องกันการเข้าถึงข้อมูลโดยตรงจากภายนอกคลาส
// Define the Superclass
class Superclass {
    private int dataA; // เข้าถึงได้เฉพาะจาก Superclass
    protected int dataB; // เข้าถึงได้จาก Superclass และ Subclass และ package เดียวกัน
    public int dataC; // เข้าถึงได้จากทุกคลาส

    // ส้ราง constructor ของ Superclass
    public Superclass(int dataA, int dataB, int dataC) {
        this.dataA = dataA;
        this.dataB = dataB;
        this.dataC = dataC;
    }

    // Getter method for dataA
    // ใช้เพื่อเข้าถึง dataA จากภายนอกคลาส
    public int getDataA() {
        return dataA;
    }

    // Setter method for dataA
    // ใช้เพื่อเปลี่ยนแปลงค่าของ dataA จากภายนอกคลาส
    public void setDataA(int dataA) {
        this.dataA = dataA;
    }
}

public class Encapsulate {
    public static void main(String[] args) {

        Superclass obj = new Superclass(1, 2, 3);

        // เข้าถึง dataA ผ่าน Getter method
        System.out.println("Data A: " + obj.getDataA());

        // เปลี่ยนแปลงค่าของ dataA ผ่าน Setter method
        obj.setDataA(10);
        System.out.println("Modified Data A: " + obj.getDataA());

        // เข้าถึง dataB ผ่าน dataB ของ Superclass
        System.out.println("Data B: " + obj.dataB);

        // เข้าถึง dataC ผ่าน dataC ของ Superclass
        System.out.println("Data C: " + obj.dataC);
    }
}
