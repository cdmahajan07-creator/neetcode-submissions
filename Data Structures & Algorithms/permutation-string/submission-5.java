class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        // Frequency of s1
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int right = s1.length();

        // Frequency of first window
        HashMap<Character, Integer> hp = new HashMap<>();

        for (int i = left; i < right; i++) {
            char c = s2.charAt(i);
            hp.put(c, hp.getOrDefault(c, 0) + 1);
        }

        while (true) {

            if (map.equals(hp)) {
                return true;
            }

            // No more windows
            if (right == s2.length()) {
                break;
            }

            // Remove left character
            char c = s2.charAt(left);
            hp.put(c, hp.get(c) - 1);

            if (hp.get(c) == 0) {
                hp.remove(c);
            }

            left++;

            // Add new right character
            c = s2.charAt(right);
            hp.put(c, hp.getOrDefault(c, 0) + 1);

            right++;
        }

        return false;
    }
}