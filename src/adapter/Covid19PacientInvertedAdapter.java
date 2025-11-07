package adapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import domain.Covid19Pacient;
import domain.Symptom;

public class Covid19PacientInvertedAdapter implements InvertedIterator {

    private Covid19Pacient pacient;
    private List<Symptom> symptoms;
    private int position;

    public Covid19PacientInvertedAdapter(Covid19Pacient p) {
        this.pacient = p;
        this.symptoms = new ArrayList<>(p.getSymptoms());
        goLast();
    }

    @Override
    public Object previous() {
        if (hasPrevious())
            return symptoms.get(position--);
        return null;
    }

    @Override
    public boolean hasPrevious() {
        return position >= 0;
    }

    @Override
    public void goLast() {
        position = symptoms.size() - 1;
    }
}
