from copy import copy

n = int(input())
result = []
histry = []
for i in range(n):
    index = input().split()
    
    if int(index[0]) == 1:
        strValue = index[1]
        histry.append(copy(result))
        result.extend(strValue)
        
    elif int(index[0]) == 2:
        intValue = int(index[1])
        histry.append(copy(result))
        del result[-intValue:]
        
    elif int(index[0]) == 3:
        intValue = int(index[1])
        print(result[intValue-1])
        
    elif int(index[0]) == 4:
        result = histry.pop()