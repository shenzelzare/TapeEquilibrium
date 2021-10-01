public class TapeEquilibrium {

    public int solution(int[] A) {
        int begin=0;
        int last=0;
        int result=Integer.MAX_VALUE;
        int currentResult=0;
        for(int i=0; i<A.length;i++){
            begin= begin +A[i];
        }
        for(int j=0;j<A.length;j++){
            last+=A[j];
            begin-=A[j];
            currentResult=Math.abs(begin-last);
            if(result>currentResult){
                result=currentResult;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
        tapeEquilibrium.solution(new int[]{3,1,2,4,3});
    }
}
