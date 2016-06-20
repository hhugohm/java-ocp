package  org.neos.cap1.constants;

public enum Animals2 {
    ELEPHANT(TypeAnimal.MAMMAL),
    GIRAFFE(TypeAnimal.MAMMAL),
    TURTLE(TypeAnimal.REPTILE),
    SNAKE(TypeAnimal.REPTILE),
    FROG(TypeAnimal.AMPHIBIAN);

    private final TypeAnimal type;
    private Animals2(final TypeAnimal type) { this.type = type; }
    public boolean isMammal() { return this.type.equals(TypeAnimal.MAMMAL); }
    public boolean isAmphibian() { return this.type.equals(TypeAnimal.AMPHIBIAN); }
    public boolean isReptile() { return this.type.equals(TypeAnimal.REPTILE); }
}
