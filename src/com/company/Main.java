package com.company;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String[]> data = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("VF_2015.dat"));

            String nextLine = br.readLine();
            while (nextLine != null) {
                String[] row = nextLine.split(",");
                data.add(row);


                nextLine = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            BufferedWriter br = new BufferedWriter(new FileWriter("VF_2015.csv"));

            for (int i = 0; i < data.size(); i++) {
                br.write(data.get(i)[0]);
                br.newLine();
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

}