package main;

public class TesteWriterFacade {

	public static void main(String[] args) {
		WriterFacade wf = new WriterFacade("testeWriterFacade.txt", "UTF-8");
		wf.write("Testando Writer Facade");
		wf.close();
	}

}
