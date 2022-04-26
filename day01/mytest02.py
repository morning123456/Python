import random

# 가위/바위/보를 선택하세요  가위 Enter
# 나 : 가위
# 컴 : 바위
# 결과 : 짐



mine = input("가위/바위/보를 선택하세요")

com = int(random.random()*3)+1
if com==1 :
    com="가위"
elif com==2 :
     com="바위"
else: com="보"


if(mine==com) :
    print("비김")
elif((mine=="가위" and com=="바위") and (mine=="바위" and com=="보") and (mine=="보" and com=="가위")) :
    result="컴 이김"
else :
    result="사용자 이김"


print("나 : ",mine)
print("컴 : ",com)
print("결과 : ",result)