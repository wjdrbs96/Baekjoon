n = int(input())
l = []


for i in range(1,n+1):
   l.append(i)

j = 1

while(True):
    if j % 2 == 1:
        print(l[0], end=" ")
        del l[0]

    else:
        l.append(l[0])
        del l[0]

    if len(l) == 0:
        break

    j+=1