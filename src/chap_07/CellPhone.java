package chap_07;

public class CellPhone {
    String cellphone; // 핸드폰 이름
    String color; // 색상
    String communication; // 통신사
    int price; // 가격

    static boolean canMobilePay = false; // 휴대폰 결제 가능 여부

    void mobilePay() {
        if (canMobilePay) {
            System.out.println("결제가 완료되었습니다.");
        } else {
            System.out.println("결제에 실패했습니다.");
        }
    }

    void mobilePayCommission(int commission) {
        System.out.println("수수료가 발생하였습니다.");
        System.out.println("수수료는 " + commission + " $ 입니다. ");
    }

    int domesticCommission(int pay) {
        if (pay == 1) { // 국내 결제
            return 5;
        } else if (pay == 5) { // 해외 결제
            return 10;
        }
        return 15;
    }
}
