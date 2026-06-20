package submission_3;

public class RabbitProblem {
    // Calculates the number of rabbit pairs after n months
    public int calculateRabbits(int months) {
        if (months == 0) return 0;
        if (months == 1) return 1;
        int prev1 = 1, prev2 = 0, current = 0;
        for (int i = 2; i <= months; i++) {
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return current;
    }
}

