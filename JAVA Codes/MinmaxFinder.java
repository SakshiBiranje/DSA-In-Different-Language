import java.util.Arrays;

class MinmaxFinder{

    public static int SetMax(int[] nums){
        int max= Integer.MIN_VALUE; //Integer.MIN_VALUE represents min value in java 
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
               max =nums[i];
            }
        }
        return max;

    }

    public static int SetMin(int[] nums){
        int min= Integer.MAX_VALUE;   //Integer.MAX_VALUE represents max value in java
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
               min =nums[i];
            }
        }
        return min;

    }
    public static void main(String[] args){

        int nums[]={1,7,6,5,9,23,56,90};
        System.out.println("MAximum Element : "+SetMax(nums));
        System.out.println("Minimum Element : "+SetMin(nums));
    }
}