
// Recursive version - O(log n) time, O(log n) space
function findNumber(arr, start, end) {
    // Base case: single element is the peak
    if (start === end) {
        return arr[start];
    }
    
    let mid = Math.floor((start + end) / 2);
    
    // If mid is greater than next element, peak is at mid or to the left
    if (arr[mid] > arr[mid + 1]) {
        return findNumber(arr, start, mid);
    } else {
        // Peak is to the right
        return findNumber(arr, mid + 1, end);
    }
}

const arr=[6,9,15,25,35,50,41,29,23,8];
console.log(findNumber(arr,0,arr.length-1));