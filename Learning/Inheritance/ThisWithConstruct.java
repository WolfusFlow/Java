
public class ThisWithConstruct {
    private int x, y;
    private int width, height;
        
    //Here we call construct with arguments 0, 0, 1, 1. It will create 1,1 rectangle in 0, 0 coordinates
    public ThisWithConstruct() {
        this(0, 0, 1, 1);
    }
    //Here we call construct with arguments 0, 0, width, height. It will create it in 0, 0 coordinates
    public ThisWithConstruct(int width, int height) {
        this(0, 0, width, height);
    }
    //Main construct which accepts parameters from "this" and if we know all parameters.
    public ThisWithConstruct(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
   // ...
}