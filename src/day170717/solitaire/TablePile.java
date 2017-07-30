package day170717.solitaire;

import java.awt.*;
import java.util.LinkedList;

/**
 * Created by Duelist on 17.07.2017.
 */
class TablePile extends CardPile {

    TablePile(int x, int y, int c) {
        // initialize the parent class
        super(x, y);
        // then initialize our pile of cards
        for (int i = 0; i < c; i++) {
            push(Solitare.deckPile.pop());
        }
        // flip topmost card face up
        top().flip();
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
                y + size * Card.height  / 2 - 35 <= ty && ty <= y + size * Card.height  / 2 + 35;
    }

    @Override
    public void select(int tx, int ty) {
        if (empty()) {
            return;
        }

        // if face down, then flip
        //Card topCard = top();
//        if (!topCard.isFaceUp()) {
//            topCard.flip();
//            return;
//        }



        Card topCard = pop();
        for (int i = 0; i < 4; i++) {
            if (Solitare.suitPile[i].canTake(topCard)) {

                Solitare.suitPile[i].push(topCard);

                if (top() != null && !top().isFaceUp()) {
                    top().flip();
                }

                return;
            }
        }

        // else put it back on our pile
        push(topCard);


        LinkedList<Card> cards = new LinkedList<>();
        while (top() != null && top().isFaceUp()) {
            cards.push(pop());
        }

        // else see if any other table pile can take card
        for (int i = 0; i < 7; i++) {
//            if (Solitare.tableau[i].canTake(topCard)) {
            if (!cards.isEmpty() && Solitare.tableau[i].canTake(cards.peek())) {
//                Solitare.tableau[i].push(topCard);
                while (!cards.isEmpty()) {
                    Solitare.tableau[i].push(cards.pop());
                }

                if (top() != null && !top().isFaceUp()) {
                    top().flip();
                }

                return;
            }
        }
        while (!cards.isEmpty()) {
            push(cards.pop());
        }
    }

    int size = 0;
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
        size = 0;
        stackDisplay(g, top());
    }
}
