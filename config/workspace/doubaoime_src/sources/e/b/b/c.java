package e.b.b;

import com.bytedance.apm6.hub.z.g;

/* loaded from: classes.dex */
class c extends g {
    c() {
    }

    @Override // com.bytedance.apm6.hub.z.g, e.b.b.j.g.b
    public e.b.b.j.g.a getConfig() {
        e.b.b.j.g.a config = super.getConfig();
        if (config != null) {
            config.g(com.bytedance.apm.g.C());
            int i = com.bytedance.apm.g.A;
            config.h(false);
        }
        return config;
    }
}
