1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int left = 0;
4        int right = numbers.length - 1;
5
6        while(left < right)
7        {
8            int sum = numbers[left] + numbers[right];
9
10            if(sum == target)
11            {
12                return new int[]{left + 1, right + 1};
13            }
14            else if(sum < target)
15            {
16                left++;
17            }
18            else
19            {
20                right--;
21            }
22        }
23
24        return new int[]{0,0};
25    }
26}