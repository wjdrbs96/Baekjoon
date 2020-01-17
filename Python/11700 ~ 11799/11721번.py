name = input()
k = 0

if len(name)%10 == 0:
    for i in range(len(name)//10):
        print(name[k:k+10])
        k+=10

elif len(name) < 10:
    print(name)

else:
    for j in range(len(name)//10 + 1):
        print(name[k:k+10])
        k+=10




