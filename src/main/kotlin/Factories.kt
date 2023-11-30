// Concrete Creators
class DogFactory : AnimalFactory {
    override fun createAnimal(): Animal {
        return Dog()
    }
}

class CatFactory : AnimalFactory {
    override fun createAnimal(): Animal {
        return Cat()
    }
}