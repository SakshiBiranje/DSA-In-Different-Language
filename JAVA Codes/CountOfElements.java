import java.util.HashMap;

class CountOfElements{

    public static HashMap<Integer, Integer> CountOccurences(int[] nums){
        HashMap<Integer, Integer> count= new HashMap<>();
        for(int num : nums){
            count.put(num, count.getOrDefault(num, 0)+1);
        }
        return count;
    }

    public static void main(String[] args){
       
        int[] nums = {1,1,2,2,2,3,3,3,4,4,5,5,5,6,6,6,6,7,7,8,8,8,8,9,10,10,10 };
        HashMap<Integer, Integer> result = CountOccurences(nums);
        for(int i : result.keySet()){
        System.out.println(i + " repeated " + result.get(i)+ "times");
        }

    }
}