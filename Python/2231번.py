n = input()
c = len(n)
count = 0
l = []
n = int(n)

for i in range(9 * (c - 1), 0, -1):
    box = str(n - i)
    sum = 0
    for j in range(len(box)):
        sum += int(box[j])

    if (sum + int(box)) == n:
        print(box)
        break

    else:
        count+=1

if count == 9 * (c-1):
    print("0")


