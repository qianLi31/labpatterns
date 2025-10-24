package adapter2;

import java.util.ArrayList;
import java.util.Set;

import javax.swing.table.AbstractTableModel;

import domain.Covid19Pacient;
import domain.Symptom;

public class Covid19PacientTableModelAdapter extends AbstractTableModel {
	protected Covid19Pacient pacient;
	protected String[] columnNames =
			new String[] {"Symptom", "Weight" };

	public Covid19PacientTableModelAdapter(Covid19Pacient p) {
		this.pacient=p;
	}

	public int getColumnCount() {
		// Challenge!
		return 2;
	}

	public String getColumnName(int i) {

		return columnNames[i];
	}

	public int getRowCount() {
		return columnNames.length+1;
	}

	public Object getValueAt(int row, int col) {

		ArrayList<Symptom> symptoms = new ArrayList<>(pacient.getSymptoms());
		Symptom symptom = symptoms.get(row);

		if (col == 0) {
			return symptom.getName();
		} else if (col == 1) {
			return pacient.getWeight(symptom);
		} else {
			return null;
		}
	}

}

