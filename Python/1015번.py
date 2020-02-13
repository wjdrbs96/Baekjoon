n = int(input())

a = list(map(int, input().split()))
b=[];

c = a.copy()
c.sort()

for i in a:
    count = 0;
    while(True):
        if c.index(i) + count in b:
            count+=1
        else:
            break
    b.append(c.index(i) + count)

print(*b)




