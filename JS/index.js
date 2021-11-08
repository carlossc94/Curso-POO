var car = new Car("AW456", new Account("Andres Herrera", "QWE234"))
car.passenger = 4;
car.printDataCar();

var uberX = new UberX("AW456", new Account("Andrea Ferran", "ANDA765"), "Chevrolet", "Spark")
uberX.passenger = 4;
uberX.printDataCar();


/*A partir de las nuevas especificaciones del EcmaScript 6 ya podemos declarar una clase con la palabra reservada class, aunque es importante aclarar que estos no dejan de ser prototipos, sino todo lo contrario.

Además tendremos una palabra clave para definir un constructor, y dentro de este estarán las propiedades de nuestra clase definidas listas para inicializarse.

Transcribamos el código JavaScript que generamos en la clase anterior a este nuevo estándar.
 */