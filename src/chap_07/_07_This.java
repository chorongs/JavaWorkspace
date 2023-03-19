package chap_07;

public class _07_This {
    public static void main(String[] args) {
        CellPhone p1 = new CellPhone();
        p1.cellphone = "아이폰13 미니"; // 아이폰13 미니(리퍼)
        p1.refurPhone("(리퍼)");
        System.out.println(p1.cellphone);

    }
}
