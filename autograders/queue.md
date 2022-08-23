# Autograder Feedback

<body>

<p>
<em>
See the Assessment Guide for information on how to interpret this report.
</em>
<br><br>

</p><h2>ASSESSMENT SUMMARY</h2>
<pre>
Compilation:  <font color="#009900">PASSED (0 errors, 2 warnings)</font>
API:          <font color="#009900">PASSED</font>

SpotBugs:     <font color="#009900">PASSED</font>
PMD:          <font color="#990000">FAILED (1 warning)</font>
Checkstyle:   <font color="#009900">PASSED</font>

Correctness:  <font color="#199900">42/49 tests passed</font>
Memory:       <font color="#139900">108/122 tests passed</font>
Timing:       <font color="#259900">155/193 tests passed</font>

Aggregate score: 86.34%
[ Compilation: 5%, API: 5%, Style: 0%, Correctness: 60%, Timing: 10%, Memory: 20% ]
</pre>


<br><br>

<h2>ASSESSMENT DETAILS</h2>

<pre>
The following files were submitted:
----------------------------------
3.6K Jun 10 03:26 Deque.java
 478 Jun 10 03:26 Permutation.java
3.0K Jun 10 03:26 RandomizedQueue.java


********************************************************************************
*  COMPILING                                                                    
********************************************************************************


% javac Deque.java
*-----------------------------------------------------------

% javac RandomizedQueue.java
*-----------------------------------------------------------
RandomizedQueue.java:14: warning: [unchecked] unchecked cast
        r = (Item[]) new Object[INIT_CAPACITY];
                     ^
  required: Item[]
  found:    Object[]
  where Item is a type-variable:
    Item extends Object declared in class RandomizedQueue
RandomizedQueue.java:86: warning: [unchecked] unchecked cast
        Item[] copy = (Item[]) new Object[capacity];
                               ^
  required: Item[]
  found:    Object[]
  where Item is a type-variable:
    Item extends Object declared in class RandomizedQueue
2 warnings

% javac Permutation.java
*-----------------------------------------------------------


================================================================


Checking the APIs of your programs.
*-----------------------------------------------------------
Deque:

RandomizedQueue:

Permutation:

================================================================


********************************************************************************
*  CHECKING STYLE AND COMMON BUG PATTERNS                                       
********************************************************************************


% spotbugs *.class
*-----------------------------------------------------------


================================================================


% pmd .
*-----------------------------------------------------------
RandomizedQueue.java:67: The user-supplied array 'array' is stored directly. [ArrayIsStoredDirectly]
PMD ends with 1 warning.


================================================================


% checkstyle *.java
*-----------------------------------------------------------

% custom checkstyle checks for Deque.java
*-----------------------------------------------------------

% custom checkstyle checks for RandomizedQueue.java
*-----------------------------------------------------------

% custom checkstyle checks for Permutation.java
*-----------------------------------------------------------


================================================================


********************************************************************************
*  TESTING CORRECTNESS
********************************************************************************

Testing correctness of Deque
*-----------------------------------------------------------
Running 19 total tests.

Tests 1-8 make random intermixed calls to addFirst(), addLast(),
removeFirst(), removeLast(), isEmpty(), and size(), and iterator().
The probabilities of each operation are (p1, p2, p3, p4, p5, p6, p7),
respectively.

Test 1: check random calls to addFirst(), addLast(), and size()
  *    5 random calls (0.4, 0.4, 0.0, 0.0, 0.0, 0.2, 0.0)
  *   50 random calls (0.4, 0.4, 0.0, 0.0, 0.0, 0.2, 0.0)
  *  500 random calls (0.4, 0.4, 0.0, 0.0, 0.0, 0.2, 0.0)
  * 1000 random calls (0.4, 0.4, 0.0, 0.0, 0.0, 0.2, 0.0)
==&gt; passed

Test 2: check random calls to addFirst(), removeFirst(), and isEmpty()
  *    5 random calls (0.8, 0.0, 0.1, 0.0, 0.1, 0.0, 0.0)
  *   50 random calls (0.8, 0.0, 0.1, 0.0, 0.1, 0.0, 0.0)
  *  500 random calls (0.8, 0.0, 0.1, 0.0, 0.1, 0.0, 0.0)
  * 1000 random calls (0.8, 0.0, 0.1, 0.0, 0.1, 0.0, 0.0)
  *    5 random calls (0.1, 0.0, 0.8, 0.0, 0.1, 0.0, 0.0)
  *   50 random calls (0.1, 0.0, 0.8, 0.0, 0.1, 0.0, 0.0)
  *  500 random calls (0.1, 0.0, 0.8, 0.0, 0.1, 0.0, 0.0)
  * 1000 random calls (0.1, 0.0, 0.8, 0.0, 0.1, 0.0, 0.0)
==&gt; passed

Test 3: check random calls to addFirst(), removeLast(), and isEmpty()
  *    5 random calls (0.8, 0.0, 0.0, 0.1, 0.1, 0.0, 0.0)
  *   50 random calls (0.8, 0.0, 0.0, 0.1, 0.1, 0.0, 0.0)
  *  500 random calls (0.8, 0.0, 0.0, 0.1, 0.1, 0.0, 0.0)
  * 1000 random calls (0.8, 0.0, 0.0, 0.1, 0.1, 0.0, 0.0)
  *    5 random calls (0.1, 0.0, 0.0, 0.8, 0.1, 0.0, 0.0)
  *   50 random calls (0.1, 0.0, 0.0, 0.8, 0.1, 0.0, 0.0)
  *  500 random calls (0.1, 0.0, 0.0, 0.8, 0.1, 0.0, 0.0)
  * 1000 random calls (0.1, 0.0, 0.0, 0.8, 0.1, 0.0, 0.0)
==&gt; passed

Test 4: check random calls to addLast(), removeLast(), and isEmpty()
  *    5 random calls (0.0, 0.8, 0.0, 0.1, 0.1, 0.0, 0.0)
  *   50 random calls (0.0, 0.8, 0.0, 0.1, 0.1, 0.0, 0.0)
  *  500 random calls (0.0, 0.8, 0.0, 0.1, 0.1, 0.0, 0.0)
  * 1000 random calls (0.0, 0.8, 0.0, 0.1, 0.1, 0.0, 0.0)
  *    5 random calls (0.0, 0.1, 0.0, 0.8, 0.1, 0.0, 0.0)
  *   50 random calls (0.0, 0.1, 0.0, 0.8, 0.1, 0.0, 0.0)
  *  500 random calls (0.0, 0.1, 0.0, 0.8, 0.1, 0.0, 0.0)
  * 1000 random calls (0.0, 0.1, 0.0, 0.8, 0.1, 0.0, 0.0)
==&gt; passed

Test 5: check random calls to addLast(), removeFirst(), and isEmpty()
  *    5 random calls (0.0, 0.8, 0.1, 0.0, 0.1, 0.0, 0.0)
  *   50 random calls (0.0, 0.8, 0.1, 0.0, 0.1, 0.0, 0.0)
  *  500 random calls (0.0, 0.8, 0.1, 0.0, 0.1, 0.0, 0.0)
  * 1000 random calls (0.0, 0.8, 0.1, 0.0, 0.1, 0.0, 0.0)
  *    5 random calls (0.0, 0.1, 0.8, 0.0, 0.1, 0.0, 0.0)
  *   50 random calls (0.0, 0.1, 0.8, 0.0, 0.1, 0.0, 0.0)
  *  500 random calls (0.0, 0.1, 0.8, 0.0, 0.1, 0.0, 0.0)
  * 1000 random calls (0.0, 0.1, 0.8, 0.0, 0.1, 0.0, 0.0)
