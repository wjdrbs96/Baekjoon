# 어려워서 못풀음

n = int(input())
b=[]
for i in range(n):
    b.append(input())

start = list(b[0])

for i in range(1,n):
    for j in range(len(start)):
        if start[j] == b[i][j]:
            continue
        else:
            start[j] = '?'


print("".join(start))


