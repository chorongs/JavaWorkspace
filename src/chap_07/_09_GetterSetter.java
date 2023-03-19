package chap_07;

public class _09_GetterSetter {
    public static void main(String[] args) {
        CellPhone p1 = new CellPhone();
        p1.cellphone = "Z플립";
        p1.communication = "LG";
        p1.price = 990000;
        p1.color = "아이보리";


        // 공시 지원금
        p1.price = -50000;
        System.out.println("가격 : " + p1.price + "원");

        // 고객 문의
        System.out.println("통신사 : " + p1.communication);

        System.out.println("--------------");

        CellPhone p2 = new CellPhone();
        p2.cellphone = ("폴드");
        p2.setPrice(-50000);
        p2.setColor("화이트");

        System.out.println("가격 : " + p2.getPrice() + "원");
        System.out.println("오류 : " + p2.getResolution());

    }
}
