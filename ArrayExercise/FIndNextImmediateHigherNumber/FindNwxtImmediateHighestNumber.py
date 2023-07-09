def findNextHighNumber(arr):
    end=len(arr)-1
    start=0
    pos=-1
    while(start<end):
        if(arr[end-1]<arr[end]):
            pos=end-1
            break 
        end-=1   
    if(pos ==-1):
        return False
    
    mergeSort(arr,pos+1,len(arr))
    swap(arr,pos,pos+1)

def swap(arr,pos1,pos2):
    temp=arr[pos1]
    arr[pos1]=arr[pos2]
    arr[pos2]=temp

def mergeSort(arr,low, high):
    
    if(low==high):
        return
    mid = int (low+high)/2

    mergeSort(arr,low,mid)
    mergeSort(arr,mid+1, high)
    result = []
    merge(arr,result,low,mid,high)

def merge(arr, result, low, mid, high):
        k=low,i=low,j=mid+1

        #in first half of result array, store the lowest elements
        while i<=mid and j<=high :
            if(arr[i]<= arr[j]):
                result[k]= arr[i]
                k+=1
                i+=1
            else:
                result[k]= arr[j]
                k+=1
                j+=1
            
        #copy the left item which were higher than right on the next half
        while(i<=mid):
            result[k]= arr[i]
            k+=1
            i+=1

        #copy the right item which were higher than left on the remaining spots
        while(j<=high):
            result[k]=arr[j]
            k+=1
            j+=1

        for i in range(low,high):
            arr[i]=result[i]


arr=[2,1,8,7,6,5]

findNextHighNumber(arr)
print(arr)