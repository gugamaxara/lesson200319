import unittest
from fib import fib_recursion

class FibTest(unittest.TestCase):
    
    def testcase1(self):
        self.assertEqual(1, fib_recursion(1))
    
    def testcase2(self):
        self.assertEqual(2, fib_recursion(2))
    
    def testcase3(self):
        self.assertEqual(3, fib_recursion(3))
    
    def testcase4(self):
        self.assertEqual(5, fib_recursion(4))

    def testcase5(self):
        self.assertEqual(8, fib_recursion(5))

    def testcase6(self):
        self.assertEqual(13, fib_recursion(6))
    
    def testcase7(self):
        self.assertEqual(21, fib_recursion(7))

if __name__ == '__main__':
    unittest.main()
    