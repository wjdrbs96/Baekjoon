# 코드 봐도 모르겠음..

stair_numbers = [[0 for _ in range(10)] for _ in range(101)]

for i in range(1, 101):
    for j in range(10):
        if i == 1:
            stair_numbers[i][j] = 1
        else:
            if 1 <= j <= 8:
                stair_numbers[i][j] = stair_numbers[i - 1][j - 1] + stair_numbers[i - 1][j + 1]
            elif j == 0:
                stair_numbers[i][j] = stair_numbers[i - 1][j + 1]
            elif j == 9:
                stair_numbers[i][j] = stair_numbers[i - 1][j - 11]

N = int(input())
print(sum(stair_numbers[N][1:10]) % 1000000000)