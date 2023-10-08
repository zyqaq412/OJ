package 字符串;

/**
 * @title: LCR_122_路径加密
 * @Author zxwyhzy
 * @Date: 2023/10/8 23:03
 * @Version 1.0
 * 假定一段路径记作字符串 path，其中以 "." 作为分隔符。现需将路径加密，加密方法为将 path 中的分隔符替换为空格 " "，请返回加密后的字符串。
 */
public class LCR_122_路径加密 {
    public String pathEncryption(String path) {
        char[] ans = path.toCharArray();
        for (int i = 0; i < ans.length; i++) {
            if (ans[i] == '.'){
                ans[i] = ' ';
            }
        }
        return new String(ans);
    }
}
