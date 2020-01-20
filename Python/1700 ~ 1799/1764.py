n,m = map(int, input().split())

a = set()
b=  set()

for i in range(n):
    a.add(input())

for j in range(m):
    b.add(input())


l = list(a & b)
print(len(l))

for k in sorted(l):
    print(k)

