package _1주차;

public class _2일차Solution {
    public int solution(String t, String p) {
        int count = 0; // 조건을 만족하는 부분 문자열의 개수 저장
        int pLen = p.length(); // p의 길이 저장
        long pNum = Long.parseLong(p); // p를 숫자로 변환

        // t에서 p와 길이가 같은 부분 문자열을 추출하여 비교
        for (int i = 0; i <= t.length() - pLen; i++) {
            String subStr = t.substring(i, i + pLen); // i부터 p 길이만큼 부분 문자열 추출
            long subNum = Long.parseLong(subStr); // 부분 문자열을 숫자로 변환
            if (subNum <= pNum) { // 조건 만족 시 count 증가
                count++;
            }
        }
        return count;
    }
}