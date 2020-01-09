n = int(input())
list=[]
sum=0

for i in range(n):
    p = int(input())
    list.append(p)

list.sort()
list.reverse()

for j in range(n):
    if j % 3 ==2:
        continue
    else:
        sum+=list[j]


print(sum)