==&gt; passed

Test 6: check random calls to addFirst(), removeFirst(), and iterator()
  *    5 random calls (0.8, 0.0, 0.1, 0.0, 0.0, 0.0, 0.1)
  *   50 random calls (0.8, 0.0, 0.1, 0.0, 0.0, 0.0, 0.1)
  *  500 random calls (0.8, 0.0, 0.1, 0.0, 0.0, 0.0, 0.1)
  * 1000 random calls (0.8, 0.0, 0.1, 0.0, 0.0, 0.0, 0.1)
  *    5 random calls (0.1, 0.0, 0.8, 0.0, 0.0, 0.0, 0.1)
  *   50 random calls (0.1, 0.0, 0.8, 0.0, 0.0, 0.0, 0.1)
  *  500 random calls (0.1, 0.0, 0.8, 0.0, 0.0, 0.0, 0.1)
  * 1000 random calls (0.1, 0.0, 0.8, 0.0, 0.0, 0.0, 0.1)
==&gt; passed

Test 7: check random calls to all methods except iterator()
  *    5 random calls (0.3, 0.3, 0.1, 0.1, 0.1, 0.1, 0.0)
  *   50 random calls (0.3, 0.3, 0.1, 0.1, 0.1, 0.1, 0.0)
  *  500 random calls (0.3, 0.3, 0.1, 0.1, 0.1, 0.1, 0.0)
  * 1000 random calls (0.3, 0.3, 0.1, 0.1, 0.1, 0.1, 0.0)
  *    5 random calls (0.1, 0.1, 0.3, 0.3, 0.1, 0.1, 0.0)
  *   50 random calls (0.1, 0.1, 0.3, 0.3, 0.1, 0.1, 0.0)
  *  500 random calls (0.1, 0.1, 0.3, 0.3, 0.1, 0.1, 0.0)
  * 1000 random calls (0.1, 0.1, 0.3, 0.3, 0.1, 0.1, 0.0)
==&gt; passed

Test 8: check random calls to all methods, including iterator()
  *    5 random calls (0.2, 0.2, 0.1, 0.1, 0.1, 0.1, 0.2)
  *   50 random calls (0.2, 0.2, 0.1, 0.1, 0.1, 0.1, 0.2)
  *  500 random calls (0.2, 0.2, 0.1, 0.1, 0.1, 0.1, 0.2)
  * 1000 random calls (0.2, 0.2, 0.1, 0.1, 0.1, 0.1, 0.2)
  *    5 random calls (0.1, 0.1, 0.2, 0.2, 0.1, 0.1, 0.2)
  *   50 random calls (0.1, 0.1, 0.2, 0.2, 0.1, 0.1, 0.2)
  *  500 random calls (0.1, 0.1, 0.2, 0.2, 0.1, 0.1, 0.2)
  * 1000 random calls (0.1, 0.1, 0.2, 0.2, 0.1, 0.1, 0.2)
==&gt; passed

Test 9: check removeFirst() and removeLast() from an empty deque
  * removeFirst()
  * removeLast()
==&gt; passed

Test 10: check whether two Deque objects can be created at the same time
  * n = 10
  * n = 1000
==&gt; passed

Test 11: check iterator() after n calls to addFirst()
  * n = 10
    - entry 0 of the two sequences are not equal
    - student   entry 0 = 1
    - reference entry 0 = 10


  * n = 50
    - entry 0 of the two sequences are not equal
    - student   entry 0 = 1
    - reference entry 0 = 50


==&gt; <font color="#990000"><b>FAILED</b></font>

