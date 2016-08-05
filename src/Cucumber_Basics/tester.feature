Feature:About testers
In order to get a highly paid job
As a tester
I want to learn Automation

Scenario Outline:Iam a Manual tester
Given Iam a "<testerType>" tester
|Location	|Position	|
|UK			|Contract	|
|India		|Permanent	|

When I apply for a job
Then I got a "<salaryType>" paid job
And Iam "<satisfactionType>" satisfied with my salary
But My parents are "<parentsView>" satisfied

Examples:
|testerType		|salaryType		|satisfactionType		|parentsView	|
|Manual			|Low			|Less					|Fairly			|
|Automation		|High			|High					|Highly			|
|Database		|Good			|Average				|Very			|
