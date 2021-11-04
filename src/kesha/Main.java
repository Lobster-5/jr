package kesha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        DynaList dl = new DynaList();
        dl.add(1);
        dl.add(2);
        dl.add(3);
        dl.add(4);
        dl.add(5);
        dl.add(6);
        System.out.println(dl);
        dl.remove(2);
        dl.remove(2);
        System.out.println(dl);
        System.out.println(dl.isEmpty());
        dl.clear();
        System.out.println(dl.isEmpty());
    }



}