Test 12: check iterator() after random calls to addFirst(), addLast(),
         removeFirst(), and removeLast() with probabilities (p1, p2, p3, p4)
  * 20 random operations (0.8, 0.0, 0.2, 0.0)
    - entry 0 of the two sequences are not equal
    - student   entry 0 = 1
    - reference entry 0 = 2

    - student iterator() yields wrong result
      after applying add/remove operation 2 of 20
    - student   iterator() = [1, 2]
    - reference iterator() = [2, 1]
    - sequence of operations was:
         Deque&lt;Integer&gt; deque = new Deque&lt;&gt;()
         deque.addFirst(1)
         deque.iterator()     ==&gt; [1]
         deque.addFirst(2)
         deque.iterator()     ==&gt; [1, 2]

  * 20 random operations (0.8, 0.0, 0.0, 0.2)
    - entry 0 of the two sequences are not equal
    - student   entry 0 = 3
    - reference entry 0 = 4

    - student iterator() yields wrong result
      after applying add/remove operation 4 of 20
    - student   iterator() = [3, 4]
    - reference iterator() = [4, 3]
    - sequence of operations was:
         Deque&lt;Integer&gt; deque = new Deque&lt;&gt;()
         deque.addFirst(1)
         deque.iterator()     ==&gt; [1]
         deque.removeLast()   ==&gt; 1
         deque.iterator()     ==&gt; []
         deque.addFirst(3)
         deque.iterator()     ==&gt; [3]
         deque.addFirst(4)
         deque.iterator()     ==&gt; [3, 4]

  * 20 random operations (0.0, 0.8, 0.0, 0.2)
    - entry 0 of the two sequences are not equal
    - student   entry 0 = 2
    - reference entry 0 = 1

    - student iterator() yields wrong result
      after applying add/remove operation 2 of 20
    - student   iterator() = [2, 1]
    - reference iterator() = [1, 2]
    - sequence of operations was:
         Deque&lt;Integer&gt; deque = new Deque&lt;&gt;()
         deque.addLast(1)
         deque.iterator()     ==&gt; [1]
         deque.addLast(2)
         deque.iterator()     ==&gt; [2, 1]

  * 20 random operations (0.0, 0.8, 0.2, 0.0)
    - entry 0 of the two sequences are not equal
    - student   entry 0 = 2
    - reference entry 0 = 1

    - student iterator() yields wrong result
      after applying add/remove operation 2 of 20
    - student   iterator() = [2, 1]
    - reference iterator() = [1, 2]
    - sequence of operations was:
         Deque&lt;Integer&gt; deque = new Deque&lt;&gt;()
         deque.addLast(1)
         deque.iterator()     ==&gt; [1]
         deque.addLast(2)
         deque.iterator()     ==&gt; [2, 1]

  * 20 random operations (0.4, 0.4, 0.1, 0.1)
    - entry 0 of the two sequences are not equal
    - student   entry 0 = 1
    - reference entry 0 = 2

    - student iterator() yields wrong result
      after applying add/remove operation 2 of 20
    - student   iterator() = [1, 2]
    - reference iterator() = [2, 1]
    - sequence of operations was:
         Deque&lt;Integer&gt; deque = new Deque&lt;&gt;()
         deque.addFirst(1)
         deque.iterator()     ==&gt; [1]
         deque.addFirst(2)
         deque.iterator()     ==&gt; [1, 2]

  * 20 random operations (0.2, 0.0, 0.8, 0.0)
    - entry 0 of the two sequences are not equal
    - student   entry 0 = 1
    - reference entry 0 = 2

    - student iterator() yields wrong result
      after applying add/remove operation 2 of 20
    - student   iterator() = [1, 2]
    - reference iterator() = [2, 1]
    - sequence of operations was:
         Deque&lt;Integer&gt; deque = new Deque&lt;&gt;()
         deque.addFirst(1)
         deque.iterator()     ==&gt; [1]
         deque.addFirst(2)
         deque.iterator()     ==&gt; [1, 2]

  * 20 random operations (0.2, 0.0, 0.0, 0.8)
    - entry 0 of the two sequences are not equal
    - student   entry 0 = 7
    - reference entry 0 = 8

    - student iterator() yields wrong result
      after applying add/remove operation 8 of 20
    - student   iterator() = [7, 8]
    - reference iterator() = [8, 7]

  * 20 random operations (0.0, 0.2, 0.0, 0.8)
    - entry 0 of the two sequences are not equal
    - student   entry 0 = 16
    - reference entry 0 = 15

    - student iterator() yields wrong result
      after applying add/remove operation 16 of 20
    - student   iterator() = [16, 15]
    - reference iterator() = [15, 16]

  * 20 random operations (0.0, 0.2, 0.8, 0.0)
    - entry 0 of the two sequences are not equal
    - student   entry 0 = 4
    - reference entry 0 = 3

    - student iterator() yields wrong result
      after applying add/remove operation 4 of 20
    - student   iterator() = [4, 3]
    - reference iterator() = [3, 4]
    - sequence of operations was:
         Deque&lt;Integer&gt; deque = new Deque&lt;&gt;()
         deque.addLast(1)
         deque.iterator()     ==&gt; [1]
         deque.removeFirst()  ==&gt; 1
         deque.iterator()     ==&gt; []
         deque.addLast(3)
         deque.iterator()     ==&gt; [3]
         deque.addLast(4)
         deque.iterator()     ==&gt; [4, 3]

  * 20 random operations (0.1, 0.1, 0.4, 0.4)
    - entry 0 of the two sequences are not equal
    - student   entry 0 = 19
    - reference entry 0 = 20

    - student iterator() yields wrong result
      after applying add/remove operation 20 of 20
    - student   iterator() = [19, 20]
    - reference iterator() = [20, 19]

  * 100 random operations (0.4, 0.4, 0.1, 0.1)
    - entry 0 of the two sequences are not equal
    - student   entry 0 = 2
    - reference entry 0 = 1

    - student iterator() yields wrong result
      after applying add/remove operation 2 of 100
    - student   iterator() = [2, 1]
    - reference iterator() = [1, 2]
    - sequence of operations was:
         Deque&lt;Integer&gt; deque = new Deque&lt;&gt;()
         deque.addLast(1)
         deque.iterator()     ==&gt; [1]
         deque.addLast(2)
         deque.iterator()     ==&gt; [2, 1]

  * 1000 random operations (0.4, 0.4, 0.1, 0.1)
    - entry 0 of the two sequences are not equal
    - student   entry 0 = 1
    - reference entry 0 = 2

    - student iterator() yields wrong result
      after applying add/remove operation 2 of 1000
    - student   iterator() = [1, 2]
    - reference iterator() = [2, 1]
    - sequence of operations was:
         Deque&lt;Integer&gt; deque = new Deque&lt;&gt;()
         deque.addFirst(1)
         deque.iterator()     ==&gt; [1]
         deque.addFirst(2)
         deque.iterator()     ==&gt; [1, 2]

==&gt; <font color="#990000"><b>FAILED</b></font>

Test 13: create two nested iterators to same deque of size n
  * n = 10
    - failed on outer loop 0
    - student   outer iterator returned 9
    - reference outer iterator returned 0

  * n = 50
    - failed on outer loop 0
    - student   outer iterator returned 49
    - reference outer iterator returned 0

==&gt; <font color="#990000"><b>FAILED</b></font>

Test 14: create two parallel iterators to same deque of size n
  * n = 10
    - failed on call 0 to next()
    - student   iterator 1 next() = 9
    - student   iterator 2 next() = 9
    - reference iterator   next() = 0

  * n = 50
    - failed on call 0 to next()
    - student   iterator 1 next() = 49
    - student   iterator 2 next() = 49
    - reference iterator   next() = 0

==&gt; <font color="#990000"><b>FAILED</b></font>

Test 15: create an iterator and check calls to next() and hasNext()
  * 10 consecutive calls to hasNext() on a deque of size 10
    - failed on operation 1 of 10
    - student   next() = 1
    - reference next() = 10
    - sequence of operations was:
         Deque&lt;Integer&gt; deque = new Deque&lt;&gt;();
         for (int j = 1; j &lt;= 10; j++)
             deque.addFirst(j);
         Iterator&lt;Integer&gt; iterator = deque.iterator()
         iterator.next()     ==&gt; 1

  * 10 consecutive calls to next() on a deque of size 10
  * 50 random intermixed calls to next() and hasNext() on a deque of size 10
    - failed on operation 1 of 50
    - student   next() = 1
    - reference next() = 10
    - sequence of operations was:
         Deque&lt;Integer&gt; deque = new Deque&lt;&gt;();
         for (int j = 1; j &lt;= 10; j++)
             deque.addFirst(j);
         Iterator&lt;Integer&gt; iterator = deque.iterator()
         iterator.next()     ==&gt; 1

  * 1000 random intermixed calls to next() and hasNext() on a deque of size 100
    - failed on operation 3 of 1000
    - student   next() = 1
    - reference next() = 100
    - sequence of operations was:
         Deque&lt;Integer&gt; deque = new Deque&lt;&gt;();
         for (int j = 1; j &lt;= 100; j++)
             deque.addFirst(j);
         Iterator&lt;Integer&gt; iterator = deque.iterator()
         iterator.hasNext()  ==&gt; true
         iterator.hasNext()  ==&gt; true
         iterator.next()     ==&gt; 1

==&gt; <font color="#990000"><b>FAILED</b></font>

Test 16: create Deque objects of different parameterized types
==&gt; passed

Test 17: call addFirst() and addLast() with null argument
==&gt; passed

Test 18: check that remove() and next() throw the specified exceptions in iterator()
==&gt; passed

Test 19: call iterator() when the deque is empty
==&gt; passed


Total: 14/19 tests passed!


================================================================
Testing correctness of RandomizedQueue
*-----------------------------------------------------------
Running 21 total tests.

Tests 1-6 make random intermixed calls to enqueue(), dequeue(), sample(),
isEmpty(), size(), and iterator(). The probabilities of each operation
are (p1, p2, p3, p4, p5, p6), respectively.

Test 1: check random calls to enqueue() and size()
  *    5 random calls (0.8, 0.0, 0.0, 0.0, 0.2, 0.0)
  *   50 random calls (0.8, 0.0, 0.0, 0.0, 0.2, 0.0)
  *  500 random calls (0.8, 0.0, 0.0, 0.0, 0.2, 0.0)
  * 1000 random calls (0.8, 0.0, 0.0, 0.0, 0.2, 0.0)
==&gt; passed

