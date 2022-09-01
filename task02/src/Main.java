import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{

        HashMap<Integer, ArrayList<String>> Jugadores = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int numAltura = 0;
        Integer n = Integer.parseInt(br.readLine());
        String nombre;
        Integer altura;


        for(int i = 0; i < n; i ++) {
            st = new StringTokenizer(br.readLine());
            nombre = st.nextToken();
            altura = Integer.parseInt(st.nextToken());

            if (Jugadores.containsKey(altura)){
                ArrayList<String> b;
                b = Jugadores.get(altura);
                b.add(nombre);
                Jugadores.put(altura, b);
            }
            else {
                ArrayList<String> b = new ArrayList<String>();
                b.add(nombre);
                Jugadores.put(altura, b);
                b = null;
            }
        }

        //System.out.println(Jugadores);


        int m = 1;
        while(m != 0) {
            int q = scanner.nextInt();
            //System.out.println(q);
            if (q != 0){
                if (Jugadores.containsKey(q)){
                    for (int i = 0; i < Jugadores.get(q).size(); i ++){
                        System.out.println(Jugadores.get(q).get(i));
                    }

                    System.out.println(" ");
                }
                else{
                    System.out.println("NO EXISTE");
                    System.out.println(" ");
                }
            }
            m = q;

        }
        br.close();
    }
}