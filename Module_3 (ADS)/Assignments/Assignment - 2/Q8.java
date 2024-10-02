import java.util.Arrays;
class Q8 //Array manipulation
{
public static long arrayManipulation(int n, List<List<Integer>> queries) {
    long[] diff = new long[n + 1];
    long[] prefixSum = new long[n + 1];

    for (List<Integer> query : queries) {
        int a = query.get(0);
        int b = query.get(1);
        int k = query.get(2);
        diff[a] += k;
        diff[b + 1] -= k;
    }
    prefixSum[0] = 0;
    for (int i = 1; i <= n; i++) {
        prefixSum[i] = prefixSum[i - 1] + diff[i];
    }
    long max = 0;
    for (int i = 1; i <= n; i++) {
        max = Math.max(max, prefixSum[i]);
    }
    return max;
}
}