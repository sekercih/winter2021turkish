package day22;

public class ParametreliConstructor {

	String marka;
    String model;
    int yil;
    boolean kazasiVarMi;
    
    public ParametreliConstructor(int yil) { //1
      this.yil=yil;
    }
    public ParametreliConstructor() { //2
        
    }
    public ParametreliConstructor(String Marka,String Model) { //3
        
    }
    public ParametreliConstructor(String marka, String model,int yil, boolean kazasiVarMi) { //4
        
    }
    
    public void yakit(String yakit) { // method
        System.out.println("Araba yakit olarak " + yakit  + " kullanir");
    }
    
    public void vites(String vites) { // method
        System.out.println("Araba " + vites + " viteslidir");
    }
}
