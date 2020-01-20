n = int(input())
l = list(map(int, input().split()))
k = []
count = 0

for i in range(len(l)):
    if l[i] not in k:
        k.append(l[i])
    else:
        count+=1


print(count)
