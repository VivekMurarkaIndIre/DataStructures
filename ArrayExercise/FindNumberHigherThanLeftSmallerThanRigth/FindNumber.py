def findNumber(arr):
    currentMax=arr[0]
    possibleNumber=-1
    smallestNumberFromRigth=-1
    start=1
    end=len(arr)-1
    while(start<=end):
        if(arr[start]<currentMax):
            start+=1
        elif(arr[start]>=currentMax):
            currentMax=arr[start]
            smallestNumberFromRigth=arr[start]
            if(arr[end]>=smallestNumberFromRigth):
                end-=1
            else:
                smallestNumberFromRigth=-1
                start+=1
        
    return smallestNumberFromRigth

arr=[6,2,5,4,7,9,11,8,10]

smallestNumberFromRigth=  findNumber(arr)
print(smallestNumberFromRigth)

