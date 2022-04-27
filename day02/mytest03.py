# 1~45까지의 수 중에서 6가지를 랜덤 중복없이 출력하시오 - 로또

import random

list = []
num = random.randint(1, 45)

for i in range(6) :
    while num in list :
        num = random.randint(1,45) #중복제거 되지 않으면 while 문 벗어나지 못함
    list.append(num)
    
print(list)