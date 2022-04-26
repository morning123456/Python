# 앞 수를 넣으세요  1 Enter
# 끝 수를 넣으세요  10 Enter
# 당신의 수의 합은 55입니다.

first = int(input("앞 수를 넣으세요"))
end = int(input("끝 수를 넣으세요"))

ran = range(first,end+1)
sum = 0;
for i in ran:
     sum+=i

print("당신의 수의 합은 ",sum)