n = int(input())
l = []
first = []
check = []

for i in range(n):
    l.append(input())

for j in range(len(l)):
    first.append(l[j][0])


for k in range(len(first)):
    if first.count(first[k]) >= 5 and first[k] not in check:
        check.append(first[k])

check.sort()

if len(check) > 0:
    for k in range(len(check)):
        print(check[k],end="")

else:
    print("PREDAJA")



