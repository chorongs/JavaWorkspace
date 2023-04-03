package chap_11;

public class _02_Catch {
    public static void main(String[] args) {
        try {
//            System.out.println(3 / 0);
//
//            int [] arr = new int[3];
//            arr[5] = 100;
//
//            Object obj = "test";
//            System.out.println((int) obj);

            String s = null;
            System.out.println(s.toLowerCase());
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("뭔가 실수 하셨네요.");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("뭔가 실수 하셨네요.");
        } catch (ClassCastException e) {
            System.out.println("뭐하냐?");
        }
        catch (Exception e) {
            System.out.println("이 외에 모든 에러는 여기서 처리가 된다.");
            e.printStackTrace();
        }


        System.out.println("프로그램 정상 종료");
    }
}
