package chap_09;

import java.util.Collections;
import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        // 링크드 리스트
        LinkedList<String> list = new LinkedList<>();

        // 데이터 추가
        list.add("탑");
        list.add("정글");
        list.add("미드");
        list.add("원딜");
        list.add("서포터");

        // 데이터 조회 (index)
        System.out.println(list.get(0));
        System.out.println(list.get(0));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println("--------------");

        // 데이터 추가
        list.addFirst("트롤러");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("-----------");

        list.addLast("도망쳐");
        for (String s :
                list) {
            System.out.println(s);
        }

        list.add(1,"라이엇");
        System.out.println(list.get(1));

        System.out.println("----------------");

        // 삭제하기
        System.out.println("남은 자리 수 (픽 전) : " + list.size());
        list.remove(list.size() - 1);
        System.out.println("남은 자리 수 (픽 후) : " + list.size());

        System.out.println("--------------");

        // 처음과 마지막을 삭제하기
        System.out.println("남은 자리 수 (픽 전) : " + list.size());
        list.removeFirst();
        list.removeLast();
        System.out.println("남은 자리 수 (픽 후) : " + list.size());
        for (String s :
                list) {
            System.out.println(s);
        }

        System.out.println("------------");
        // 데이터 변경
        list.set(0,"미드 선픽");
        System.out.println(list.get(0));

        System.out.println("------------");

        System.out.println(list.indexOf("미드"));
        if(list.contains("미드")) {
            System.out.println("픽 성공 ");
        } else {
            System.out.println("픽 실패");
        }

        // 전부 지우기
        list.clear();
        if (list.isEmpty()) {
            System.out.println("남은 라인 : " + list.size());
            System.out.println("픽이 완료됨.");
        }

        System.out.println("-------");

        // 정렬
        list.add("루니");
        list.add("카카");
        list.add("뮐러");
        list.add("디발라");
        list.add("크로스");

        Collections.sort(list); // 정렬
        for (String s :
                list) {
            System.out.println(s);
        }
    }
}
