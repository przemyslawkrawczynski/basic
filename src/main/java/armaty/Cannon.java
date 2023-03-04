package armaty;

public class Cannon {
    public boolean isLoaded;

    public Cannon(boolean loaded) {
        this.isLoaded = loaded;
    }

    public void setLoaded(boolean loaded) {
        this.isLoaded = loaded;
    }

    public void fire(){
        if (isLoaded){
            System.out.println("Bum!");
        } else {
            System.out.println("Cannon is empty! Loading...");
            isLoaded = true;
        }
    }
}
