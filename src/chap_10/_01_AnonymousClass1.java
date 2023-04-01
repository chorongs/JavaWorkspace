package chap_10;

public class _01_AnonymousClass1 {
    public static void main(String[] args) {
        // 익명 클래스
        Coffee c1 = new Coffee();
        c1.order("카페라떼");
        System.out.println("---------------");

        Coffee c2 = new Coffee();
        c2.order("카라멜 마끼야또");
        System.out.println("---------------");

        // 굉장히 친한 친구 방문
        Coffee specialCoffee = new Coffee() {
            @Override
            public void order(String coffee) {
                super.order(coffee);
                System.out.println("(쪽지) 저쪽 신사분께서 보내신겁니다.");
            }

            @Override
            public void returnTray() {
                System.out.println("(쪽지) 번호 알려주실 수 있을까요?");
            }
        };
        specialCoffee.order("키위 스무디");
        specialCoffee.returnTray();


    }
}

class Coffee {
    public void order(String coffee) {
        System.out.println("주문하신 " + coffee + " 나왔습니다.");
    }

    public void returnTray() {
        System.out.println("커피 반납이 완료되었습니다.");
    }
}


