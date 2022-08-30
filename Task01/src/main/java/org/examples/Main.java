package org.examples;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        Integer n = Integer.parseInt(br.readLine());
        String nombre;
        Integer altura;

        for(int i = 0; i < n; i ++) {
            st = new StringTokenizer(br.readLine());
            nombre = st.nextToken();
            altura = Integer.parseInt(st.nextToken());
        }

        br.close();
    }
}
