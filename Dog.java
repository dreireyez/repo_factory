public class Dog implements Pet {
    private String breed;

    public String setBreed(String breed) {
        this.breed = breed;
    }

    public void getBreed() {
        return breed;
    }

    @Override
    private String makeSound() {
        return "Aw, aw!";
    }

    @Override
    private String play() {
        return "Play catch and fetch!";
    }
}