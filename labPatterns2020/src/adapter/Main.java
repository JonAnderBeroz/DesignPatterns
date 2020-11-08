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
		p.addSymptom(new Symptom("s2", 10, 20), 2);
		p.addSymptom(new Symptom("s3", 10, 30), 3);
		p.addSymptom(new Symptom("s4", 10, 25), 4);
		p.addSymptom(new Symptom("s5", 10, 1), 5);
		Covid19AdapterInvertedIterator ii = new Covid19AdapterInvertedIterator(p);
		SymptomComparatorByName sC = new SymptomComparatorByName();
		SymptomComparatorBySeverityIndex  scSI = new SymptomComparatorBySeverityIndex();
		Sorting s = new Sorting();
		
		System.out.println("By Name");
		Iterator i = s.sortedIterator(ii, sC);
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("By severity Index");
		Iterator i2 = s.sortedIterator(ii, scSI);
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
	}

}
