import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class P57CardGame {
    static class Card implements Comparable<Card> {
        final static int RADIX = 13;
        final static char[] KIND = "SHDC".toCharArray();
        final static char[] DIGTT = "A23456789TJQK".toCharArray();
        int kind;
        int digit;

        Card() {
            this(0, 0);
        }

        public Card(int kind, int digit) {
            this.kind = kind;
            this.digit = digit;

        }

        @Override
        public String toString() {
            return KIND[kind] + "" + DIGTT[digit];
        }

        static List<Card> genFullCards() {
            List<Card> cards = new Vector<Card>();
            for (int i = 0; i < 52; i++) cards.add(new Card(i / 13, i % 13));
            return cards;
        }

        @Override
        public int compareTo(Card that) {
            if (this.kind != that.kind) return this.kind - that.kind;
            return this.digit - that.digit;
        }
    }

    public static void main(String[] args) {
        List<Card> cards = Card.genFullCards();
        System.out.println(cards);

        Collections.shuffle(cards);

        List<Card> east = cards.subList(0, Card.RADIX);
        List<Card> south = cards.subList(Card.RADIX, Card.RADIX * 2);
        List<Card> west = cards.subList(Card.RADIX * 2, Card.RADIX * 3);
        List<Card> north = cards.subList(Card.RADIX * 3, cards.size());

        Collections.sort(east);
        Collections.sort(south);
        Collections.sort(west);
        Collections.sort(north);


        for (List<Card> list : new List[]{east, south, west, north}) {

            for (char ch : Card.KIND) {

                System.out.print(ch + ":");
                for (Card card : list) {
                    if (card.toString().charAt(0) == ch) System.out.print(card.toString().substring(1) + " ");
                }
                System.out.println();

            }
            System.out.println();
        }
    }
}
//57自动发牌
//        一副扑克有52张牌，打桥牌时应将牌分给四个人。请设计一个程序完成自动发牌的工作。要求：黑桃用S(Spaces)表示；红桃用H(Hearts)表示；方块用D(Diamonds)表示；梅花用C(Clubs)表示。
//
//        *运行结果
//
//        S 3 2
//        H J 8 6 2
//        D J 9 8 4 3
//        C 8 4
//
//        S A Q 8 7
//        H T 7 3
//        D K
//        C A Q J T 5
//
//        S K J 9 5
//        H A 9 4
//        D Q T 6 5 2
//        C 7
//
//        S T 6 4
//        H K Q 5
//        D A 7
//        C K 9 6 3 2
