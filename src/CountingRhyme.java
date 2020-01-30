import java.util.ArrayList;
import java.util.Iterator;

public class CountingRhyme {
    private ArrayList<Person> persons;

    public CountingRhyme(ArrayList<Person> persons) {
        this.persons = persons;
    }

    public Person calculation(int step) {
        if (step < 1) {
            throw new IllegalArgumentException("step < 1");
        }
        ArrayList<Person> copyPersons = new ArrayList<>(persons);
        Iterator<Person> iterator = copyPersons.listIterator();
        for (int count = 1; copyPersons.size() > 1; count++) {
            if (iterator.hasNext()) {
                iterator.next();
                if (count % step == 0) {
                    iterator.remove();
                }
            } else {
                iterator = copyPersons.listIterator();
                count--;
            }
        }
        return copyPersons.get(0);
    }
}
