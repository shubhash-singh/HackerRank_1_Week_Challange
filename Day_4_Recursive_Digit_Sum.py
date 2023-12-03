def superDigit(x):
    sum_ =0
    for i in x:
        sum_ += int(i)
    # print(sum_)
    if (len(x)>1):
        superDigit(str(sum_))
    else:
        print(sum_)



n, m = map(str, input().split())
k = int(m)
initial_sum = 0
for i in n:
    initial_sum += int(i) 
superDigit(str(initial_sum*k))