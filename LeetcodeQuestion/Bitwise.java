public class Bitwise {
    public int bitwiseComplement(int n){
        if(n==0) return 1;
        int num = n;
        int mask=0;
        while(num !=0){
            mask = mask << 1 | 1;
            num=num>>1;
        }
        return (~n) & mask;
    }

    public static void main(String[] args) {
        Bitwise bit = new Bitwise();
        System.out.println(bit.bitwiseComplement(5));
    }
}
