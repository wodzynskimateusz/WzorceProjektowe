package WzorzecStrategia.StrategieSortowania.Sortowania;

public class Babelkowe implements SortowanieInterfejs {

    @Override
    public int[] sortuj(int[] input) {

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length - 1; j++) {
                if (input[j] > input[j + 1]) {
                    int temp = input[j + 1];
                    input[j + 1] = input[j];
                    input[j] = temp;
                }
            }
        }

        return input;
    }
}
