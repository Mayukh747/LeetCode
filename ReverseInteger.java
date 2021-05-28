class ReverseInteger {
    // public int reverse(int x) {
    // String a = String.valueOf(x);
    // String b = "";
    // for(int i = 0; i < a.length(); i++){
    // b += a.charAt(a.length() - i - 1);
    // }
    // if(x<0)
    // b = "-" + b;
    // return Integer.parseInt(b);
    // }

    /**
     * I only have one edge case left that I am unable to handle. If the reversed
     * number is larger than the possible values of the int datatype then I must
     * return 0;
     */
    public int reverse(int x) {
        int reversedNum = 0;

        while (x != 0) {
            reversedNum *= 10;
            reversedNum += x % 10;
            x /= 10;
        }

        return reversedNum;
    }

    public static void main(String[] args) {
        ReverseInteger r = new ReverseInteger();
        System.out.println(r.reverse(-123456789));
    }
}
