package assignment;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class first {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("문자를 입력하세요: ");
        String line = sc.nextLine(); // 입력
        
        List<Character> charList = new ArrayList<>(); // Character 형태인 char List를 만들고

        for (char c : line.toCharArray()){ // char형의 c라는 변수를 line이라는 String형 데이터를 순회함 
            charList.add(c); // 순회하면서 계속해서 charList에 추가
        }

        Set<Character> uniqueList = new LinkedHashSet<>(charList); // set형으로 설정하여 charList에 중복된 요소를 제거

        // System.out.println(uniqueList); 
        
        Map<Character, Integer> map = new HashMap<>(); // Dictionary랑 비슷함
        
        for (char a : uniqueList){
            int cnt = 0;

            for (char b : charList){
                if (a==b){
                    cnt += 1;
                }
            }
            map.put(a, cnt);
            }

        int i = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey() + ":" + entry.getValue());
            if (i != map.size() - 1) {
                System.out.print(", ");
            }
            i++;
        }

        sc.close();
    }
    
}