Test 2: check random calls to enqueue() and dequeue()
  *    5 random calls (0.7, 0.1, 0.0, 0.1, 0.1, 0.0)
  *   50 random calls (0.7, 0.1, 0.0, 0.1, 0.1, 0.0)
  *  500 random calls (0.7, 0.1, 0.0, 0.1, 0.1, 0.0)
  * 1000 random calls (0.7, 0.1, 0.0, 0.1, 0.1, 0.0)
  *    5 random calls (0.1, 0.7, 0.0, 0.1, 0.1, 0.0)
  *   50 random calls (0.1, 0.7, 0.0, 0.1, 0.1, 0.0)
  *  500 random calls (0.1, 0.7, 0.0, 0.1, 0.1, 0.0)
  * 1000 random calls (0.1, 0.7, 0.0, 0.1, 0.1, 0.0)
==&gt; passed

Test 3: check random calls to enqueue() and sample()
  *    5 random calls (0.8, 0.0, 0.2, 0.0, 0.0, 0.0)
  *   50 random calls (0.8, 0.0, 0.2, 0.0, 0.0, 0.0)
  *  500 random calls (0.8, 0.0, 0.2, 0.0, 0.0, 0.0)
  * 1000 random calls (0.8, 0.0, 0.2, 0.0, 0.0, 0.0)
  *    5 random calls (0.2, 0.0, 0.8, 0.0, 0.0, 0.0)
  *   50 random calls (0.2, 0.0, 0.8, 0.0, 0.0, 0.0)
  *  500 random calls (0.2, 0.0, 0.8, 0.0, 0.0, 0.0)
  * 1000 random calls (0.2, 0.0, 0.8, 0.0, 0.0, 0.0)
==&gt; passed

Test 4: check random calls to enqueue() and iterator()
  *    5 random calls (0.8, 0.0, 0.0, 0.0, 0.0, 0.2)
  *   50 random calls (0.8, 0.0, 0.0, 0.0, 0.0, 0.2)
  *  500 random calls (0.8, 0.0, 0.0, 0.0, 0.0, 0.2)
  * 1000 random calls (0.8, 0.0, 0.0, 0.0, 0.0, 0.2)
==&gt; passed

Test 5: check random calls to all methods except iterator()
  *    5 random calls (0.6, 0.1, 0.1, 0.1, 0.1, 0.0)
  *   50 random calls (0.6, 0.1, 0.1, 0.1, 0.1, 0.0)
  *  500 random calls (0.6, 0.1, 0.1, 0.1, 0.1, 0.0)
  * 1000 random calls (0.6, 0.1, 0.1, 0.1, 0.1, 0.0)
  *    5 random calls (0.1, 0.6, 0.1, 0.1, 0.1, 0.0)
  *   50 random calls (0.1, 0.6, 0.1, 0.1, 0.1, 0.0)
  *  500 random calls (0.1, 0.6, 0.1, 0.1, 0.1, 0.0)
  * 1000 random calls (0.1, 0.6, 0.1, 0.1, 0.1, 0.0)
==&gt; passed

Test 6: check random calls to all methods, including iterator()
  *    5 random calls (0.5, 0.1, 0.1, 0.1, 0.1, 0.1)
  *   50 random calls (0.5, 0.1, 0.1, 0.1, 0.1, 0.1)
  *  500 random calls (0.5, 0.1, 0.1, 0.1, 0.1, 0.1)
  * 1000 random calls (0.5, 0.1, 0.1, 0.1, 0.1, 0.1)
  *    5 random calls (0.1, 0.5, 0.1, 0.1, 0.1, 0.1)
  *   50 random calls (0.1, 0.5, 0.1, 0.1, 0.1, 0.1)
  *  500 random calls (0.1, 0.5, 0.1, 0.1, 0.1, 0.1)
  * 1000 random calls (0.1, 0.5, 0.1, 0.1, 0.1, 0.1)
==&gt; passed

Test 7: call dequeue() and sample() from an empty randomized queue
  * dequeue()
  * sample()
==&gt; passed

Test 8: create multiple randomized queue objects at the same time
  * n = 10
  * n = 100
==&gt; passed

Test 9: check that iterator() returns correct items after a sequence
        of n enqueue() operations
  * n = 10
  * n = 50
==&gt; passed

Test 10: check that iterator() returns correct items after intermixed
         sequence of m enqueue() and dequeue() operations
  * m = 10
  * m = 1000
==&gt; passed

Test 11: create two nested iterators over the same randomized queue of size n
  * n = 10
    - outer iterator failed to return one (or more) of the 10 items
    - outer iterator returned the same item more than once

  * n = 50
    - outer iterator failed to return one (or more) of the 50 items
    - outer iterator returned the same item more than once

==&gt; <font color="#990000"><b>FAILED</b></font>

Test 12: create two parallel iterators over the same randomized queue of size n
  * n = 10
    - two iterators return the same sequence of values
    - they should return the same set of values but in a
      different order

  * n = 50
    - two iterators return the same sequence of values
    - they should return the same set of values but in a
      different order

==&gt; <font color="#990000"><b>FAILED</b></font>

Test 13: create two iterators over different randomized queues,
         each of length 10
==&gt; passed

Test 14: create an iterator and check calls to next() and hasNext()
  * 10 consecutive calls to hasNext() on a deque of size 10
  * 10 consecutive calls to next() on a deque of size 10
  * 50 random intermixed calls to next() and hasNext() on a deque of size 10
  * 1000 random intermixed calls to next() and hasNext() on a deque of size 100
==&gt; passed

Test 15: create RandomizedQueue objects of different parameterized types
==&gt; passed

Test 16: check randomness of sample() by enqueueing n items, repeatedly calling
         sample(), and counting the frequency of each item
  * n = 3, trials = 12000
  * n = 5, trials = 12000
  * n = 8, trials = 12000
  * n = 10, trials = 12000
==&gt; passed

Test 17: check randomness of dequeue() by enqueueing n items, dequeueing n items,
         and seeing whether each of the n! permutations is equally likely
  * n = 2, trials = 12000
  * n = 3, trials = 12000
  * n = 4, trials = 12000
  * n = 5, trials = 12000
==&gt; passed

Test 18: check randomness of iterator() by enqueueing n items, iterating over those
         n items, and seeing whether each of the n! permutations is equally likely
  * n = 2, trials = 12000
  * n = 3, trials = 12000
  * n = 4, trials = 12000
  * n = 5, trials = 12000
==&gt; passed

Test 19: call enqueue() with a null argument
==&gt; passed

Test 20: check that remove() and next() throw the specified exceptions in iterator()
==&gt; passed

Test 21: call iterator() when randomized queue is empty
==&gt; passed


Total: 19/21 tests passed!


================================================================
********************************************************************************
*  TESTING CORRECTNESS (substituting reference RandomizedQueue and Deque)
********************************************************************************

Testing correctness of Permutation
*-----------------------------------------------------------
Tests 1-5 call the main() function directly, resetting standard input
before each call.

Running 9 total tests.

Test 1a: check formatting for sample inputs from assignment specification
  % java Permutation 3 &lt; distinct.txt
  G
  F
  D

  % java Permutation 3 &lt; distinct.txt
  G
  H
  C

  % java Permutation 8 &lt; duplicates.txt
  BB
  BB
  BB
  BB
  BB
  AA
  CC
  CC

