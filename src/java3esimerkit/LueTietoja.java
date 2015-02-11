package java3esimerkit;

// K�ytt�j�n kanssa keskusteleva ohjelma

/**
 * Esimerkki tietojen lukemisesta Lukija-luokan avulla.
 * 
 * @author Mika Vesterholm
 * @version 1.0
 */
public class LueTietoja {
	public static void main(String[] args) {
    System.out.println("Kirjoita nimesi: ");
    String nimi = Lukija.lueRivi();
    System.out.println("Kirjoita ik�si: ");
    int ik� = Lukija.lueInt();
    System.out.println("Kirjoita pituutesi metrein�: ");
    float pituus = Lukija.lueFloat();
    System.out.println("Hei, olet " + nimi + " ja olet " + ik�
     + " vuotta vanha. Pituutesi on " + pituus + " metri�.");
  }
}
