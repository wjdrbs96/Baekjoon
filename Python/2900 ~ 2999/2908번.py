a,b = map(str,input().split())
p = a[-1]
q = b[-1]
for i in range(len(a)-2,-1,-1):
    p += a[i]
    q += b[i]

if int(p) < int(q):
    print(q)
else:
    print(p)