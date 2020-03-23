import random
import timeit

arr = [0] * 1000000

for i in range(len(arr)):
  arr[i] = random.randrange(1,1000000)

def countingSort(arr, exp1): 
  
    n = len(arr) 
  
    output = [0] * (n) 
  
    count = [0] * (10) 
  
    for i in range(0, n): 
        index = (arr[i]//exp1) 
        count[ (index)%10 ] += 1
  
    # Change count[i] so that count[i] now contains actual 
    #  position of this digit in output array 
    for i in range(1,10): 
        count[i] += count[i-1] 
  
    # Build the output array 
    i = n-1
    while i>=0: 
        index = (arr[i]//exp1) 
        output[ count[ (index)%10 ] - 1] = arr[i] 
        count[ (index)%10 ] -= 1
        i -= 1
  
    i = 0
    for i in range(0,len(arr)): 
        arr[i] = output[i] 
  
def radixSort(arr): 
  
    max1 = max(arr) 
  
    exp = 1
    while max1/exp > 0: 
        countingSort(arr,exp) 
        exp *= 10

start = timeit.default_timer()
radixSort(arr)
stop = timeit.default_timer()
print("Radix Time", stop - start)