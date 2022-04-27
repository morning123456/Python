# 1~9까지의 수 중에서 3가지를 랜덤 중복없이 출력하시오
import random
from dask.array.random import randint

# a = int(random.random()*9)+1
# b = int(random.random()*9)+1
# c = int(random.random()*9)+1
#
#
# if a != b and a != c and b != c: 
#     print(a)
#     print(b)
#     print(c)

list = []
num = random.randint(1, 9)
for i in range(3):
    while num in list:  # 중복제거
        num = random.randint(1,9)
    list.append(num)
    
print(list)
