package okhttp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes2.dex */
public final class s {
    private final String[] a;

    public static final class a {
        final List<String> a = new ArrayList(20);

        public a a(String str, String str2) {
            s.b(str);
            s.c(str2, str);
            this.a.add(str);
            this.a.add(str2.trim());
            return this;
        }

        a b(String str, String str2) {
            this.a.add(str);
            this.a.add(str2.trim());
            return this;
        }

        public s c() {
            return new s(this);
        }

        public a d(String str) {
            int i = 0;
            while (i < this.a.size()) {
                if (str.equalsIgnoreCase(this.a.get(i))) {
                    this.a.remove(i);
                    this.a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }
    }

    s(a aVar) {
        List<String> list = aVar.a;
        this.a = (String[]) list.toArray(new String[list.size()]);
    }

    static void b(String str) {
        Objects.requireNonNull(str, "name == null");
        if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= ' ' || charAt >= 127) {
                throw new IllegalArgumentException(okhttp3.F.c.o("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
            }
        }
    }

    static void c(String str, String str2) {
        if (str == null) {
            throw new NullPointerException(e.a.a.a.a.t("value for name ", str2, " == null"));
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ((charAt <= 31 && charAt != '\t') || charAt >= 127) {
                throw new IllegalArgumentException(okhttp3.F.c.o("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i), str2, str));
            }
        }
    }

    public static s h(String... strArr) {
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) strArr.clone();
        for (int i = 0; i < strArr2.length; i++) {
            if (strArr2[i] == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i] = strArr2[i].trim();
        }
        for (int i2 = 0; i2 < strArr2.length; i2 += 2) {
            String str = strArr2[i2];
            String str2 = strArr2[i2 + 1];
            b(str);
            c(str2, str);
        }
        return new s(strArr2);
    }

    public long a() {
        String[] strArr = this.a;
        long length = strArr.length * 2;
        for (int i = 0; i < strArr.length; i++) {
            length += this.a[i].length();
        }
        return length;
    }

    public String d(String str) {
        String[] strArr = this.a;
        int length = strArr.length;
        do {
            length -= 2;
            if (length < 0) {
                return null;
            }
        } while (!str.equalsIgnoreCase(strArr[length]));
        return strArr[length + 1];
    }

    public String e(int i) {
        return this.a[i * 2];
    }

    public boolean equals(Object obj) {
        return (obj instanceof s) && Arrays.equals(((s) obj).a, this.a);
    }

    public Set<String> f() {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int i = i();
        for (int i2 = 0; i2 < i; i2++) {
            treeSet.add(e(i2));
        }
        return Collections.unmodifiableSet(treeSet);
    }

    public a g() {
        a aVar = new a();
        Collections.addAll(aVar.a, this.a);
        return aVar;
    }

    public int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public int i() {
        return this.a.length / 2;
    }

    public Map<String, List<String>> j() {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int i = i();
        for (int i2 = 0; i2 < i; i2++) {
            String lowerCase = e(i2).toLowerCase(Locale.US);
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(k(i2));
        }
        return treeMap;
    }

    public String k(int i) {
        return this.a[(i * 2) + 1];
    }

    public List<String> l(String str) {
        int i = i();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            if (str.equalsIgnoreCase(e(i2))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(k(i2));
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = i();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(e(i2));
            sb.append(": ");
            sb.append(k(i2));
            sb.append("\n");
        }
        return sb.toString();
    }

    private s(String[] strArr) {
        this.a = strArr;
    }
}
