public record UserForm(String email, String password, int age) {

    public UserForm(String email, String password, int age) {
        if (email == null || password == null || email.isEmpty() || password.isEmpty()) {
            throw new IllegalArgumentException("Email or password is null or empty");
        }
        this.email = email;
        this.password = password;
        this.age = age;
    }
}
