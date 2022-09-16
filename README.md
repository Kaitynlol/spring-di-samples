# DI & IoC

<p> Для начала определим две самые важные термины, как Инверсия управления - Inversion of Control (IoC) и Внедрение зависимостей - Dependency Injection (DI).

* IoC - это принцип ООП, используемый для уменьшения связанности между классами и объектами. Программист в нужные точки программы разместит необходимый код и не волнуется как и когда должен работать размещенный код. Говоря простым языком, при использовании IoC кодом будет управлять фреймворк а не программист.</p>
* DI - делает объекты приложения слабо зависимым друг от друга. То есть об инициализации объектов будет заботится внешний механизм разработанный программистом. При использовании DI программист будет работать не на "уровне классов" а на "уровне интерфейсов". Таким образом зависимости между объектами будут сведены к минимуму.

### В Spring Boot существует 4 типа DI:

1. Как поле класса
2. Как приватное поле класса 
3. С помощью setter
4. С помощью конструктора

**DI с помощью «сеттера»** до сих пор остается местом споров. Это связано с другой особенностью Spring Boot — Ioc (Inversion of Controll, инверсия контроля). IoC — передача управления. Обычно программист сам решает когда вызывать ту или иную процедуру, делать DI и т.п. В Spring Boot — это делает IoC — инициализация и вызовы процедур в Runtime. Получается, что используя DI с помощью «сеттера» вы не можете знать в какой именно момент вы зависимость будет внедрена.

**DI как поле класса** используется редко по причине нарушения инкапсуляции, ведь внедряемое поле должно быть помечено как public.

**DI с помощью конструктора** — наиболее предпочтительный способ осуществления DI. Связывание будет осуществлено в момент создания объекта и вы точно будете знать когда именно IoC осуществит вызов.

### Какой из способов использовать — решать вам. Главное, чтобы это был DI с помощью конструктора.