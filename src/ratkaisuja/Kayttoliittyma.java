/**
 * ###Ei niin graafinen UI###

HUOM: merkkijonon pilkkominen tulee olla tehtyn�

Hae ali.jar paketti. [Suora latauslinkki](https://svn.cc.jyu.fi/srv/svn/ohj2/Ali/trunk/Ali.jar)

Lis�� ali.jar projektiisi. (Project-properties-Java build path)


 */

package ratkaisuja;

import java.util.*;

import fi.jyu.mit.ohj2.*;

public class Kayttoliittyma {

	public static void lisaaNimia(ArrayList lista) {
		while (true) {

			String nimi = Syotto
					.kysy("Anna nimesi muodossa: Etunimi Sukunimi ");
			if (nimi.equals(""))
				break;
			lista.add(nimi);
		}

	}

	private static void tyhjennaNimet(ArrayList nimilista) {
		// TODO Auto-generated method stub

	}

	private static void tulostaNimet(ArrayList nimilista) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// Esimerkki k�ytt�liittym�n tekemisest�

		ArrayList nimilista = new ArrayList();

		System.out.println("Ohjelma luo nimilistoja");
		System.out
				.println("Toiminnot:\n  1. Lis�� nimi�\n   2. Tulosta nimet\n   3. Tyhjenn� nimet\n");
		Syotto.kysy("Anna toiminto");

		char nappain;
		while (true) {
			nappain = IO
					.odota_nappain("0123", IO.EI_OLETUSTA, IO.MERKKI_ISOKSI);

			switch (nappain) {
			case '1':
				lisaaNimia(nimilista);
				break;
			case '2':
				tulostaNimet(nimilista);
				break;
			case '3':
				tyhjennaNimet(nimilista);
			default:
				System.out.println("Pakko valita jotain!");

			}

		}

	}

}
