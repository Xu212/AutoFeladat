package modell;
public class Auto extends Jarmu{
    private boolean defekt;

    public Auto(boolean defekt) {
        this.defekt = defekt;
    }
    
    public void kereketCserel(){
        this.defekt = false;
    }
    @Override
    public boolean halad(){
        if((int)((Math.random()*4)+1)==4){
            this.defekt = true;
            kereketCserel();
        }

        return true;
    }

    @Override
    public boolean tankol() {
        
    }

    @Override
    public void leallit() {
        
    }

    @Override
    public void beindit() {
        beindit(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
