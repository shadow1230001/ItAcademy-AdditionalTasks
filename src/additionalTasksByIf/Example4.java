package additionalTasksByIf;

public class Example4 {
    public static void main(String[] args) {
        String seasonString;
        int season = 4;
        switch (season) {
            case 1:
                seasonString = "winter ";
                break;
            case 2:
                seasonString = "spring ";
                break;
            case 3:
                seasonString = "autumn";
                break;
            case 4:
                seasonString = "summer";
                break;
            default:
                seasonString = "error";
                break;
        }
        System.out.println(seasonString);
    }
}
