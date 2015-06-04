package string;

public class circle extends figure{
    int rad;
    double Pi = 3.1415926;
    public double pl(){
     sss = Pi * rad * rad;
        return sss;
    }

    public String f(){
        f = "circle";
        return f;
    }
    circle( int r) {
       rad = r;
    }
}