#questions
##How do decks of cards work?
###A deck of cards would contain a stack of card objects. you would have the ability to deal cards, put cards back in the deck, and the ability shuffle the cards.
##describe instance variables and methods of Deck.
###instance variable would be an arraylist of cards. the methods would be shuffle(), deal(), recieveCard(), etc.
#Real Questions:
##Question1: Explain in your own words the relationship between a deck and a card.
##Answer: Cards make up a deck, and decks hold a move cards.
##Question2: Consider the deck initialized with the statements below. How many cards does the deck contain?
###String[] ranks = {"jack", "queen", "king"};
###String[] suits = {"blue", "red"};
###int[] pointValues = {11, 12, 13};
###Deck d = new Deck(ranks, suits, pointValues);
##Answer: 18 in the way the activity told me to do. The real way would only contain 6.
##Question3: The game of Twenty-One is played with a deck of 52 cards. Ranks run from ace (highest) down to 2 (lowest). Suits are spades, hearts, diamonds, and clubs as in many other games. A face card has point value 10; an ace has point value 11; point values for 2, …, 10 are 2, …, 10, respectively. Specify the contents of the ranks, suits, and pointValues arrays so that the statement
###Deck d = new Deck(ranks, suits, pointValues); initializes a deck for a Twenty-One game.
##Answer: rank[2, 3, 4, 5, 6, 7, 8, 9, 10, ace], suit[spades, hearts, diamonds, clubs], value[2, 3, 4 ,5 ,6 ,7 ,8 ,9 ,10 ,11].
##Question4: Does the order of elements of the ranks, suits, and pointValues arrays matter?
##Answer:no they don't matter because the cards will be created
