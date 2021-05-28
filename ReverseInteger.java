/**
 * This problem has been solved. Finish: 28 May 2021.
 **/

class ReverseInteger {
    public int reverse(int x) {

        long reversedNum = 0;

        while (x != 0) {
            reversedNum *= 10;
            reversedNum += x % 10;
            x /= 10;
        }

        if( reversedNum >= Integer.MAX_VALUE || reversedNum <= Integer.MIN_VALUE){
            return 0;
        }
        else 
            return (int) reversedNum;
    }

    public static void main(String[] args) {
        ReverseInteger r = new ReverseInteger();
        System.out.println(r.reverse(1534236469));
    }


}
