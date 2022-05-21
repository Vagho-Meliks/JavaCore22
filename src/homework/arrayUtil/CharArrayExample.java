package homework.arrayUtil;

public class CharArrayExample {

    public static void main(String[] args) {

        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e' };
        char c = 'o';
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                count++;
            }
        }
        System.out.println(count);

        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e' };
        System.out.print(chars2[chars2.length / 2 - 1]);
        System.out.println(chars2[chars2.length / 2]);

        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y' };
        boolean b = false;
        if (chars3[chars3.length - 2] == 'l' && chars3[chars3.length - 1] == 'y') {
            b = true;
        }
        System.out.println(b);

        char[] bobArray = {'b', 'a', 'b', 'o', 'l', 'a' };
        boolean bob = false;
        for (int i = 0; i < bobArray.length - 2; i++) {
            if (bobArray[i] == 'b' && bobArray[i + 2] == 'b') {
                bob = true;
                break;
            }
        }
        System.out.println(bob);

        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' ' };
        int first = 0;
        int end = text.length - 1;
        for (int i = first; i < end; i++) {
            if (text[first] == ' ') {
                first++;
            }
        }
        for (int i = first; i < end; i++) {
            if (text[end] == ' ') {
                end--;
            }
        }
        char[] result = new char[(end - first) + 1];
        int index = 0;
        for (int i = first; i < end + 1; i++) {
            result[index++] = text[i];
        }
        for (char r : result) {
            System.out.print(r);
        }
    }
}
