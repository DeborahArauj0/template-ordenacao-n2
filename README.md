# Identificação

* Nome: Deborah dos Santos Araujo
* Email (@ccc): deborah.araujo@ccc.ufcg.edu.br
* Matrícula: 20250030337

# Roteiro: Ordenação $n^2$

## Material Teórico

[Selection Sort](https://joaoarthurbm.github.io/eda/posts/selection-sort/)

[Insertion Sort](https://joaoarthurbm.github.io/eda/posts/insertion-sort/)

## O template

> O código java estará (ou você terá que colocar) no diretório **/src/main/java/**

> Os testes estarão (ou você terá que incluir) no diretório **/src/main/java/** no formato de asserts.

> Seu código é tão bom quanto seus testes.

> Eu vou executar meus testes quando você submeter.

> Não mude nenhuma assinatura de método, nome de classe ou localização dos arquivos. Mas você pode/deve criar outros métodos e classes, desde que passem nos testes.

> Compilando: `javac *.java` em **/src/main/java/**

> Executando os testes: `java -ea InsertionSortAsserts` em **/src/main/java/**

## Introdução

Este roteiro envolve implementação e teoria dos principais algoritmos de ordenação $O(n^2)$.

Você vai ver que o design do código do template envolve a interface SortingStrategy e que ambos, InsertionSort e SelectionSort implementam essa interface. Isso vai facilitar a minha vida no futuro.

## A tarefa.

### Implementação e testes

**InsertionSort.** Comece pelo insertion. Mais precisamente, pelos dois métodos de inserção ordenada. Depois passe para o método de ordenação clássico (que pode ou não usar os métodos que você fez anteriormente) e a sua implementação recursiva. Seu objetivo é passar nos testes que disponibilizei.

**SelectionSort.** Nem sempre os testes serão entregues. Você deve ser capaz de fazer seus próprios testes. Para o selection, além de implementar os dois métodos que foram pedidos, você deverá criar também uma classe de teste no diretório `src/main/java/`. Inspire-se nos testes que criei para o insertion.

Ah...confira (sempre!) se você passa nos testes: `java -ea InsertionSortAsserts`. Execute de forma semelhante para os testes do selection sort que você criar.

### Teoria

Perguntas importantes:

* Qual o pior caso do insertion sort?

> Quando o elemento inserido está na ordem reversa do array ordernado. Por
> exemplo, para um array ordenado do menor para o maior e o novo elemento é
> inserido no final do array, ele precisará percorrer toda a lista para se
> alocar no início dela.O mesmo ocorre com um cenário contrário, para uma lista
> do maior para o menor e um maior elemento inserido no início

* Qual o pior caso do selection sort?

> Independente dele está ordenado ou não ele sempre faz muitas trocas

* Em termos de trocas, como você compararia o insertion sort e o selection sort?

> O insertion sort possui mais vantagens, ele faz menos trocas que o selection
> sort, ele compara mais elementos, mas substitui apenas quando o elemento
> comparado é menor ou maior. Por outro lado o selection não, ele sempre vai
> trocar todo elemento do array, embora já esteja ordenado.

* Em termos de comparações, como você compararia o insertion sort e o selection sort?

> O selection sort tem mais vantagem, ele não compara tantas vezes quanto o
> inserction sort. 

* Mostre com um exemplo concreto que o selection não é estável.

> considerando A e B como ordem de elementos, temos que um array [3a, 6a, 6b, 3b] é um caso claro que quebra a regra de estabilidade.  

> [3a, 6a, 6b, 3b] //3a está na posição correta, partindo para o próximo índice  

> [3a, 6a, 6b, 3b] //3b é o segundo menor elemento no array, trocamos com 6a    

> [3a, 3b, 6b, 6a] //array ordenado, mas não estável. A estábilidade foi  
preservada apenas para os dois primeiros elementos  
  


* O insertion é estável? Argumente com um exemplo concreto.  


> Sim, como as trocas são feitas sempre com vizinhos "empurrando" os elementos
> quando trocas são feitas, a estabilidade é preservada.

## Mais estudo

Implemente as seguintes questões no tst-eda:

* Insere Último
* Insere Primeiro
* InsertionSort Recursivo
* Selection sort passo a passo
* SelectionSort Recursivo
* Mariana e os livros

