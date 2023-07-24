def rotate(matrix):
    m=len(matrix)
    mid=(int)(m/2)
    count=m
    i=0
    j=0
    for i in range(mid):
        for j in range(i,m):
            temp=matrix[j][N-1-i]
            