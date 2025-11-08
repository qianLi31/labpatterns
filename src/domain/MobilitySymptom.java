package domain;

public class MobilitySymptom extends Symptom {
    
    public MobilitySymptom(String name, int covidImpact, int severityIndex) {
        super(name, covidImpact, severityIndex);
    }
    
    @Override
    public int getAffectedDays() {
        return 3; 
    }
}