import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeactChar {
    public static void main(String[] args) {
        Map<Character,Integer> freqMap = new HashMap<>();
        String str = "o a green apple";

        for(char ch : str.toCharArray()){
            if(freqMap.containsKey(ch)){
                freqMap.put(ch, freqMap.get(ch)+1);
            }else{
                freqMap.put(ch,1);
            }
        }

        for(char c : str.toCharArray()){
            if(c == ' ') continue;
            if(freqMap.get(c)==1){
                System.out.println(c);
                break;
            }
        }

        System.out.println(freqMap);
    }
}
