class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int idx1 = 0;
        int idx2 = 0;
        
        boolean result = true;
        
        for (int i = 0; i < goal.length; i++) {
            if (idx1< cards1.length && goal[i].equals(cards1[idx1])) {
                idx1++;
                continue;
            } else {
                if (idx2< cards2.length && goal[i].equals(cards2[idx2])) {
                    idx2++;
                } else {
                    result = false;
                    break;
                }
            }
        }
        
        String answer = "";
        answer = result?"Yes":"No";
        return answer;
    }
}