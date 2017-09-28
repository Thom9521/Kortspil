public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Rank!");

        //Deklarer variablerne
        Rank highCard, faceCard, card1, card2;

        //Jeg sætter variabler lig nogle værdier fra Rank
        highCard = Rank.ACE;
        faceCard = Rank.KING;
        card1 = Rank.FIVE;
        card2 = Rank.NINE;

        //Jeg udskriver en tekst
        System.out.println("A blackjack hand: " + highCard + " and " + faceCard);

        //Jeg har lavet 2 variabler og brugt ordinal-metode og lagt 1 til for at få den rigtige værdi for kortet
        int card1Val, card2Val;
        card1Val = card1.ordinal() +1;
        card2Val = card2.ordinal() +1;

        //Udkskriver en tekst
        System.out.println("A two card hand: " + card1 + " and " + card2);
        System.out.println("Hand value: " + card1Val + " and " + card2Val);




        

        //Lidt ekstra
        Rank card3, card4, card5, card6;

        card3 = Rank.EIGHT;
        card4 = Rank.THREE;
        card5 = Rank.SEVEN;
        card6 = Rank.QUEEN;

        System.out.println("Jeg har fået tre nye kort: " + card3 + " og " + card4 + " og " + card5);

        int cardVal3, cardVal4, cardVal5;
        cardVal3 = card3.ordinal() + 1;
        cardVal4 = card4.ordinal() + 1;
        cardVal5 = card5.ordinal() + 1;

        System.out.println("Værdierne for mine kort er: " + cardVal3 + ", " + cardVal4 + " og " + cardVal5);


        System.out.println("Jeg har fået et ekstra kort: " + card6);

        int cardVal6;
        cardVal6 = card6.ordinal() +1;
        System.out.println("Kortets værdi er: " + cardVal6);
    }
}
