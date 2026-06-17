package com.prolificinteractive.materialcalendarview;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.android.doubaoime.C0838R;
import com.prolificinteractive.materialcalendarview.d;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
abstract class c<V extends d> extends PagerAdapter {
    private final ArrayDeque<V> a;
    protected final MaterialCalendarView b;

    /* renamed from: c, reason: collision with root package name */
    private final CalendarDay f8206c;
    private e k;
    private com.prolificinteractive.materialcalendarview.w.e n;
    private com.prolificinteractive.materialcalendarview.w.e o;
    private List<g> p;
    private List<i> q;
    private boolean r;
    boolean s;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    private com.prolificinteractive.materialcalendarview.w.g f8207d = com.prolificinteractive.materialcalendarview.w.g.a;

    /* renamed from: e, reason: collision with root package name */
    private Integer f8208e = null;

    /* renamed from: f, reason: collision with root package name */
    private Integer f8209f = null;

    /* renamed from: g, reason: collision with root package name */
    private Integer f8210g = null;
    private int h = 4;
    private CalendarDay i = null;
    private CalendarDay j = null;
    private List<CalendarDay> l = new ArrayList();
    private com.prolificinteractive.materialcalendarview.w.h m = com.prolificinteractive.materialcalendarview.w.h.a;

    c(MaterialCalendarView materialCalendarView) {
        com.prolificinteractive.materialcalendarview.w.e eVar = com.prolificinteractive.materialcalendarview.w.e.a;
        this.n = eVar;
        this.o = eVar;
        this.p = new ArrayList();
        this.q = null;
        this.r = true;
        this.b = materialCalendarView;
        this.f8206c = CalendarDay.m();
        ArrayDeque<V> arrayDeque = new ArrayDeque<>();
        this.a = arrayDeque;
        arrayDeque.iterator();
        u(null, null);
    }

