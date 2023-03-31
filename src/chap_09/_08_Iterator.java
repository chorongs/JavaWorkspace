package chap_09;

import java.util.*;

public class _08_Iterator {
    public static void main(String[] args) {
        // Iterator
        List<String> list = new ArrayList<>();
        list.add("칸토나");
        list.add("(알 수 없어)");
        list.add("바란");
        list.add("(알 수 없어)");
        list.add("카세미루");
        list.add("(알 수 없어)");
        list.add("반통수");
        list.add("(알 수 없어)");
        list.add("반데사르");

        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("--------------------");

        Iterator<String> it = list.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());

        System.out.println("-----------------");
        it = list.iterator(); // 커서를 처음 위치로
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("-----------------");

        it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            if (s.contains("(알 수 없어)")) {
                it.remove(); // 삭제
            }
        }

        it = list.iterator(); // 커서를 처음 위치로 이동
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("-------------");

        HashSet<String> set = new HashSet<>();
        set.add("짱구");
        set.add("맹구");
        Iterator<String> itSet = set.iterator();
        while (itSet.hasNext()) {
            System.out.println(itSet.next());
        }
        System.out.println("-----------------");

        HashMap<String, Integer> map = new HashMap<>();
        map.put("짱구", 10);
        map.put("맹구", 5);

        // map.iterator() // 제공되지 않음
        Iterator<String> itMapKey = map.keySet().iterator();
        while (itSet.hasNext()) {
            System.out.println(itMapKey.next());
        }
        System.out.println("-------------");

        Iterator<Integer> itMapValue = map.values().iterator();
        while (itMapValue.hasNext()) {
            System.out.println(itMapValue.next());
        }

        Iterator<Map.Entry<String, Integer>> itMap =  map.entrySet().iterator();
        while (itMap.hasNext()) {
            System.out.println(itMap.next());
        }
    }
}
