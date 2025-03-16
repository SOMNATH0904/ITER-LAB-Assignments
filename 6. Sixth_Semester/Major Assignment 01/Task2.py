class Hand:
    def __init__(self):
        self.cards = []
        self.total = 0

    def add_card(self, card):
        self.cards.append(card)
        self.calculate_total()

    def calculate_total(self):
        self.total = sum(10 if card.rank in ["Jack", "Queen", "King"] else (11 if card.rank == "Ace" else int(card.rank)) for card in self.cards)
        aces = sum(1 for card in self.cards if card.rank == "Ace")
        
        while self.total > 21 and aces:
            self.total -= 10  # Convert Ace from 11 to 1
            aces -= 1

    def is_bust(self):
        return self.total > 21

    def __repr__(self):
        return f"Hand: {self.cards} (Total: {self.total})"

class BlackjackGame:
    def __init__(self):
        self.deck = Deck()
        self.player = Hand()
        self.dealer = Hand()

    def initial_deal(self):
        for _ in range(2):
            self.player.add_card(self.deck.draw())
            self.dealer.add_card(self.deck.draw())

    def player_turn(self):
        while self.player.total < 21:
            print(f"Player's {self.player}")
            move = input("Hit (h) or Stand (s)? ").lower()
            if move == 'h':
                self.player.add_card(self.deck.draw())
                if self.player.is_bust():
                    print(f"Player Busts! {self.player}")
                    return
            else:
                break

    def dealer_turn(self):
        print(f"Dealer's {self.dealer}")
        while self.dealer.total < 17:
            self.dealer.add_card(self.deck.draw())
            print(f"Dealer hits: {self.dealer}")
        if self.dealer.is_bust():
            print("Dealer Busts!")

    def determine_winner(self):
        if self.player.is_bust():
            print("Dealer Wins!")
        elif self.dealer.is_bust() or self.player.total > self.dealer.total:
            print("Player Wins!")
        elif self.player.total == self.dealer.total:
            print("It's a Tie!")
        else:
            print("Dealer Wins!")

    def play(self):
        self.initial_deal()
        self.player_turn()
        self.dealer_turn()
        self.determine_winner()
game = BlackjackGame()
game.play()
