a=list(map(int,input().split(' ')))
i = 1;
count1 = 0;
count2 = 0;
m = 8
for j in range(0,8):
    if a[j] == i:
        count1 += 1
    elif a[j] == m:
        count2 += 1
    i+=1
    m -= 1

if count1 == 8:
    print("ascending")
elif count2 == 8:
    print("descending")
else:
    print("mixed")

