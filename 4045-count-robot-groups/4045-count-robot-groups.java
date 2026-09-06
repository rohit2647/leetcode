class Solution {
    public int countGroups(int[] position, int[] speed, int distance) {
        int n = position.length;
        int ret = 0;
        for (int i=n-1; i>=0; ) {
            int v = speed[i];
            int j = i-1;
            while (j>=0 && ((speed[j]>speed[i]) || (Math.abs(position[j]-position[j+1])<=distance)))
                j--;
            ret += 1;
            i = j;
        }
        return ret;
    }
}