package Composite;

public class CreatePaper {
	public static void main(String[] args)
	{
		QuestionTypeA QTA = new QuestionTypeA("2+4=?");
		QuestionTypeB QTB = new QuestionTypeB("56-32=?");
		TestPaper tp = new TestPaper(null);
		tp.add(QTA);
		tp.add(QTB);
		tp.print();
	}

	
	
}
