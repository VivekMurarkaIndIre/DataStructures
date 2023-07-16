def majority_number(arr):
    n=len(arr)
    majorityNumber=arr[0]
    count=1
    for i in range(1,n):
        if(arr[i] == majorityNumber):
            count+=1
        else:
            count-=1
            if(count ==0):
                majorityNumber=arr[i]
                count+=1
    if(count > 0):
        return majorityNumber
    return -1

arr= [2,3,3,2,2,5,2,3,1,2,2]
print(majority_number(arr))
