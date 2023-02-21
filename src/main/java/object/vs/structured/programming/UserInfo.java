package object.vs.structured.programming;

public class UserInfo {
    public boolean checkUserName(String name) {
        if (name != null) {
            return true;
        }
        return false;
    }
    public boolean checkUserAge(int age) {
        if (age > 30) {
            return true;
        }
        return false;
    }
    public boolean checkUserHeight(double height) {
        if (height > 160) {
            return true;
        }
        return false;
    }
}


