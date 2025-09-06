public class Cricketer{
    private String name;
    private int score;

    public Cricketer(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Cricketer{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}