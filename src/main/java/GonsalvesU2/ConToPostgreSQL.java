package GonsalvesU2;

import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Produces;


@Alternative @qOracle
public class ConToPostgreSQL implements Connection{

    @Produces @qcountTable
    private int countTable = 888888;

    @Produces  @qcountView
    private int countView = 8888888;

    @Produces
    private String hostDriver = "jdbc:Postgre";

    public void printBDConnection() {
        System.out.println("printBDConnection - connecting to " +"jdbc:Postgre" );
    }
    @Override @Produces @qCountAllObject
    public int countAllObject() {
        return 888888888;
    }
}
