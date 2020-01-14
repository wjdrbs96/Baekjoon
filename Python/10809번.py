name = input()
l = []

for i in range(26):
    l.append(-1)

for j in range(len(name)):
    for k in range(26):
        if name[j] == chr(97 + k) and l[k]==-1:
            l[k]=j
            break

for p in range(len(l)):
    print(l[p], end=" ")
