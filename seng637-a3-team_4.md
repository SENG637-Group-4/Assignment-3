**SENG 637 - Dependability and Reliability of Software Systems**

**Lab. Report #3 – Code Coverage, Adequacy Criteria and Test Case Correlation**

| Group 4      |
|-----------------|
| Zohara Kamal            |   
| Thanoshan Vijayanandan          |   
| Minh Le                |   
| Shuvam Agarwala              | 

# Table of Contents


# 1 Introduction

This assignment focuses on improving test coverage (white-box coverage criteria) two different classes: `org.jfree.data.Range` and `org.jfree.data.DataUtilities`, using testing tools such as EclEmma, CodeCover, and JaCoCo.

# 2 Manual data-flow coverage calculations for X and Y methods

Text…

# 3 A detailed description of the testing strategy for the new unit test

To create additional unit tests, we followed a systematic approach.

First, we executed the test cases from the test classes developed in Assignment 2 to obtain the initial coverage metrics. Since EclEmma is integrated into Eclipse, we ran the tests using the "Coverage As -> JUnit Test" option to measure the coverage. We then recorded the line, branch, and method coverage metrics for each test class.

For methods that did not satisfy the required coverage thresholds, we carefully inspected the corresponding source code. EclEmma visually highlighted the sections and branches that were not executed by the existing tests. Using this information, we designed additional test cases with appropriate inputs to exercise those uncovered execution paths.

After adding each new test case, we reran the coverage analysis to observe whether the coverage metrics improved. This iterative process continued until satisfactory coverage was achieved. The same procedure was repeated for all relevant methods to ensure that the coverage requirements were met.

# 4 A high level description of five selected test cases you have designed using coverage information, and how they have increased code coverage

Text…

# 5 A detailed report of the coverage achieved of each class and method (a screen shot from the code cover results in green and red color would suffice)

Text…

# 6 Pros and Cons of coverage tools used and Metrics you report

We tried to install Coverlipse Eclipse plugin. They recommended update mechanism to get Coverlipse in Eclispe - [webpage](https://coverlipse.sourceforge.net/download.php.html). We followed their instructions step-by-step. However, we got an error message "Could not find https://coverlipse.sf.net/update/".

Coverlipse
![Coverlipse error message](images/coverlipse-error-1.png)

# 7 A comparison on the advantages and disadvantages of requirements-based test generation and coverage-based test generation.

Text…

# 8 A discussion on how the team work/effort was divided and managed

Text…

# 9 Any difficulties encountered, challenges overcome, and lessons learned from performing the lab

Text…

# 10 Comments/feedback on the lab itself

Text…
