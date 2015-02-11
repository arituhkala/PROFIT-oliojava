package mpe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merkkijono {

	public String kirjaimetIsoksi(String mjono) {
		String temp = "";
		for (int i = 0; i < mjono.length(); i += 2) {
			temp += (mjono.charAt(i));

		}
		temp = temp.toUpperCase();

		return temp;
	}

	// public String[] parsiMerkkijono(String mjono) {
	public List<String> parsiMerkkijono(String mjono) {
		String delims = "[ .,?!;:]+";
		/*
		 * String[] lista; //array lista = mjono.split(delims);
		 */
		// List<String> lista = new
		// ArrayList<String>(Arrays.asList(mjono.split(delims)));
		List<String> lista = new ArrayList<String>();
		lista.addAll(Arrays.asList(mjono.split(delims)));

		return lista;
	}
}
