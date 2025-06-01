Opis programu:
Program realizuje uproszczoną wersję nieograniczonego problemu plecakowego. Pozwala na wygenerowanie zestawu przedmiotów o losowych wartościach i wagach, a następnie wybiera te, które maksymalizują łączną wartość, mieszcząc się w zadanej pojemności plecaka. Program realizuje zadanie na ocenę 4.0.

Opis działania:
Program działa w trybie konsolowym. Użytkownik może ustawić następujące parametry:
liczbę przedmiotów n
pojemność plecaka
ziarno losowości (seed) do wygenerowania danych
Dane są następnie analizowane, a wynik prezentowany w formie listy indeksów zapakowanych przedmiotów, ich łącznej wagi i łącznej wartości.

Opis klas:

Item – klasa reprezentująca pojedynczy przedmiot:
value – wartość przedmiotu
weight – waga przedmiotu
index – oryginalny indeks przedmiotu (do identyfikacji)
CompareTo(Item) – metoda porównująca przedmioty na podstawie stosunku wartości do wagi
przeciążone operatory < i > – umożliwiają sortowanie
ToString() – zwraca czytelną reprezentację przedmiotu

Problem – klasa zarządzająca listą przedmiotów i rozwiązywaniem problemu:
Problem(int n, int seed) – konstruktor generujący n przedmiotów z losowymi danymi
Solve(int capacity) – metoda rozwiązująca problem plecakowy przy danej pojemności
ToString() – zwraca listę wszystkich wygenerowanych przedmiotów

Result – klasa przechowująca wynik działania algorytmu:
items – lista indeksów zapakowanych przedmiotów
total_weight – łączna waga spakowanych przedmiotów
total_value – łączna wartość spakowanych przedmiotów
ToString() – zwraca wynik w formacie tekstowym



Algorytm:
Algorytm oparty jest na metodzie zachłannej (ang. greedy), która:
1. Sortuje przedmioty malejąco według stosunku wartości do wagi.
2. Dodaje do plecaka kolejne wystąpienia najlepszego przedmiotu, o ile ich waga nie przekracza dostępnej pojemności.
3. W przypadku braku miejsca, kończy działanie.
4. Ponieważ to problem nieograniczony, ten sam przedmiot może zostać dodany wielokrotnie.
Przykładowy wynik działania programu:

no.: 0  v: 9 w: 3 [3000]
no.: 1  v: 1 w: 8 [125]
no.: 2  v: 10 w: 1 [10000]
no.: 3  v: 7 w: 10 [700]
no.: 4  v: 8 w: 9 [888]
no.: 5  v: 5 w: 7 [714]
no.: 6  v: 5 w: 5 [1000]
no.: 7  v: 5 w: 7 [714]
no.: 8  v: 8 w: 10 [800]
no.: 9  v: 1 w: 2 [500]

result: 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, [w,v]=[20, 200]

gdzie [w,v] oznacza, że liczby z prawej to kolejno łączna waga przedmiotów w plecaku oraz ich wartość.
