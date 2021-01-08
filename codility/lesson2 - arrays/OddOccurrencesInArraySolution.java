class Solution {
  public int solution(int[] A) {

    int unpaired = 0;

    for (int i = 0; i < A.length; i++) {
      // making use of XOR operator
      unpaired ^= A[i];
    }

    return unpaired;
  }
}