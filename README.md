# Разные алгоритмы в Java / Java_Algorithm
___Это проект реализации различных алгоритмов:___
1. Поиск минимального значения в массиве / Minimum_value_in_array 
2. Сортировка пузырьком / Bubble_sort 
3. Алгоритм поиска в папках всех картинок / File_Search 
4. Сортировка массива выбором / Sorting_by_choice [^4]
5. Быстрая сортировка / Quick_Sort [^5]
6. Сортировка слиянием / Merge_Sort [^6]
7. 




[^4]: Sorting_by_choice - использует в себе поиск минимального элемента в массиве и ставит его в начало. На каждом шаге область отсортированных элементов увеличивается (step сдвигается).
[^5]: Quick_Sort - основная логика заключается в том, что выбирается опорный элемент, те которые меньше него идут влево, те которые больше идут вправо. После выбирается опорные элементы у этих массивов и так далее, до того момента пока эти подмассивы не превратятся в отдельные элементы. (Алгоритм быстрой сортировки неплохо работает с кэшом на современных процессорах) (На каждой итерации всё уменьшается. Так как подмассивы сортируются независимо друг от друга. Процесс их сортировки можно делать параллельно. И можно пременить вместо быстрой сортировки, какую-нибудь другую).
[^6]: Merge_Sort - Сортировка слиянием также как и быстрая сортировка основанна на принципе разделяй и властвуй. Если быстрая сортировка от большого массива разделяет его и идет к более меньшим массивам (подмассива) а далее к элементам, то сортировка слиянием сначала разбивает весь массив на элементы, а позже соединяет их в отсортированном порядке. ![image](https://user-images.githubusercontent.com/35079479/146191035-bdee7459-867d-4d6e-906a-0aa1826e34b3.png)
![image](https://user-images.githubusercontent.com/35079479/146193112-6bb12ad0-03c4-476d-b84f-9d1ac4522225.png)

