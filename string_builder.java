public class string_builder {
    public static void main(String[]args){
        StringBuilder sb=new StringBuilder("uday");
        System.out.println(sb);
        //chat at index o
        System.out.println(sb.charAt(0));
        //set character at index
        sb.setCharAt(0,'P');
        System.out.println(sb);

        //insert element in string
        sb.insert(2,'d');
        System.out.println(sb);

    }
}