==&gt; passed

Test 1b: check formatting for other inputs
  % java Permutation 8 &lt; mediumTale.txt
  foolishness
  the
  it
  it
  was
  the
  it
  times

  % java Permutation 0 &lt; distinct.txt
  [no output]

==&gt; passed

Test 2: check that main() reads all data from standard input
  * filename = distinct.txt, k = 3
  * filename = distinct.txt, k = 3
  * filename = duplicates.txt, k = 8
  * filename = mediumTale.txt, k = 8
==&gt; passed

Test 3a: check that main() prints each item from the sequence at most once
         (for inputs with no duplicate strings)
  * filename = distinct.txt, k = 3
  * filename = distinct.txt, k = 1
  * filename = distinct.txt, k = 9
  * filename = permutation6.txt, k = 6
  * filename = permutation10.txt, k = 10
==&gt; passed

Test 3b: check that main() prints each item from the sequence at most once
         (for inputs with duplicate strings)
  * filename = duplicates.txt, k = 8
  * filename = duplicates.txt, k = 3
  * filename = permutation8.txt, k = 6
  * filename = permutation8.txt, k = 2
  * filename = tinyTale.txt, k = 10
==&gt; passed

Test 3c: check that main() prints each item from the sequence at most once
         (for inputs with newlines)
  * filename = mediumTale.txt, k = 10
  * filename = mediumTale.txt, k = 20
  * filename = tale.txt, k = 10
  * filename = tale.txt, k = 50
==&gt; passed

Test 4: check main() when k = 0
  * filename = distinct.txt, k = 0
  * filename = distinct.txt, k = 0
==&gt; passed

Test 5a: check that permutations are uniformly random
         (for inputs with no duplicate strings)
  * filename = permutation4.txt, k = 1
  * filename = permutation4.txt, k = 2
  * filename = permutation4.txt, k = 3
  * filename = permutation4.txt, k = 4
  * filename = permutation6.txt, k = 2
==&gt; passed

Test 5b: check that permutations are uniformly random
         (for inputs with duplicate strings)
  * filename = permutation5.txt, k = 1
  * filename = permutation5.txt, k = 2
  * filename = permutation5.txt, k = 3
  * filename = duplicates.txt, k = 3
  * filename = permutation8.txt, k = 2
==&gt; passed

Total: 9/9 tests passed!


================================================================
********************************************************************************
*  TIMING (substituting reference RandomizedQueue and Deque)
********************************************************************************

Timing Permutation
*-----------------------------------------------------------
Running 23 total tests.

Test 1: count calls to methods in StdIn
  * java Permutation 5 &lt; distinct.txt
  * java Permutation 10 &lt; permutation10.txt
  * java Permutation 1 &lt; mediumTale.txt
  * java Permutation 20 &lt; tale.txt
  * java Permutation 100 &lt; tale.txt
  * java Permutation 16412 &lt; tale.txt
==&gt; passed

Test 2: count calls to methods in Deque and RandomizedQueue
  * java Permutation 5 &lt; distinct.txt
  * java Permutation 10 &lt; permutation10.txt
  * java Permutation 1 &lt; mediumTale.txt
  * java Permutation 20 &lt; tale.txt
  * java Permutation 100 &lt; tale.txt
  * java Permutation 16412 &lt; tale.txt
==&gt; passed

Test 3: count calls to methods in StdRandom
  * java Permutation 5 &lt; distinct.txt
  * java Permutation 10 &lt; permutation10.txt
  * java Permutation 1 &lt; mediumTale.txt
  * java Permutation 20 &lt; tale.txt
  * java Permutation 100 &lt; tale.txt
  * java Permutation 16412 &lt; tale.txt
==&gt; passed

Test 4: Time main() with k = 5, for inputs containing n random strings

                    n  seconds
------------------------------
=&gt; passed        1000     0.00
=&gt; passed        2000     0.00
=&gt; passed        4000     0.00
=&gt; passed        8000     0.00
=&gt; passed       16000     0.01
=&gt; passed       32000     0.01
=&gt; passed       64000     0.02
=&gt; passed      128000     0.04
=&gt; passed      256000     0.08
=&gt; passed      512000     0.15
==&gt; 10/10 tests passed


Test 5: Time main() with k = 1000, for inputs containing n random strings

                    n  seconds
------------------------------
=&gt; passed        1000     0.00
=&gt; passed        2000     0.00
=&gt; passed        4000     0.00
=&gt; passed        8000     0.00
=&gt; passed       16000     0.01
=&gt; passed       32000     0.01
=&gt; passed       64000     0.02
=&gt; passed      128000     0.04
=&gt; passed      256000     0.07
=&gt; passed      512000     0.15
==&gt; 10/10 tests passed


Total: 23/23 tests passed!


================================================================



********************************************************************************
*  MEMORY
********************************************************************************

Analyzing memory of Permutation
*-----------------------------------------------------------
Running 2 total tests.

Test 1: check that only one Deque or RandomizedQueue object is created
  * filename = distinct.txt, n = 9, k = 1
  * filename = distinct.txt, n = 9, k = 2
  * filename = distinct.txt, n = 9, k = 4
  * filename = tinyTale.txt, n = 12, k = 10
  * filename = tale.txt, n = 138653, k = 50
==&gt; passed

Test 2: check that the maximum size of any Deque or RandomizedQueue object
        created is between k and n
  * filename = distinct.txt, n = 9, k = 1
  * filename = distinct.txt, n = 9, k = 2
  * filename = distinct.txt, n = 9, k = 4
  * filename = tinyTale.txt, n = 12, k = 10
  * filename = tale.txt, n = 138653, k = 5
  * filename = tale.txt, n = 138653, k = 50
  * filename = tale.txt, n = 138653, k = 500
  * filename = tale.txt, n = 138653, k = 5000
  * filename = tale.txt, n = 138653, k = 50000
==&gt; passed

Test 3 (bonus): check that maximum size of any or Deque or RandomizedQueue object
                created is equal to k
  * filename = tale.txt, n = 138653, k = 5
    - max size of RandomizedQueue object = 138653

  * filename = tale.txt, n = 138653, k = 50
    - max size of RandomizedQueue object = 138653

  * filename = tale.txt, n = 138653, k = 500
    - max size of RandomizedQueue object = 138653

  * filename = tale.txt, n = 138653, k = 5000
    - max size of RandomizedQueue object = 138653

  * filename = tale.txt, n = 138653, k = 50000
    - max size of RandomizedQueue object = 138653

==&gt; <font color="#990000"><b>FAILED</b></font>

Total: 2/2 tests passed!


================================================================



********************************************************************************
*  MEMORY
********************************************************************************

Analyzing memory of Deque
*-----------------------------------------------------------
For tests 1-4, the maximum amount of memory allowed for a Deque
containing n items is 48n + 192.

Running 49 total tests.

Test 1a-1i: total memory usage after inserting n items,
            where n is a power of 2

                 n        bytes
----------------------------------------------------------
=&gt; passed       32         1400         
=&gt; passed       64         2680         
=&gt; passed      128         5240         
=&gt; passed      256        10360         
=&gt; passed      512        20600         
=&gt; passed     1024        41080         
=&gt; passed     2048        82040         
=&gt; passed     4096       163960         
=&gt; passed     8192       327800         
==&gt; 9/9 tests passed

