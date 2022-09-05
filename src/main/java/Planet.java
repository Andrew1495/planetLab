public class Planet {
    private String name;
    private int size;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Planet(String name, int size){
        this.name = name;
        this.size = size;
    }

    public void explode(){
        System.out.println("Boom " + this.name + " has exploded!");
    }

}
