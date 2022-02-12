public class ExclamationMarksSeries {
    public static void main(String[] args) {
        String s = "<prod><name>drill</name><prx>99</prx><qty>5</qty></prod>\n" +
                "<prod><name>hammer</name><prx>10</prx><qty>50</qty></prod>\n" +
                "<prod><name>screwdriver</name><prx>5</prx><qty>51</qty></prod>\n" +
                "<prod><name>table saw</name><prx>1099.99</prx><qty>5</qty></prod>\n" +
                "<prod><name>saw</name><prx>9</prx><qty>10</qty></prod>";

        String product = "hammer";

        System.out.println(catalog(s, product));

    }

    public static String catalog(String s, String article) {
        // your code
        String result = "";
        String productFind = "(?<=<name>)(.*\\n?)(?=</name>)";

        return result;

    }
}
