package string;

public class rect extends figure{
    int edge2;
    int edge1;
    public double pl(){
    sss = edge1 * edge2;
        return sss;
    }

    public String f(){
        f = "rect";
        return f;
    }
    rect( int a, int b) {
        edge2 = a;
        edge1 = b;
    }
}