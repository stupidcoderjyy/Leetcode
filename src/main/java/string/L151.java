package string;

public class L151 {
    public String reverseWords(String s) {
        byte[] data = s.getBytes();
        reverse(data, 0, data.length - 1);
        int wordL = data.length - 1, wordR, write = wordL;
        boolean hasWord = false;
        L1:
        while (wordL >= 0) {
            //[write]下一轮赋值 → 左移wordL
            while (data[wordL] == ' ') {
                if (wordL-- == 0) {
                    break L1;
                }
            }
            if (hasWord) {
                data[write--] = ' ';
            }
            //[wordL]非空格 → 左移wordL
            wordR = wordL;
            while (wordL >= 0 && data[wordL] != ' ') {
                wordL--;
            }
            hasWord = true;
            //(wordL,wordR]单词 → 翻转单词，赋值
            reverse(data, wordL + 1, wordR);
            while (wordR > wordL) {
                data[write--] = data[wordR--];
            }
        }
        byte[] result = new byte[data.length - write - 1];
        System.arraycopy(data, write + 1, result, 0, result.length);
        return new String(result);
    }

    //翻转[l,r]
    private void reverse(byte[] s, int l, int r) {
        while (l < r) {
            byte temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }
}
