a,b = map(str, input().split())

p = a[-1]; q = b[-1]

for i in range(len(a)-1):
    p+=a[-2-i]

for j in range(len(b)-1):
    q+=b[-2-j]


sum = int(p) + int(q)

r = str(sum)
r = r[-1]
for k in range(len(str(sum))-1):
    r+=str(sum)[-2-k]

print(int(r))