def superDigit(x):
    sum_ =0
    for i in x:
        sum_ += int(i)
    
    if (len(x)>1):
        superDigit(str(sum_))
    else:
        print(sum_)

n, m = map(str, input().split())
k = int(m)
value = n*k

superDigit(value)