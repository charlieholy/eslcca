import org.freeswitch.esl.*;

import java.net.URI;

public class A {



    public static void main(String[] args) throws Exception{
        System.out.printf("A");
        loadLib();
        ESLevent esLevent;


        ESLconnection esLconnection = new ESLconnection("10.0.10.45",58021,"ClueCon");
        int con = esLconnection.connected();
        System.out.printf(" conn " + con);
        if(esLconnection.connected() == 1){
            System.out.printf("conn....");
        }

    }

    private static void loadLib() throws Exception {
        URI path = A.class.getResource("libesljni.so").toURI();
        System.out.printf("PATH: " + path);
        System.load(path.getPath());

    }
}
