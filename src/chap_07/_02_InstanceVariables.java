package chap_07;

public class _02_InstanceVariables {
    public static void main(String[] args) {
        CellPhone new1 = new CellPhone();
        new1.cellphone = "아이폰13 PRO";
        new1.color = "스페이스 그레이";
        new1.communication = "KT";
        new1.price = 1500000;

        System.out.println(new1.cellphone);
        System.out.println(new1.color);
        System.out.println(new1.communication);
        System.out.println(new1.price);


        System.out.println("-----------기기 변경좀 하려구요----------");

        // 기기 변경
        CellPhone new2 = new CellPhone();
        new2.cellphone = "갤럭시 S23";
        new2.color = "아이보리";
        new2.communication = "SKT";
        new2.price = 990000;

        System.out.println(new2.cellphone);
        System.out.println(new2.color);
        System.out.println(new2.communication);
        System.out.println(new2.price);
    }
}
