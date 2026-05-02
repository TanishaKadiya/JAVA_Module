abstract class RBI{
    abstract void rateOfInterest();

}
class SBI extends RBI{
    void rateOfInterest(){
        System.out.println("SBI rate of interest is 7%");
    }
}
class PNB extends RBI{
    void rateOfInterest(){
        System.out.println("PNB rate of interest is 8%");
    }
}


public class abstractdemo{
    public static void main(String[] args) {
        SBI s = new SBI();
        PNB p = new PNB();
        s.rateOfInterest();
        p.rateOfInterest();
    
    }
}
