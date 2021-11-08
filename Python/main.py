from car import Car
from account import Account
from payment import Payment
from route import Route


if __name__ == "__main__":
    print("Hola Mundo")
    car = Car("SRGGG98",Account("Carlos Marquina","SOCR3322R8","mail@mail.com"),5)

    print(vars(car))
    print(vars(car.driver))