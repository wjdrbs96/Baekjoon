l = []

for i in range(9):
    l.append(int(input()))

a = sorted(l)

print(a[-1])
print(l.index(max(l))+1)
