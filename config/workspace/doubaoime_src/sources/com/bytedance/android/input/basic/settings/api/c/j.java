package com.bytedance.android.input.basic.settings.api.c;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public final class j {

    @SerializedName("use_bot")
    private boolean a;

    @SerializedName("use_seed")
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    @SerializedName("chat")
    private c f2109c;

    /* renamed from: d, reason: collision with root package name */
    @SerializedName("wechat_circle")
    private b f2110d;

    /* renamed from: e, reason: collision with root package name */
    @SerializedName("mail")
    private b f2111e;

    /* renamed from: f, reason: collision with root package name */
    @SerializedName("xhs")
    private b f2112f;

    /* renamed from: g, reason: collision with root package name */
    @SerializedName("evaluate")
    private b f2113g;

    @SerializedName("blessing")
    private b h;

    @SerializedName("invitation")
    private b i;

    @SerializedName("introduction")
    private b j;

    @SerializedName("optimize")
    private b k;

    @SerializedName("intent_recognize")
    private b l;

    @SerializedName("baike_topic")
    private b m;

    @SerializedName(com.heytap.mcssdk.constant.b.y)
    private c n;

    @SerializedName("atomic")
    private String o;

    public j() {
        this(false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767);
    }

    public j(boolean z, boolean z2, c cVar, b bVar, b bVar2, b bVar3, b bVar4, b bVar5, b bVar6, b bVar7, b bVar8, b bVar9, b bVar10, c cVar2, String str, int i) {
        boolean z3;
        b bVar11;
        boolean z4;
        int i2;
        b bVar12;
        b bVar13;
        b bVar14;
        boolean z5 = (i & 1) != 0 ? true : z;
        boolean z6 = (i & 2) != 0 ? false : z2;
        c cVar3 = (i & 4) != 0 ? new c("7322373952545013811", "[对话历史]：\n{{user_input}} \n[我的输入]：{{current_input}} \n我：") : cVar;
        b bVar15 = (i & 8) != 0 ? new b(new c("7337202012121235507", "【朋友圈文案】: {{current_input}} \n【优化要求】: {{mandate}} \n【输出】："), new c("7337202633825894427", "【朋友圈文案】: {{current_input}} \n【续写要求】: {{mandate}} \n【输出】："), new c("7337201928692187186", "【朋友圈文案】：{{message}} \n【输出】：")) : bVar;
        b bVar16 = (i & 16) != 0 ? new b(new c("7329442725739298867", "【上下文信息】:{{user_input}}\n【邮件主题】: {{current_input}}\n【优化要求】: {{mandate}}\n【输出】："), new c("7329442624199442442", "【上下文信息】:{{user_input}}\n【邮件主题】: {{current_input}}\n【优化要求】: {{mandate}}\n【输出】："), new c("7329439985755717669", "【邮件正文】:{{message}}\n【输出】：")) : bVar2;
        b bVar17 = (i & 32) != 0 ? new b(new c("7329446609123704882", "【小红书文案】：{{current_input}} \n【优化要求】：{{mandate}} \n【输出】："), new c("7329444678221430794", "【当前输入】：{{current_input}} \n【续写要求】：{{mandate}} \n【输出】："), new c("7329444028695642150", "【小红书文案】：{{message}} \n【输出】：")) : bVar3;
        b bVar18 = (i & 64) != 0 ? new b(new c("7365798740210253861", "【评论文案】：{{current_input}} "), null, null, 6) : null;
        b bVar19 = (i & 128) != 0 ? new b(new c("7369044933896437772", " {{current_input}} "), null, null, 6) : null;
        b bVar20 = (i & 256) != 0 ? new b(new c("7369419005671227433", " {{current_input}} "), null, null, 6) : null;
        if ((i & 512) != 0) {
            z3 = z6;
            bVar11 = new b(new c("7366918524100771879", " {{current_input}} "), null, null, 6);
        } else {
            z3 = z6;
            bVar11 = null;
        }
        b bVar21 = (i & 1024) != 0 ? new b(new c("7366917442729820179", " {{current_input}} "), null, null, 6) : null;
        if ((i & 2048) != 0) {
            z4 = z5;
            i2 = 6;
            bVar12 = new b(new c("7386966337719566376", " {{user_input}} "), null, null, 6);
        } else {
            z4 = z5;
            i2 = 6;
            bVar12 = null;
        }
        if ((i & 4096) != 0) {
            bVar13 = bVar12;
            bVar14 = new b(new c("7426936733494738996", " {{current_input}} "), null, null, i2);
        } else {
            bVar13 = bVar12;
            bVar14 = null;
        }
        c cVar4 = (i & 8192) != 0 ? new c("7337626025763061798", null, 2) : cVar2;
        String str2 = (i & 16384) != 0 ? "7340488300303646730" : str;
        kotlin.s.c.l.f(cVar3, "chat");
        kotlin.s.c.l.f(bVar15, "wechatCircle");
        kotlin.s.c.l.f(bVar16, "mail");
        kotlin.s.c.l.f(bVar17, "xhs");
        kotlin.s.c.l.f(bVar18, "evaluate");
        kotlin.s.c.l.f(bVar19, "blessing");
        kotlin.s.c.l.f(bVar20, "invitation");
        kotlin.s.c.l.f(bVar11, "introduction");
        kotlin.s.c.l.f(bVar21, "optimize");
        b bVar22 = bVar13;
        kotlin.s.c.l.f(bVar22, "intentRecognize");
        kotlin.s.c.l.f(bVar14, "baikeTopic");
        kotlin.s.c.l.f(cVar4, com.heytap.mcssdk.constant.b.y);
        kotlin.s.c.l.f(str2, "atomic");
        this.a = z4;
        this.b = z3;
        this.f2109c = cVar3;
        this.f2110d = bVar15;
        this.f2111e = bVar16;
        this.f2112f = bVar17;
        this.f2113g = bVar18;
        this.h = bVar19;
        this.i = bVar20;
        this.j = bVar11;
        this.k = bVar21;
        this.l = bVar22;
        this.m = bVar14;
        this.n = cVar4;
        this.o = str2;
    }

    public final b a() {
        return this.h;
    }

    public final c b() {
        return this.f2109c;
    }

    public final b c() {
        return this.f2113g;
    }

    public final b d() {
        return this.j;
    }

    public final b e() {
        return this.i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.a == jVar.a && this.b == jVar.b && kotlin.s.c.l.a(this.f2109c, jVar.f2109c) && kotlin.s.c.l.a(this.f2110d, jVar.f2110d) && kotlin.s.c.l.a(this.f2111e, jVar.f2111e) && kotlin.s.c.l.a(this.f2112f, jVar.f2112f) && kotlin.s.c.l.a(this.f2113g, jVar.f2113g) && kotlin.s.c.l.a(this.h, jVar.h) && kotlin.s.c.l.a(this.i, jVar.i) && kotlin.s.c.l.a(this.j, jVar.j) && kotlin.s.c.l.a(this.k, jVar.k) && kotlin.s.c.l.a(this.l, jVar.l) && kotlin.s.c.l.a(this.m, jVar.m) && kotlin.s.c.l.a(this.n, jVar.n) && kotlin.s.c.l.a(this.o, jVar.o);
    }

    public final b f() {
        return this.f2111e;
    }

    public final b g() {
        return this.k;
    }

    public final boolean h() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    public int hashCode() {
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.b;
        return this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.f2113g.hashCode() + ((this.f2112f.hashCode() + ((this.f2111e.hashCode() + ((this.f2110d.hashCode() + ((this.f2109c.hashCode() + ((i + (z2 ? 1 : z2 ? 1 : 0)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final b i() {
        return this.f2110d;
    }

    public final b j() {
        return this.f2112f;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("RecommendConfig(useBot=");
        M.append(this.a);
        M.append(", useSeed=");
        M.append(this.b);
        M.append(", chat=");
        M.append(this.f2109c);
        M.append(", wechatCircle=");
        M.append(this.f2110d);
        M.append(", mail=");
        M.append(this.f2111e);
        M.append(", xhs=");
        M.append(this.f2112f);
        M.append(", evaluate=");
        M.append(this.f2113g);
        M.append(", blessing=");
        M.append(this.h);
        M.append(", invitation=");
        M.append(this.i);
        M.append(", introduction=");
        M.append(this.j);
        M.append(", optimize=");
        M.append(this.k);
        M.append(", intentRecognize=");
        M.append(this.l);
        M.append(", baikeTopic=");
        M.append(this.m);
        M.append(", command=");
        M.append(this.n);
        M.append(", atomic=");
        return e.a.a.a.a.G(M, this.o, ')');
    }
}
