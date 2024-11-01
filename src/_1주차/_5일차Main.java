package _1주차;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _5일차Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 문자열의 길이 N
        int N = scanner.nextInt();
        scanner.nextLine(); // 줄바꿈 제거

        // 모스 부호 메시지
        String morseMessage = scanner.nextLine();

        // 1. 모스 부호 매핑 생성
        Map<String, String> morseMap = new HashMap<>();

        // 알파벳 A-Z 모스 부호 매핑
        morseMap.put(".-", "A"); morseMap.put("-...", "B"); morseMap.put("-.-.", "C");
        morseMap.put("-..", "D"); morseMap.put(".", "E"); morseMap.put("..-.", "F");
        morseMap.put("--.", "G"); morseMap.put("....", "H"); morseMap.put("..", "I");
        morseMap.put(".---", "J"); morseMap.put("-.-", "K"); morseMap.put(".-..", "L");
        morseMap.put("--", "M"); morseMap.put("-.", "N"); morseMap.put("---", "O");
        morseMap.put(".--.", "P"); morseMap.put("--.-", "Q"); morseMap.put(".-.", "R");
        morseMap.put("...", "S"); morseMap.put("-", "T"); morseMap.put("..-", "U");
        morseMap.put("...-", "V"); morseMap.put(".--", "W"); morseMap.put("-..-", "X");
        morseMap.put("-.--", "Y"); morseMap.put("--..", "Z");

        // 숫자 0-9 모스 부호 매핑
        morseMap.put(".----", "1"); morseMap.put("..---", "2"); morseMap.put("...--", "3");
        morseMap.put("....-", "4"); morseMap.put(".....", "5"); morseMap.put("-....", "6");
        morseMap.put("--...", "7"); morseMap.put("---..", "8"); morseMap.put("----.", "9");
        morseMap.put("-----", "0");

        // 기호 , . ? : - @ 모스 부호 매핑
        morseMap.put("--..--", ","); morseMap.put(".-.-.-", "."); morseMap.put("..--..", "?");
        morseMap.put("---...", ":"); morseMap.put("-....-", "-"); morseMap.put(".--.-.", "@");

        // 2. 모스 부호 해독
        StringBuilder decodedMessage = new StringBuilder();

        // 공백을 기준으로 모스 부호 메시지를 분리
        String[] morseCharacters = morseMessage.split(" ");

        // 분리된 각 모스 부호를 해독
        for (String morseChar : morseCharacters) {
            // HashMap을 사용해 모스 부호에 대응하는 문자를 찾고 결과 문자열에 추가
            decodedMessage.append(morseMap.get(morseChar));
        }

        // 3. 결과 출력
        System.out.println(decodedMessage.toString());

    }
}
