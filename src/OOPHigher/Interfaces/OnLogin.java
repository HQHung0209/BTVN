package OOPHigher.Interfaces;

public interface OnLogin {
    //abstract function : phương thức trừu tượng (không có thân hàm)
    void inputData(String username, String password);
    void validateForm(String username, String password);
    void loginSuccess();
    void loginFail();
}
