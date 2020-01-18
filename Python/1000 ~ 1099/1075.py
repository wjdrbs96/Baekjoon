N = input()
F = int(input())

a = int(N[:-2] + '00')

while True:
    if a % F == 0:
        break;
    a+=1

print(str(a)[-2:])

