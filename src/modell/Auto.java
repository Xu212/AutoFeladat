package modell;
public class Auto extends Jarmu{
    private boolean defekt;

    public Auto(boolean defekt) {
        this.defekt = defekt;
    }
    public void kereketCserel(){
    
    }
    @Override
    public boolean halad(){
        return true;
    }

    @Override
    public boolean tankol() {
        return super.tankol(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void leallit() {
        super.leallit(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void beindit() {
        super.beindit(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
