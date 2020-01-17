n = int(input())
l = list(map(int, input().split())) # 채점 결과
count = 0
sum = 0

for i in l:
    if i == 1:
        count+=1
        if count == 1:
            sum+=1
        else:
            sum+=count
    else:
        count = 0
print(sum)






