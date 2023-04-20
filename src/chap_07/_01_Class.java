package chap_07;

public class _01_Class {
    public static void main(String[] args) {
        // 객체 지향 프로그래밍 (OOP : Object-Oriented Programing)
        // 유지보수 용이
        // 높은 재사용성

        // 핸드폰
        // 모델명, 색상, 통신사, 가격
        String cellPhone = "아이폰13 PRO";
        String color = "스페이스 그레이";
        String communication = "KT";
        int price = 1500000;

        // 통신사 이동
        String newCellPhone = "갤럭시 S23";
        String newColor = "아이보리";
        String moveCommunication = "SKT";
        int newPrice = 990000;

        // 기기 변경
        CellPhone sktCellphone = new CellPhone();
        // CellPhone 클래스로부터 sktCellphone 객체 생성
        // sktCellphone 객체는 CellPhone 클래스의 인스턴스

        CellPhone ktCellphone = new CellPhone();
    }
}

// 클래스