Memory: 40.00 n + 120.00   (R^2 = 1.000)


Test 2a-2i: Total memory usage after inserting n items,
            when n is one more than a power of 2.

                 n        bytes
----------------------------------------------------------
=&gt; passed       33         1440         
=&gt; passed       65         2720         
=&gt; passed      129         5280         
=&gt; passed      257        10400         
=&gt; passed      513        20640         
=&gt; passed     1025        41120         
=&gt; passed     2049        82080         
=&gt; passed     4097       164000         
=&gt; passed     8193       327840         
==&gt; 9/9 tests passed

Memory: 40.00 n + 120.00   (R^2 = 1.000)


Test 3a-3i: Total memory usage after inserting 2n-1 items, and then
            deleting n-1 items, when n is one more than a power of 2.

                 n        bytes
----------------------------------------------------------
=&gt; passed       33         1440         
=&gt; passed       65         2720         
=&gt; passed      129         5280         
=&gt; passed      257        10400         
=&gt; passed      513        20640         
=&gt; passed     1025        41120         
=&gt; passed     2049        82080         
=&gt; passed     4097       164000         
=&gt; passed     8193       327840         
==&gt; 9/9 tests passed

Memory: 40.00 n + 120.00   (R^2 = 1.000)


Test 4a-4e: Total memory usage after inserting n items,
            and then deleting all but one item
            (should not grow with n or be too large of a constant).

                 n        bytes
----------------------------------------------------------
=&gt; passed       32          160         
=&gt; passed       64          160         
=&gt; passed      128          160         
=&gt; passed      256          160         
=&gt; passed      512          160         
=&gt; passed     1024          160         
=&gt; passed     2048          160         
=&gt; passed     4096          160         
=&gt; passed     8192          160         
==&gt; 9/9 tests passed

Memory: 160.00   (R^2 = 1.000)


Test 5a-5e: Total memory usage of iterator after inserting n items
            (should not grow with n or be too large of a constant).

                 n        bytes
----------------------------------------------------------
=&gt; passed       32           40         
=&gt; passed       64           40         
=&gt; passed      128           40         
=&gt; passed      256           40         
=&gt; passed      512           40         
=&gt; passed     1024           40         
=&gt; passed     2048           40         
=&gt; passed     4096           40         
=&gt; passed     8192           40         
==&gt; 9/9 tests passed

Memory: 40.00   (R^2 = 1.000)


Test 6a: Insert n strings; delete them one at a time, checking for
         loitering after each deletion. The probabilities of addFirst()
         and addLast() are (p1, p2), respectively. The probabilities of
         removeFirst() and removeLast() are (q1, q2), respectively.
  * 100 random insertions (1.0, 0.0) and 100 random deletions (1.0, 0.0)
  * 100 random insertions (1.0, 0.0) and 100 random deletions (0.0, 1.0)
  * 100 random insertions (0.0, 1.0) and 100 random deletions (1.0, 0.0)
  * 100 random insertions (0.0, 1.0) and 100 random deletions (0.0, 1.0)
  * 100 random insertions (0.5, 0.5) and 100 random deletions (0.5, 0.5)
==&gt; passed

Test 6b: Perform random operations, checking for loitering after
         each operation. The probabilities of addFirst(), addLast(),
         removeFirst(), and removeLast() are (p1, p2, p3, p4),
         respectively.
  * 100 random operations (0.8, 0.0, 0.2, 0.0)
  * 100 random operations (0.8, 0.0, 0.0, 0.2)
  * 100 random operations (0.0, 0.8, 0.2, 0.0)
  * 100 random operations (0.0, 0.8, 0.0, 0.2)
  * 100 random operations (0.4, 0.4, 0.1, 0.1)
  * 100 random operations (0.2, 0.2, 0.3, 0.3)
==&gt; passed

Test 7: Perform m random add/remove operations in the deque and check
        that only constant memory is allocated/deallocated per operation
  * m = 128
  * m = 256
  * m = 512
==&gt; passed

Test 8: Insert m items into deque; then iterate over deque and check
        that only constant memory is allocated/deallocated per operation
  * m = 64
  * m = 128
  * m = 256
==&gt; passed


Min observed memory for Deque: 40.00 n + 120.00   (R^2 = 1.000)
Max observed memory for Deque: 40.00 n + 120.00   (R^2 = 1.000)

Total: 49/49 tests passed!


================================================================



Analyzing memory of RandomizedQueue
*-----------------------------------------------------------
For Tests 1-5, the maximum amount of memory allowed for
a RandomizedQueue containing n items is 48n + 192.

For Test 6, the maximum amount of memory allowed for
a RandomizedQueue iterator over n items is 8n + 72.

Test 1a-1i: Total memory usage after inserting n items
            when n is a power of 2.

                 n        bytes
----------------------------------------------------------
=&gt; passed       32          312         
=&gt; passed       64          568         
=&gt; passed      128         1080         
=&gt; passed      256         2104         
=&gt; passed      512         4152         
=&gt; passed     1024         8248         
=&gt; passed     2048        16440         
=&gt; passed     4096        32824         
=&gt; passed     8192        65592         
==&gt; 9/9 tests passed

Memory: 8.00 n + 56.00   (R^2 = 1.000)


Test 2a-2i: Total memory usage after inserting n items,
            when n is one more than a power of 2.

                 n        bytes
----------------------------------------------------------
=&gt; passed       33          568         
=&gt; passed       65         1080         
=&gt; passed      129         2104         
=&gt; passed      257         4152         
=&gt; passed      513         8248         
=&gt; passed     1025        16440         
=&gt; passed     2049        32824         
=&gt; passed     4097        65592         
=&gt; passed     8193       131128         
==&gt; 9/9 tests passed

Memory: 16.00 n + 40.00   (R^2 = 1.000)


Test 3a-3i: Total memory usage after inserting 2n-1 items, and then
            deleting n-1 items, when n is one more than a power of 2.

                 n        bytes
----------------------------------------------------------
=&gt; passed       33         1080         
=&gt; passed       65         2104         
=&gt; passed      129         4152         
=&gt; passed      257         8248         
=&gt; passed      513        16440         
=&gt; passed     1025        32824         
=&gt; passed     2049        65592         
=&gt; passed     4097       131128         
=&gt; passed     8193       262200         
==&gt; 9/9 tests passed

Memory: 32.00 n + 24.00   (R^2 = 1.000)


Test 4a-4i: Total memory usage after inserting n items, deleting n items,
            then inserting n times, when n is a power of 2.

                 n        bytes
----------------------------------------------------------
=&gt; passed       32          312         
=&gt; passed       64          568         
=&gt; passed      128         1080         
=&gt; passed      256         2104         
=&gt; passed      512         4152         
=&gt; passed     1024         8248         
=&gt; passed     2048        16440         
=&gt; passed     4096        32824         
=&gt; passed     8192        65592         
==&gt; 9/9 tests passed

Memory: 8.00 n + 56.00   (R^2 = 1.000)


Test 5a-5i: Total memory usage after inserting n items,
            and then deleting all but one item.

                 n        bytes
