package com.bytedance.android.input.basic.recognition.api;

import com.ss.android.socialbase.downloader.constants.DBDefinition;
import java.util.Objects;
import java.util.UUID;
import kotlin.o;
import kotlin.s.c.g;
import kotlin.s.c.l;
import kotlin.s.c.m;

/* loaded from: classes.dex */
public interface IRecognizer {
    public static final b a = b.a;

    public enum Scene {
        UNKNOWN(0),
        CHAT(1),
        MAIL(2),
        WE_CHAT_CIRCLE(3),
        XIAO_HONG_SHU(4);

        public static final a Companion = new a(null);
        private final int value;

        public static final class a {
            public a(g gVar) {
            }
        }

        Scene(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    public interface a {
        void a(String str, e eVar);
    }

    public static final class b {
        static final /* synthetic */ b a = new b();
        private static final kotlin.e<IRecognizer> b = kotlin.a.c(a.a);

        static final class a extends m implements kotlin.s.b.a<IRecognizer> {
            public static final a a = new a();

            a() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public IRecognizer invoke() {
                return (IRecognizer) com.ss.android.i.a.a.a.e.a().b(IRecognizer.class);
            }
        }

        private b() {
        }

        public final IRecognizer a(String str) {
            l.f(str, DBDefinition.PACKAGE_NAME);
            IRecognizer value = b.getValue();
            return (value == null || !value.a(str)) ? c.b : value;
        }

        public final void b(String str) {
            l.f(str, "id");
            IRecognizer value = b.getValue();
            if (value == null) {
                value = c.b;
            }
            value.b(str);
        }
    }

    private static final class c implements IRecognizer {
        public static final c b = new c();

        private c() {
        }

        @Override // com.bytedance.android.input.basic.recognition.api.IRecognizer
        public boolean a(String str) {
            l.f(str, DBDefinition.PACKAGE_NAME);
            return false;
        }

        @Override // com.bytedance.android.input.basic.recognition.api.IRecognizer
        public void b(String str) {
            l.f(str, "id");
        }

        @Override // com.bytedance.android.input.basic.recognition.api.IRecognizer
        public void c(kotlin.s.b.a<o> aVar) {
            l.f(aVar, "action");
        }

        @Override // com.bytedance.android.input.basic.recognition.api.IRecognizer
        public String d(String str, a aVar, kotlin.s.b.l<? super String, ? extends Scene> lVar) {
            l.f(str, DBDefinition.PACKAGE_NAME);
            l.f(aVar, "callback");
            String uuid = UUID.randomUUID().toString();
            l.e(uuid, "randomUUID().toString()");
            aVar.a(uuid, new f(com.bytedance.android.input.basic.recognition.api.a.f2075e.a(str), Scene.UNKNOWN));
            return uuid;
        }

        @Override // com.bytedance.android.input.basic.recognition.api.IRecognizer
        public void e(kotlin.s.b.a<o> aVar) {
            l.f(aVar, "action");
        }

        @Override // com.bytedance.android.input.basic.recognition.api.IRecognizer
        public boolean isEnabled() {
            return false;
        }
    }

    public static final class d extends e {
        @Override // com.bytedance.android.input.basic.recognition.api.IRecognizer.e
        public Scene a() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            Objects.requireNonNull((d) obj);
            return l.a(null, null) && l.a(null, null);
        }

        public int hashCode() {
            throw null;
        }

        public String toString() {
            return "Failure(e=null, node=null, scene=null)";
        }
    }

    public static abstract class e {
        private final Scene a;

        public e(Scene scene, g gVar) {
            this.a = scene;
        }

        public Scene a() {
            return this.a;
        }
    }

    public static final class f extends e {
        private final com.bytedance.android.input.basic.recognition.api.a b;

        /* renamed from: c, reason: collision with root package name */
        private final Scene f2074c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.bytedance.android.input.basic.recognition.api.a aVar, Scene scene) {
            super(scene, null);
            l.f(aVar, "conversation");
            l.f(scene, "scene");
            this.b = aVar;
            this.f2074c = scene;
        }

        @Override // com.bytedance.android.input.basic.recognition.api.IRecognizer.e
        public Scene a() {
            return this.f2074c;
        }

        public final com.bytedance.android.input.basic.recognition.api.a b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return l.a(this.b, fVar.b) && this.f2074c == fVar.f2074c;
        }

        public int hashCode() {
            return this.f2074c.hashCode() + (this.b.hashCode() * 31);
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("Success(conversation=");
            M.append(this.b);
            M.append(", scene=");
            M.append(this.f2074c);
            M.append(')');
            return M.toString();
        }
    }

    boolean a(String str);

    void b(String str);

    void c(kotlin.s.b.a<o> aVar);

    String d(String str, a aVar, kotlin.s.b.l<? super String, ? extends Scene> lVar);

    void e(kotlin.s.b.a<o> aVar);

    boolean isEnabled();
}
