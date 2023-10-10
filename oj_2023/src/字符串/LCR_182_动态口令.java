package 字符串;

/**
 * @title: LCR_182_动态口令
 * @Author zxwyhzy
 * @Date: 2023/10/10 23:24
 * @Version 1.0
 * 某公司门禁密码使用动态口令技术。初始密码为字符串 password，密码更新均遵循以下步骤：
 *
 * 设定一个正整数目标值 target
 * 将 password 前 target 个字符按原顺序移动至字符串末尾
 * 请返回更新后的密码字符串。
 */
public class LCR_182_动态口令 {
    public String dynamicPassword(String password, int target) {
            StringBuilder sb = new StringBuilder();
            sb.append(password.substring(target,password.length()))
                    .append(password.substring(0,target));
            return sb.toString();
    }
}
