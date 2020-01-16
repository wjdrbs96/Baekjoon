n = input()
count = 0

if int(n) < 10:
    n = str(n) + "0"

start = n
while(True):
    p = (int(n[0]) + int(n[1]))%10
    q = n[1]
    n = str(q) + str(p)
    count+=1
    if start == n:
        break


print(count)