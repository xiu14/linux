package e.b.h;

import java.util.ArrayList;

/* loaded from: classes.dex */
class d extends UnsatisfiedLinkError {
    private static final ArrayList<d> a = new ArrayList<>();
    private static final ArrayList<UnsatisfiedLinkError> b = new ArrayList<>();

    d(String str) {
        super(str);
        ArrayList<d> arrayList = a;
        synchronized (arrayList) {
            arrayList.add(this);
        }
    }

    static void a(UnsatisfiedLinkError unsatisfiedLinkError) {
        ArrayList<UnsatisfiedLinkError> arrayList = b;
        synchronized (arrayList) {
            arrayList.add(unsatisfiedLinkError);
        }
    }

    d(String str, Throwable th) {
        super(str);
        initCause(th);
        ArrayList<d> arrayList = a;
        synchronized (arrayList) {
            arrayList.add(this);
        }
    }
}
