package modell;

public class Auto extends Jarmu {

    private boolean defekt;

    public Auto() {
        super();
        this.defekt = false;
    }

    public boolean isDefekt() {
        return defekt;
    }

    public void kereketCserel() {
        this.defekt = false;
    }

    @Override
    public boolean halad() {
        if ((int) ((Math.random() * 4) + 1) == 4) {
            this.defekt = true;
            kereketCserel();
        }

        return true;
    }

}
