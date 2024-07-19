public class PowerOfTwo {
    public boolean  power(int n ){
        if(n<=0) return false;
        while(n!=0){
            int lastBit = n & 1;
            n=n>>1;
            if(lastBit == 1 && n!=0)
                return false;

        }
        return true;
    }


    public static void main(String[] args) {
        PowerOfTwo povv = new PowerOfTwo();
        System.out.println(povv.power(14));
    }
}
