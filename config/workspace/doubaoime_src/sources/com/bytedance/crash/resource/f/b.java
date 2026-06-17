package com.bytedance.crash.resource.f;

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
    protected boolean m;
    boolean n;

    public b(JSONArray jSONArray) {
        super(21, 35, 1);
        this.n = false;
        if (h.g()) {
            this.l = 0;
            this.i = 30;
            this.j = 150;
            this.h = 1;
            this.m = false;
            this.k = 2;
            this.n = true;
            return;
        }
        this.h = jSONArray.optInt(0);
        this.i = jSONArray.optInt(1);
        this.j = jSONArray.optInt(2);
        this.m = jSONArray.optBoolean(3);
        this.k = jSONArray.optInt(5);
        this.l = jSONArray.optInt(6);
        this.h = Math.max(4, this.h);
    }

    @Override // com.bytedance.crash.resource.c
    public String toString() {
        StringBuilder M = e.a.a.a.a.M("pollSecond=");
        M.append(this.h);
        M.append("\nwaterLineMB=");
        M.append(this.i);
        M.append("\ncollectSizeMB=");
        M.append(this.j);
        M.append("\nneedDumpMemInfo=");
        M.append(this.m);
        M.append("\ndebug=");
        M.append(this.n);
        M.append("\nmonitorSize=");
        M.append(this.k);
        M.append("\nmonitorType=");
        return e.a.a.a.a.D(M, this.l, "\n");
    }
}
