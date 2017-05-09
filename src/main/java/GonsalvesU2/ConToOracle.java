package GonsalvesU2;

import javax.enterprise.inject.Produces;


@qOracle
public class ConToOracle implements Connection {

    @Produces @qOracle @qcountTable
    private int countTable = 1;

    @Produces @qOracle @qcountView
    private int countView = 2;

    @Produces @qOracle
    private String hostDriver = "jdbc:Oracle";

    public void printBDConnection() {
        System.out.println("printBDConnection - connecting to " +"jdbc:Oracle" );
    };

    @Produces @qOracle @qCountAllObject
    public int countAllObject() {
        return (countTable + countView);};


}
