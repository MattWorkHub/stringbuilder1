public class Main {
    public static void main(String[] args) {
        String txt = "lololol";
        String txt1 = "lololol";
        StringBuilder stringBuilder = new StringBuilder();
        if(txt.equals(txt1)) {
            stringBuilder.append("The strings are equal");
        }
        else {
            stringBuilder.append("The strings are different");
        }
        System.out.println(stringBuilder);
    }
}