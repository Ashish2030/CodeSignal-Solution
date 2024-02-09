// he method checks if k is 0 to handle a special case where no additional votes can be added. 
// It finds the maximum number of votes and counts how many candidates have the same maximum votes, returning 0 
// if there are multiple candidates or 1 if there is only one.
// If k is not 0, the method determines the number of potential winners by comparing each candidate's vote count 
// with k added to it. It increments a count variable for each candidate whose temporary vote count is greater than all other candidates.
// The method returns the count of potential winners, indicating how many candidates can potentially win the election.


public class Main {
    public static void main(String[] args) {
        int[] votes = {2, 3, 5, 2};
        int k = 1;
        int winners = electionsWinners(votes, k);
        System.out.println("Number of winners: " + winners);
    }
    
    public static int electionsWinners(int[] votes, int k) {
        if (k == 0) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < votes.length; i++) {
                if (votes[i] > max) {
                    max = votes[i];
                }
            }
            int count1 = 0;
            for (int i = 0; i < votes.length; i++) {
                if (votes[i] == max) {
                    count1++;
                }
            }
            if (count1 > 1) {
                return 0;
            } else {
                return 1;
            }
        }
        int count = 0;
        for (int i = 0; i < votes.length; i++) {
            int flag = 0;
            int temp = votes[i] + k;
            for (int j = 0; j < votes.length; j++) {
                if (temp <= votes[j]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                count++;
            }
        }
        return count;
    }
}
