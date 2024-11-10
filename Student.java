import java.math.BigDecimal;

public class Student {
    private String ime;
    private String prezime;
    private String brojIndeksa;
    private double prosjekOcjena;

    public Student(String ime, String prezime, String brojIndeksa, double prosjekOcjena){
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndeksa = brojIndeksa;
        this.prosjekOcjena = prosjekOcjena;
    }

    public String getIme() {
        return this.ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return this.prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getBrojIndeksa() {
        return this.brojIndeksa;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public double getProsjekOcjena() {
        return this.prosjekOcjena;
    }

    public void setProsjekOcjena(double prosjekOcjena) {
        this.prosjekOcjena = prosjekOcjena;
    }

    public void ispisPodatakaOStudentu(){
        System.out.println("Ime studenta: " + getIme());
        System.out.println("Prezime studenta: " + getPrezime());
        System.out.println("Broj indeksa: " + getBrojIndeksa());
        System.out.println("Prosjek ocjena: " + getProsjekOcjena());
    }
}
