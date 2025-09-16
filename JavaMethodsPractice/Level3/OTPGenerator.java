import java.util.*;

public class OTPGenerator {
    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) otps[i] = generateOTP();
        System.out.println("OTPs: " + Arrays.toString(otps));
        System.out.println("All unique: " + areUnique(otps));
    }
    static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000;
    }
    static boolean areUnique(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int v : arr) set.add(v);
        return set.size() == arr.length;
    }
}
