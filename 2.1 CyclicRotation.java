class Solution {
    public int[] solution(int[] A, int K) {
        if (A.length<2 || K == 0){
            return A;
            } else {
            for (int i=0; i<K; i++) {
                A = rotateArray (A);
            }        
        return A;
        }
    }   
    private int[] rotateArray (int[] A){
        int [] temp = new int[A.length];
        for (int i =0; i<A.length-1; i++){
            temp[i+1] = A[i];
        }
        temp[0]=A[A.length-1];
        return temp;
    }
}
