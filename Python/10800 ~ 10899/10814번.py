num = int(input())
l = []

for _ in range(num):
    age, name = map(str, input().split())  # 입력 공백으로 2개받기
    age = int(age)  # 나이는 int 도 변환
    l.append((age, name))  # 리스트에 나이와 이름 튜플로 추가


l.sort(key = lambda a: (a[0]))   # lambda 식은 아래와 의미가 같다.

# def temp(a):
#   return(a[0])


for a in l:
    print(a[0], a[1])