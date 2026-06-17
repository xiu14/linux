package com.alibaba.fastjson.parser;

/* loaded from: classes.dex */
public class m {
    private final a[] a;
    private final int b;

    static class a {
        final String a;
        final char[] b;

        /* renamed from: c, reason: collision with root package name */
        final int f1510c;

        a(String str, int i) {
            this.a = str;
            this.b = str.toCharArray();
            this.f1510c = i;
        }
    }

    public m(int i) {
        this.b = i - 1;
        this.a = new a[i];
        a("$ref", 0, 4, 1185263);
        a("@type", 0, 5, 62680954);
    }

    public String a(String str, int i, int i2, int i3) {
        int i4 = this.b & i3;
        a aVar = this.a[i4];
        if (aVar != null) {
            if (i3 == aVar.f1510c && i2 == aVar.b.length && str.regionMatches(i, aVar.a, 0, i2)) {
                return aVar.a;
            }
            char[] cArr = new char[i2];
            str.getChars(i, i2 + i, cArr, 0);
            return new String(cArr);
        }
        if (i2 != str.length()) {
            char[] cArr2 = new char[i2];
            str.getChars(i, i2 + i, cArr2, 0);
            str = new String(cArr2);
        }
        String intern = str.intern();
        this.a[i4] = new a(intern, i3);
        return intern;
    }

    public String b(char[] cArr, int i, int i2, int i3) {
        int i4 = this.b & i3;
        a aVar = this.a[i4];
        if (aVar == null) {
            String intern = new String(cArr, i, i2).intern();
            this.a[i4] = new a(intern, i3);
            return intern;
        }
        boolean z = false;
        if (i3 == aVar.f1510c && i2 == aVar.b.length) {
            int i5 = 0;
            while (true) {
                if (i5 >= i2) {
                    z = true;
                    break;
                }
                if (cArr[i + i5] != aVar.b[i5]) {
                    break;
                }
                i5++;
            }
        }
        return z ? aVar.a : new String(cArr, i, i2);
    }
}
