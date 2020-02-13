n,m=list(map(int,input().split(' ')))   #정수 2개를 띄어쓰기로 입력받기
data=list(map(int,input().split(' ')))  #map은 리스트의 요소를 지정된 함수로 처리해주는 함수
#map은 원본리스트를 변경하지 않고 새 리스트를 생성합니다.   list(map(함수,리스트))
result=0
length=len(data)
list=[]
for i in range(0,length):
    for j in range(i+1,length):
        for k in range(j+1, length):
            max_sum=data[i]+data[j]+data[k]
            if max_sum<=m:
                result=max(result,max_sum)   #max 는 더큰 값을 출력시켜줌

print(result)