package nbparsexml;

public class Libro {

    private String genere;
    private String titolo;
    private String autore;
    private float prezzo;

    public Libro() {
        this.genere = "";
        this.titolo = "";
        this.autore = "";
        this.prezzo = 0;
    }

    public Libro(String genere, String titolo, String autore,
            float prezzo) {
        this.genere = genere;
        this.titolo = titolo;
        this.autore = autore;
        this.prezzo = prezzo;
    }

    public Libro(Libro libro) {
        this.genere = libro.genere;
        this.titolo = libro.titolo;
        this.autore = libro.autore;
        this.prezzo = libro.prezzo;
    }

    public String getGenere() {
        return genere;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public String toString() {
        return "[" + genere + "] " + autore + ", \"" + titolo + "\" (" + prezzo + "€)";
    }
}
