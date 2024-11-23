
package hammam.percobaan2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CobaArrayList {
    public static void main(String[] args) {
        List<Object> mListCounty = new ArrayList<>();
        mListCounty.add("Indonesia");
        mListCounty.add("Malaysia");
        mListCounty.add("German");

        System.out.println("Country List");
        Iterator mIterator = mListCounty.iterator();
        while (mIterator.hasNext()) {
            Object element = mIterator.next();
            System.out.format("%s ", element);
        }
    }
}