package day170717.solitaire;

import java.awt.*;
import java.util.LinkedList;

/**
 * Created by Duelist on 17.07.2017.
 */
class TablePile extends CardPile {

    private int size = 0;

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
        if (empty()) {
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
                80 <= ty && ty <= y + size * Card.height / 2 + 35;
//                y + size * Card.height / 2 - 35 <= ty && ty <= y + size * Card.height / 2 + 35;
    }

    private static LinkedList<Card> cards = new LinkedList<>();
    private static TablePile selectedPile = null;

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

        if (empty()) {
            return;
        }

        Card topCard = pop();
        for (int i = 0; i < 4; i++) {
            if (Solitare.suitPile[i].canTake(topCard)) {
                flippedCards--;
                Solitare.suitPile[i].push(topCard);

                if (top() != null && !top().isFaceUp()) {
                    top().flip();
                    flippedCards++;
                }

                return;
            }
        }

        // else put it back on our pile
        push(topCard);

        int temp = 0;

        if (size >= 1) {
            temp += 70;
            temp += (35 * (size - 1));
        }

        int chosenCards = (temp - (ty - 80)) / 35;
//        System.out.println("choosed = " + chosenCards);
//        System.out.println("flipped = " + flippedCards);

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
//        while (top() != null && top().isFaceUp()) {
//            cards.push(pop());
//        }


        for (int i = 0; i < 7; i++) {
            if (!cards.isEmpty() && Solitare.tableau[i].canTake(cards.peek()) && this != Solitare.tableau[i]) {
                Solitare.tableau[i].setHighlight(true);
            }
        }

        if (selectedPile == null) {
            selectedPile = this;
        }
    }

    private int stackDisplay(Graphics g, Card aCard) {
        int localy;
        if (aCard == null) {
            return y;
        }
        localy = stackDisplay(g, aCard.link);
        aCard.draw(g, x, localy);
        size++;
        return localy + 35;
    }

    @Override
    public void display(Graphics g) {
        if (isHighlighted()) {
            g.setColor(Color.green);
            g.drawRect(x, y + size * Card.height / 2, Card.width, Card.height);
            setHighlight(false);
        }

        size = 0;
        stackDisplay(g, top());
    }

}
