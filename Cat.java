public class Cat implements Pet {
    private Integer noOfLives;
 
    public void setNoOfLives(Integer noOfLives) {
        this.noOfLives = noOfLives;
    }

    public Integer getNoOfLives() {
        return noOfLives;
    }

    @Override
    private String makeSound() {
        return "Meow, meow!";
    }

    @Override
    private String play() {
        return "Pouncing!";
    }
}