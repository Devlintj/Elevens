#questions
##1. What items would be necessary if you were playing a game of Elevens at your desk (not on the computer)? List the private instance variables needed for the ElevensBoard class.
##Answer: You Would need a deck, nine Cards on the board, and the ability to put cards from the deck onto the table. Card[] nine, Card[] unusedCards, and int wins/loses.
##2. Write an algorithm that describes the actions necessary to play the Elevens game.
##Answer:
-have a deck of cards
-shuffle cards
-deal nine cards on a table
-have people pick 2 or 3 cards
-determine if the two cards sum to 11 or are the cards J,K,Q.
-if they are one of these two possibilities, replace those cards with other cards in deck
-repeat 4-6 until there are no more combinations or there are no more cards in the deck.
##3. Now examine the partially implemented ElevensBoard.java file found in the Activity7 Starter Code directory. Does the ElevensBoard class contain all the state and behavior necessary to play the game?
#Answer: yes except for the few unwritten methods that I will need to write at a later date.
##4. ElevensBoard.java contains three helper methods. These helper methods are private because they are only called from the ElevensBoard class.
###a. Where is the dealMyCards method called in ElevensBoard?
##Answer: When the class is created and when the method newGame() is called.
###b. Which public methods should call the containsPairSum11 and containsJQK methods?
##Answer: They should be called for if-statements in the replace cards method.
###c. It’s important to understand how the cardIndexes method works, and how the list that it returns is used. Suppose that cards contains the elements shown below. Trace the execution of the cardIndexes method to determine what list will be returned. Complete the diagram below by filling in the elements of the returned list, and by showing how those values index cards. Note that the returned list may have less than 9 elements.
###cards ->
###returned -> JHeart, 6Club, 2Spade, AceSpade, and 4Heart get returned.
###list
###0 1 2 3 4 5 6 7 8
###J♥ 6♣ null 2♠ null null A♠ 4♥ null
###0 1 2 3 4 5 6 7 8
###d. Complete the following printCards method to print all of the elements of cards that are
####indexed by cIndexes.
####public static printCards(ElevensBoard board) {
####List<Integer> cIndexes = board.cardIndexes();
####Your code goes here.
##Answer:
{
for(int i = 0; i < cIndexes.length(); i++) {
  System.out.println(board.deck[i]);
}
}
###e. Which one of the methods that you identified in question 4b above needs to call the cardIndexes method before calling the containsPairSum11 and containsJQK methods? Why?
##Answer: You need to know what the card is before you can determine whether or not it adds up to 11 or is the cards(J, K, Q).
