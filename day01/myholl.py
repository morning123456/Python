import random
rnd = random.random()
com =""
mine = input("홀/짝을 입력하세요")
result =""

rbd = random.random()
if rnd>0.5:
    com="홀"
else :
    com="짝"


if com==mine:
    result="게임에서 이겼다"
else :
      result="게임에서 졌다"

print("com",com)
print("mine",mine)
print("result",result)





"""
rnd = random.random()

a = input("홀짝을 입력하세요")
print(a)

print(rnd)

if rnd>=0.5 :
              b="홀"
else:         b="짝"

if a==b :
         print("게임에서 이겼다")
else :   print("게임에서 졌다")

"""



