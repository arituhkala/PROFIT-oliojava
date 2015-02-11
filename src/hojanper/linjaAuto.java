package hojanper;

public class linjaAuto {
	private int paikkoja;
	private int paikkojaVapaana;

	public linjaAuto() {
        this(,0); //kutsutaan j�lkimm�ist� konstruktoria
    }

	public linjaAuto(int maxPaikkoja) {
		paikkoja = maxPaikkoja;
		paikkojaVapaana = maxPaikkoja;
	}

	public void lisaaMatkustaja() {
		if (paikkojaVapaana > 0)
			paikkojaVapaana = paikkojaVapaana - 1;
		else
			System.out.println("Paikat t�ynn�");

	}

	public void poistaMatkustaja() {
		if (paikkojaVapaana == paikkoja)
			System.out.println("Kaikki paikat tyhji�");
		else {
			paikkojaVapaana = paikkojaVapaana - 1;
			System.out.println("Paikka vaputui");
		}
	}

	public static void main(String[] args) {
		int i;
		linjaAuto auto = new linjaAuto(1);
		for (i = 0; i < 5; i++)
			auto.lisaaMatkustaja();

		// for(i=0;i<5;i++)
		auto.poistaMatkustaja();
	}

}
