// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
import java.util.*;
class Main {
    public static boolean isValid(String s) {
        Stack <Character> st = new Stack<>();
        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);
            if(ch == '[' || ch == '{' || ch == '('){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                if(st.peek() == '(' && ch == ')' || st.peek() == '{' && ch == '}' || st.peek() == '[' && ch == ']'){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(st.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
      String str = "(){}[()]";
      System.out.println(isValid(str));
    }
}
