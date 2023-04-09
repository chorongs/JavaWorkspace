package chap_13;

public class _02_Output {
    public static void main(String[] args) {
//        System.out.format()
//        System.out.printf("");

        System.out.println("------- 정수 -----");
        System.out.printf("%d%n", 1); // 1
        System.out.printf("%d %d %d%n", 1, 2, 3); // 1 2 3
        System.out.printf("%d%n", 1234); //  1234
        System.out.printf("%6d%n", 1234); // __1234(6자리의 공간을 확보하고 나서 1234 출력)
        System.out.printf("%06d%n", 1234); // 001234 (6자리의 공간을 확보 후 1234를 출력하는데 빈 공간은 0으로 채움)
        System.out.printf("%6d%n", -1234); //  _-1234
        System.out.printf("%,12d%n", 1000000000); // __1,000,000,000 (세자리 마다 콤마로 구분)
        System.out.printf("%-6d%n", 1234); // 1234__ (6자리의 공간을 확보하고 나서 왼쪽 정렬 1234 출력)

        System.out.println("------- 실수 --------");
        System.out.printf("%f%n", Math.PI); // 3.141593
        System.out.printf("%.2f%n", Math.PI); // 3.14
        System.out.printf("%6.2f%n", Math.PI); // __3.14
        System.out.printf("%-6.2f%n", Math.PI); // 3.14__
        System.out.printf("%06.2f%n", Math.PI); // 003.14
        System.out.printf("%+6.2f%n", Math.PI); // _+3.14

        System.out.println("------ 문자열 --------");
        System.out.printf("%s%n", "Java"); // Java
        System.out.printf("%6s%n", "Java"); // __Java (6자리 공간 확보하고 우측 정렬)
        System.out.printf("%-6s%n", "Java"); // Java__ (6자리 공간 확보하고 좌측 정렬)
        System.out.printf("%6.2s%n", "Java"); // ____Ja (6자리 공간 확보하고 우측 정렬해서 2글자 출력)
        System.out.printf("%-6.2s%n", "Java"); // Ja____ (6자리공간 확보하고 좌측 정렬해서 2글자 출력)

        System.out.println("--------응용 ---------");
        System.out.println("이름 영어 수학 평균");
        System.out.println("김명준 " + 90 + " " + 80 + " " + 85.0); // 김명준 90 80 85.0
        System.out.println("김초롱 " + 100 + " " + 100 + " " + 100.0); // 김초롱 100 100 100
        System.out.println("서금순 " + 95 + " " + 100 + " " + 97.5); // 서금순 95 100 97.5

        System.out.println("-------- 응용2 ----------");
        System.out.println("이름      영어   수학   평균"); // 공백 6, 3, 3 칸으로 구성
        System.out.printf("%-6s %4d %4d %6.1f%n", "김명준", 90, 80, 85.0);
        System.out.printf("%-6s %4d %4d %6.1f%n", "김초롱", 100, 100, 100.0);
        System.out.printf("%-6s %4d %4d %6.1f%n", "서금순", 95, 100, 97.5);

        System.out.println("------- 참고 -------");
        System.out.println("ABCDEFG");
        System.out.println("가나다라마바사");
        System.out.println("가 나 다 라");
    }
}
