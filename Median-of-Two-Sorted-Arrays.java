1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        int[] arr=merge(nums1,nums1.length,nums2,nums2.length);
4        int n=arr.length;
5        double ans=0.0000;
6        if(n % 2 != 0)
7        {
8            ans=arr[n/2];
9            return ans;
10        }
11        ans = (arr[n/2]+arr[n/2-1])/2.0;
12        return ans;
13    }
14        public int[] merge(int[] nums1, int m, int[] nums2, int n) {
15        int[] arr = new int[m + n];
16        int i = 0, j = 0, k = 0;
17        while (i < m && j < n) {
18            if (nums1[i] < nums2[j]) {
19                arr[k++] = nums1[i++];
20            } else {
21                arr[k++] = nums2[j++];
22            }
23        }
24        while (i < m) {
25            arr[k++] = nums1[i++];
26        }
27        while (j < n) {
28            arr[k++] = nums2[j++];
29        }
30        return arr;
31    }
32}