----------------------------------------------------------
=&gt; <font color="#990000"><b>FAILED</b></font>       32          312   (1.3x)
=&gt; <font color="#990000"><b>FAILED</b></font>       64          568   (2.4x)
=&gt; <font color="#990000"><b>FAILED</b></font>      128         1080   (4.5x)
=&gt; <font color="#990000"><b>FAILED</b></font>      256         2104   (8.8x)
=&gt; <font color="#990000"><b>FAILED</b></font>      512         4152  (17.3x)
=&gt; <font color="#990000"><b>FAILED</b></font>     1024         8248  (34.4x)
=&gt; <font color="#990000"><b>FAILED</b></font>     2048        16440  (68.5x)
=&gt; <font color="#990000"><b>FAILED</b></font>     4096        32824 (136.8x)
=&gt; <font color="#990000"><b>FAILED</b></font>     8192        65592 (273.3x)
==&gt; 0/9 tests passed

Memory: 8.00 n + 56.00   (R^2 = 1.000)


Test 6a-6i: Total memory usage of iterator after inserting n items.

                 n        bytes
----------------------------------------------------------
=&gt; passed       32           40         
=&gt; passed       64           40         
=&gt; passed      128           40         
=&gt; passed      256           40         
=&gt; passed      512           40         
=&gt; passed     1024           40         
=&gt; passed     2048           40         
=&gt; passed     4096           40         
=&gt; passed     8192           40         
==&gt; 9/9 tests passed

Memory: 40.00   (R^2 = 1.000)


Test 7a: Insert 100 strings; delete them one at a time, checking
         for loitering after each deletion.
==&gt; passed

Test 7b: Perform random operations, checking for loitering after
         each operation. The probabilities of enqueue(), dequeue(),
         and sample() are (p1, p2, p3), respectively.
  * 200 random operations (0.8, 0.2, 0.0)
  * 200 random operations (0.2, 0.8, 0.0)
  * 200 random operations (0.6, 0.2, 0.2)
  * 200 random operations (0.2, 0.4, 0.4)
==&gt; passed

Test 8: Insert m items into queue; then iterate over deque and check
        that only constant memory is allocated/deallocated per operation
  * m = 64
  * m = 128
  * m = 256
==&gt; passed

Test 9: Total memory usage after inserting n items, seeking to identify
        values of n where memory usage is minimized as a function of n.

                 n        bytes
----------------------------------------------------------
=&gt; passed       32          312         
=&gt; passed       64          568         
=&gt; passed      128         1080         
=&gt; passed      256         2104         
=&gt; passed      512         4152         
=&gt; passed     1024         8248         
=&gt; passed     2048        16440         
==&gt; 7/7 tests passed

Memory: 8.00 n + 56.00   (R^2 = 1.000)


Test 10: Total memory usage after inserting 4096 items, then successively
         deleting items, seeking values of n where memory usage is maximized
         as a function of n

                 n        bytes
----------------------------------------------------------
=&gt; passed     3200        65592         
=&gt; passed     1600        65592         
=&gt; <font color="#990000"><b>FAILED</b></font>      800        65592   (1.7x)
=&gt; <font color="#990000"><b>FAILED</b></font>      400        65592   (3.4x)
=&gt; <font color="#990000"><b>FAILED</b></font>      200        65592   (6.7x)
=&gt; <font color="#990000"><b>FAILED</b></font>      100        65592  (13.1x)
=&gt; <font color="#990000"><b>FAILED</b></font>       50        65592  (25.3x)
==&gt; 2/7 tests passed

Memory: 65592.00   (R^2 = 1.000)


Min observed memory for RandomizedQueue: 65592.00   (R^2 = 1.000)
Max observed memory for RandomizedQueue: 32.00 n + 24.00   (R^2 = 1.000)

Running 71 total tests.

Total: 57/71 tests passed!


================================================================



********************************************************************************
*  TIMING
********************************************************************************

Timing Deque
*-----------------------------------------------------------
Running 103 total tests.

Test 1a-1k: make n calls to addFirst() followed by n calls to removeFirst()
                    n  seconds
----------------------------------
=&gt; passed        1024     0.00
=&gt; passed        2048     0.00
=&gt; passed        4096     0.00
=&gt; passed        8192     0.00
=&gt; passed       16384     0.00
=&gt; passed       32768     0.00
=&gt; passed       65536     0.00
=&gt; passed      128000     0.00
=&gt; passed      256000     0.00
=&gt; passed      512000     0.01
=&gt; passed     1024000     0.02
==&gt; 11/11 tests passed


Test 2a-2k: make n calls to addLast() followed by n calls to removeLast()
                    n  seconds
----------------------------------
=&gt; passed        1024     0.00
=&gt; passed        2048     0.00
=&gt; passed        4096     0.00
=&gt; passed        8192     0.00
=&gt; passed       16384     0.00
=&gt; passed       32768     0.00
=&gt; passed       65536     0.00
=&gt; passed      128000     0.00
=&gt; passed      256000     0.00
=&gt; passed      512000     0.01
=&gt; passed     1024000     0.02
==&gt; 11/11 tests passed


Test 3a-3k: make n calls to addFirst() followed by n calls to removeLast()
                    n  seconds
----------------------------------
=&gt; passed        1024     0.00
=&gt; passed        2048     0.00
=&gt; passed        4096     0.00
=&gt; passed        8192     0.00
=&gt; passed       16384     0.00
=&gt; passed       32768     0.00
=&gt; passed       65536     0.00
=&gt; passed      128000     0.00
=&gt; passed      256000     0.00
=&gt; passed      512000     0.01
=&gt; passed     1024000     0.02
==&gt; 11/11 tests passed


Test 4a-4k: make n calls to addLast() followed by n calls to removeFirst()
                    n  seconds
----------------------------------
=&gt; passed        1024     0.00
=&gt; passed        2048     0.00
=&gt; passed        4096     0.00
=&gt; passed        8192     0.00
=&gt; passed       16384     0.00
=&gt; passed       32768     0.00
=&gt; passed       65536     0.00
=&gt; passed      128000     0.00
=&gt; passed      256000     0.00
=&gt; passed      512000     0.01
=&gt; passed     1024000     0.02
==&gt; 11/11 tests passed


Test 5a-5g: make n random calls to addFirst(), removeFirst(), isEmpty(), and size()
            with probabilities (0.7, 0.1, 0.1, 0.1)

                    n  seconds
------------------------------
=&gt; passed        1024     0.00
=&gt; passed        2048     0.00
=&gt; passed        4096     0.00
=&gt; passed        8192     0.00
=&gt; passed       16384     0.00
=&gt; passed       32768     0.00
=&gt; passed       65536     0.00
=&gt; passed      128000     0.00
=&gt; passed      256000     0.01
=&gt; passed      512000     0.02
=&gt; passed     1024000     0.03
=&gt; passed     2048000     0.06
==&gt; 12/12 tests passed


Test 6a-6g: make n random calls to addLast(), removeLast(), isEmpty(), and size(),
            with probabilities (0.7, 0.1, 0.1, 0.1)

                    n  seconds
------------------------------
=&gt; passed        1024     0.00
=&gt; passed        2048     0.00
=&gt; passed        4096     0.00
=&gt; passed        8192     0.00
=&gt; passed       16384     0.00
=&gt; passed       32768     0.00
=&gt; passed       65536     0.00
=&gt; passed      128000     0.00
=&gt; passed      256000     0.01
=&gt; passed      512000     0.02
=&gt; passed     1024000     0.03
=&gt; passed     2048000     0.06
==&gt; 12/12 tests passed


