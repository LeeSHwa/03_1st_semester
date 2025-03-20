import java.util.Arrays;

public class Fourth {
    public static void main(String[] args) {
    
        String str1 = "This is";
        String[] ans1 = str1.split(" ");
        System.out.println(Arrays.toString(ans1) + " -> " + ans1.length);
        

        String str2 = "A good dog";
        String[] ans2 = str2.split(" ");
        System.out.println(Arrays.toString(ans2) + " -> " + ans2.length);
}
}