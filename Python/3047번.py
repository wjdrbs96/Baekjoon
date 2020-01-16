l = list(map(int, input().split()))

name = input()
d={}
l.sort()

for i in range(len(l)):
    d[chr(65+i)] = l[i]

for j in name:
    print(d[j], end=" ")