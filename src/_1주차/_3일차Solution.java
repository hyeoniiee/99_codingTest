package _1주차;

public class _3일차Solution {
    public int solution(String s) {
        int count = 0;       // 분리된 문자열의 개수를 저장하는 변수
        int xCount = 0;      // 기준 글자(x)의 개수
        int otherCount = 0;  // 기준 글자가 아닌 다른 글자의 개수

        char x = s.charAt(0);

        for (int i = 0; i < s.length(); i++) {
            // 현재 문자가 기준 문자(x)와 같으면 xCount 증가
            if (s.charAt(i) == x) {
                xCount++;
            } else {
                otherCount++; // 기준 문자(x)와 다르면 otherCount 증가
            }

            // 기준 문자와 다른 문자의 개수가 같아지면 분리
            if (xCount == otherCount) {
                count++;         // 분리 횟수 증가
                xCount = 0;      // xCount와 otherCount를 초기화하여 새 구간 시작 준비
                otherCount = 0;

                // 다음 글자를 새로운 기준 문자(x)로 설정
                if (i + 1 < s.length()) {
                    x = s.charAt(i + 1);
                }
            }
        }

        if (xCount != 0 || otherCount != 0) {
            count++;
        }

        return count;
    }
}
