package chap_10;

public class _02_AnonymousClass2 {
    public static void main(String[] args) {
        HomeMadeBurger momMadeBurger = getMomMadeBurger();
        momMadeBurger.cook();
        System.out.println("-------------------");


        HomeMadeBurger broMadeBurger = getBroMadeBurger();
        broMadeBurger.cook();

    }

    private static HomeMadeBurger getBroMadeBurger() {
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("집에서 만드는 동생표 군대리아");
                System.out.println("재료 : 빵, 치킨패티, 치즈, 딸기잼, 삶은 게란");

            }
        };
    }

    public static HomeMadeBurger getMomMadeBurger() {
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("집에서 만드는 수제 버거");
                System.out.println("재료 : 빵, 소고기패티, 해시브라운, 양상추, 소스");
            }
        };
    }
}

abstract class HomeMadeBurger {
    public abstract void cook();
}
