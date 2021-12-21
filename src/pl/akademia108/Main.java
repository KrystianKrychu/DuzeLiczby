package pl.akademia108;
import java.math.BigInteger;
public class Main {

    public static void main(String[] args) {

        BigInteger podstawa = new BigInteger("10");
        int potega = 10;

        BigInteger wynik = podstawa.pow(potega);

        System.out.println("Wynik potęgowania 10^80 (BigInteger): " + wynik);
    }
}
