
Complexity

Time:O(N) we are iterating the string only once. we are comparing whether the next char is equal same as current character or not.
If yes, then we increment the count else we append the current char and count to the final string. 
Space:



def encode(arr):
    # Code here
    result = ''
    #print(arr)
    #print(len(arr))
    count = 1
    for index, s in enumerate(arr):
        #print(index, s)
        if (index + 1 >= len(arr)) or (arr[index] != arr[index+1]):
            result += s
            result += str(count)
            count = 1
            #print(result)
        else:
            count +=1
    return result        
    