n = int(input())

cnt = 0

for i in range(n):
    word = input()
    for j in range(len(word)):
        if j != len(word)-1:
            if word[j] == word[j+1]:
                pass
            else:
                if word[j] in word[j+1:]:
                    break
        else:
            cnt+=1

print(cnt)

