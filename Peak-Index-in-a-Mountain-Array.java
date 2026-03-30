1class Solution {
2    public int peakIndexInMountainArray(int[] arr) {
3        int n=arr.length;
4        int l=1;
5        int r=n-2;
6        while(l<=r)
7        {
8            int mid=l+(r-l)/2;
9            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
10            {
11                return mid;
12            }
13            else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1])
14            {
15                l=mid+1;
16            }
17            else
18            {
19                r=mid-1;
20            }
21        }
22        return 0;
23    }
24}