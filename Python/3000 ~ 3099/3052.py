l = []
div = []

for i in range(10):
    l.append(int(input()))
    div.append(l[i] % 42)


div = set(div)

print(len(div))