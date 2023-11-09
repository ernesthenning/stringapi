#### REST API, вычисляющее частоту вхождения символов в строку

-  На вход принимается любая строка, состоящая из символов в кодировке Unicode;
- На выходе API отдает строку формата "symbol1": count1, "symbol2": count2 ..., где в кавычках расположены
символы, входящие в строку (case sensitive), а после двоеточия - число вхождений символов в строку. 
- Символы на выходе отсортированы по убыванию частоты появления в строке;
- В случае передачи пустой строки или null программа вернет предупреждение;
- Для запуска перейдите через терминал в корневую папку проекта и выполните команду ./mvnw spring-boot:run
- API будет доступно по адресу http://localhost:8080/api/string
- Прием и обработка запросов осуществляется через метод POST;
- Для работы с API можно воспользоваться curl. Для этого в терминале введите команду 
curl --location --request POST 'http://localhost:8080/api/string' --header 'Content-Type: application/json' --data-raw 'строка_для_обработки'
- Также работа возможна через Postman и другие программы для работы с HTTP запросами

