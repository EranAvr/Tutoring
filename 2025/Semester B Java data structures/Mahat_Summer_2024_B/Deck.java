package Mahat_Summer_2024_B;

public class Deck
{
    private Node<Domino> head;

    public Deck()
    {
        this.head = null;
    }

    public boolean isWellOrdered(){
        if (head==null || head.getNext()==null) // ריקה או אבן יחידה
            return true;
        Node<Domino> stone = head;
        while (stone.getNext() != null){
            Domino d = stone.getValue();
            Domino dNext = stone.getNext().getValue();
            if (d.getRight() != dNext.getLeft())
                return false;
            stone = stone.getNext();
        }
        return true;
    }

    public static boolean addStone(Deck deck, Domino stone){
        if (!deck.isWellOrdered())
            return false;
        Node<Domino> temp = deck.getHead();
        // check start
        if (stone.getRight() == temp.getValue().getLeft()){
            deck.setHead(new Node<>(stone, temp));
            return true;
        }
        stone.rotate();
        if (stone.getRight() == temp.getValue().getLeft()){
            deck.setHead(new Node<>(stone, temp));
            return true;
        }
        // check middle
        while (temp.getNext() != null){
            if (stone.getLeft() == stone.getRight() &&
                    temp.getValue().getRight() == stone.getLeft()){
                temp.setNext(new Node<>(stone, temp.getNext()));
                return true;
            }

            temp = temp.getNext();
        }
        // check end
        if (stone.getLeft() == temp.getValue().getRight()){
            temp.setNext(new Node<>(stone));
            return true;
        }
        stone.rotate();
        if (stone.getLeft() == temp.getValue().getRight()){
            temp.setNext(new Node<>(stone));
            return true;
        }
        return false;
    }

    public Node<Domino> getHead() {
        return head;
    }

    public void setHead(Node<Domino> head) {
        this.head = head;
    }
}
