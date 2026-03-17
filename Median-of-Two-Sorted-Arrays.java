1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        int n1=nums1.length;
4        int n2=nums2.length;
5        double ans=0.0;
6        int[] merge=new int[n1+n2];
7        for(int i=0;i<n1;i++)
8        {
9            merge[i]=nums1[i];
10        } 
11        for(int i=0;i<n2;i++)
12        {
13            merge[n1+i]=nums2[i];
14        }
15        Arrays.sort(merge);
16        int mid=(n1+n2)/2;
17        if((n1+n2)%2==0)
18        {
19            ans=(merge[mid-1]+merge[mid])/2.0;
20        }
21        else
22        {
23            ans=merge[mid];
24        }
25        return ans;
26    }
27}