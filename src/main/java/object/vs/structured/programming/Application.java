package object.vs.structured.programming;

public class Application {

    public static void main(String[] args) {

        String name = "Michal";
        int age = 31;
        double height = 151;

        UserInfo userinfo = new UserInfo();

        boolean isNameNotNull = userinfo.checkUserName(name);
        boolean isAgeOver30 = userinfo.checkUserAge(age);
        boolean isHeightOver160 = userinfo.checkUserHeight(height);

        if (isNameNotNull) {
            String textAgeHeightOfUser = isAgeOver30 && isHeightOver160 ? "User is older than 30 and higher then 160cm" : "User is younger than 30 or lower than 160cm";
            System.out.println(textAgeHeightOfUser);
        } else {
            System.out.println("isempty");
        }
    }
}

