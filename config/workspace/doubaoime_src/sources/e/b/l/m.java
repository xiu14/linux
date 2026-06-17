package e.b.l;

import com.bytedance.rpc.serialize.SerializeType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Map;

/* loaded from: classes2.dex */
public class m {
    private static e.b.l.q.b i = new e.b.l.q.b(1, 999999999);
    a a;
    private h b;

    /* renamed from: c, reason: collision with root package name */
    private k f9636c;

    /* renamed from: d, reason: collision with root package name */
    private Object[] f9637d;

    /* renamed from: e, reason: collision with root package name */
    private e.b.l.p.a f9638e;

    /* renamed from: f, reason: collision with root package name */
    protected Type f9639f;

    /* renamed from: g, reason: collision with root package name */
    protected Type f9640g;
    private int h;

    public m(m mVar) {
        if (mVar != null) {
            this.b = mVar.b;
            this.f9636c = mVar.f9636c;
            this.f9637d = mVar.f9637d;
            this.f9638e = mVar.f9638e;
            this.f9639f = mVar.f9639f;
            this.f9640g = mVar.f9640g;
            this.h = mVar.h;
            this.a = mVar.a;
        }
    }

    boolean a(Map<String, String> map, Map<String, String> map2) {
        String[] c2 = this.f9636c.c();
        int length = c2 == null ? 0 : c2.length;
        if (length == 0) {
            return this.b.b(null, map, map2);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (this.b.b(c2[i3], map, map2)) {
                i2++;
            }
        }
        return i2 == length;
    }

    public Object[] b() {
        return this.f9637d;
    }

    public e.b.l.p.a c() {
        return this.f9638e;
    }

    public Method d() {
        return this.f9636c.d();
    }

    public String e() {
        return this.f9636c.f();
    }

    public String f() {
        return this.f9636c.h();
    }

    public int g() {
        return this.h;
    }

    public Type h() {
        return this.f9640g;
    }

    public h i() {
        return this.b;
    }

    public k j() {
        return this.f9636c;
    }

    public SerializeType k() {
        return this.f9636c.j();
    }

    public Class l() {
        return this.f9636c.k();
    }

    public boolean m() {
        return this.f9636c.l();
    }

    public boolean n() {
        return this.f9636c.m();
    }

    public boolean o() {
        return this.f9636c.n();
    }

    m(h hVar, k kVar, Object[] objArr, e.b.l.p.a aVar, Type type) {
        Type[] actualTypeArguments;
        this.b = hVar;
        this.f9636c = kVar;
        this.f9637d = objArr;
        this.f9638e = aVar;
        this.h = i.a();
        this.f9640g = e.b.l.q.e.f(this.f9636c.i());
        Type type2 = null;
        type2 = null;
        type2 = null;
        if (m()) {
            Type type3 = (!(type instanceof ParameterizedType) || (actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments()) == null || actualTypeArguments.length == 0) ? null : actualTypeArguments[0];
            if (type3 instanceof WildcardType) {
                Type[] genericInterfaces = aVar != null ? aVar.getClass().getGenericInterfaces() : null;
                if (genericInterfaces != null && genericInterfaces.length > 0 && (genericInterfaces[0] instanceof ParameterizedType)) {
                    type3 = ((ParameterizedType) genericInterfaces[0]).getActualTypeArguments()[0];
                }
            }
            this.f9639f = type3;
            return;
        }
        Type type4 = this.f9640g;
        if (type4 == Object.class && objArr.length > 0) {
            for (Object obj : objArr) {
                if (obj instanceof Class) {
                    type2 = (Type) obj;
                }
            }
        }
        this.f9639f = type2 != null ? type2 : type4;
    }
}
