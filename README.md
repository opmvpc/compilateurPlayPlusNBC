# 1819_IHDCB332_COMPILATEUR_GROUPE12

# Créer une pull request (PR)

## Créer une branche

Le nom n'a pas beaucoup d'importance mais le mieux est d'essayer de trouver un mot implicite.
(si vous manquez d'inspiration, utilisez votre prénom)

```
$ git checkout -b [nomDeLaBranche]
``` 

cette commande crée la nouvelle branche et vous dirige vers celle-ci.

Pour revenir sur master:

```
$ git checkout master
``` 

## Enregistrer les modifs

```
$ git add -A
``` 

```
$ git commit -m "[description du commit]"
``` 

```
$ git push origin [nomDeLaBranche]
``` 

git est assez sympa, il propose un lien dans l'output de l derniere commande :

```
opmvpc@opmvpc-Aspire-4830TG:~/repos/1819_IHDCB332_COMPILATEUR_GROUPE12$ git push origin testpr
Username for 'https://github.com': thibsix@outlook.be
Password for 'https://thibsix@outlook.be@github.com':
Counting objects: 12, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (7/7), done.
Writing objects: 100% (12/12), 1.65 KiB | 843.00 KiB/s, done.
Total 12 (delta 2), reused 0 (delta 0)
remote: Resolving deltas: 100% (2/2), completed with 2 local objects.
remote:
remote: Create a pull request for 'testpr' on GitHub by visiting:
remote:      https://github.com/UNamurCSFaculty/1819_IHDCB332_COMPILATEUR_GROUPE12/pull/new/testpr
remote:
To https://github.com/UNamurCSFaculty/1819_IHDCB332_COMPILATEUR_GROUPE12.git
 * [new branch]      testpr -> testpr
 ```
 
 ## Créer la pr
 
 Allez sur github, dans la page "pull requests", il vous proposera directement de générer une pr sur base de votre dernier commit.
 Il ne restera plus qu'à l'accepter pour merge les modifs dans master!
 
 (j'utilise git en ligne de commande, ca doit pas être très différent avec intellij)