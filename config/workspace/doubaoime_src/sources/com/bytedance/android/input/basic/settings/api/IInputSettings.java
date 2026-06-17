package com.bytedance.android.input.basic.settings.api;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.settings.api.IInputSettings;
import com.bytedance.android.input.basic.settings.api.c.g;
import com.bytedance.android.input.basic.settings.api.c.h;
import com.bytedance.android.input.basic.settings.api.c.j;
import com.bytedance.news.common.settings.d;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.e;
import kotlin.s.c.l;
import kotlin.s.c.m;

/* loaded from: classes.dex */
public interface IInputSettings {
    public static final a a = a.b;

    public static final class a implements IInputSettings {

        /* renamed from: e, reason: collision with root package name */
        private static boolean f2081e;
        static final /* synthetic */ a b = new a();

        /* renamed from: c, reason: collision with root package name */
        private static final e<Handler> f2079c = kotlin.a.c(c.a);

        /* renamed from: d, reason: collision with root package name */
        private static final CopyOnWriteArraySet<com.bytedance.android.input.basic.settings.api.b> f2080d = new CopyOnWriteArraySet<>();

        /* renamed from: f, reason: collision with root package name */
        private static final e<IInputSettings> f2082f = kotlin.a.c(C0059a.a);

        /* renamed from: com.bytedance.android.input.basic.settings.api.IInputSettings$a$a, reason: collision with other inner class name */
        static final class C0059a extends m implements kotlin.s.b.a<IInputSettings> {
            public static final C0059a a = new C0059a();

            C0059a() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public IInputSettings invoke() {
                return (IInputSettings) com.ss.android.i.a.a.a.e.a().b(IInputSettings.class);
            }
        }

        public static final class b implements d {
            b() {
            }

            @Override // com.bytedance.news.common.settings.d
            public void a(com.bytedance.news.common.settings.e.d dVar) {
                IAppGlobals.a.x("Settings_init", "onSettingsUpdate");
                Iterator it2 = a.f2080d.iterator();
                while (it2.hasNext()) {
                    ((com.bytedance.android.input.basic.settings.api.b) it2.next()).onSettingsUpdate();
                }
            }
        }

        static final class c extends m implements kotlin.s.b.a<Handler> {
            public static final c a = new c();

            c() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public Handler invoke() {
                return new Handler(Looper.getMainLooper());
            }
        }

        private a() {
        }

        private final IInputSettings j() {
            return f2082f.getValue();
        }

        private final void l() {
            e();
            IAppGlobals.a aVar = IAppGlobals.a;
            StringBuilder M = e.a.a.a.a.M("innerUpdateConfig = ");
            M.append(a().q());
            aVar.x("Settings_init", M.toString());
            f2079c.getValue().postDelayed(new Runnable() { // from class: com.bytedance.android.input.basic.settings.api.a
                @Override // java.lang.Runnable
                public final void run() {
                    IInputSettings.a.m();
                }
            }, a().q() * com.heytap.mcssdk.constant.a.f6886d);
        }

        public static void m() {
            b.l();
        }

        @Override // com.bytedance.android.input.basic.settings.api.IInputSettings
        public com.bytedance.android.input.basic.settings.api.c.e a() {
            com.bytedance.android.input.basic.settings.api.c.e a;
            IInputSettings j = j();
            return (j == null || (a = j.a()) == null) ? new com.bytedance.android.input.basic.settings.api.c.e(0, false, 0, 0, 0, false, 0, 0, false, 0, false, false, false, false, false, false, false, null, null, null, 0L, false, false, null, null, null, false, false, false, false, false, false, 0, null, null, false, -1, 15) : a;
        }

