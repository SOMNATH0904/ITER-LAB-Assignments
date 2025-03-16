class BlackjackGameMulti:
    def __init__(self, players):
        self.deck = Deck()
        self.players = {name: Hand() for name in players}
        self.dealer = Hand()

    def initial_deal(self):
        for _ in range(2):
            for player in self.players:
                self.players[player].add_card(self.deck.draw())
            self.dealer.add_card(self.deck.draw())

    def player_turn(self, player):
        while self.players[player].total < 21:
            print(f"{player}'s {self.players[player]}")
            move = input(f"{player}, Hit (h) or Stand (s)? ").lower()
            if move == 'h':
                self.players[player].add_card(self.deck.draw())
                if self.players[player].is_bust():
                    print(f"{player} Busts! {self.players[player]}")
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

    def determine_winners(self):
        dealer_total = self.dealer.total
        for player, hand in self.players.items():
            if hand.is_bust():
                print(f"{player} loses (Bust).")
            elif self.dealer.is_bust() or hand.total > dealer_total:
                print(f"{player} wins!")
            elif hand.total == dealer_total:
                print(f"{player} ties (Push).")
            else:
                print(f"{player} loses.")

    def play(self):
        self.initial_deal()
        for player in self.players:
            self.player_turn(player)
        self.dealer_turn()
        self.determine_winners()

# Example Run
players = ["Alice", "Bob"]
game = BlackjackGameMulti(players)
game.play()
