class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer> set = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j])
                i++;
            else if(nums1[i]>nums2[j])
                j++;
            else{
                set.add(nums1[i]);
                i++;
                j++;
            }
        }
        int arr[] = new int [set.size()];
        int k=0;
        for(int num : set){
            arr[k++] = num;
        }
        return arr;
    }
}