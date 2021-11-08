public class Car {
    Integer id;
    String license;
    /*Se cambia el valor de string a Driver ya que driver es herencia de la clase Account */
    Account driver;
    private Integer passenger;

    public Car(String license, Account driver, Integer passenger){
        /*Para usar las variables globales se usa el this de esta CLASE car */
        this.license = license;
        this.driver = driver;
        this.passenger = passenger;
    }

    void printDataCar(){
        System.out.println("Car with license: "+license+" is driving for the driver: "+ driver.name+" with "+passenger+ " passengers") ;
    }

    public Integer getPassenger(){
        return passenger;
    }

    public void setPassenger(Integer passenger){
        if(passenger == 4){
            this.passenger=passenger;
        }else{
            System.out.println("Asigne mayor numero de pasajeros");
        }
        
    }
}
