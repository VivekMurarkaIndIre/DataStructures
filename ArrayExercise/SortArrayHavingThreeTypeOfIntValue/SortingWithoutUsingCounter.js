function sortArray(arr) {
    let low=0,mid=0,high=arr.length-1;
    while(mid <= high && mid>=low){
        if(arr[mid]==2){
            arr[mid]=arr[high]
            arr[high]=2;
            high--;

        }else if(arr[mid]==0){
            arr[mid]=arr[low]
            arr[low]=0;
            low++;
            mid++;

        }else{
            mid++;
        }
    }
return arr;
}

const arr=[1,1,0,2,1,2,0,2,1,0,0,2,1,0];
console.log(sortArray(arr));