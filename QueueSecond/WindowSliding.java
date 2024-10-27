import java.util.ArrayDeque;
import java.util.ArrayList;

public class WindowSliding {
    public long printFirstNegativeInteger(long A[] , int N , int K){
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        ArrayList<Long> result = new ArrayList<>();

        for(int i = 0 ; i < K; i++){
            if(A[i] < 0){
                dq.add(i);
            }
        }

        if(dq.isEmpty()){
            result.add(A[dq.getFirst()]);
        }else{
            result.add(0l);
        }

        for(int i = K ; i < N; i++){
            if(!dq.isEmpty() && i - dq.getFirst() >=K){
                dq.removeFirst();
            }

            if(A[i] < 0){
                dq.add(i);
            }

            if(!dq.isEmpty()){
                result.add(A[dq.getFirst()]);
            }else{
                result.add(0l);
            }
        }

        long[] ans = new long[result.size()];
        for(int i = 0 ; i < result.size() ; i++){
            ans[i] = result.get(i);
        }

        return ans;
    }
    
}
