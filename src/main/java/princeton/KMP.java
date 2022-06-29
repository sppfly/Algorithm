package princeton;

/**
 * @author shuxiahua
 * @Description:
 * @date 2022/5/4 16:46
 */
public class KMP {



    private static int[][] dfa = new int[1][1];

    /**
     *  brutal-force method
     */
    private static int search(String t, String p) {
        int i, M = t.length();
        int j, N = p.length();
        for (i=0, j=0; i<M && j<N; i++) {
                j = dfa[t.charAt(i)][j];
        }
        if (j==N) return i-j;
        return -1;
    }


    public static void main(String[] args) {
        String pattern = "aab";
        String text = "abcaabcaaacacsadas";
        System.out.println(search(text, pattern));
    }


}
