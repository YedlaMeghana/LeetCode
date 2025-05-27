// 56.Merge Intervals
// Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input

class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        // sort array based on the first element
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        // lisrt of list to store merged intervals
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
        // if ans list is empty --> for 1st element in the intervals OR 
        // if current interval cannot be merged then add it to the list
            if(ans.isEmpty() || intervals[i][0] > ans.get(ans.size()-1).get(1)){
                ans.add(Arrays.asList(intervals[i][0] , intervals[i][1]));
            }else{
                 // if the current can be merged
                ans.get(ans.size()-1).set(1,Math.max(ans.get(ans.size()-1).get(1) , intervals[i][1]));
            }
        }
      // convert list to array
        int [][] arr = new int[ans.size()][2];
        for(int i=0;i<ans.size();i++){
            for(int j=0;j<2;j++){
                arr[i][j] = ans.get(i).get(j);
            }
        }
        return arr;
    }
}

/*
Input:
intervals =
[[1,3],[2,6],[8,10],[15,18]]
Output:
[[1,6],[8,10],[15,18]] */
