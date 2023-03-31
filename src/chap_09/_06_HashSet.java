package chap_09;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class _06_HashSet {
    public static void main(String[] args) {
        // Set
        HashSet<String> set = new HashSet<>();

        // 데이터 추가
        set.add("바란");
        set.add("아자르");
        set.add("그리즈만");
        set.add("바란");
        set.add("칸토나");
        set.add("비디치");
        set.add("바란");
        set.add("쇼");

        System.out.println("영입 가능 선수 : " + set.size());

        // 순회
        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("-------------------");

        // 포함 여부
        if (set.contains("바란")) {
            System.out.println("바란 영입 가능");
        }
        System.out.println("-----------------");

        // 삭제
        System.out.println("영입 가능 선수 (바란 영입 전) : " + set.size());
        set.remove("바란");
        System.out.println("영입 가능 선수 (바란 영입 후) : " + set.size());
        System.out.println("--------------");

        // 전체삭제
        set.clear();
        if (set.isEmpty()) {
            System.out.println("남은 영입 가능 선수 : " + set.size());
            System.out.println("이적 시장 마감");
        }
        System.out.println("-----------------");

        // 세트 : 중복 허용 X, 순서 보장 X
        HashSet<Integer> intSet = new LinkedHashSet<>();
        intSet.add(1);
        intSet.add(11);
        intSet.add(2);

        for (int i:
             intSet) {
            System.out.println(i);
        }
    }
}
