import java.util.ArrayList;
import java.util.Map;

public class UberVan extends Car {
    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    public UberVan(String license, Account driver, Integer passenger,Map<String, Map<String,Integer>> typeCarAccepted, ArrayList<String> seatsMaterial){
        super(license, driver, passenger);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }
}