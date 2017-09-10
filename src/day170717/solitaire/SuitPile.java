package day170717.solitaire;

import java.awt.*;

/**
 * Created by Duelist on 17.07.2017.
 */
class SuitPile extends CardPile {

    SuitPile(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean canTake(Card aCard) {
        if (isEmpty()) {
            return aCard.getRank() == 0;
        }
        Card topCard = top();
        return (aCard.getSuit() == topCard.getSuit()) &&
                (aCard.getRank() == 1 + topCard.getRank());
    }

    @Override
    public void select(int tx, int ty) {

        if (TablePile.cards != null && TablePile.cards.size() == 1) {
            if (canTake(TablePile.cards.peek())) {
                push(TablePile.cards.pop());
            } else {
                TablePile.selectedPile.push(TablePile.cards.pop());
                incrementFlippedCards();
            }

            if (TablePile.selectedPile.getTotalCards() > 0 && !TablePile.selectedPile.top().isFaceUp()) {
                TablePile.selectedPile.top().flip();
                incrementFlippedCards();
            }
            TablePile.selectedPile = null;
        }
    }

    private void incrementFlippedCards() {
        int flippedCards = TablePile.selectedPile.getFlippedCards();
        TablePile.selectedPile.setFlippedCards(flippedCards + 1);
    }

    @Override
    public void display(Graphics g) {
        if (isHighlighted()) {
            g.setColor(Color.green);
            setHighlight(false);
            g.drawRect(x - 1, y - 1, Card.width + 2, Card.height + 2);
        } else {
            g.setColor(Color.black);
        }

        if (firstCard == null) {
            g.drawRect(x, y, Card.width, Card.height);
        } else {
            firstCard.draw(g, x, y);
        }
    }
}
