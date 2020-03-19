import unittest
from fib import fib_recursion

class FibTest(unittest.TestCase):
    
    def testcase1(self):
        self.assertEqual(1, fib_recursion(1))

if __name__ == '__main__':
    unittest.main()
    