package auto;

import java.util.ArrayList;

public class AutoOverzicht {

    private ArrayList<Auto> lijst;
    private ArrayList<String> autolijst;

    public AutoOverzicht() {
        lijst = new ArrayList<Auto>();
        autolijst = new ArrayList<String>();
        autolijst.add("Alle merken");
        lijst.add(new Auto("audi", "a1", 23000,"4,7 liter","200 pk","rood","1500 kg"));
        lijst.add(new Auto("audi", "a3", 23000,"2,7 liter","300 pk","rood","1600 kg"));
        lijst.add(new Auto("audi", "r8", 123000,"3,8 liter","400 pk","rood","1300 kg"));
        lijst.add(new Auto("ferrari", "enzo", 200000,"6,0 liter","600 pk","rood","1654 kg"));
        lijst.add(new Auto("ferrari", "testarossa", 209000,"7,7 liter","700 pk","rood","1235 kg"));
        lijst.add(new Auto("fiat", "500", 12000,"2,7 liter","100 pk","zilver","653 kg"));
        lijst.add(new Auto("fiat", "bravo", 23000,"1,7 liter","200 pk","zilver","1764 kg"));
        lijst.add(new Auto("fiat", "punto", 16000,"4,7 liter","500 pk","blauw","1124 kg"));
        lijst.add(new Auto("ford", "fiesta", 14000,"1,7 liter","300 pk","wit","1453 kg"));
        lijst.add(new Auto("ford", "focus", 25000,"6,7 liter","700 pk","wit","175643 kg"));
        lijst.add(new Auto("ford", "mondeo", 28000,"7,7 liter","400 pk","wit","12345 kg"));
        lijst.add(new Auto("maserati", "ghibli", 120000,"8,7 liter","800 pk","wit","1324 kg"));
        lijst.add(new Auto("maserati", "quattroporte", 160000,"8,7 liter","600 pk","zilver","1342 kg"));
        lijst.add(new Auto("opel", "astra", 22000,"3,7 liter","200 pk","zilver","1500 kg"));
        lijst.add(new Auto("opel", "corsa", 14000,"2,7 liter","500 pk","groen","1654 kg"));
        lijst.add(new Auto("opel", "mokka", 11000,"1,7 liter","600 pk","grijs","1675 kg"));
        lijst.add(new Auto("porsche", "cayenne", 85000,"7,7 liter","800 pk","wit","1235 kg"));
        lijst.add(new Auto("porsche", "panamera", 120000,"9,7 liter","900 pk","zwart","1542 kg"));
        lijst.add(new Auto("porsche", "911", 126000,"6,7 liter","900 pk","rood","1543 kg"));

        for (Auto a : lijst) {
            if (!autolijst.contains(a.getMerk())) {
                autolijst.add(a.getMerk());
            }
        }
    }

    public String getMerk(String autotje) {

        String s = "";
        for (Auto a : lijst) {
            if (a.getMerk().equals(autotje)) {

            	   s += "<div class=\"pull-left panel panel-info auto-panel\">";
                   s += "<div class=\"panel-heading\">" + a.getMerk() + "  "+ a.getType() +" "+ "<br>&euro;" + a.getPrijsFormat()+"</div>";
                   s += "<div class=\"panel-body\">" + a.getImage() + "<br /><br /> Cilinder: "+a.getCilinder()+"<br />Vermogen: "+a.getVermogen()+"<br />Kleur: "+a.getKleur()+"<br />Gewicht: "+a.getGewicht()+"</div>";
                   s += "</div>";
            }
        }

        return s;

    }

    public String getMinMax(int min, int max) {
        String s = "";
        for (Auto a : lijst) {
            if (a.getPrijs() > min && a.getPrijs() < max) {
             s += "<div class=\"pull-left panel panel-info auto-panel\">";
                s += "<div class=\"panel-heading\">" + a.getMerk() + "  "+ a.getType() +" "+ "<br>&euro;" + a.getPrijsFormat()+"</div>";
                s += "<div class=\"panel-body\">" + a.getImage() + "<br /><br /> Cilinder: "+a.getCilinder()+"<br />Vermogen: "+a.getVermogen()+"<br />Kleur: "+a.getKleur()+"<br />Gewicht: "+a.getGewicht()+"</div>";
                s += "</div>";
            }
        }
        return s;
    }
    


    public String getAutoLijst() {
        String s1 = "";
           //s1+="<option>Alle merken</option>";
        for (String s : autolijst) {
            s1 += "<option>";
          
            s1 += s;
            s1 += "</option>";
        }

        return s1;
    }
        public String getAlles() {

        String s = "";
        for (Auto a : lijst) {
        	   s += "<div class=\"pull-left panel panel-info auto-panel\">";
               s += "<div class=\"panel-heading\">" + a.getMerk() + "  "+ a.getType() +" "+ "<br>&euro;" + a.getPrijsFormat()+"</div>";
               s += "<div class=\"panel-body\">" + a.getImage() +"<br /><br />Cilinder: "+a.getCilinder()+"<br />Vermogen: "+a.getVermogen()+"<br />Kleur: "+a.getKleur()+"<br />Gewicht: "+a.getGewicht()+"</div>";
               s += "</div>";
        }

        return s;

    }
        
    	public String minPrijs(int min){
    		String s = "";

    		for (Auto a : lijst) {
    			if (a.getPrijs() > min) {
    				 s += "<div class=\"pull-left panel panel-info auto-panel\">";
    	               s += "<div class=\"panel-heading\">" + a.getMerk() + "  "+ a.getType() +" "+ "<br>&euro;" + a.getPrijsFormat()+"</div>";
    	               s += "<div class=\"panel-body\">" + a.getImage() +"<br /><br />Cilinder: "+a.getCilinder()+"<br />Vermogen: "+a.getVermogen()+"<br />Kleur: "+a.getKleur()+"<br />Gewicht: "+a.getGewicht()+"</div>";
    	               s += "</div>";
    			}
    		}

    		return s;
    	}

    	public String maxPrijs(int max){
    		String s = "";

    		for (Auto a : lijst) {
    			if (a.getPrijs() < max) {
    				  s += "<div class=\"pull-left panel panel-info auto-panel\">";
    	               s += "<div class=\"panel-heading\">" + a.getMerk() + "  "+ a.getType() +" "+ "<br>&euro;" + a.getPrijsFormat()+"</div>";
    	               s += "<div class=\"panel-body\">" + a.getImage() +"<br /><br />Cilinder: "+a.getCilinder()+"<br />Vermogen: "+a.getVermogen()+"<br />Kleur: "+a.getKleur()+"<br />Gewicht: "+a.getGewicht()+"</div>";
    	               s += "</div>";
    			
    			}
    		}

    		return s;
    	}
    	public String zoekPrijs(int min, int max) {
    		String s = "";

    		for (Auto a : lijst) {
    			if (a.getPrijs() <= max && a.getPrijs() >= min) {
    				 s += "<div class=\"pull-left panel panel-info auto-panel\">";
  	               s += "<div class=\"panel-heading\">" + a.getMerk() + "  "+ a.getType() +" "+ "<br>&euro;" + a.getPrijsFormat()+"</div>";
  	               s += "<div class=\"panel-body\">" + a.getImage() +"<br /><br />Cilinder: "+a.getCilinder()+"<br />Vermogen: "+a.getVermogen()+"<br />Kleur: "+a.getKleur()+"<br />Gewicht: "+a.getGewicht()+"</div>";
  	               s += "</div>";
    			}
    		}

    		return s;

        
    	}
}
