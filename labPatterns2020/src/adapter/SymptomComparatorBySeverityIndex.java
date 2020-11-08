package adapter;

import java.util.Comparator;

import domain.Symptom;

public class SymptomComparatorBySeverityIndex implements Comparator {

	@Override
	public int compare(Object arg0, Object arg1) {
		if (((Symptom) arg0).getSeverityIndex() < ((Symptom) arg1).getSeverityIndex()) {
			return -1;
		}else if(((Symptom) arg0).getSeverityIndex() > ((Symptom) arg1).getSeverityIndex()) {
			return 1;
		}else {
			return 0;
		}
	}
}	
