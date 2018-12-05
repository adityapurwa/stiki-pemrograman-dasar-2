public class Pangkat {
    public static void main(String[] args) {
        System.out.println(pangkat(2,2));

    }

    public static int pangkat(int base, int power) {
        if (power - 1 <= 0) {
            return base;
        }
        return base * pangkat(  base, power - 1);
    }

}
