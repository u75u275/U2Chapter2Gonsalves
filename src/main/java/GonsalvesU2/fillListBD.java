package GonsalvesU2;

import javax.enterprise.inject.Produces;
import java.util.ArrayList;
import java.util.List;


public class fillListBD {
    @Produces @producedList
    public List<String> injectListBD() {
        ArrayList<String> dbstring = new ArrayList<>();
        dbstring.add("Oracle");
        dbstring.add("MySQL");
        return dbstring;
    };
}
