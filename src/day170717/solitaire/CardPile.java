package day170717.solitaire;

import java.awt.*;

/**
 * Created by Duelist on 17.07.2017.
 */
class CardPile {

    // coordinates of the card pile
    protected int x;
    protected int y;

    protected boolean highlight = false;

    private Card firstCard;

    CardPile(int x, int y) {
        this.x = x;
        this.y = y;
        firstCard = null;
    }


    // access to cards are not overridden

    public Card top() {
        return firstCard;
    }

    public boolean empty() {
        return firstCard == null;
    }

    public void push(Card aCard) {
        aCard.link = firstCard;
        firstCard = aCard;
    }

    public Card pop() {
        Card result = null;
        if (firstCard != null) {
            result = firstCard;
            firstCard = firstCard.link;
        }
        return result;
    }

    // the following are sometimes overridden

    public boolean includes(int tx, int ty) {
        return x <= tx && tx <= x + Card.width &&
                y <= ty && ty <= y + Card.height;
    }

    public void select(int tx, int ty) {
        // do nothing
    }


    public void display(Graphics g) {
        g.setColor(Color.black);
        if (firstCard == null) {
            g.drawRect(x, y, Card.width, Card.height);
        } else {
            firstCard.draw(g, x, y);
        }
    }

    public boolean isHighlighted() {
        return highlight;
    }

    public void setHighlight(boolean highlight) {
        this.highlight = highlight;
    }

    public boolean canTake(Card aCard) {
        return false;
    }

}
