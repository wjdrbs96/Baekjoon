n=int(input())  #정수 2개를 띄어쓰기로 입력받기
count=1
stack=[]
result=[]
for i in range(1,n+1):
    data=int(input())
    while count<=data:
        stack.append(count)
        count+=1
        result.append('+')
    if stack[-1]==data:
        stack.pop()
        result.append('-')
    else:
        print('No')
        exit(0)
print('\n'.join(result))    # \n 을 기준으로 result를 출력시켜주는 join 함수

