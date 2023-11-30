fun main(args: Array<String>) {
    // Using DogFactory to create a Dog
    val dogFactory: AnimalFactory = DogFactory()
    val dog: Animal = dogFactory.createAnimal()
    dog.makeSound()

    // Using CatFactory to create a Cat
    val catFactory: AnimalFactory = CatFactory()
    val cat: Animal = catFactory.createAnimal()
    cat.makeSound()
}