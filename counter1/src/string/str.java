package string;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.IOException;
import java.util.List;
import java.util.StringTokenizer;

public class str{
    public static void main(String args[]) throws IOException{
        String s = "abc";
        int len = 0;
        BufferedReader reader = new BufferedReader(new FileReader("a.txt"));
        String line;
        List<String> lines = new ArrayList<String>();
        while ((line = reader.readLine()) != null) {
            lines.add(line);
            len++;
        }
        String ss = "";
        String [] linesAsArray = lines.toArray(new String[lines.size()]);
        for (int i = 0;i < len; i++) {
          ss = ss + linesAsArray[i] + ' ';

        }
        StringTokenizer st = new StringTokenizer(ss);
        int k = st.countTokens();
        int l = ss.length();


    }
}