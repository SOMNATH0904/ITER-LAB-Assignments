'''
Ques 15. Modify a script to play 1,000,000 games of craps. Use two dictionaries, wins and losses, to track
the number of games won and lost for each roll number. Update these dictionaries as the simulation
progresses. For example, a key–value pair 4: 50217 in the wins dictionary would mean that
50,217 games were won on the 4th roll. At the end of the simulation, display:
(i) The percentage of games won.
(ii) The percentage of games lost.
(iii) The percentage of games resolved on each roll.
(iv) The cumulative percentage of games resolved up to each roll.
Sample Output
Percentage of wins: 50.2%
Percentage of losses: 49.8%
Percentage of wins/losses based on total number of rolls:
Rolls | % Resolved on this roll | Cumulative % of games resolved
------------------------------------------------------------------
1 | 30.10% | 30.10%
2 | 20.80% | 50.90%
...
'''

import random

def roll_dice():
    return random.randint(1, 6) + random.randint(1, 6)

def simulate_craps(games=1_000_000):
    wins = {}
    losses = {}
    total_games = games

    for _ in range(total_games):
        roll_count = 1
        first_roll = roll_dice()

        if first_roll in (7, 11):
            wins[roll_count] = wins.get(roll_count, 0) + 1
        elif first_roll in (2, 3, 12):
            losses[roll_count] = losses.get(roll_count, 0) + 1
        else:
            while True:
                roll_count += 1
                new_roll = roll_dice()
                if new_roll == first_roll:
                    wins[roll_count] = wins.get(roll_count, 0) + 1
                    break
                elif new_roll == 7:
                    losses[roll_count] = losses.get(roll_count, 0) + 1
                    break

    total_wins = sum(wins.values())
    total_losses = sum(losses.values())
    win_percentage = (total_wins / total_games) * 100
    loss_percentage = (total_losses / total_games) * 100

    print(f"Percentage of wins: {win_percentage:.2f}%")
    print(f"Percentage of losses: {loss_percentage:.2f}%")
    print("Rolls | % Resolved on this roll | Cumulative % of games resolved")
    print("---------------------------------------------------------------")

    cumulative_percentage = 0

    for roll in range(1, max(max(wins.keys(), default=0), max(losses.keys(), default=0)) + 1):
        resolved_on_roll = wins.get(roll, 0) + losses.get(roll, 0)
        resolved_percentage = (resolved_on_roll / total_games) * 100
        cumulative_percentage += resolved_percentage
        print(f"{roll:5} | {resolved_percentage:22.2f}% | {cumulative_percentage:30.2f}%")

simulate_craps()


'''
Output ->
Percentage of wins: 49.22%
Percentage of losses: 50.78%
Rolls | % Resolved on this roll | Cumulative % of games resolved
---------------------------------------------------------------
    1 |                  33.33% |                          33.33%        
    2 |                  18.82% |                          52.15%        
    3 |                  13.45% |                          65.61%        
    4 |                   9.61% |                          75.22%        
    5 |                   6.95% |                          82.17%        
    6 |                   4.99% |                          87.16%        
    7 |                   3.57% |                          90.73%        
    8 |                   2.61% |                          93.33%        
    9 |                   1.85% |                          95.18%        
   10 |                   1.32% |                          96.51%        
   11 |                   0.96% |                          97.46%        
   12 |                   0.71% |                          98.18%        
   13 |                   0.50% |                          98.68%        
   14 |                   0.37% |                          99.05%        
   15 |                   0.26% |                          99.31%        
   16 |                   0.19% |                          99.50%        
   17 |                   0.14% |                          99.64%        
   18 |                   0.10% |                          99.74%        
   19 |                   0.07% |                          99.81%        
   20 |                   0.05% |                          99.86%        
   21 |                   0.04% |                          99.90%        
   22 |                   0.03% |                          99.93%        
   23 |                   0.02% |                          99.95%        
   24 |                   0.01% |                          99.96%        
   25 |                   0.01% |                          99.97%        
   26 |                   0.01% |                          99.98%        
   27 |                   0.01% |                          99.98%        
   28 |                   0.00% |                          99.99%        
   29 |                   0.00% |                          99.99%        
   30 |                   0.00% |                          99.99%        
   31 |                   0.00% |                          99.99%        
   32 |                   0.00% |                         100.00%        
   33 |                   0.00% |                         100.00%        
   34 |                   0.00% |                         100.00%        
   35 |                   0.00% |                         100.00%        
   36 |                   0.00% |                         100.00%        
   37 |                   0.00% |                         100.00%        
   38 |                   0.00% |                         100.00%        
   39 |                   0.00% |                         100.00%        
   40 |                   0.00% |                         100.00%        
   41 |                   0.00% |                         100.00%        
   42 |                   0.00% |                         100.00%        
   43 |                   0.00% |                         100.00%        
   44 |                   0.00% |                         100.00%        
   45 |                   0.00% |                         100.00%        
   46 |                   0.00% |                         100.00%        
   47 |                   0.00% |                         100.00%        
   48 |                   0.00% |                         100.00%        
   49 |                   0.00% |                         100.00% 
'''