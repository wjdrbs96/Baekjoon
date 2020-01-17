a,b = map(int, input().split())
sum = 1
total = 1
tsum = 1

for i in range(2, a+1):
    sum*=i

for j in range(2, b+1):
    total*=j

for k in range(2, a-b+1):
    tsum*=k

result = sum // (total * tsum)
count = 0

for p in range(len(str(result))):
    if str(result)[-1 - p] == "0":
        count+=1
    else:
        break

print(count)


