# cs100f2018-lab5-starter

Designed for use with [GitHub Classroom](https://classroom.github.com/), this
repository contains the solution for Laboratory 5 in Computer Science 100.
 Since the Travis builds for this repository will initially fail (as evidenced by
 a red &#x2717; appearing in the commit logs instead of a green &#x2714;), the
 programmer is responsible for completing all of the steps needed to satisfy the
 requirements for the assignment, thus causing a &#x2714; to instead appear in
 the commit logs.


## Introduction

This assignment requires a team of programmers to implement and test a Java program,
called `ManipulateDna`, that will produce textual output demonstrating the
manipulation of a DNA string. First, the program will display the name of the
programmer and the date at which the program was run. Then, it will display the
input DNA string read in from the text file and, finally, produce output that meets the requirements
outlined later in the assignment. As verified by
[Checkstyle](https://github.com/checkstyle/checkstyle), the source code for the
`ManipulateDna.java` file must adhere to all of the requirements in the [Google
Java Style Guide](https://google.github.io/styleguide/javaguide.html).

The team of developers is also responsible for writing a three-paragraph reflection,
stored in the file `writing/reflection.md`, that explains the challenges that
you faced and the solutions you developed and your strategy for manipulating the
DNA string and a general team-working strategy.
This is a Markdown file that must adhere to the standards described
in the [Markdown Syntax
Guide](https://guides.github.com/features/mastering-markdown/). Remember, you
can preview the contents of a comitted Markdown file by clicking on the name of
the file in your GitHub repository.

The source code in the `ManipulateDna.java` file must also pass additional tests
set by the [GatorGrader tool](https://github.com/GatorEducator/gatorgrader). As
before, GatorGrader will check to ensure `ManipulateDna` uses the `new Date()`
construct in the Java code. Moreover, GatorGrader will check the following
characteristics of your implementation:

* The `ManipulateDna` program must:
  * Contain at least 8 single-line comments and 2 multi-line comments
  * Include at least 8 `println` statements
  * Perform and display manipulations of the DNA string as outlined in the
    assignment sheet

When you use the `git commit` command to transfer your source code to your
GitHub repository, [Travis CI](https://travis-ci.com/) will initialize a build
of your assignment, checking to see if it meets all of the requirements. If both
your source code and writing meet the established requirements, then you
will see a green &#x2714; in the listing of commits in GitHub. If your
submission does not meet the requirements, a red &#x2717; will appear instead.
The instructor will reduce a programmer's grade for this assignment if the red
&#x2717; appears on the last commit in GitHub immediately before the
assignment's due date.

A carefully formatted assignment sheet for this project provides more details
about the steps that a computer scientist should take to complete this
assignment. You can view this assignment sheet by visiting the listing of
laboratories on the course web site.

## Learning

If you have not done so already, please read all of the relevant [GitHub
Guides](https://guides.github.com/) that explain how to use many of the features
that GitHub provides. In particular, please make sure that you have read the
following GitHub guides: [Mastering
Markdown](https://guides.github.com/features/mastering-markdown/), [Hello
World](https://guides.github.com/activities/hello-world/), and [Documenting Your
Projects on GitHub](https://guides.github.com/features/wikis/). Each of these
guides will help you to understand how to use both [GitHub](http://github.com) and
[GitHub Classroom](https://classroom.github.com/).

To do well on this assignment, you should also review Chapters 1 and 2 and study
Sections 3.1 through 3.5. Please see the course instructor or one of the
teaching assistants or tutors if you have questions about any of these reading
assignments.

## System Commands

This project invites students to enter system commands into a terminal window.
This assignment uses [Docker](https://www.docker.com) to deliver programs, such
as `gradle` and the source code and packages needed to run
[GatorGrader](https://github.com/GatorEducator/gatorgrader), to a students'
computer, thereby eliminating the need for a programmer to install them on their
development workstation. Individuals who do not want or can not install Docker can
optionally install of the programs mentioned in the [Project
Requirements](#requirements) section of this document. Once all the required
programs are installed locally on a machine, a software developer can type the
various `gradle` commands directly in the terminal.

### Using Docker

Once you have installed [Docker
Desktop](https://www.docker.com/products/docker-desktop), you can use the
following `docker run` command to start `gradle grade` as a containerized
application, using the [DockaGator](https://github.com/GatorEducator/dockagator)
Docker image available on
[DockerHub](https://cloud.docker.com/u/gatoreducator/repository/docker/gatoreducator/dockagator).

```bash
docker run --rm --name dockagator \
  -v "$(pwd)":/project \
  -v "$HOME/.dockagator":/root/.local/share \
  gatoreducator/dockagator
```

The aforementioned command will use `"$(pwd)"` (i.e., the current directory) as
the project directory and `"$HOME/.dockagator"` as the cached GatorGrader
directory. Please note that both of these directories must exist, although only
the project directory must contain something. Generally, the project directory
should contain the source code and technical writing of this assignment, as
provided to a student through GitHub. Additionally, the cache directory should
not contain anything other than directories and programs created by DockaGator,
thus ensuring that they are not otherwise overwritten during the completion of
the assignment. To ensure that the previous command will work correctly, you
should create the cache directory by running the command `mkdir
$HOME/.dockagator`. If the above `docker run` command does not work correctly on
the Windows operating system, you may need to instead run the following command
to work around limitations in the terminal window:

```bash
docker run --rm --name dockagator \
  -v "$(pwd):/project" \
  -v "$HOME/.dockagator:/root/.local/share" \
  gatoreducator/dockagator
```

Since the above `docker run` command uses a Docker images that, by default, runs
`gradle grade` and then exits the Docker container, you may want to instead run
the following command so that you enter an "interactive terminal" that will
allow you to repeatedly run commands within the Docker container.

```bash
docker run -it --rm --name dockagator \
  -v "$(pwd)":/project \
  -v "$HOME/.dockagator":/root/.local/share \
  gatoreducator/dockagator /bin/bash
```

Once you have typed this command, you can use the [GatorGrader
tool](https://github.com/GatorEducator/gatorgrader) in the Docker container by
typing the command `gradle grade` in your terminal. Running this command will
produce a lot of output that you should carefully inspect. If GatorGrader's
output shows that there are no mistakes in the assignment, then your source code
and writing are passing all of the automated baseline checks. However, if the
output indicates that there are mistakes, then you will need to understand what
they are and then try to fix them.

Here are some additional commands that you may need to run when using Docker:

* `docker info`: display information about how Docker runs on your workstation
* `docker images`: show the Docker images installed on your workstation
* `docker container list`: list the active images running on your workstation
* `docker system prune`: remove many types of "dangling" components from your workstation
* `docker image prune`: remove all "dangling" docker images from your workstation
* `docker container prune`: remove all stopped docker containers from your workstation
* `docker rmi $(docker images -q) --force`: remove all docker images from your workstation

### Using Gradle

You can complete several important Java programming tasks by using the
`gradle` tool. For instance, you can compile (i.e., create bytecode from the
program's source code if it is correct) the program using the command `gradle
build`. Running the command `gradle -q --console plain run` will suppress the display of
Gradle's diagnostic information and only produce output of the program.
Here are some other commands that you can type:

* `gradle grade`: run the [GatorGrader](https://github.com/GatorEducator/gatorgrader) tool to check your work
* `gradle clean`: clean the project of all the derived files
* `gradle check`: check the quality of the code using Checkstyle
* `gradle build`: create the bytecode from the Java source code
* `gradle run`: run the Java program in the command-line
* `gradle tasks`: display details about the Gradle system

To run one of these commands, you must be in the main (i.e., "home base")
directory for this assignment where the `build.gradle` file is located.

## Expected Program Output

Due to the inherent randomness in this program's output, typing the command
`gradle run` in the terminal window produces textual output that will differ
from the instructor's version of `ManipulateDna` shown below. Your program must adhere to
all of the requirements for the assignment and pass all of the verification
checks, producing textual output that follows the pattern that is given on the
assignment sheet. In particular, please remember that the purpose of the
`ManipulateDna` program is to effectively manipulate an input DNA string &mdash;
make sure that your program displays the input string, the complement of the
input string, and the result of an insertion, deletion, and position mutation in
the input string.

```
> Task :run
Janyl Jumadinova Wed Oct 02 22:43:11 EDT 2019
Okay, I am going to manipulate the DNA string "AAGTCTGGGCCTTAATCCAGATCAGGA".

Display the complement
Complement AAGTCTGGGCCTTAATCCAGATCAGGA
Display the insertion
Insertion: AAAGTCTGGGCCTTAATCCAGATCAGGA
Display the deletion
Deletion: AAGTCTGGGCCTTAATCCAGATCAGA
Display the random mutation
Change: AACTCTCCCCCTTAATCCACATCACCA

Thanks for using the ManipulateDna program.
Have an awesome day.
```

## Using Travis CI

This assignment uses [Travis CI](https://travis-ci.com/) to automatically run
[GatorGrader](https://github.com/GatorEducator/gatorgrader) and additional
checking programs every time you commit to your GitHub repository. The checking
will start as soon as you have accepted the assignment &mdash; thus creating your own
private repository &mdash; and the course instructor and/or GitHub enables Travis for
it. If you are using Travis for the first time, you will need to authorize
Travis CI to access the private repositories that you created on GitHub. If you
do not see either a yellow &#9679; or a green &#x2714; or a red &#x2717; in your
listing of commits, then please ask the instructor to see whether or not
Travis CI was correctly enabled.

## System Requirements

We developed this assignment to work with the following software and versions:

- Docker Desktop
- Operating Systems
  - Linux
  - MacOS
  - Windows 10 Pro
  - Windows 10 Enterprise
- Programming Language Tools
  - Gradle 5.4
  - OpenJDK 11.0.4
  - Python 3.6 or 3.7


## Reporting Problems

If you have found a problem with this assignment's provided source code or
documentation, then you can go to the [Java Assignment Starter
100-01](https://github.com/allegheny-computer-science-100-01-f2019/lab05-starter)
repository and [raise an
issue](https://github.com/allegheny-computer-science-100-01-f2019/lab05-starter/issues).
If you have found a problem with the [GatorGrader
tool](https://github.com/GatorEducator/gatorgrader) and the way that it checks
your assignment, then you can also [raise an
issue](https://github.com/GatorEducator/gatorgrader/issues) in that repository.
To ensure that your issue is properly resolved, please provide as many details
as is possible about the problem that you experienced. If you discover a problem
with the assignment sheet for this project, then please raise an issue in the
GitHub repository that provides the assignment sheets for your course.

Whenever possible, individuals who find, and use the appropriate GitHub issue
tracker to correctly document, a mistake in any aspect of this assignment will
receive free [GitHub stickers](https://octodex.github.com/) and extra credit
towards their grade for the project.

## Receiving Assistance

If you are having trouble completing any part of this project, then please talk
with either the course instructor or a technical leader during the
course session. Alternatively, you may ask questions in the Slack workspace for
this course. Finally, you can schedule a meeting during the course instructor's
office hours.

## Project Assessment

The grade that a student receives through Sakai on this assignment will have the following components:

- **Percentage of Correct GatorGrader Checks [up to 75%]**: Students are encouraged to
  repeatedly try to implement a Java program that passes all of GatorGrader's
  checks by, for instance, creating a program that produces the correct output.
  Students should also repeatedly revise their technical writing to ensure that
  it also passes all of GatorGrader's checks about, for instance, the length of
  its content and its appropriate use of Markdown.

- **Travis CI Build Status [5%]**: Since additional checks on the source code and/or
  technical writing may be encoded in Travis CI's actions and, moreover, all of
  the GatorGrader checks are also run in Travis CI, a portion of the students' lab grade
  depends on whether their last before-the-deadline build passes and a green
  &#x2714; appears in their GitHub commit log instead of a red &#x2717;. As with
  the previous grading component, students are encouraged to repeatedly revise
  their source code and technical writing in an attempt to get their Travis CI
  build to pass.

- **Mastery of Technical Writing [up to 10%]**: Students will also receive this portion of the lab grade
  when the responses to the technical writing questions presented in the
  `writing/reflection.md` reveal a mastery of both writing skills and technical
  knowledge. To receive this portion of the grade, the submitted writing should have
  correct spelling, grammar, and punctuation in addition to following the rules
  of Markdown and providing technically accurate answers. Students are
  encouraged to ask the course instructor or a student technical leader to use
  the GitHub issue tracker to provide feedback on their mastery of technical
  writing skills.

- **Mastery of Technical Knowledge and Skills [up to 10%]**: Students will receive
  a portion of their assignment grade when their GitHub repository
  reveals that they have  mastered all of the technical
  knowledge and skills developed during the
  completion of this project. As a part of this grade, the instructor will
  assess aspects of the project including, but not limited to, the use of
  effective source code comments and Git commit messages. Students are
  encouraged to ask the course instructor or a student technical leader to use
  the GitHub issue tracker to provide feedback on how well their work
  demonstrates mastery of the assignment's technical knowledge and skills.
