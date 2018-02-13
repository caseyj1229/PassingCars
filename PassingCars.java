public class PassingCars {
    public static int solution(int[] A){
        if(A.length == 1){
            return 0;
        }

        int inc = 0;
        int total = 0;
        for(int i = 0; i<A.length; i++){
            if(A[i] == 0){
                inc++;
            }
            else{
                total += inc;
            }
        }
        if(total > 1000000000 || total < 0){
            return -1;
        }

        return total;
    }
}
