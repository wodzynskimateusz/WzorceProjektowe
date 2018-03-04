package WzorzecStrategia.StrategieSortowania.Sortowania;

public class Zliczanie implements SortowanieInterfejs {
    @Override
    public int[] sortuj(int[] input) {

        int max = -1;
        for (int i = 0; i < input.length; i++) {
            if (max < input[i])
                max = input[i];
        }

        int[] countingTable = new int[max + 1];
        for (int i = 0; i < input.length; i++)
            countingTable[input[i]]++;

        int counter = 0;
        int[] sorted = new int[input.length];
        for (int i = 0; i < countingTable.length; i++) {
            while (countingTable[i] > 0) {
                sorted[counter] = i;
                countingTable[i]--;
                counter++;
            }
        }

        return sorted;
    }
}

