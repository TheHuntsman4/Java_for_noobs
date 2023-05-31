import java.util.*;

public class _12 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                continue;
            } else {
                System.out.println(i);
            }
        }
        for (int i = 0; i <= 6; i++) {
            if (i == 3 || i == 6) {
                continue;
            } else {
                System.out.println(i);
            }
        }
    }
}
