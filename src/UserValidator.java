import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UserValidator {
    private List<Predicate<UserForm>> validators = new ArrayList<>();

    public void addRule(Predicate<UserForm> rule){
        validators.add(rule);
    }

    public boolean isValid(UserForm form){
        for (Predicate<UserForm> rule : validators) {
            if (!rule.test(form)) {
                return false;
            }
        }
        return true;
    }

}
