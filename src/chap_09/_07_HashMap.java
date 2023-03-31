package chap_09;

import java.util.HashMap;

public class _07_HashMap {
    public static void main(String[] args) {
        // Map (key, value)
        HashMap<String, Integer> map = new HashMap<>();

        // 데이터 추가
        map.put("아자르", 10);
        map.put("카카", 22);
        map.put("크로스", 8);
        map.put("돈나룸마", 99);

        System.out.println("선수 수 : " + map.size());
        System.out.println("-------------------");

        // 조회
        System.out.println("아자르의 등번호 : " + map.get("아자르"));
        System.out.println("카카의 등번호 : " + map.get("카카"));
        System.out.println("크로스의 등번호 : " + map.get("크로스"));
        System.out.println("------------------");

        // 확인
        if (map.containsKey("아자르")) {
            int number = map.get("아자르");
            map.put("아자르", ++number);
            System.out.println("아자르의 등번호 : " + map.get("아자르"));
        } else {
            map.put("아자르", 1);
            System.out.println("아자르의 등번호 업데이트 (1 추가)");
        }
        System.out.println("-----------------");


        // 삭제
        map.remove("카카");
        System.out.println(map.get("카카"));
        System.out.println("---------------------");

        // 전체삭제
        map.clear();
        if (map.isEmpty()) {
            System.out.println("남은 선수 수 : " + map.size());
            System.out.println("샤따 내려.");
        }
        System.out.println("------------------");

        // 재영입 기회
        map.put("아자르", 10);
        map.put("카카", 22);
        map.put("크로스", 8);
        map.put("돈나룸마", 99);

        // key 확인법
        for (String key : map.keySet()) {
            System.out.println(key);
        }
        System.out.println("----------------");
        // value 확인법
        for (int value :
                map.values()) {
            System.out.println(value);
        }
        System.out.println("---------------");
        // key, value 동시확인법
        for (String key :
                map.keySet()) {
            System.out.println("선수이름 : " + key + " 등번호 : " + map.get(key) );
        }
    }
}
