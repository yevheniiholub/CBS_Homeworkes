package Practice_lesson_Classes_and_Objects;

public class AccountInfo {
    private AccountInfoAnswer answer;
    private AccountInfoBirthDay birthDay;
    private AccountInfoMail mail;
    private AccountInfoName name;
    private AccountInfoOrder order;
    private AccountInfoPassword password;
    private AccountInfoQuestion question;

    public AccountInfo(AccountInfoAnswer answer, AccountInfoBirthDay birthDay, AccountInfoMail mail,
                       AccountInfoName name, AccountInfoOrder order, AccountInfoPassword password,
                       AccountInfoQuestion question) {
        this.answer = answer;
        this.birthDay = birthDay;
        this.mail = mail;
        this.name = name;
        this.order = order;
        this.password = password;
        this.question = question;
    }

    public AccountInfoAnswer getAnswer() {
        return answer;
    }

    public AccountInfoBirthDay getBirthDay() {
        return birthDay;
    }

    public AccountInfoMail getMail() {
        return mail;
    }

    public AccountInfoName getName() {
        return name;
    }

    public AccountInfoOrder getOrder() {
        return order;
    }

    public AccountInfoPassword getPassword() {
        return password;
    }

    public AccountInfoQuestion getQuestion() {
        return question;
    }
}
