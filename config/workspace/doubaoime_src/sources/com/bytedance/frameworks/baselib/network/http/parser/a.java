package com.bytedance.frameworks.baselib.network.http.parser;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Locale;

/* loaded from: classes.dex */
public class a implements Externalizable {
    private String a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private b f5242c;

    public a(String str) throws c {
        e(str);
    }

    private boolean d(String str) {
        int length = str.length();
        if (length <= 0) {
            return false;
        }
        int i = 0;
        while (true) {
            if (i >= length) {
                return true;
            }
            char charAt = str.charAt(i);
            if (!(charAt > ' ' && charAt < 127 && "()<>@,;:/[]?=\\\"".indexOf(charAt) < 0)) {
                return false;
            }
            i++;
        }
    }

    private void e(String str) throws c {
        int indexOf = str.indexOf(47);
        int indexOf2 = str.indexOf(59);
        if (indexOf < 0 && indexOf2 < 0) {
            throw new c("Unable to find a sub type.");
        }
        if (indexOf < 0 && indexOf2 >= 0) {
            throw new c("Unable to find a sub type.");
        }
        if (indexOf >= 0 && indexOf2 < 0) {
            String trim = str.substring(0, indexOf).trim();
            Locale locale = Locale.ENGLISH;
            this.a = trim.toLowerCase(locale);
            this.b = str.substring(indexOf + 1).trim().toLowerCase(locale);
            this.f5242c = new b();
        } else {
            if (indexOf >= indexOf2) {
                throw new c("Unable to find a sub type.");
            }
            String trim2 = str.substring(0, indexOf).trim();
            Locale locale2 = Locale.ENGLISH;
            this.a = trim2.toLowerCase(locale2);
            this.b = str.substring(indexOf + 1, indexOf2).trim().toLowerCase(locale2);
            this.f5242c = new b(str.substring(indexOf2));
        }
        if (!d(this.a)) {
            throw new c("Primary type is invalid.");
        }
        if (!d(this.b)) {
            throw new c("Sub type is invalid.");
        }
    }

    public String a() {
        return this.a + "/" + this.b;
    }

    public String b(String str) {
        return this.f5242c.a(str);
    }

    public String c() {
        return this.a;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        try {
            e(objectInput.readUTF());
        } catch (c e2) {
            throw new IOException(e2.toString());
        }
    }

    public String toString() {
        return a() + this.f5242c.toString();
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeUTF(toString());
        objectOutput.flush();
    }
}
