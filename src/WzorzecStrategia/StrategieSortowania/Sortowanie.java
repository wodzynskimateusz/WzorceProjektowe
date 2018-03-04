package WzorzecStrategia.StrategieSortowania;

import WzorzecStrategia.StrategieSortowania.Sortowania.Babelkowe;
import WzorzecStrategia.StrategieSortowania.Sortowania.SortowanieInterfejs;

public class Sortowanie{

    private SortowanieInterfejs sortowaniaInterfejs;

     public Sortowanie(SortowanieInterfejs sortowaniaInterfejs){
         setSortowanie(sortowaniaInterfejs);
     }

     public void setSortowanie (SortowanieInterfejs sortowanieInterfejs){
         this.sortowaniaInterfejs = sortowanieInterfejs;
     }

     public int[] wykonajSortowanie(int[] input){
         return sortowaniaInterfejs.sortuj(input);
     }

}
