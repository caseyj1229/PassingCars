import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassingCarsTest {
    @Test
    void solution() {
        int[] A = {0,1,0,1,1};
        assertEquals(5,PassingCars.solution(A));

        int[] B = {0,1,1,1,1,1,0,1,1,1,1,0,0,0,1};
        assertEquals(18,PassingCars.solution(B));

        int[] C = new int[100000];
        int[] D = new int[100000];
        int[] E = new int[100000];
        for(int i = 0; i<C.length; i++){
            if(i%2 == 0){
                C[i] = 0;
            }
            else{
                C[i] = 1;
            }
            D[i] = 0;
            E[i] = 1;
        }
        assertEquals(-1,PassingCars.solution(C));
        assertEquals(0,PassingCars.solution(D));
        assertEquals(0,PassingCars.solution(E));
    }
}