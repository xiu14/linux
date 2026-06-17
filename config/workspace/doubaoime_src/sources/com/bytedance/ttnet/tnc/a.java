package com.bytedance.ttnet.tnc;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Map;

/* loaded from: classes2.dex */
public class a {
    public boolean a = false;
    public boolean b = true;

    /* renamed from: c, reason: collision with root package name */
    public Map<String, Integer> f6256c = null;

    /* renamed from: d, reason: collision with root package name */
    public int f6257d = 10;

    /* renamed from: e, reason: collision with root package name */
    public int f6258e = 3;

    /* renamed from: f, reason: collision with root package name */
    public int f6259f = 3;

    /* renamed from: g, reason: collision with root package name */
    public int f6260g = 10;
    public int h = 3;
    public int i = 3;
    public int j = TypedValues.Custom.TYPE_INT;
    public int k = 120;
    public String l = null;

    public String toString() {
        StringBuilder M = e.a.a.a.a.M(" localEnable: ");
        M.append(this.a);
        M.append(" probeEnable: ");
        M.append(this.b);
        M.append(" hostFilter: ");
        Map<String, Integer> map = this.f6256c;
        M.append(map != null ? map.size() : 0);
        M.append(" reqTo: ");
        M.append(this.f6257d);
        M.append("#");
        M.append(this.f6258e);
        M.append("#");
        M.append(this.f6259f);
        M.append(" reqErr: ");
        M.append(this.f6260g);
        M.append("#");
        M.append(this.h);
        M.append("#");
        M.append(this.i);
        M.append(" updateInterval: ");
        M.append(this.j);
        M.append(" updateRandom: ");
        M.append(this.k);
        M.append(" httpBlack: ");
        M.append(this.l);
        return M.toString();
    }
}
