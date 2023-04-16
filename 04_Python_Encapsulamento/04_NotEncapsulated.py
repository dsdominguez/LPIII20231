#Implementação da função main()
def main():
    cat1 = Cat()
    cat1.name = "Kayla"
    cat1.age = 2
    cat1.info()

    cat2 = Cat()
    cat2.name = 'Raschid'
    cat2.age = 1
    cat2.info();
    cat2.makeSound()

#Implementação da classe Cats
class Cat:
    def __init__(self):
        self.name = ""
        self.age = 0
        
    def info(self):
        print(f"I am a cat. My name is {self.name}. I am {self.age} years old.")
        
    def makeSound(self):
        print("Meow")

#Executando a classe main
main()        