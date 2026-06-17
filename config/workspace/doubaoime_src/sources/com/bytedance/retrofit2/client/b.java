package com.bytedance.retrofit2.client;

/* loaded from: classes2.dex */
public final class b {
    private final String a;
    private final String b;

    public b(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        String str = this.a;
        if (str == null ? bVar.a != null : !str.equals(bVar.a)) {
            return false;
        }
        String str2 = this.b;
        String str3 = bVar.b;
        return str2 == null ? str3 == null : str2.equals(str3);
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.a;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append(": ");
        String str2 = this.b;
        sb.append(str2 != null ? str2 : "");
        return sb.toString();
    }
}
