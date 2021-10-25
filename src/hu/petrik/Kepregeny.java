package hu.petrik;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kepregeny {
    private static List<Szuperhos>szhosok = new ArrayList();



    public static void beolvas(String fajlNev){
        try{
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
                    szhosok.add(obj);
                }
                else{
                    Batman obj = new Batman();
                    int hanyszorKeszit = Integer.parseInt(adatok[1]);
                    for (int i = 0; i < hanyszorKeszit; i++) {
                        obj.kutyutKeszit();
                    }
                    szhosok.add(obj);
                }
                sor = br.readLine();

            }
            br.close();
            fr.close();


        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }

    }
    public static void kiir(){
        for (Szuperhos item:szhosok) {
            System.out.println(item);
        }
    }
}
