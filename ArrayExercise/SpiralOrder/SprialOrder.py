def spiralOrder(arr):
    p=len(arr)
    o=len(arr[0])
    i=0
    j=0
    m=0
    n=0
    while(m<p and n<o):
        i=m
        for j in range(n,o):
            print(arr[i][j])
            j+=1
        j=o-1
        for i in range(m+1,p):
            print(arr[i][j])
        i=p-1
        for j in reversed(range(n,o-1)):
            print(arr[i][j])
        j=n
        for i in reversed(range(m+1,p-1)):
            print(arr[i][j])    
        m +=1
        n +=1
        p -=1
        o -=1

spiralOrder([[1,2,3,4],[12,13,14,5],[11,16,15,6],[10,9,8,7]])
print('next')
spiralOrder([[1,2,3,4,5],[12,13,14,15,6],[11,10,9,8,7]])



