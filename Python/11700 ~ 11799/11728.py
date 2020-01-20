n,m = map(int, input().split())

A = list(input().split())
B = list(input().split())

A = [int(i) for i in A]
B = [int(i) for i in B]

C = A + B
C.sort()

for c in C:
    print(c,end=" ")