package chap_07;

public class _05_MethodOverloading {
    public static void main(String[] args) {
        CellPhone p1 = new CellPhone();
        p1.cellphone = "아이폰13 미니";

        p1.record(false, false, 350);
        System.out.println("-------------------");
        p1.record(true, true, 55);
        System.out.println("--------------------");
        p1.record();

        // String


    }
}
