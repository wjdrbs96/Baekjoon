l = list(map(int,input().split()))

a = l[1]-l[0]
b = l[2]-l[1]

if a < b:
    print(b-1)
else:
    print(a-1)
