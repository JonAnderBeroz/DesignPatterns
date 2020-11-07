package adapter;

import java.util.ArrayList;
import java.util.List;

import domain.Covid19Pacient;
import domain.Symptom;

public class Covid19AdapterInvertedIterator  implements InvertedIterator{

	private final List<Symptom> symptoms;
	private Covid19Pacient pacient;
	private int position = 0;
	public Covid19AdapterInvertedIterator(Covid19Pacient p) {
		symptoms=new ArrayList<Symptom>(p.getSymptoms()); this.pacient=p;
		this.pacient = p;
	}
	@Override
	public Object previous() {
		
		return symptoms.get(position--);
	}

	@Override
	public boolean hasPrevious() {
		return position > -1;
	}

	@Override
	public void goLast() {
		this.position = symptoms.size()-1;
	}

}
