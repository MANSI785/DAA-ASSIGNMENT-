class Solution {
    public int[] sortArray(int[] nums) {
      
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
       void mergeSort(int[] arr,int low,int high){

            if(low>=high){
                return;
            }

            int mid = (low+high)/2;

            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);

            merge(arr,low,mid,high);

        }
       void merge(int[] arr,int low,int mid,int high){

            int i = low;
            int j = mid+1;
            int trace = 0;
            int result[] = new int[high - low + 1];
            while(i<=mid && j<=high){

                if(arr[i]<arr[j]){
                    result[trace] = arr[i];
                    trace++;
                    i++;
                }
                else{
                    result[trace] = arr[j];
                    trace++;
                    j++;

                }
            }
            while(i<=mid){
                result[trace] = arr[i];
                trace++;
                i++;

            }
             while(j<=high){
                result[trace] = arr[j];
                trace++;
                j++;


        }
        int k = 0;

        for(int s = low;s<=high;s++){
            arr[s] = result[k];
            k++;

        }
    }
}
