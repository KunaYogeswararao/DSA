1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        int[] arr = new int[m + n];
4        int i = 0, j = 0, k = 0;
5        while (i < m && j < n) {
6            if (nums1[i] < nums2[j]) {
7                arr[k++] = nums1[i++];
8            } else {
9                arr[k++] = nums2[j++];
10            }
11        }
12        while (i < m) {
13            arr[k++] = nums1[i++];
14        }
15        while (j < n) {
16            arr[k++] = nums2[j++];
17        }
18        for (int x = 0; x < m + n; x++) {
19            nums1[x] = arr[x];
20        }
21    }
22}
23