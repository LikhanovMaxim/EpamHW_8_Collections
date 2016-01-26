
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

public class CountingRhymeTest {

    @Test
    public void calculationStepOneSizeOne() throws Exception {
        Person Anna = new Person("Anna");
        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.add(Anna);
        CountingRhyme countingRhyme = new CountingRhyme(arrayList);
        assertTrue(countingRhyme.calculation(1).equals(Anna));
    }

    @Test
    public void calculationStepOneSizeThree() throws Exception {
        Person Anna = new Person("Anna");
        Person Pasha = new Person("Pasha");
        Person Alex = new Person("Alex");
        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.add(Anna);
        arrayList.add(Pasha);
        arrayList.add(Alex);
        CountingRhyme countingRhyme = new CountingRhyme(arrayList);
        assertTrue(countingRhyme.calculation(1).equals(Alex));
    }

    @Test
    public void calculationStepTwoSizeOne() throws Exception {
        Person Anna = new Person("Anna");
        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.add(Anna);
        CountingRhyme countingRhyme = new CountingRhyme(arrayList);
        assertTrue(countingRhyme.calculation(2).equals(Anna));
    }

    @Test
    public void calculationStepTwoSizeTwo() throws Exception {
        Person Anna = new Person("Anna");
        Person Pasha = new Person("Pasha");
        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.add(Anna);
        arrayList.add(Pasha);
        CountingRhyme countingRhyme = new CountingRhyme(arrayList);
        assertTrue(countingRhyme.calculation(2).equals(Anna));
    }

    @Test
    public void calculationStepTwoSizeThree() throws Exception {
        Person Anna = new Person("Anna");
        Person Pasha = new Person("Pasha");
        Person Alex = new Person("Alex");
        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.add(Anna);
        arrayList.add(Pasha);
        arrayList.add(Alex);
        CountingRhyme countingRhyme = new CountingRhyme(arrayList);
        assertTrue(countingRhyme.calculation(2).equals(Alex));
    }

    @Test
    public void calculationStepThreeSizeTwo() throws Exception {
        Person Anna = new Person("Anna");
        Person Pasha = new Person("Pasha");
        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.add(Anna);
        arrayList.add(Pasha);
        CountingRhyme countingRhyme = new CountingRhyme(arrayList);
        assertTrue(countingRhyme.calculation(3).equals(Pasha));
    }
}