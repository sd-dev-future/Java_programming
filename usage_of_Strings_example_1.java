public class usage_of_Strings_example_1 {
    public static void main(String[] args){

        String text="Fast-and-Furious";

        String[] parts=text.split("-");

        for(String word:parts){
            System.out.println(word);
        }

        String result=text.replace("-", " ").toUpperCase();
        System.out.println(result);
    }
}
