# 출력하고 싶은 단수를 입력하세요  6 Enter
# 6*1 = 6
# .
# .

num = int(input("출력하고 싶은 단수를 입력하세요"))

for i in range(1,10) :
    print(num, "*", i, "=", num*i)


    #print("{}*{}={}".format(num,i,num*i))

print("{}*{}={}".format(num,1,num*1))
print("{}*{}={}".format(num,2,num*2))
print("{}*{}={}".format(num,3,num*3))
print("{}*{}={}".format(num,4,num*4))
print("{}*{}={}".format(num,5,num*5))
print("{}*{}={}".format(num, 6, num * 6))
print("{}*{}={}".format(num, 7, num * 7))
print("{}*{}={}".format(num, 8, num * 8))
print("{}*{}={}".format(num, 9, num * 9))

