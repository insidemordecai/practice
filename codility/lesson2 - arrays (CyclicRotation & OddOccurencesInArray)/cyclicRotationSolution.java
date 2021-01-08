class Solution {
  public int[] solution(int[] A, int K) {
      
    //if the array is empty then return the array
      if(A.length == 0){
          return A;
      }

      // K being number of times it rotates
      for(int i = 0; i < K; i++){

        // store the last item to place it in first position later
          int lastItem = A[A.length-1];

          // loop from the back, A.length -1 being the last position
          for (int j = A.length - 1; j > 0; j--){

            // shift the second last value into the last position.
              A[j] = A[j-1];
          }

          // finally place the last item into the first position
          A[0] = lastItem;
      }

      return A;
  }
}
