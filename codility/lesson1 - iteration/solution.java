class Solution {
  public int solution(int N) {
    int maxGap = 0;

    if (N >= 1 && N <= 2147483647) {
      int gap = 0;

      String binaryValue = Integer.toBinaryString(N);

      for (int i = 0; i < binaryValue.length(); i++) {
        if (binaryValue.charAt(i) == '1') {
          if (gap > 0 && gap > maxGap) {
            maxGap = gap;
          }
          gap = 0;
          continue;
        } else if (binaryValue.charAt(i) == '0') {
          gap++;
        }
      }

    }

    return maxGap;
  }
}
