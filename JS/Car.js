class Car{
    constructor(license, driver, passenger){
        this.id;
        this.license = license;
        this.driver = driver;
        this.passenger = passenger;
    }


    printDataCar = function (){
        console.log(this.driver);
        console.log(this.driver.name);
        console.log(this.driver.document);
        console.log(this.license);
        console.log(this.passenger);
    }
}