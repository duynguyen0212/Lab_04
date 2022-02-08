package Lab04A;

import java.util.Comparator;

public class LexicographicComparator implements Comparator {
    @Override
    public int compare(Object arg0, Object arg1){
        Person p1 = (Person)arg0;
        Person p2 = (Person)arg1;

        if(p1.name.length() == p2.name.length())
            return 0;
        else if(p1.name.length() > p2.name.length())
            return 1;
        else
            return -1;
    }
}
