// package assignment;
// 2번, 정수를 String로 바꾸는 여러가지 방법법 
public class Second {
    public static void main(String[] args){
        int number = 123;

        // 1. String.valueOf(), String 클래스에 valueOf 메서드
        String strNum1 = String.valueOf(number);
    
        System.out.println("1. ans:" + strNum1 +" / Type: " + strNum1.getClass().getName()); // 타입 확인

        // 2. Integer.toString() : Integer 클래스의 toString 메서드
        String strNum2 = Integer.toString(number);

        System.out.println("2. ans:" + strNum2 +" / Type: " + strNum2.getClass().getName()); // 타입 확인

        // 3. 빈 문자열 연결 (+)을 사용하여 문자열로 변환
        String strNum3 = "" + number;
        System.out.println("3. ans:" + strNum3 +" / Type: " + strNum3.getClass().getName()); // 타입 확인

}
}