n = int(input())
l = []
for i in range(n):
    a,b = map(str, input().split())
    for k in range(len(b)):
        for j in range(int(a)):
            l.append(b[k])
    for p in range(len(l)):
        print(l[p],end="")
    l=[]
    print()

