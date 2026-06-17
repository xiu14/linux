package c;

/* loaded from: classes.dex */
public class d extends RuntimeException {
    public d(Exception exc) {
        super("An exception was thrown by an Executor", exc);
    }
}
