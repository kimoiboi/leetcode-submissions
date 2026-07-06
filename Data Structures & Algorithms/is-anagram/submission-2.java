class Solution {
    public boolean isAnagram(String s, String t) {
        char[] temp1 = s.toCharArray();
        char[] temp2 = t.toCharArray();
        Arrays.sort(temp1);
        Arrays.sort(temp2);

        if(temp1.length < 1 || temp2.length < 1 || temp1.length != temp2.length){
            return false;
        }

        for(int i = 0; i < temp1.length; i++){
            if(temp1[i] == temp2[i] && i == temp1.length - 1){
                return true;
            }else if(temp1[i] == temp2[i]){
                continue;
            }else{
                break;
            }
        }
        return false;
    }
}
