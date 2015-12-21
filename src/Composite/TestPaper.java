package Composite;

import java.awt.List;
import java.util.ArrayList;

public class TestPaper extends Question{
	
	public TestPaper(String desc) {
		super(desc);
		// TODO Auto-generated constructor stub
	}

	private ArrayList<Question> test = new ArrayList<Question>();
	public void print(){
		for(Question q : test)
		{
			q.print();
		}
	}
	public void add(Question q){
		this.test.add(q);
	}
	public void remove(Question q){
		test.remove(q);
	}
}
