/**
 * 账户类
 */
public class Account {
    private String cardId;//卡号
    private String userName; // 用户名
    private String passWord; // 密码
    private double money; // 账户余额
    private double quotaMoney; // 每次取现额度


    public Account() {
    }

    public Account(String cardId, String userName, String passWord, double money, double quotaMoney) {
        this.cardId = cardId;
        this.userName = userName;
        this.passWord = passWord;
        this.money = money;
        this.quotaMoney = quotaMoney;
    }

    /**
     * 获取
     * @return cardId
     */
    public String getCardId() {
        return cardId;
    }

    /**
     * 设置
     * @param cardId
     */
    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    /**
     * 获取
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取
     * @return passWord
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * 设置
     * @param passWord
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    /**
     * 获取
     * @return money
     */
    public double getMoney() {
        return money;
    }

    /**
     * 设置
     * @param money
     */
    public void setMoney(double money) {
        this.money = money;
    }

    /**
     * 获取
     * @return quotaMoney
     */
    public double getQuotaMoney() {
        return quotaMoney;
    }

    /**
     * 设置
     * @param quotaMoney
     */
    public void setQuotaMoney(double quotaMoney) {
        this.quotaMoney = quotaMoney;
    }

    public String toString() {
        return "Account{cardId = " + cardId + ", userName = " + userName + ", passWord = " + passWord + ", money = " + money + ", quotaMoney = " + quotaMoney + "}";
    }
}
