# Version Control with Git

## Initialise git repository
- A new repo from scratch
1. *git init*
2. *git add*
3. *git commit*

- A new repo from an existing project
1. *git init*
2. *git add* to all of the relevant files
3. You’ll probably want to create a .gitignore file right away, to indicate all of the files you don’t want to track. 
   Use *git add .gitignore* , too.

- Connect it to github
1. Go to github
2. Log into your account
3. create the new repository 
4. Go into the directory and type: *git remote add origin git@github.com:username/new_repo*
5.  And then, *git push -u origin master*


## Create a new branch and check out
- create git branch and checkout
1. *git branch <branch_name>*
2. *git checkout <branch_name>*

- Create a Git branch and checkout in one command:
1. *git checkout -b <branch_name>*

-Read more: [git checkout/ git switch/ git reset](https://stackoverflow.com/questions/57265785/whats-the-difference-between-git-switch-and-git-checkout-branch)


## Stage and commit 
1. *git add*
2. *git commit -m "message""*
3. Read more: [stage-commit-files](https://www.nobledesktop.com/learn/git/stage-commit-files)


## Push the changes committed from local branch to remote branch
- *git push <remote> <local_branch>:<remote_name>*
- As an example, let’s say that you have created a local branch named “my-feature”. 
  However, you want to push your changes to the remote branch named “feature” on your repository.
   *git push origin my-feature:feature*

## Check the status of a repository
- *git status*

## Switch branches
- *git switch <existing_branch>*
- *git switch -c <non_existing_branch>*


## Git stash
- Use git stash when you want to record the current state of the working directory and the index, 
  but want to go back to a clean working directory. The command saves your local modifications away and reverts the 
  working directory to match the HEAD commit.
- *git stash name*

## Fetch commits from remote branches and merge them to the respective local branch (fetch + merge = pull)
- Git Fetch is the command that tells the local repository that there are changes available in the remote repository without 
  bringing the changes into the local repository. 
- To merge these changes into our local repository, we need to use the git merge origin/<branch name> command.
- Git Pull on the other hand brings the copy of the remote directory changes 
  into the local repository. Let us look at Git Fetch and Git Pull separately with the help of an example.
- Read more: [fetch + merge = pull](https://www.geeksforgeeks.org/git-difference-between-git-fetch-and-git-pull/)

## Interactive rebase to tidy up local Git history
- Read more: [Interactive Rebase](https://medium.com/@catalinaturlea/clean-git-history-a-step-by-step-guide-eefc0ad8696d)