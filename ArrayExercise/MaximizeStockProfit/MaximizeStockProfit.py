def findProfit(arr):
    totalprofit=0
    n=len(arr)
    hasStock=False
    buyPrice=0
    for i in range(n-1):
        if(hasStock != True):
            if(arr[i]<arr[i+1]):
               buyPrice= arr[i]
               hasStock = True
            else:
               continue
        else:
            if(arr[i]<arr[i+1]):
                continue
            else:
                totalprofit=totalprofit+ (arr[i]-buyPrice)
                hasStock=False
    if(hasStock):
        if( arr[n-2]<arr[n-1]):
            totalprofit=totalprofit+(arr[n-1]-buyPrice)
        else:
            totalprofit=totalprofit(arr[n-2]-buyPrice)
    else:
        if( arr[n-2]<arr[n-1]):
            hasStock=True
            totalprofit=totalprofit+(arr[n-1]-arr[n-2])
    return totalprofit

arr=[98,178,250,300,40,540,690]
print(findProfit(arr))
           
           