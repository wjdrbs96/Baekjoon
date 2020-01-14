n = int(input())
l = []
for i in range(n):
    l.append(input())

count = 0
sum = 0

for j in range(len(l)):
    for k in range(len(l[j])):
        if l[j][k] == 'O':
            count += 1
            sum += count
        else:
            count = 0
    print(sum)
    sum = 0
    count = 0


