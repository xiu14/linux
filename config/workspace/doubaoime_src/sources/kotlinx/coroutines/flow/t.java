package kotlinx.coroutines.flow;

/* loaded from: classes2.dex */
public interface t<T> extends x<T>, Object<T>, g {
    boolean c(T t, T t2);

    @Override // kotlinx.coroutines.flow.x
    T getValue();

    void setValue(T t);
}
