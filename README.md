# Test_BWT

## Task 1

[Max Element](src/main/kotlin/task_1/MaxElement.kt)

## Task 2

[Bubble Sort](src/main/kotlin/task_2/BubleSort.kt)

## Task 3

![image](https://i.imgur.com/qMwCzGN.png)

Связь многие ко многим. У множества продуктов, множество тегов.
Запрос: 
```
SELECT products.id, products.name, COUNT(product_tags.product_id) as product_tags_count
FROM product_tags
JOIN products ON product_tags.product_id = products.id
GROUP BY products.id
HAVING product_tags_count > 10
```

Делал и тестировал через phpMyAdmin и MariaDB

## Task 4

[Binary Search](src/main/kotlin/task_4/BinarySearch.kt)

## Task 5

[Vector2D Class](src/main/kotlin/task_5/Vector2D.kt)

## Task 6

[Palindrome](src/main/kotlin/task_6/Palindrome.kt)
