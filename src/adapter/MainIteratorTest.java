package adapter;

import java.util.Iterator;
import domain.Covid19Pacient;
import domain.Symptom;

public class MainIteratorTest {
    public static void main(String[] args) {

        Covid19Pacient p = new Covid19Pacient("Jon", 28);
        p.addSymptomByName("fiebre", 2);
        p.addSymptomByName("tos seca", 3);
        p.addSymptomByName("cefalea", 1);
        p.addSymptomByName("astenia", 1);
        p.addSymptomByName("disnea", 2);

        Covid19PacientInvertedAdapter adapter = new Covid19PacientInvertedAdapter(p);

        System.out.println("+---- Izena order ----+");
        Iterator<Object> it1 = Sorting.sortedIterator(adapter, new SymptomNameComparator());
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }

        System.out.println("\n+---- Severity order ----+");
        Iterator<Object> it2 = Sorting.sortedIterator(adapter, new SymptomSeverityComparator());
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
    }
}
