package chap_07;

public class CellPhone {
    String cellphone; // 핸드폰 이름
    String color; // 색상
    int serialNumber; // 시리얼 번호

    static  int counter = 0; // 시리얼 번호 생성 역할
    String communication; // 통신사
    int price; // 가격

    static boolean canMobilePay = false; // 휴대폰 결제 가능 여부

    CellPhone(){
        System.out.println("기본 생성자 호출");
        this.serialNumber = ++counter;
        System.out.println("새로운 시리얼 넘버를 발급했습니다 : " + this.serialNumber);
    }


    CellPhone (String cellphone, String color, String communication, int price) {
        this(); // 기본 생성자 호출

        System.out.println("사용자 정의, 생성자 호출");
        this.cellphone = cellphone;
        this.color = color;
        this.price = price;
        this.communication = communication;
    }

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


    // showDateTIme : 잔여 요금
    // showBill : 잔여 약정
    // money : 요금
    void record (boolean showDateTime, boolean showBill, int money) {
        System.out.println("잔여 요금을 확인합니다.");
        if (showDateTime) {
            System.out.println("잔여 요금을 표시합니다.");
        }
        if (showBill) {
            System.out.println("잔여 약정을 표시합니다.");
        }
        System.out.println("위약금은 " + money + "$만큼 청구되었습니다.");
    }

    void record() {
            record(true, true, 5);

    }

    static void callServiceCenter () {
        System.out.println("서비스 센터 (1588-0000) 로 연결합니다.");

    }

    void refurPhone(String refurName) {
        this.cellphone += cellphone;
    }

    // Better & Setter
    String getCellphone() {
        return getCellphone();
    }
    void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    String getResolution () {
        if (communication == null || communication.isEmpty()) {
            return "통신사에 문의하세요.";
        }
        return communication;
    }

    void setResolution (String resolution) {
        this.communication = resolution;
    }
    int getPrice() {
        return price;
    }
    void setPrice(int price) {
        if (price < 100000) {
            this.price = 100000;
        }
        else {
            this.price = price;
        }
    }

    String getColor() {
        return color;
    }
    void setColor (String color) {
        this.color = color;
    }
}
