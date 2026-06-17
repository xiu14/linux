package e.b.b.e.a.j;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {
    private byte[] a;

    public b(byte[] bArr) {
        this.a = bArr;
    }

    public byte[] a() {
        return this.a;
    }

    public String toString() {
        try {
            return new JSONObject(new String(this.a)).toString();
        } catch (Exception unused) {
            return "";
        }
    }
}
