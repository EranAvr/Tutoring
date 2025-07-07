package Mahat_Spring_2024_B;

public class Two extends One{
    private String s;
    private One p;

    public Two(){
        super();
        s = "AAA";
        p = null;
    }
    public Two(int val, One o){
        super(val);
        this.s = "CCC";
        this.p = o;
    }
    public Two(int val, String str, One o){
        super(val);
        this.s = str;
        this.p = o;
    }

    }
