public class TestMain{
    public static void main() {
        System.out.println(System.currentTimeMillis());
        Mac mac = Mac.getInstance("HmacSHA256");
        System.out.println(System.currentTimeMillis());
    }
}