package Mahat_Summer_2024_B;

public class Domino
{
    private int left; // ( ערך מספרי צד שמאלי בין 0 ל 6- (כולל
    private int right; // ( ערך מספרי צד ימני בין 0 ל 6- (כולל
    public Domino(int left, int right)
    {
        this.left = left;
        this.right = right;
    }

    public void rotate(){
        int temp = this.left;
        this.left = this.right;
        this.right = temp;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }
}
