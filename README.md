# PHGEE
REPO FOR CSC 131 PHGEE MED APP

Members:
1. Elizabeth Nguyen (DBA)
2. Eduardo Cordon
3. Hamzah Ramzan
4.
5.


# GIT TUTORIAL/STEPS



### 1. Create a GitHub account.

### 1.5 Download Git to access Git Bash shell/Or you can access Git Bash on your IDE.

### 2. Clone GitHub repository to local system.
> `git clone <URL_to_repository>`
> where:
> <URL_to_repository> = copied from GitHub.

-OR-

Depending on IDE, there's a clone repository option (Version control) already, just paste <URL_to_Repository>.

If using Windows Git Bash, make a new folder.  Then inside folder, right click and select 'Git Bash Here'.  A Bash window opens (command line shell) with Git running and with the active set to the directory that it was run from.

### 3. Update Local Repository with changes from GitHub Repository
> `git pull origin main`
> `git switch main`

### 4. Create a New Branch in your Local Repository and Make it the Active Branch
> `git branch <new_branch>`
> `git switch <new_branch>`
> where:
> <new_branch> = name of new branch being created (Ex: Elizabeth/AddGitSteps)

-OR-

> `git checkout -b <new_branch>`
> where:
> -b = flag to create a new branch named <new_branch> if one does not already exist.  If a branch named <new_branch> already exists, then moves to that branch.

-OR-

> `git switch -c <new_branch>`
> where:
> -c = flag to create a new branch named <new_branch>

### 5. Update/Edit Files in Local Branch
Once done with edits, save the files.

### 6. Add Changes to the Local Branch
> `git add -A`
> `git commit -m "<msg>"`
> where:
> -A = flag to add all changes.
> -m = flag to add a commit message.
> <msg> = Short message explaing commit.  Must be enclosed by double quotes.

-OR-

> `git commit -a -m "<msg>"`

### 7. Push Branch to GitHub Repository
> `git push -u origin <branch>`
> where:
> -u = flag as a remote tracking branch.
> <branch> = name of branch being pushed.

***If you end up having credential/access issues/error when pushing, let me know and I'll add you as a collaborator.***

### 8. Create A Pull Request From GitHub Repository

    1. Login to GitHub.
    2. Select Repository.
    3. Find Branch.
    4. Select Pull Request Option.

### 9.  Merge Pull Request.
I suggest after figuring everything out, future pull requests should be reviewed by Eduardo before merging since there's no restriction to merging and he's team lead.
