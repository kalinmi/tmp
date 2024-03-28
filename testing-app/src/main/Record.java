package src.main;

public class Record {

    private String tytul;
    private String zrodlo;
    private String przetworzoneZrodlo;
    private String wzor;
    private boolean isMatching;

    public Record(String tytul, String zrodlo, String przetworzoneZrodlo, String wzor) {
        this.tytul = tytul;
        this.zrodlo = zrodlo;
        this.przetworzoneZrodlo = przetworzoneZrodlo;
        this.wzor = wzor;
    }

    public Record() {
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getZrodlo() {
        return zrodlo;
    }

    public void setZrodlo(String zrodlo) {
        this.zrodlo = zrodlo;
    }

    public String getPrzetworzoneZrodlo() {
        return przetworzoneZrodlo;
    }

    public void setPrzetworzoneZrodlo(String przetworzoneZrodlo) {
        this.przetworzoneZrodlo = przetworzoneZrodlo;
    }

    public String getWzor() {
        return wzor;
    }

    public void setWzor(String wzor) {
        this.wzor = wzor;
    }

    public boolean isMatching() {
        return isMatching;
    }

    public void setMatching(boolean matching) {
        isMatching = matching;
    }
}