Test 7a-7g: make n random calls to addFirst(), addLast(), removeFirst(), removeLast(),
            isEmpty(), and size() with probabilities (0.3, 0.3, 0.1, 0.1, 0.1, 0.1)

                    n  seconds
------------------------------
=&gt; passed        1024     0.00
=&gt; passed        2048     0.00
=&gt; passed        4096     0.00
=&gt; passed        8192     0.00
=&gt; passed       16384     0.00
=&gt; passed       32768     0.00
=&gt; passed       65536     0.00
=&gt; passed      128000     0.01
=&gt; passed      256000     0.01
=&gt; passed      512000     0.02
=&gt; passed     1024000     0.04
=&gt; passed     2048000     0.07
==&gt; 12/12 tests passed


Test 8a-8g: make n calls to addFirst(); iterate over the n items by calling
            next() and hasNext()

                    n  seconds
------------------------------
=&gt; passed        1024     0.00
=&gt; passed        2048     0.00
=&gt; passed        4096     0.00
=&gt; passed        8192     0.00
=&gt; passed       16384     0.00
=&gt; passed       32768     0.00
=&gt; passed       65536     0.00
=&gt; passed      128000     0.00
=&gt; passed      256000     0.01
=&gt; passed      512000     0.01
=&gt; passed     1024000     0.02
=&gt; passed     2048000     0.03
==&gt; 12/12 tests passed


Test 9a-9k: make n calls to addFirst()/addLast(); interleave n calls each to
            removeFirst(), removeLast(), addFirst(), and addLast()

                    n  seconds
----------------------------------
=&gt; passed        1025     0.00
=&gt; passed        2049     0.00
=&gt; passed        4097     0.00
=&gt; passed        8193     0.00
=&gt; passed       16385     0.00
=&gt; passed       32769     0.00
=&gt; passed       65537     0.00
=&gt; passed      128001     0.01
=&gt; passed      256001     0.01
=&gt; passed      512001     0.03
=&gt; passed     1024001     0.05
==&gt; 11/11 tests passed

Total: 103/103 tests passed!


================================================================



Timing RandomizedQueue
*-----------------------------------------------------------
Running 67 total tests.

Test 1: make n calls to enqueue() followed by n calls to dequeue();
        count calls to StdRandom
  * n = 10
    - dequeue() should call StdRandom at most once
    - number of elementary StdRandom operations = 10
    - failed enqueueing item 1 of 10

  * n = 100
    - dequeue() should call StdRandom at most once
    - number of elementary StdRandom operations = 100
    - failed enqueueing item 1 of 100

  * n = 1000
    - dequeue() should call StdRandom at most once
    - number of elementary StdRandom operations = 1000
    - failed enqueueing item 1 of 1000

==&gt; <font color="#990000"><b>FAILED</b></font>

Test 2: make n calls to enqueue() follwed by n calls to sample();
        count calls to StdRandom
  * n = 10
    - sample() should call StdRandom at most once
    - number of elementary StdRandom operations = 10
    - failed sampling item 1 of 10

  * n = 100
    - sample() should call StdRandom at most once
    - number of elementary StdRandom operations = 100
    - failed sampling item 1 of 100

  * n = 1000
    - sample() should call StdRandom at most once
    - number of elementary StdRandom operations = 1000
    - failed sampling item 1 of 1000

==&gt; <font color="#990000"><b>FAILED</b></font>

Test 3: make n calls to enqueue() and iterate over the n items;
        count calls to StdRandom
  * n = 10
  * n = 100
  * n = 1000
==&gt; passed

Test 4a-k: make n calls to enqueue() followed by n calls to dequeue()

                    n  seconds
----------------------------------
=&gt; passed        1024     0.01
=&gt; passed        2048     0.04
=&gt; passed        4096     0.17
=&gt; passed        8192     0.68

    
        ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
        OperationCountLimitExceededException
        Number of calls to methods in StdRandom exceeds limit: 100000000
        ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

=&gt; <font color="#990000"><b>FAILED</b></font>       16384   [ Test did not complete due to an exception. ]

==&gt; 4/11 tests passed


Test 5a-k: make n calls to enqueue() followed by n random calls to
           enqueue(), sample(), dequeue(), isEmpty(), and size()
           with probabilities (0.2, 0.2, 0.2, 0.2, 0.2)

                    n  seconds
----------------------------------
=&gt; passed        1024     0.01
=&gt; passed        2048     0.03
=&gt; passed        4096     0.14
=&gt; passed        8192     0.54

    
        ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
        OperationCountLimitExceededException
        Number of calls to methods in StdRandom exceeds limit: 100000000
        ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

=&gt; <font color="#990000"><b>FAILED</b></font>       16384   [ Test did not complete due to an exception. ]

==&gt; 4/11 tests passed


Test 6a-k: make n calls to enqueue() followed by n random calls to
           enqueue(), sample(), dequeue(), isEmpty(), and size()
           with probabilities (0.6, 0.1, 0.1, 0.1, 0.1)

                    n  seconds
----------------------------------
=&gt; passed        1024     0.01
=&gt; passed        2048     0.02
=&gt; passed        4096     0.09
=&gt; passed        8192     0.41

    
        ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
        OperationCountLimitExceededException
        Number of calls to methods in StdRandom exceeds limit: 100000000
        ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

=&gt; <font color="#990000"><b>FAILED</b></font>       16384   [ Test did not complete due to an exception. ]

==&gt; 4/11 tests passed


Test 7a-k: make n calls to enqueue() followed by n random calls to
           enqueue(), sample(), dequeue(), isEmpty(), and size()
           with probabilities (0.1, 0.1, 0.6, 0.1, 0.1)

                    n  seconds
----------------------------------
=&gt; passed        1024     0.02
=&gt; passed        2048     0.07
=&gt; passed        4096     0.27
=&gt; <font color="#990000"><b>FAILED</b></font>        8192     1.10
   [ Most likely one of your operations is not constant time. ]

==&gt; 3/11 tests passed


Test 8a-k: make n calls to enqueue() followed by n calls each to
           next() and hasNext().

                    n  seconds
----------------------------------
=&gt; passed        1024     0.00
=&gt; passed        2048     0.00
=&gt; passed        4096     0.00
=&gt; passed        8192     0.00
=&gt; passed       16384     0.00
=&gt; passed       32768     0.00
=&gt; passed       65536     0.00
=&gt; passed      128000     0.01
=&gt; passed      256000     0.01
=&gt; passed      512000     0.02
=&gt; passed     1024000     0.05
==&gt; 11/11 tests passed


Test 9a-i: make 100 calls to enqueue; 99 calls to dequeue;
           n calls to enqueue(); then call dequeue() three times,
           followed by enqueue() three times, and repeat n times.

                    n  seconds
----------------------------------
=&gt; passed        1024     0.07
=&gt; passed        2048     0.27
=&gt; <font color="#990000"><b>FAILED</b></font>        4096     1.10
   [ Most likely one of your operations is not constant time. ]

==&gt; 2/9 tests passed


Total: 29/67 tests passed!


================================================================




</pre>


</body></html>
