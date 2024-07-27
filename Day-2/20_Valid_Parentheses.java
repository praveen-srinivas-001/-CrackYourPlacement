class Solution {
    public boolean isValid(String s) {
        Stack<Character> chr = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='{' || ch=='[' || ch=='(')
                chr.push(ch);
            else{
                if(chr.size()==0) return false;
                else if(ch=='}'){
                    if(chr.peek() == '{')
                        chr.pop();
                    else
                        return false;
                }
                else if(ch==']'){
                    if(chr.peek() == '[')
                        chr.pop();
                    else
                        return false;
                }
                else if(ch==')'){
                    if(chr.peek() == '(')
                        chr.pop();
                    else
                        return false;
                }
            }
        }
        if (chr.size() == 0) return true;
        else return false;
    }
}