package adapter;

import java.util.Iterator;

import domain.Covid19Pacient;
import domain.Symptom;
import domain.SymptomFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Covid19Pacient p = new Covid19Pacient("Pepe", 35, new SymptomFactory());
		p.addSymptom(new Symptom("s1", 10, 10), 1);
		p.addSymptom(new Symptom("s2", 10, 10), 2);
		p.addSymptom(new Symptom("s3", 10, 10), 3);
		p.addSymptom(new Symptom("s4", 10, 10), 4);
		p.addSymptom(new Symptom("s5", 10, 10), 5);
		Covid19AdapterInvertedIterator ii = new Covid19AdapterInvertedIterator(p);
		SymptomComparator sC = new SymptomComparator();
		Sorting s = new Sorting();
		Iterator i = s.sortedIterator(ii, sC);
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
