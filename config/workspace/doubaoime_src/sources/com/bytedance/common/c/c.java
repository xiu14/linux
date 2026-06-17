package com.bytedance.common.c;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Locale;

/* loaded from: classes.dex */
public class c implements Externalizable {
    private String a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private d f4126c;

    public c(String str) throws e {
        d(str);
    }

    private boolean c(String str) {
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

    private void d(String str) throws e {
        int indexOf = str.indexOf(47);
        int indexOf2 = str.indexOf(59);
        if (indexOf < 0 && indexOf2 < 0) {
            throw new e("Unable to find a sub type.");
        }
        if (indexOf < 0 && indexOf2 >= 0) {
            throw new e("Unable to find a sub type.");
        }
        if (indexOf >= 0 && indexOf2 < 0) {
            String trim = str.substring(0, indexOf).trim();
            Locale locale = Locale.ENGLISH;
            this.a = trim.toLowerCase(locale);
            this.b = str.substring(indexOf + 1).trim().toLowerCase(locale);
            this.f4126c = new d();
        } else {
            if (indexOf >= indexOf2) {
                throw new e("Unable to find a sub type.");
            }
            String trim2 = str.substring(0, indexOf).trim();
            Locale locale2 = Locale.ENGLISH;
            this.a = trim2.toLowerCase(locale2);
            this.b = str.substring(indexOf + 1, indexOf2).trim().toLowerCase(locale2);
            this.f4126c = new d(str.substring(indexOf2));
        }
        if (!c(this.a)) {
            throw new e("Primary type is invalid.");
        }
        if (!c(this.b)) {
            throw new e("Sub type is invalid.");
        }
    }

    public String a() {
        return this.a + "/" + this.b;
    }

    public String b(String str) {
        return this.f4126c.a(str);
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        try {
            d(objectInput.readUTF());
        } catch (e e2) {
            throw new IOException(e2.toString());
        }
    }

    public String toString() {
        return a() + this.f4126c.toString();
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeUTF(toString());
        objectOutput.flush();
    }
}
