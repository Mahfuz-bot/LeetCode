public class HaystackNeedle {
    public static int strStr(String haystack, String needle) {
        int size = haystack.length();
        int needleSize = needle.length();
        int index =-1;
        for (int i = 0; i <= size - needleSize; i++) {
            if(needle.equals(haystack.substring(i, (i + needleSize)))){
                index = i;
                return index;
            }
        }
        return index;

    }

//  alternative mehtod
//    public int strStsr(String haystack, String needle) {
//        return haystack.indexOf(needle);
//    }
    public static void main(String[] args) {
        String haystack = "sadbutsad"; String needle = "ts";
        int index = strStr(haystack,needle);
        System.out.println("index = " + index);
    }

}
