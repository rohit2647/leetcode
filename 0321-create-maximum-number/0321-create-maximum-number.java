class Solution {

    public static int[] dsort(int[] nums, int k) {
        int[] res = new int[k];
        int top = 0;
        int drop = nums.length - k;

        for (int i = 0; i < nums.length; i++) {
            while (top > 0 && res[top - 1] < nums[i] && drop > 0) {
                top--;
                drop--;
            }
            if (top < k) {
                res[top++] = nums[i];
            } else {
                drop--;
            }
        }
        return res;
    }

    public static boolean greater(int[] nums1, int i, int[] nums2, int j) {
        while (i < nums1.length && j < nums2.length && nums1[i] == nums2[j]) {
            i++;
            j++;
        }
        return j == nums2.length || (i < nums1.length && nums1[i] > nums2[j]);
    }

    public static int[] merge(int[] nums1, int[] nums2, int k) {
        int[] array = new int[k];
        int j = 0;
        int t = 0;

        for (int i = 0; i < k; i++) {
            if (greater(nums1, j, nums2, t)) {
                array[i] = nums1[j];
                j++;
            } else {
                array[i] = nums2[t];
                t++;
            }
        }
        return array;
    }

    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        int[] array = new int[k];
        int start = Math.max(0, k - nums2.length);
        int end = Math.min(k, nums1.length);

        for (int i = start; i <= end; i++) {
            int[] cand1 = dsort(nums1, i);
            int[] cand2 = dsort(nums2, k - i);
            int[] cand = merge(cand1, cand2, k);

            if (greater(cand, 0, array, 0)) {
                array = cand;
            }
        }

        return array;
    }
}