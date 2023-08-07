
/*
    Welcome to this interview!
    Please write program which will give possibility to find number of unique pairs in array of random integers.
    Unique pair is two opposite numbers, like [-2,2], [-6,6] etc. In other words - two numbers with the same
    absolute value but different sign.
*/

public class countPairOfOppositeNumbers {

    public static void main(final String[] args) {
        //We have two unique pairs in this array: [-5,5] and [-1,1]
        int[] input = new int[]{7, -5, 6, 5, -8, 5, -5, 1, 7, 4, -1, -2, 1};

        PairCounter pairCounter = new UniquePairCounter(input);

        System.out.println(pairCounter.countPairs());
    }
}

interface PairCounter {
    int countPairs();

}

class UniquePairCounter implements PairCounter  {
    int[] input;

    UniquePairCounter (int[] input) {
        this.input=input;
    }

    /**
     * add сет для хранения пар , которые уже посчитаны, чтобы была уникальность.
     * @return
     */
    @Override
    public int countPairs() {
        int count = 0;
        for(int i = 0 ; i < input.length-1; i++) {
            for (int j = i; j< input.length;j++) {
                if (input[i] + input[j] == 0 ) {
                    count++;
                }
            }
        }

        return count;
    }
}
