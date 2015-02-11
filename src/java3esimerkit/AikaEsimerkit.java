package java3esimerkit;

/**
 * Esimerkkej� Aika-luokan k�yt�st�.
 * 
 * @author mikaves
 */
public class AikaEsimerkit {
	public static void main(String[] args) {
    //Aika aika = new Aika();
    //aika.tunnit = 12; //LUVATON, attribuutti ei n�y luokan ulkopuolle!
    
    Aika aika = new Aika(0,0,0);
    //Tulostaa olion toString metodin palauttaman merkkijonon.
    System.out.println(aika);
    System.out.println(aika.sekunteina());

    aika = aika.lis��Sekunteja(12);
    System.out.println(aika);
    System.out.println(aika.sekunteina());

    aika = aika.lis��Sekunteja(61);    
    System.out.println(aika);
    System.out.println(aika.sekunteina());

    aika = aika.lis��(1,61,61);    
    System.out.println(aika);
    System.out.println(aika.sekunteina());

    System.out.println(aika.lis��(aika));
    System.out.println(aika.sekunteina());
  }
}
