import unittest
from fib import fib_recursion

class FibTest(unittest.TestCase):
    
    def testcase1(self):
        self.assertEqual(1, fib_recursion(1))
    
    def testcase2(self):
        self.assertEqual(2, fib_recursion(2))
    
    

if __name__ == '__main__':
    unittest.main()
    