public class Class {
    public static void main(String[] args) {
        String s = "anagrams";
        String t = "nagarams";
        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            count[c - 'a']++;
        }

        System.out.println(count[0]);
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            count[c - 'a']--;
        }

        System.out.println(count[0]);
        boolean isAnagram = true;

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                isAnagram = false;
                break;
            }
        }

        System.out.println(isAnagram);
    }
}
