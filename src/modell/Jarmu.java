package modell;
public abstract class Jarmu {
    private boolean beinditva;
    private boolean uzemanyag;
    private boolean megerkezett;

    public Jarmu() {
        this.beinditva = false;
        this.uzemanyag = true;
        this.megerkezett = false;
    }
    
    public void beindit(){
        this.beinditva = true;
    }
    public void leallit(){
        this.beinditva = false;
    }
    
    public boolean tankol(){
        return true;
    }
    
    public boolean halad(){
        return true;
    }

    public boolean isBeinditva() {
        return beinditva;
    }

    public void setUzemanyag() {
        this.uzemanyag = tankol();
    }
    
}
