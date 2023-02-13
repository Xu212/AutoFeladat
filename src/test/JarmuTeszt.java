package test;

import modell.Auto;
import modell.Jarmu;

class Hajo extends Jarmu {
}

public class JarmuTeszt {

    public static void main(String[] args) {
        new JarmuTeszt();
    }

    public JarmuTeszt() {
        //mintaSablonTeszt();
        haladAutoBeinditasN1kTeszt();
        haladAutoBeubdtassalTeszt();

        haladJarmuBeinditassalTeszt();
        kerekCsereAutoTeszt();
        jarmuTankolTeszt();
        
    }

    private void mintaSablonTeszt() {
        int kapott = 7;
        int vart = 4;
        assert kapott == vart : "nem egyenlőek";
    }

    private void haladAutoBeinditasN1kTeszt() {
        Auto auto = new Auto();
        boolean kapott = auto.halad();
        boolean vart = false;
        assert kapott == vart : "beindítás nélkól is haladt!";
    }

    private void haladAutoBeubdtassalTeszt() {
        Auto auto = new Auto();
        auto.beindit();
        boolean kapott = auto.halad();
        boolean vart = true;
        assert kapott == vart : "nem halad!";
    }

    private void haladJarmuBeinditassalTeszt() {
        Hajo hajo = new Hajo();
        hajo.beindit();
        boolean kapott = hajo.halad();
        boolean vart = true;
        assert kapott == vart : "nem halad!";
    }

    private void kerekCsereAutoTeszt() {
        Auto auto = new Auto();
        auto.kereketCserel();
        boolean kapott = auto.isDefekt();
        boolean vart = false;
        assert kapott == vart : "Nincs cserélve a kerék";
    }
    private void jarmuTankolTeszt() {
        Hajo hajo = new Hajo();
        hajo.setUzemanyag();
        boolean kapott = hajo.isUzemanyag();
        boolean vart = true;
        assert kapott == vart : "nincs tankolvas!";
    }
    private void AutoTankolTeszt() {
        Auto auto = new Auto();
        auto.setUzemanyag();
        boolean kapott = auto.isUzemanyag();
        boolean vart = true;
        assert kapott == vart : "nincs tankolvas!";
    }
    public void AutoLeallitTeszt(){
       Auto auto = new Auto();
       auto.leallit();
        boolean kapott = auto.isBeinditva();
        boolean vart = false;
        assert kapott == vart : "nincs leaállíitva!"; 
    }
}
