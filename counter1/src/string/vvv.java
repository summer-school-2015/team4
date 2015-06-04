package string;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.IOException;
import java.util.List;
import java.util.StringTokenizer;

public class vvv {
    public static void sort(String s) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(s));
        String line = reader.readLine();
        int n = Integer.valueOf(line);
        List<String> lines = new ArrayList<String>();
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
        String[] linesAsArray = lines.toArray(new String[lines.size()]);
        String s1 = "";
        for (int i = 0; i < n; i++) {
            s1 = s1 + linesAsArray[i] + " ";

        }
        figure[] f;
        f = new figure[n];

        StringTokenizer st = new StringTokenizer(s1);
        for (int i = 0;i < n; i++){
          switch (st.nextToken()) {
            case "triangle":
                f[i] = new triangle(Integer.valueOf(st.nextToken()), Integer.valueOf(st.nextToken()));
                double a = f[i].pl();

                break;
              case "circle":
                  f[i] = new circle(Integer.valueOf(st.nextToken()));
                  f[i].pl();
                  break;
              case "rect":
                  f[i] = new rect(Integer.valueOf(st.nextToken()), Integer.valueOf(st.nextToken()));
                  f[i].pl();
                  break;
          }
        }
        figure buf = null;
        for (int i = 0; i < n; i++)
        {
            for (int j = i; j < n - 1; j++) {
               if (f[j].pl() > f[j + 1].pl())
                buf  = f[j];
                f[j] = f[j + 1];
                f[j + 1] = buf;
            }

        }

        for (int i = 0; i < n; i++)
        {
            System.out.print(f[i].f() + ' ');
            System.out.println(f[i].pl() + ' ');

        }
        double c;
    }
}