package com.bytedance.crash.resource.g;

import com.bytedance.crash.N.h;
import com.bytedance.crash.resource.c;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class b extends c {
    protected int h;
    protected int i;
    protected int j;
    protected int k;
    protected int l;
    protected int m;

    public b(int i, JSONArray jSONArray, int i2) {
        super(23, 33, 5);
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 50000;
        this.l = 50000;
        this.m = 500;
        if (h.g()) {
            this.h = 7;
            this.i = 3;
            this.k = 1000;
            this.l = 1000;
            this.m = 350;
            this.j = 4;
            return;
        }
        this.h = i;
        this.i = i2;
        int length = jSONArray.length();
        if (length >= 2) {
            this.k = jSONArray.optInt(0);
            this.l = jSONArray.optInt(1);
            if (length == 3) {
                this.m = jSONArray.optInt(2);
            }
        }
        this.k = Math.max(1000, this.k);
        this.l = Math.max(1000, this.l);
        this.m = Math.max(500, this.m);
    }

    @Override // com.bytedance.crash.resource.c
    public String toString() {
        StringBuilder M = e.a.a.a.a.M("monitorType=");
        M.append(this.h);
        M.append("\nlimitGlobal=");
        M.append(this.k);
        M.append("\nlimitWeak=");
        M.append(this.l);
        M.append("\nlimitLocal=");
        M.append(this.m);
        M.append("\nbtFlag=");
        M.append(this.i);
        M.append("\ndebugType=");
        return e.a.a.a.a.D(M, this.j, "\n");
    }
}
