package string;

public class triangle extends figure {
    int height;
    int edge;

    public double pl(){

     sss = height * edge / 2;
        return sss;
    }
    public String f(){
      f = "triangle";
      return f;
    }
    triangle( int a, int h) {
        height = h;
        edge = a;
    }
}