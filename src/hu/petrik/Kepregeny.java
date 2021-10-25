package hu.petrik;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Kepregeny {
    private  List<Szuperhos>szhosLista;
    public Kepregeny(Szuperhos[] szhosTomb){
        this.szhosLista = new ArrayList<>();
        this.szhosLista.addAll(Arrays.asList(szhosTomb));
    }
    public Kepregeny(String fajlNev){
        this.szhosLista = new ArrayList<>();
        try {
            FileReader fr = new FileReader(fajlNev);
            BufferedReader br = new BufferedReader(fr);
            String sor = br.readLine();
            while (sor !=null){
                String [] adatok = sor.split(" ");
                if (adatok[0].equals("Vasember")){
                    Vasember obj = new Vasember();
                    int hanyszorKeszit = Integer.parseInt(adatok[1]);
                    for (int i = 0; i < hanyszorKeszit; i++) {
                        obj.kutyutKeszit();
                    }
                    szhosLista.add(obj);
                }
                else{
                    Batman obj = new Batman();
                    int hanyszorKeszit = Integer.parseInt(adatok[1]);
                    for (int i = 0; i < hanyszorKeszit; i++) {
                        obj.kutyutKeszit();
                    }
                    szhosLista.add(obj);
                }
                sor = br.readLine();

            }
            br.close();
            fr.close();


        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (Szuperhos szuperhos:this.szhosLista) {
           s+= szuperhos +"\n";
        }
        return s;
    }

}
