n = int(input())
l = []
for i in range(n):
    l.append(input())

l = set(l)
l = list(l)

voca = []

for j in l:
    voca.append((len(j),j))

voca.sort()

for k in range(len(voca)):
    print(voca[k][1])
