# G2AC-RSW
Repositório de conteúdos relacionados a Residencia de Software

## Comandos que mais usaremos

Sintam-se a vontade para acrescentar coisas depois.. ou modificar o readme.md para treinar. 

```	
git clone
```	

> O **git clone** é usado sobretudo para apontar para um repositório existente e fazer um clone ou cópia deste repositório no novo diretório, em outro local.	

```	
git branch 	
```	

> Branches ("ramos") são utilizados para desenvolver funcionalidades isoladas umas das outras.Esse comando, ele lista todas as branches existentes. 	

> - git branch <nome_da_branch> : Cria uma branch com o nome escolhido	
> - git branch -d <nome_da_branch>: Deleta a branch com o nome escolhido. 	

``` 	
git checkout
```	

> O comando **git checkout** permite navegar entre branches criados pelo git branch. 
	

``` 	
git status 	
``` 	

> O comando **git status** exibe as condições do diretório. Ele permite que você veja quais alterações foram despreparadas, quais não foram e quais arquivos não estão sendo monitorados pelo Git. 	

```	
git add <arquivo> ou git add . 	
``` 	

> O comando **git add** adiciona uma alteração no diretório ativo à área de staging. Ele diz ao Git que você quer incluir atualizações a um arquivo particular na próxima confirmação. No entanto, git add não afeta realmente o repositório de nenhuma forma significativa—as alterações não são realmente gravadas até você executar git commit.	

```	
git commit -m "comentários das alterações"	
```	

> Já que o **git add** inclui as atualizações, mas não as confirma. O **git commit** serve para realmente confirmar as mudanças. Mas ainda envia-as para o repositório remoto.  	

```	
git push origin	
```	

> O comando **git push** é usado para enviar conteúdo do repositório local para um repositório remoto. "Push" é como os commits do repositório local são enviados a um repositório remoto. **O comando push tem o potencial de sobrescrever modificações e, assim, deve ser usado com cuidado. **	

```	
git pull 	
```	

> O comando **git pull** é usado para buscar e baixar conteúdo de um repositório remoto e atualizar na hora o repositório local para que tenha o mesmo conteúdo. 	