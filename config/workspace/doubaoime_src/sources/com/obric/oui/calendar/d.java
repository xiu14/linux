package com.obric.oui.calendar;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.calendar.e;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
abstract class d<V extends e> extends PagerAdapter {
    private final ArrayDeque<V> a;
    protected final MaterialCalendarView b;

    /* renamed from: c, reason: collision with root package name */
    private final CalendarDay f7667c;
    private f k;
    private com.obric.oui.calendar.w.e n;
    private com.obric.oui.calendar.w.e o;
    private List<h> p;
    private List<j> q;
    private boolean r;
    boolean s;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    private com.obric.oui.calendar.w.g f7668d = com.obric.oui.calendar.w.g.a;

    /* renamed from: e, reason: collision with root package name */
    private Integer f7669e = null;

    /* renamed from: f, reason: collision with root package name */
    private Integer f7670f = null;

    /* renamed from: g, reason: collision with root package name */
    private Integer f7671g = null;
    private int h = 4;
    private CalendarDay i = null;
    private CalendarDay j = null;
    private List<CalendarDay> l = new ArrayList();
    private com.obric.oui.calendar.w.h m = com.obric.oui.calendar.w.h.a;

    d(MaterialCalendarView materialCalendarView) {
        com.obric.oui.calendar.w.e eVar = com.obric.oui.calendar.w.e.a;
        this.n = eVar;
        this.o = eVar;
        this.p = new ArrayList();
        this.q = null;
        this.r = true;
        this.b = materialCalendarView;
        this.f7667c = CalendarDay.m();
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
                this.b.A(calendarDay2);
                i--;
            }
            i++;
        }
        Iterator<V> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().m(this.l);
        }
    }

    public void A(com.obric.oui.calendar.w.h hVar) {
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
        this.f7671g = Integer.valueOf(i);
        Iterator<V> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().q(i);
        }
    }

    public void a() {
        this.l.clear();
        m();
    }

    protected abstract f b(CalendarDay calendarDay, CalendarDay calendarDay2);

    protected abstract V c(int i);

    protected int d() {
        Integer num = this.f7670f;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        e eVar = (e) obj;
        this.a.remove(eVar);
        viewGroup.removeView(eVar);
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

    public f g() {
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
        e eVar = (e) obj;
        if (eVar.c() != null && (k = k(eVar)) >= 0) {
            return k;
        }
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i) {
        return this.f7668d.a(f(i));
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
            charSequence = materialCalendarView.getContext().getString(C0838R.string.oui_calendar);
        }
        c2.setContentDescription(charSequence);
        c2.setAlpha(0.0f);
        c2.o(this.r);
        c2.p(this.m);
        c2.h(this.n);
        c2.i(this.o);
        Integer num = this.f7669e;
        if (num != null) {
            c2.n(num.intValue());
        }
        Integer num2 = this.f7670f;
        if (num2 != null) {
            c2.g(num2.intValue());
        }
        Integer num3 = this.f7671g;
        if (num3 != null) {
            c2.q(num3.intValue());
        }
        c2.f7673d = this.h;
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
        Integer num = this.f7671g;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    protected abstract int k(V v);

    public void l() {
        this.q = new ArrayList();
        for (h hVar : this.p) {
            i iVar = new i();
            hVar.b(iVar);
            if (iVar.f()) {
                this.q.add(new j(hVar, iVar));
            }
        }
        Iterator<V> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().j(this.q);
        }
    }

    protected abstract boolean n(Object obj);

    public d<?> o(d<?> dVar) {
        dVar.f7668d = this.f7668d;
        dVar.f7669e = this.f7669e;
        dVar.f7670f = this.f7670f;
        dVar.f7671g = this.f7671g;
        dVar.h = this.h;
        dVar.i = this.i;
        dVar.j = this.j;
        dVar.l = this.l;
        dVar.m = this.m;
        dVar.n = this.n;
        dVar.o = this.o;
        dVar.p = this.p;
        dVar.q = this.q;
        dVar.r = this.r;
        return dVar;
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
        this.f7670f = Integer.valueOf(i);
        Iterator<V> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().g(i);
        }
    }

    public void s(com.obric.oui.calendar.w.e eVar) {
        com.obric.oui.calendar.w.e eVar2 = this.o;
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

    public void t(com.obric.oui.calendar.w.e eVar) {
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
            calendarDay = CalendarDay.a(this.f7667c.g() - 200, this.f7667c.f(), this.f7667c.e());
        }
        if (calendarDay2 == null) {
            calendarDay2 = CalendarDay.a(this.f7667c.g() + 200, this.f7667c.f(), this.f7667c.e());
        }
        this.k = b(calendarDay, calendarDay2);
        notifyDataSetChanged();
        m();
    }

    public void v(int i) {
        this.f7669e = Integer.valueOf(i);
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
            next.f7673d = i;
            next.r();
        }
    }

    public void y(boolean z) {
        this.s = z;
    }

    public void z(@Nullable com.obric.oui.calendar.w.g gVar) {
        if (gVar == null) {
            gVar = com.obric.oui.calendar.w.g.a;
        }
        this.f7668d = gVar;
    }
}
