package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {


        // 조건은 ElseIf
        // 한라봉 에이드가 있으면 +1
        // 또는 망고 주스가 있으면 +1
        // 또는 아이스 아메리카노 +1

        boolean milk = true;
        boolean coffee = true;

            if (milk) {
                System.out.println("우유 + 1");
            } else if (coffee) {
                System.out.println("커피 + 1");
            } else {
                System.out.println("생수 + 1");
            }
            System.out.println("음료 주문 완료");



            // else if 는 여러번 사용 가능
        milk = false;
        coffee = false;
        boolean orangeJuice = true;

        if (milk) {
            System.out.println("우유 + 1");
        } else if (coffee) {
            System.out.println("커피 + 1");
        } else if (orangeJuice) {
            System.out.println("오렌지 주스 + 1");
        } else {
            System.out.println("생수 + 1");
        }
        System.out.println("음료 주문 완료");
    }



}
