public class Third {
    public static void main(String[] args){
    
    String str = "3.14";
    
    //1. Double 클래스의 parseDouble 메서드
    double double1 = Double.parseDouble(str); 

    if (double1 instanceof Double) {
        System.out.println("1. ans: " + double1 +" / type: double");
    }

    // 2. Double 클래스의 valueOf 메서드
    double double2 = Double.valueOf(str);

    if (double2 instanceof Double) {
        System.out.println("2. ans: " + double2 +" / type: double");
    }
    
    }
}