        @Override // com.bytedance.android.input.basic.settings.api.IInputSettings
        public j b() {
            j b2;
            if (!IAppGlobals.a.F()) {
                return new j(false, false, new com.bytedance.android.input.basic.settings.api.c.c("os.ime.reply_suggest_seed_20240126", "os.ime.reply_suggest_gpt_240125"), new com.bytedance.android.input.basic.settings.api.c.b(new com.bytedance.android.input.basic.settings.api.c.c("os.ime.circle_polish_seed", "os.ime.circle_polish"), new com.bytedance.android.input.basic.settings.api.c.c("os.ime.circle_expansion_seed", "os.ime.circle_expansion"), new com.bytedance.android.input.basic.settings.api.c.c("os.ime.circle_mandate_suggest_seed", "os.ime.circle_mandate_suggest")), new com.bytedance.android.input.basic.settings.api.c.b(new com.bytedance.android.input.basic.settings.api.c.c("os.ime.mail_polish_seed", "os.ime.mail_polish"), new com.bytedance.android.input.basic.settings.api.c.c("os.ime.mail_expansion_seed", "os.ime.mail_expansion"), new com.bytedance.android.input.basic.settings.api.c.c("os.ime.mail_mandate_suggest_seed", "os.ime.mail_mandate_suggest")), new com.bytedance.android.input.basic.settings.api.c.b(new com.bytedance.android.input.basic.settings.api.c.c("os.ime.redbook_polish_seed", "os.ime.redbook_polish"), new com.bytedance.android.input.basic.settings.api.c.c("os.ime.redbook_expansion_seed", "os.ime.redbook_expansion"), new com.bytedance.android.input.basic.settings.api.c.c("os.ime.redbook_mandate_suggest_seed", "os.ime.redbook_mandate_suggest")), null, null, null, null, null, null, null, new com.bytedance.android.input.basic.settings.api.c.c("os.ime.command_parser_seed", "os.ime.command_parser"), "os.ime.content_suggest", 8128);
            }
            IInputSettings j = j();
            return (j == null || (b2 = j.b()) == null) ? new j(false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767) : b2;
        }

        @Override // com.bytedance.android.input.basic.settings.api.IInputSettings
        public h c() {
            h c2;
            IInputSettings j = j();
            return (j == null || (c2 = j.c()) == null) ? new h(0, false, false, false, 15) : c2;
        }

        @Override // com.bytedance.android.input.basic.settings.api.IInputSettings
        public com.bytedance.android.input.basic.settings.api.c.a d() {
            com.bytedance.android.input.basic.settings.api.c.a d2;
            IInputSettings j = j();
            return (j == null || (d2 = j.d()) == null) ? new com.bytedance.android.input.basic.settings.api.c.a(null, null, 0, 0, 0, 0, 0, 0, 0, null, 0, 0L, false, false, false, false, null, null, null, false, null, false, null, null, false, false, 67108863) : d2;
        }

        @Override // com.bytedance.android.input.basic.settings.api.IInputSettings
        public void e() {
            if (j() != null) {
                IInputSettings j = j();
                l.c(j);
                j.e();
            }
        }

        @Override // com.bytedance.android.input.basic.settings.api.IInputSettings
        public g f() {
            g f2;
            IInputSettings j = j();
            return (j == null || (f2 = j.f()) == null) ? new g(null, false, 3) : f2;
        }

        @Override // com.bytedance.android.input.basic.settings.api.IInputSettings
        public com.bytedance.android.input.basic.settings.api.c.d g() {
            com.bytedance.android.input.basic.settings.api.c.d g2;
            IInputSettings j = j();
            return (j == null || (g2 = j.g()) == null) ? new com.bytedance.android.input.basic.settings.api.c.d(false, false, 0, null, null, 0, 0, false, 255) : g2;
        }

        public final void i(com.bytedance.android.input.basic.settings.api.b bVar) {
            if (bVar == null) {
                return;
            }
            f2080d.add(bVar);
        }

        public final void k() {
            if (f2081e) {
                return;
            }
            IAppGlobals.a.x("Settings_init", "init");
            l();
            com.bytedance.news.common.settings.c.f(new b(), false);
            f2081e = true;
        }

        public final void n(com.bytedance.android.input.basic.settings.api.b bVar) {
            if (bVar == null) {
                return;
            }
            f2080d.remove(bVar);
        }
    }

    com.bytedance.android.input.basic.settings.api.c.e a();

    j b();

    h c();

    com.bytedance.android.input.basic.settings.api.c.a d();

    void e();

    g f();

    com.bytedance.android.input.basic.settings.api.c.d g();
}
