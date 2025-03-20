public class test {
    public static void main(String[] args) {
        // 정수 선언
        int number = 123;

        // 1. String.valueOf()를 사용하여 문자열로 변환
        String strNumber1 = String.valueOf(number);
        System.out.println("Using String.valueOf(): " + strNumber1);
        System.out.println("Type: " + strNumber1.getClass().getName()); // 타입 확인

        // 2. Integer.toString()을 사용하여 문자열로 변환
        String strNumber2 = Integer.toString(number);
        System.out.println("Using Integer.toString(): " + strNumber2);
        System.out.println("Type: " + strNumber2.getClass().getName()); // 타입 확인

        // 3. 빈 문자열 연결 (+)을 사용하여 문자열로 변환
        String strNumber3 = "" + number;
        System.out.println("Using concatenation: " + strNumber3);
        System.out.println("Type: " + strNumber3.getClass().getName()); // 타입 확인

        // 타입 비교 (instanceof)
        if (strNumber1 instanceof String) {
            System.out.println("strNumber1 is a String");
        }
    }
}
