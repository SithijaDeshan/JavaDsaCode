public class SearchIntString {
    public static void main(String[] args) {
        String name= "Sithija";
        char target = 'j';
        System.out.println(search2(name,target));
    }

    public static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }

        for(int i = 0; i < str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }
        }

        return false;
    }

    public static boolean search2(String str, char target){
        if(str.length() == 0){
            return false;
        }

        for( char ch : str.toCharArray()){
            if(target == ch){
                return true;
            }
        }

        return false;
    }
}
