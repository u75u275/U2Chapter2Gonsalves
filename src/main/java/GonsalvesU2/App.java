package GonsalvesU2;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;


public class App 
{
    public static void main( String[] args )
    {

        Weld weld = new Weld();
        WeldContainer container = weld.initialize();

        MetaDataBD md = container.instance().select(MetaDataBD.class).get();

        md.printDataDB();

        md.printDataAll();

        md.printListBD();

        weld.shutdown();


    }
}
