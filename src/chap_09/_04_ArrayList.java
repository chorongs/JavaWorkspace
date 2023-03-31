package chap_09;

import java.util.ArrayList;
import java.util.Collections;

public class _04_ArrayList {
    public static void main(String[] args) {
        // 컬렉션 프레임워크 (List, Set, Map)
        ArrayList<String> list = new ArrayList<>();

        // 데이터 추가
        list.add("김명준");
        list.add("서강준");
        list.add("윤하");
        list.add("아이묭");
        list.add("이도현");

        // 데이터 조회 (인덱스)
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));

        System.out.println("-----------------");

        // 리스트에서 삭제하는 법
        System.out.println("신청자 리스트 (제거 전) : " + list.size());
        list.remove("서강준");
        System.out.println("신청자 리스트 (제거 후) : " + list.size());
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));

        System.out.println("---------------");

        System.out.println("남은 리스트 (제거 전) : " + list.size());
        list.remove(list.size() - 1);
        System.out.println("남은 리스트 (제거 후) : " + list.size());

        System.out.println("----------------");

        // 순회
        for (String s: list) {
            System.out.println(s);
        }

        // 변경 (양보)
        System.out.println("양보하기 전 : " + list.get(0));
        list.set(0, "김초롱");
        System.out.println("양보한 다음 : " + list.get(0));


        System.out.println("---------------");

        // 확인
        System.out.println(list.indexOf("아이묭"));
        // 선착순 5명 안에 들어왔는가?
        if (list.contains("아이묭")) {
            System.out.println("웅!");
        } else {
            System.out.println("아닝!");
        }

        // 전체 삭제
        list.clear();
        if (list.isEmpty()) {
            System.out.println("생존자 수 : " + list.size());
            System.out.println("비어있다.");
        }

        // 새로운 시작
        list.add("김명준");
        list.add("서강준");
        list.add("윤하");
        list.add("아이묭");
        list.add("이도현");

        // 정렬
        Collections.sort(list);
        for (String s :
                list) {
            System.out.println(s);
        }
    }
}
