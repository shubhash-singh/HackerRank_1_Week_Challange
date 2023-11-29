size = int(input())
arr = list(map(int, input().split()))
pos = 0
neg = 0
zero = 0
for i in arr:
    if i<0:
        neg += 1
    elif i>0:
        pos += 1
    else:
        zero += 1
print(pos/size)
print(neg/size)
print(zero/size)