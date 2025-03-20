import java.util.*

fun main() {
    val scanner = Scanner(System.`in`) // scanner 객체 생성
    val line = scanner.nextLine() // 입력받을 변수인 'line' 생성
    val map = mutableMapOf<Char, Int>() // char 당 count를 위해 dictionary와 유사한 map 생성
    
    val charList = line.toList() // String을 List<Char>로 변환

    val uniqueList = LinkedHashSet(charList) // set 자료형을 사용하여 중복 제거
    
    for (a in uniqueList) { 
        val count = charList.count { it == a } // lambda로 if 생략
        map[a] = count // map의 각 key마다 증가된 count를 삽입
    }

    map.entries.forEachIndexed { index, entry -> // forEachIndexed로 index를 받아옴옴
        print("${entry.key}:${entry.value}")
        if (index != map.size - 1) { // 인덱스가 마지막인 경우, 
            print(", ") // 해당 문자는 출력하지 않음
        }
    }
    
    scanner.close() // 입력이후 scanner는 닫아줌
}
