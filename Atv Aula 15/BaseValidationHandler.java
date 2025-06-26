public abstract class BaseValidationHandler {
    private BaseValidationHandler next;

    public BaseValidationHandler setNext(BaseValidationHandler next) {
        this.next = next;
        return next;
    }

    public abstract boolean handle(LoginData data);

    protected boolean checkNext(LoginData data) {
        if (next == null) {
            return true; 
        }
        return next.handle(data);
    }
}