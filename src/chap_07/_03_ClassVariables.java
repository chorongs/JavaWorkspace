package chap_07;

public class _03_ClassVariables {
    public static void main(String[] args) {
        CellPhone p1 = new CellPhone();
        p1.cellphone = "아이폰14 PRO MAX";
        System.out.println(p1.cellphone);

        CellPhone p2 = new CellPhone();
        p2.cellphone = "베가레이서";
        System.out.println(p2.cellphone);


        // 휴대폰 결제 가능 여부
        System.out.println("애플 페이 미지원 국가");
        System.out.println(p1.cellphone + " 애플 페이 : " + p1.canMobilePay);
        System.out.println(p2.cellphone + " 삼성 페이 : " + p2.canMobilePay);
        System.out.println("휴대폰 결제 기능 : " + CellPhone.canMobilePay);

        // 모든 기종 휴대폰 결제 도입 완료
        CellPhone.canMobilePay = true;

        System.out.println("애플 페이 지원 국가");
        System.out.println(p1.cellphone + " 애플 페이 : " + p1.canMobilePay);
        System.out.println(p2.cellphone + " 삼성 페이 : " + p2.canMobilePay);
        System.out.println("휴대폰 결제 기능 : " + CellPhone.canMobilePay);
    }
}

// 클래스
