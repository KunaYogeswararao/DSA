1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3    int l=1;
4    int r=nums.length-2;
5    int n=nums.length;
6    if(n==1) return nums[0];
7    if(nums[0] != nums[1]) return nums[0];
8    if(nums[n-1] != nums[n-2]) return nums[n-1];
9    while(l<=r)
10    {
11        int mid=l+(r-l)/2;
12        if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1])
13        {
14            return nums[mid];
15        }
16        else if((mid%2==0 && (nums[mid]!=nums[mid+1])) ||( mid%2==1 && nums[mid]!=nums[mid-1]))
17        {
18            r=mid-1;
19        }
20        else
21        {
22            l=mid+1;
23        }
24    }
25    return -1;
26    }
27}