package modell;

public class Palya {
    private final String HARCOS = "H", VARAZSLO = "V", URES = "_", HARC = "X";
    private final int HOSSZ = 3;
    private String[] mezok = new String[HOSSZ];
    
    public Palya(String[] mezok) {
        this.mezok = mezok;
    }
    
    public Palya() {
        for(int i = 0; i < HOSSZ; i++) mezok[i] = URES;
    }

    public String getHARCOS() {
        return HARCOS;
    }

    public String getVARAZSLO() {
        return VARAZSLO;
    }

    public String getURES() {
        return URES;
    }
    
    public String getHARC() {
        return HARC;
    }

    public int getHOSSZ() {
        return HOSSZ;
    }

    public String[] getMezok() {
        return mezok;
    }
}
