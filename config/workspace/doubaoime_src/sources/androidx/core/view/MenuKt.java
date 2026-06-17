package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;
import kotlin.o;
import kotlin.s.b.p;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class MenuKt {
    public static final boolean contains(Menu menu, MenuItem menuItem) {
        l.f(menu, "<this>");
        l.f(menuItem, "item");
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            if (l.a(menu.getItem(i), menuItem)) {
                return true;
            }
        }
        return false;
    }

    public static final void forEach(Menu menu, kotlin.s.b.l<? super MenuItem, o> lVar) {
        l.f(menu, "<this>");
        l.f(lVar, "action");
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = menu.getItem(i);
            l.e(item, "getItem(index)");
            lVar.invoke(item);
        }
    }

    public static final void forEachIndexed(Menu menu, p<? super Integer, ? super MenuItem, o> pVar) {
        l.f(menu, "<this>");
        l.f(pVar, "action");
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            Integer valueOf = Integer.valueOf(i);
            MenuItem item = menu.getItem(i);
            l.e(item, "getItem(index)");
            pVar.invoke(valueOf, item);
        }
    }

    public static final MenuItem get(Menu menu, int i) {
        l.f(menu, "<this>");
        MenuItem item = menu.getItem(i);
        l.e(item, "getItem(index)");
        return item;
    }

    public static final kotlin.x.e<MenuItem> getChildren(final Menu menu) {
        l.f(menu, "<this>");
        return new kotlin.x.e<MenuItem>() { // from class: androidx.core.view.MenuKt$children$1
            @Override // kotlin.x.e
            public Iterator<MenuItem> iterator() {
                return MenuKt.iterator(menu);
            }
        };
    }

    public static final int getSize(Menu menu) {
        l.f(menu, "<this>");
        return menu.size();
    }

    public static final boolean isEmpty(Menu menu) {
        l.f(menu, "<this>");
        return menu.size() == 0;
    }

    public static final boolean isNotEmpty(Menu menu) {
        l.f(menu, "<this>");
        return menu.size() != 0;
    }

    public static final Iterator<MenuItem> iterator(Menu menu) {
        l.f(menu, "<this>");
        return new MenuKt$iterator$1(menu);
    }

    public static final void minusAssign(Menu menu, MenuItem menuItem) {
        l.f(menu, "<this>");
        l.f(menuItem, "item");
        menu.removeItem(menuItem.getItemId());
    }

    public static final void removeItemAt(Menu menu, int i) {
        o oVar;
        l.f(menu, "<this>");
        MenuItem item = menu.getItem(i);
        if (item != null) {
            menu.removeItem(item.getItemId());
            oVar = o.a;
        } else {
            oVar = null;
        }
        if (oVar == null) {
            throw new IndexOutOfBoundsException();
        }
    }
}
