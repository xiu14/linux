package e.b.b.e.a;

import java.util.Comparator;

/* loaded from: classes.dex */
class d implements Comparator<String> {
    d(c cVar) {
    }

    @Override // java.util.Comparator
    public int compare(String str, String str2) {
        return String.CASE_INSENSITIVE_ORDER.compare(str, str2);
    }
}
