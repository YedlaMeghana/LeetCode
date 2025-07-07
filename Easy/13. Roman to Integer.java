/* 13. Roman to Integer
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. 
The number 27 is written as XXVII, which is XX + V + II. */

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> mpp = new HashMap<>();
        mpp.put('I', 1);
        mpp.put('V', 5);
        mpp.put('X', 10);
        mpp.put('L', 50);
        mpp.put('C', 100);
        mpp.put('D', 500);
        mpp.put('M', 1000);

        int total = 0;
        for(int i=0;i<s.length();i++){
            int current = mpp.get(s.charAt(i));

            if(i+1 < s.length()){
                int next = mpp.get(s.charAt(i+1));
                if(current < next){
                    total -= current;
                }else{
                    total += current;
                }
            }else{
                total += current;
            }
        }

        return total;
    }
}
