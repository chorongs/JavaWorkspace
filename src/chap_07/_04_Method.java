package chap_07;

public class _04_Method {
    public static void main(String[] args) {
        CellPhone p1 = new CellPhone();
        p1.cellphone = "아이폰14 PRO";

        CellPhone.canMobilePay = true;
        p1.mobilePay(); // 휴대폰 결제 도입

        p1.mobilePayCommission(1);

        // 일반 결제 : 1
        // 해외 결제 : 5
        int payCommission = p1.domesticCommission(1); // 일반 결제
        System.out.println("일반 결제 횟수 : " + payCommission + "회");

        payCommission = p1.domesticCommission(5); // 해외 결제
        System.out.println("해외 결제 횟수 : " + payCommission + "회");
    }
}
