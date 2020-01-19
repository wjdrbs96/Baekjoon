from collections import deque

cards = deque([i for i in range(int(input()), 0, -1)])

while len(cards) > 1:
    cards.pop()

    if len(cards) == 1:
        break

    cards.appendleft(cards.pop())

print(cards[0])