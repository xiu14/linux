package e.b.l.q;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class a<K, V> extends LinkedHashMap<K, V> {
    private int a;

    public a(int i) {
        super(i, 0.75f, true);
        this.a = i;
    }

    @Override // java.util.LinkedHashMap
    protected boolean removeEldestEntry(Map.Entry entry) {
        return size() > this.a;
    }

    public a(int i, int i2) {
        super(i, 0.75f, true);
        this.a = i2;
    }
}
