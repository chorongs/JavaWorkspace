package chap_01;

public class _Quiz_01 {
    public static void main(String[] args) {
        // 버스 번호 (1234, 상암08)
        String busNumber = "상암08";
        System.out.println(busNumber);

        // 남은 시간 (3분, 5분)
        int min = 3;
        System.out.println(min);

        // 남은 거리 (1.5km, 0.8km)
        double distance = 1.2;
        System.out.println(distance);

        // 결과 출력
        System.out.println(busNumber + "번 버스");
        System.out.println(min + "분 후 도착");
        System.out.println("남은 거리 " + distance + "km");
    }
}
