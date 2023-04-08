public class Login {
    private int userid;
    private int pass;
    public int getUserid()
    {
        return userid;
    }
    public void setUserid(int userid)
    {
        this.userid = userid;
    }
    public int getPass()
    {
        return pass;
    }
    public void setPass(int pass)
    {
        this.pass = pass;
    }
    void log()
    {
        System.out.println("invalid passWord!Try again");
    }
}
