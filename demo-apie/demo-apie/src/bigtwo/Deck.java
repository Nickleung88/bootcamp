

public class Deck {
  private Card[] cards;

  public Deck(){
    this.cards = new Card [52];
    int idx = 0;
    // for -each
    for (char suit : Card.SUITS){
      for (char rank : Card.RANKS){
        this.cards[idx] = new Card (rank, suit);
        idx++;
      }
    }
  }

public int size(){
  return this.cards.length;
}

public void shuffle(){
  int half = this.cards.length/2;
  //Local variable
  Card[] newCards = new Card[this.cards.length];
  int idx=0;
  for (int i=0; i<this.cards.length; i++){
    newCards[idx++] = this.cards[i];
    newCards[idx++] = this.cards[i + half] ;
  }
}





  @Override
  public String toString(){
    String value = "Deck [cards=";
    for (Card card : this.cards){
      value += card.toString() + ",";
    }
    value = value.substring (0, value.length()-1) + "]";
    return value;
  }


  public static void main(String[] args) {
    Deck deck = new Deck();  // empty constructor -> 52 cards
    System.out.println(deck);
    
    System.out.println(deck.size());
  }
}
