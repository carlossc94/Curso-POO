class Main{
    public static void main(String[] args) {
        Account account = new Account("Carlos Marquina","SOCC940409UE9","mail@mail.com");

        Car car = new Car("AMQ-688",account,4);
        car.printDataCar();
        
        Payment payment = new Payment();
        Route route = new Route();
    }

    
}