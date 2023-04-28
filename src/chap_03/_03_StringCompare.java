package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("Java")); // 문자열 내용이 같으면 true, 다르면 false
        System.out.println(s2.equals("python")); // 대소문자가 달라도 false 로 인식됨
        System.out.println(s2.equalsIgnoreCase("python")); // 대소문자 구분 없이 문자열 내용만 같으면 됨

        // 문자열 비교 심화
        s1 = "1234"; // 벽에 붙은 메모지의 비밀번호 정보 (참조)
        s2 = "1234";
        System.out.println(s1.equals(s2)); // true (내용)
        System.out.println(s1 == s2); // true (참조)

        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // true (내용은 같기 때문에 true 가 나온다)
        System.out.println(s1 == s2); // false (서로 다른 곳에서 참조해오기 때문에 false 가 나온다.)

    }
}
// 참고할 것