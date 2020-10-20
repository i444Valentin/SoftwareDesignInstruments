package logging;

public class SearchSmallest {
    static int F(int x) {
        return (x * x - 9) * (x * x - 9) + 5;
    }

    public static void main (String[] args) {
        int a, b, t, M, R;
        a = -13;
        b = 13;
        M = a;
        R = F(a);
        for (t = a; t <= b; t++) {
            if (F(t) < R) {
                M = t;
                R = F(t);
            }
        }
        System.out.println(M + 7);

    }
}
