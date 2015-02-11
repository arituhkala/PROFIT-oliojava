package markob;

//t‰‰ j‰i yrityksen asteelle

public class ErotteletSanat {
    
    public static Arraylist(String) listaa(String syoteMerkkijono){
        ArrayList tulosLista = new ArrayList(String);
        String[] jakoStr = syoteMerkkijono.split("\\,");
        for (int i=0;i<jakoStr.length;i++) {
          tulosLista.add(jakoStr[i]);
         }
        return tulosLista;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String syoteMerkkijono = "AA,BB,CC,DD,EE,FF";
        ArrayList(String) tulos=listaa(syoteMerkkijono);
        System.out.println("Tuloslista " + tulos);
    }

}
