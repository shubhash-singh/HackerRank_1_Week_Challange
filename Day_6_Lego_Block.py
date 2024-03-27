def legoBlocks(n, m):
    MOD = (10**9 +7)
    
    row_combinations = [1, 1, 2, 4]
    
    
    while len(row_combinations) <= m:
        row_combinations.append(sum(row_combinations[-4:]) % MOD)

    total = [pow(c, n, MOD) for c in row_combinations]

    unstable = [0, 0]

    for i in range(2, m + 1):

        f = lambda j: (total[j] - unstable[j]) * total[i - j]
        result = sum(map(f, range(1, i)))
        unstable.append(result % MOD)

    return (total[m] - unstable[m]) % MOD
    
    
if __name__ == '__main__':
    t = int(input().strip())
    
    for t_itr in range(t):
        first_multiple_input = input().rstrip().split()
        
        n = int(first_multiple_input[0])
        m = int(first_multiple_input[1])
        
        result = legoBlocks(n, m)
        print(result)