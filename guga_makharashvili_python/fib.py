from functools import lru_cache #python's built in function for memoization


"""
    calculate fibonacci numbers using simple memoization to speed up process, 
    we save already calculated result on each number in dictionary key(number):value(result),
    if number already exists in dictionary it will take its value directly without calculating current number's result every time
"""
fibonacci_memo = {}
def fib_recursion(n):
    if n in fibonacci_memo:
        return fibonacci_memo[n]
    if n < 0:
        return -1
    elif n == 1:
        value = 1
    elif n == 2:
        value = 2
    else:
        value = fib_recursion(n-1) + fib_recursion(n-2)
    fibonacci_memo[n] = value
    return value

@lru_cache(maxsize = 1000) #if we don't specify maxsize of lru_cache by default it will be 128
def fib_with_cache(n):
    if n < 0:
        return -1
    elif n == 1:
        return 1
    elif n == 2:
        return 2
    else:
        return fib_with_cache(n-1) + fib_with_cache(n-2)


