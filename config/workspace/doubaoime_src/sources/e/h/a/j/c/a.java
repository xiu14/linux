package e.h.a.j.c;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public class a extends b {
    protected String h;

    @NonNull
    protected e.h.a.j.b.a i;
    protected boolean j;
    protected boolean k;
    protected boolean l;
    protected boolean m;
    protected boolean n;
    private List<String> o;

    public a(String str, long j, boolean z, String str2, @NonNull e.h.a.j.b.a aVar, HashMap<String, String> hashMap) {
        super(j, z, str2, hashMap);
        this.j = true;
        this.k = true;
        this.l = true;
        this.m = false;
        this.n = false;
        this.h = str;
        this.i = aVar;
    }

    @NonNull
    public e.h.a.j.b.a j() {
        return this.i;
    }

    public String k() {
        return this.h;
    }

    public List<String> l() {
        return this.o;
    }

    public boolean m() {
        return this.k;
    }

    public boolean n() {
        return this.m;
    }

    public boolean o() {
        return this.n;
    }

    public boolean p() {
        return this.l;
    }

    public boolean q() {
        return this.j;
    }

    public void r(boolean z) {
        this.k = z;
    }

    public void s(boolean z) {
        this.m = z;
    }

    public void t(boolean z) {
        this.n = z;
    }

    public void u(List<String> list) {
        this.o = list;
    }
}
