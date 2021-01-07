class Solution {
  public int solution(int N) {
    int largestGap = 0;

    if (N > 0 && N <= 2147483647) {
      int gap = 0;

      char binaryValue[] = Integer.toBinaryString(N).toCharArray();

      for (int i = 0; i < binaryValue.length; i++) {
        if (binaryValue[i] == '0') {
          gap++;
          continue;
        } else if (binaryValue[i] == '1') {
          if (gap > largestGap) {
            largestGap = gap;
            gap = 0;
          }
        }
      }
    }

    return largestGap;
  }
}