    private void m() {
        CalendarDay calendarDay;
        int i = 0;
        while (i < this.l.size()) {
            CalendarDay calendarDay2 = this.l.get(i);
            CalendarDay calendarDay3 = this.i;
            if ((calendarDay3 != null && calendarDay3.i(calendarDay2)) || ((calendarDay = this.j) != null && calendarDay.j(calendarDay2))) {
                this.l.remove(i);
                this.b.v(calendarDay2);
                i--;
            }
            i++;
        }
        Iterator<V> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().m(this.l);
        }
    }

    public void A(com.prolificinteractive.materialcalendarview.w.h hVar) {
        this.m = hVar;
        Iterator<V> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().p(hVar);
        }
    }

    public void B(int i) {
        if (i == 0) {
            return;
        }
        this.f8210g = Integer.valueOf(i);
        Iterator<V> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().q(i);
        }
    }

    public void a() {
        this.l.clear();
        m();
    }

    protected abstract e b(CalendarDay calendarDay, CalendarDay calendarDay2);

    protected abstract V c(int i);

    protected int d() {
        Integer num = this.f8209f;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        d dVar = (d) obj;
        this.a.remove(dVar);
        viewGroup.removeView(dVar);
    }

    public int e(CalendarDay calendarDay) {
        if (calendarDay == null) {
            return getCount() / 2;
        }
        CalendarDay calendarDay2 = this.i;
        if (calendarDay2 != null && calendarDay.j(calendarDay2)) {
            return 0;
        }
        CalendarDay calendarDay3 = this.j;
        return (calendarDay3 == null || !calendarDay.i(calendarDay3)) ? this.k.a(calendarDay) : getCount() - 1;
    }

    public CalendarDay f(int i) {
        return this.k.getItem(i);
    }

    public e g() {
        return this.k;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.k.getCount();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(@NonNull Object obj) {
        int k;
        if (!n(obj)) {
            return -2;
        }
        d dVar = (d) obj;
        if (dVar.c() != null && (k = k(dVar)) >= 0) {
            return k;
        }
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i) {
        return this.f8207d.a(f(i));
    }

    @NonNull
    public List<CalendarDay> h() {
        return Collections.unmodifiableList(this.l);
    }

    public int i() {
        return this.h;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
        V c2 = c(i);
        MaterialCalendarView materialCalendarView = this.b;
        CharSequence charSequence = materialCalendarView.s;
        if (charSequence == null) {
            charSequence = materialCalendarView.getContext().getString(C0838R.string.calendar);
        }
        c2.setContentDescription(charSequence);
        c2.setAlpha(0.0f);
        c2.o(this.r);
        c2.p(this.m);
        c2.h(this.n);
        c2.i(this.o);
        Integer num = this.f8208e;
        if (num != null) {
            c2.n(num.intValue());
        }
        Integer num2 = this.f8209f;
        if (num2 != null) {
            c2.g(num2.intValue());
        }
        Integer num3 = this.f8210g;
        if (num3 != null) {
            c2.q(num3.intValue());
        }
        c2.f8212d = this.h;
        c2.r();
        c2.l(this.i);
        c2.k(this.j);
        c2.m(this.l);
        viewGroup.addView(c2);
        this.a.add(c2);
        c2.j(this.q);
        return c2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    protected int j() {
        Integer num = this.f8210g;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    protected abstract int k(V v);

    public void l() {
        this.q = new ArrayList();
        for (g gVar : this.p) {
            h hVar = new h();
            gVar.a(hVar);
            if (hVar.f()) {
                this.q.add(new i(gVar, hVar));
            }
        }
        Iterator<V> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().j(this.q);
        }
    }

    protected abstract boolean n(Object obj);

    public c<?> o(c<?> cVar) {
        cVar.f8207d = this.f8207d;
        cVar.f8208e = this.f8208e;
        cVar.f8209f = this.f8209f;
        cVar.f8210g = this.f8210g;
        cVar.h = this.h;
        cVar.i = this.i;
        cVar.j = this.j;
        cVar.l = this.l;
        cVar.m = this.m;
        cVar.n = this.n;
        cVar.o = this.o;
        cVar.p = this.p;
        cVar.q = this.q;
        cVar.r = this.r;
        return cVar;
    }

    public void p(CalendarDay calendarDay, CalendarDay calendarDay2) {
        this.l.clear();
        org.threeten.bp.e H = org.threeten.bp.e.H(calendarDay.g(), calendarDay.f(), calendarDay.e());
        org.threeten.bp.e c2 = calendarDay2.c();
        while (true) {
            if (!H.A(c2) && !H.equals(c2)) {
                m();
                return;
            } else {
                this.l.add(CalendarDay.b(H));
                H = H.L(1L);
            }
        }
    }

    public void q(CalendarDay calendarDay, boolean z) {
        if (z) {
            if (this.l.contains(calendarDay)) {
                return;
            }
            this.l.add(calendarDay);
            m();
            return;
        }
        if (this.l.contains(calendarDay)) {
            this.l.remove(calendarDay);
            m();
        }
    }

    public void r(int i) {
        if (i == 0) {
            return;
        }
        this.f8209f = Integer.valueOf(i);
        Iterator<V> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().g(i);
        }
    }

    public void s(com.prolificinteractive.materialcalendarview.w.e eVar) {
        com.prolificinteractive.materialcalendarview.w.e eVar2 = this.o;
        if (eVar2 == this.n) {
            eVar2 = eVar;
        }
        this.o = eVar2;
        this.n = eVar;
        Iterator<V> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().h(eVar);
        }
    }

    public void t(com.prolificinteractive.materialcalendarview.w.e eVar) {
        this.o = eVar;
        Iterator<V> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().i(eVar);
        }
    }

    public void u(CalendarDay calendarDay, CalendarDay calendarDay2) {
        this.i = calendarDay;
        this.j = calendarDay2;
        Iterator<V> it2 = this.a.iterator();
        while (it2.hasNext()) {
            V next = it2.next();
            next.l(calendarDay);
            next.k(calendarDay2);
        }
        if (calendarDay == null) {
            calendarDay = CalendarDay.a(this.f8206c.g() - 200, this.f8206c.f(), this.f8206c.e());
        }
        if (calendarDay2 == null) {
            calendarDay2 = CalendarDay.a(this.f8206c.g() + 200, this.f8206c.f(), this.f8206c.e());
        }
        this.k = b(calendarDay, calendarDay2);
        notifyDataSetChanged();
        m();
    }

    public void v(int i) {
        this.f8208e = Integer.valueOf(i);
        Iterator<V> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().n(i);
        }
    }

    public void w(boolean z) {
        this.r = z;
        Iterator<V> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().o(this.r);
        }
    }

    public void x(int i) {
        this.h = i;
        Iterator<V> it2 = this.a.iterator();
        while (it2.hasNext()) {
            V next = it2.next();
            next.f8212d = i;
            next.r();
        }
    }

    public void y(boolean z) {
        this.s = z;
    }

    public void z(@Nullable com.prolificinteractive.materialcalendarview.w.g gVar) {
        if (gVar == null) {
            gVar = com.prolificinteractive.materialcalendarview.w.g.a;
        }
        this.f8207d = gVar;
    }
}
