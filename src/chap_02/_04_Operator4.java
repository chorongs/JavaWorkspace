package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        // 논리 연산자
        boolean 짬뽕 = false;
        boolean 탕수육 = true;
        boolean 볶음밥 = false;

        System.out.println(짬뽕 || 탕수육 || 볶음밥);
        System.out.println(짬뽕 && 탕수육 && 볶음밥);


        System.out.println((5 > 3) && (3 > 1)); // 5는 3보다 크고, 3은 1보다 크다. (true)
        System.out.println((5 > 3) && (3 < 1)); // 5는 3보다 크고, 3은 1보다 작다. (false)

        System.out.println((5 > 3) || (3 > 1)); // 5는 3보다 크거나 3은 1보다 크다. (true)
        System.out.println((5 > 3) || (3 < 1)); // 5는 3보다 크거나 3은 1보다 작다. (true)
        System.out.println((5 < 3) || (3 < 1)); // 5는 3보다 작거나 3은 1보다 작다. (false)

        System.out.println( 1 < 3 && 3 < 5);

        // 논리 부정 연산자
        System.out.println(!true); // false
        System.out.println(!false); // true
        System.out.println(!(5 == 5)); // false
        System.out.println(!(5 == 3)); // true

    }
}
