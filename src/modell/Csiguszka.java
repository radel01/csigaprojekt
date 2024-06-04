package modell;

public class Csiguszka {


    public enum Szinek{PIROS, ZOLD, KEK};
    
    private static final String RESET = "\u001B[0m";
    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String BLUE = "\u001B[34m";

    private String nev;
    private Szinek szinNev;
    private String szinKod;   
    
//    public Csigusz(){
//        this("Csiga Adel", "narancssarga");
//    }
    
    public Csiguszka(String nev) throws Exception {
        this(nev, Szinek.PIROS);
    }
    
    public Csiguszka(String nev, Szinek szinNev) throws Exception {
       // this.nev = nev;
        setNev(nev);
        this.szinKod=RESET;
        this.szinNev = szinNev;
        setSzin();
    }
        private void setSzin() {
            switch(szinNev) {
                case PIROS:
                    szinKod=Csiguszka.RED;                    
                    break;
                case KEK:
                    szinKod=Csiguszka.BLUE;                    
                    break;
                case ZOLD:
                    szinKod=Csiguszka.GREEN;                    
                    break;
                default:
                    throw new AssertionError();
            }
    }
    public void setNev(String nev) throws Exception{
        if (nev.length() >= 3) {
            char nevElso = nev.charAt(0);
            if (Character.isLowerCase(nevElso)) {
                nevElso = Character.toUpperCase(nevElso);
                nev = nevElso + nev.substring(1);
            }
            this.nev = nev;
        } else {
            throw new Exception("A név rövid!");
        }
    }
    
    
    
    public String getNev() {
        return nev;
    }

    public String getSzin() {
        return szinNev.toString();
    }
    

    @Override
    public String toString() {
        return szinKod + "Csigusz{" + "nev=" + nev + ", szinNev=" + szinNev + '}' + RESET;
    }
    
    
    
}
