package MyClasses;

public class PositivePoint {
    // שדות
    private int x;
    private int y;

    // מתודות
    // getters:
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    // setters:
    public void setX(int _x){
        // דרך ארוכה
        /*if (_x < 0)
            this.x = 0;
        else
            this.x = _x;*/
        // דרך קצרה
        if (_x < 0)
            _x = 0;
        this.x = _x;
    }
    public void setY(int _y){
        // דרך קצרה ביותר
        this.y = Math.max(0, _y);
    }
}
