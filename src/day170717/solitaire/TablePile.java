package day170717.solitaire;

import java.awt.*;
import java.util.LinkedList;

/**
 * Created by Duelist on 17.07.2017.
 */
class TablePile extends CardPile {

    public int getTotalCards() {
        return totalCards;
    }

    private int totalCards = 0;

    public int getFlippedCards() {
        return flippedCards;
    }

    public void setFlippedCards(int flippedCards) {
        this.flippedCards = flippedCards;
    }

    private int flippedCards;

    TablePile(int x, int y, int c) {
        // initialize the parent class
        super(x, y);
        // then initialize our pile of cards
        for (int i = 0; i < c; i++) {
            push(Solitare.deckPile.pop());
        }
        // flip topmost card face up
        top().flip();
        flippedCards++;
    }

    @Override
    public boolean canTake(Card aCard) {
        if (isEmpty()) {
            return aCard.getRank() == 12;
        }
        Card topCard = top();
        return (aCard.getColor() != topCard.getColor()) &&
                (aCard.getRank() == topCard.getRank() - 1);
    }


    @Override
    public boolean includes(int tx, int ty) {
        // don't test bottom of card
        return x <= tx && tx <= x + Card.width &&
                80 <= ty && ty <= y + totalCards * Card.height / 2 + 35;
//                y + totalCards * Card.height / 2 - 35 <= ty && ty <= y + totalCards * Card.height / 2 + 35;
    }

    static LinkedList<Card> cards = new LinkedList<>();
    static TablePile selectedPile = null;

    @Override
    public void select(int tx, int ty) {

        if (!cards.isEmpty() && canTake(cards.peek())) {
            flippedCards += cards.size();
            while (!cards.isEmpty()) {
                push(cards.pop());
            }

            if (selectedPile.top() != null && !selectedPile.top().isFaceUp()) {
                selectedPile.top().flip();
                selectedPile.flippedCards++;
            }
            selectedPile = null;
            return;
        } else if (selectedPile != null) {
            selectedPile.flippedCards += cards.size();
            while (!cards.isEmpty()) {
                selectedPile.push(cards.pop());
            }
            selectedPile = null;
            return;
        }

        if (isEmpty()) {
            return;
        }


        int temp = 0;

        if (totalCards >= 1) {
            temp += 70;
            temp += (35 * (totalCards - 1));
        }

        int chosenCards = 0;

        int area = temp - (ty - 80);

        if (ty - 80 >= temp - 70 && ty - 80 <= temp) {
            chosenCards++;
        } else {
            chosenCards = area / 35;
        }

        if (chosenCards == 0 || chosenCards > flippedCards) {
            return;
        }

        if (chosenCards <= flippedCards) {
            while (chosenCards != 0) {
                cards.push(pop());
                chosenCards--;
            }
        }
        flippedCards -= cards.size();

        if (cards.size() == 1) {
            for (int i = 0; i < 4; i++) {
                if (Solitare.suitPile[i].canTake(cards.peek())) {
                    Solitare.suitPile[i].setHighlight(true);
                }
            }
        }

        if (!cards.isEmpty()) {
            for (int i = 0; i < 7; i++) {
                if (Solitare.tableau[i].canTake(cards.peek()) && this != Solitare.tableau[i]) {
                    Solitare.tableau[i].setHighlight(true);
                }
            }
        }

        if (selectedPile == null) {
            selectedPile = this;
        }
    }

    public void incrementFlippedCards() {
        flippedCards++;
    }

    private int stackDisplay(Graphics g, Card aCard) {
        int localy;
        if (aCard == null) {
            return y;
        }
        localy = stackDisplay(g, aCard.link);
        aCard.draw(g, x, localy);
        totalCards++;
        return localy + 35;
    }

    @Override
    public void display(Graphics g) {
        if (isHighlighted()) {
            g.setColor(Color.green);
            g.drawRect(x, y + totalCards * Card.height / 2, Card.width, Card.height);
            setHighlight(false);
        } else {
            g.setColor(Color.black);
        }

        totalCards = 0;
        stackDisplay(g, top());
    }

}
