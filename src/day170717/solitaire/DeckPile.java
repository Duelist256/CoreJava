package day170717.solitaire;

/**
 * Created by Duelist on 17.07.2017.
 */
class DeckPile extends CardPile {

    DeckPile(int x, int y) {
        // first initialize parent
        super(x, y);
        // then create the new deck
        // first put them into a local pile
        CardPile pileOne = new CardPile(0, 0);
        CardPile pileTwo = new CardPile(0, 0);
        int count = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= 12; j++) {
                pileOne.push(new Card(i, j));
                count++;
            }
        }
        // then pull them out randomly
        for (; count > 0; count--) {
            int limit = ((int) (Math.random() * 1000)) % count;
            // move down to a random location
            for (int i = 0; i < limit; i++) {
                pileTwo.push(pileOne.pop());
            }
            // then add the card found there
            push(pileOne.pop());
            // then put the decks back together
            while (!pileTwo.empty()) {
                pileOne.push(pileTwo.pop());
            }
        }
    }

    @Override
    public void select(int tx, int ty) {
        if (empty()) {
            Card card;
            card = Solitare.discardPile.pop();
            while (card != null) {
                if (card.isFaceUp()) {
                    card.flip();
                }
                Solitare.deckPile.push(card);
                card = Solitare.discardPile.pop();
            }
            return;
        }
        Solitare.discardPile.push(pop());
    }
}
