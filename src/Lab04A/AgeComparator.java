package Lab04A;

import java.util.Comparator;

public class AgeComparator implements Comparator {
        @Override
        public int compare(Object agr0, Object arg1) {
            Person p1 = (Person)agr0;
            Person p2 = (Person)arg1;

            if(p1.age == p2.age)
                return 0;
            else if(p1.age > p2.age)
                return 1;
            else
                return -1;
        }

}
