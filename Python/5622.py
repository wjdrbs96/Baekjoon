name = input()
sum=0

dic = { 3:['A','B','C'],
        4:['D','E','F'],
        5:['G','H','I'],
        6:['J','K','L'],
        7:['M','N','O'],
        8:['P','Q','R','S'],
        9:['T','U','V'],
        10:['W','X','Y','Z']}


for i in range(len(name)):
    for j in range(3,11):
        if name[i] in dic[j]:
            sum+=j

print(sum)