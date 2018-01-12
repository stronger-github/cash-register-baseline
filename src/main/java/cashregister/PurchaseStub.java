package cashregister;

public class PurchaseStub extends Purchase{

    public PurchaseStub(){
        super(null);
    }


    public String asString() {
        String out = "Purchase excute";
        return out;
    }
}
