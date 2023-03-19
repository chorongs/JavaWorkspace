package chap_07;

public class _08_Constructor {
    public static void main(String[] args) {
        CellPhone p1 = new CellPhone();
        p1.cellphone = "아이폰13 미니";
        p1.color = "미드나이트";
        p1.communication = "LG";
        p1.price = 890000;
        System.out.println(p1.cellphone);
        System.out.println(p1.serialNumber);

        System.out.println("------------");


        CellPhone p2 = new CellPhone("갤럭시 S22", "아이보리", "KT", 990000);
        System.out.println(p2.cellphone);
        System.out.println(p2.serialNumber);
    }
}
