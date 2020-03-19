
# 0 1 1 2 3 5 8 13 21 34 55

def fib_recursion(n):
    if n < 0:
        return -1
    elif n == 0:
        return 0
    elif n == 1:
        return 1
    else:
        return fib_recursion(n-1) + fib_recursion(n-2)
