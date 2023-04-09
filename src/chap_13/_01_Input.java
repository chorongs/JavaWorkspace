package chap_13;

import java.util.Scanner;

public class _01_Input {
    public static void main(String[] args) {
        // 사용자 입력
        Scanner sc = new Scanner(System.in);
//        System.out.println("이름을 입력하세요.");
//        String name = sc.next();
//        System.out.println("MBTI를 입력해보세요.");
//        String mbti = sc.next();
//        System.out.println("키를 입력해주세요.");
//        int height = sc.nextInt();
//        System.out.println("몸무게를 입력해주세요.");
////        double weight = Double.parseDouble(sc.next());
//        double weight = sc.nextDouble();
//
//        System.out.println("입력하신 정보는 다음과 같습니다.");
//        System.out.println("이름 : " + name);
//        System.out.println("MBTI : " + mbti);
//        System.out.println("키 : " + height);
//        System.out.println("몸무게 : " + weight);

        System.out.println("어떤프로그래밍 언어를 선택했나요?");
//        String lang = sc.next(); // 한 단어
        String lang = sc.next();
        System.out.println("언어 : " + lang);

        sc.nextLine(); // 불필요한 문장을 삭제

        System.out.println("배우고 난 뒤 기분이 어땠나?");
        String feeling = sc.next(); // 소감
        System.out.println("기분 : " + feeling);



    }
}
