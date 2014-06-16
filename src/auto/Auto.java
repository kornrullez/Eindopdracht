/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Auto {

 
    String merk;
    String type;
    String cilinder;
    String vermogen;
    String kleur;
    String gewicht;
    int prijs;
    

  

    public Auto(String merk, String type, int prijs,String cilinder, String vermogen,
			String kleur, String gewicht) {
		
		this.merk = merk;
		this.type = type;
		this.cilinder = cilinder;
		this.vermogen = vermogen;
		this.kleur = kleur;
		this.gewicht = gewicht;
		this.prijs = prijs;
	}

	public String getCilinder() {
		return cilinder;
	}

	public void setCilinder(String cilinder) {
		this.cilinder = cilinder;
	}

	public String getVermogen() {
		return vermogen;
	}

	public void setVermogen(String vermogen) {
		this.vermogen = vermogen;
	}

	public String getKleur() {
		return kleur;
	}

	public void setKleur(String kleur) {
		this.kleur = kleur;
	}

	public String getGewicht() {
		return gewicht;
	}

	public void setGewicht(String gewicht) {
		this.gewicht = gewicht;
	}

	public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrijs() {
        return prijs;
    }

    public void setPrijs(int prijs) {
        this.prijs = prijs;
    }


    public String getImage() {
        String pre = "<img src='images/";
        String post = ".jpg'>";

        return pre + getMerk() + "_" + getType() + post;
    }
    public String getPrijsFormat() {
    	DecimalFormatSymbols dfs = new DecimalFormatSymbols();
       	dfs.setDecimalSeparator(',');
       	dfs.setGroupingSeparator('.');
       	DecimalFormat df = new DecimalFormat("#,##0.--", dfs);
       	double prijs = (double) this.getPrijs();
       	String sPrijs = df.format(prijs);
       	return sPrijs;
    	}

}
