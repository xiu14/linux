package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;
import kotlin.o;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class MenuKt$iterator$1 implements Iterator<MenuItem>, Object {
    final /* synthetic */ Menu $this_iterator;
    private int index;

    MenuKt$iterator$1(Menu menu) {
        this.$this_iterator = menu;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.$this_iterator.size();
    }

    @Override // java.util.Iterator
    public void remove() {
        o oVar;
        Menu menu = this.$this_iterator;
        int i = this.index - 1;
        this.index = i;
        MenuItem item = menu.getItem(i);
        if (item != null) {
            l.e(item, "getItem(index)");
            menu.removeItem(item.getItemId());
            oVar = o.a;
        } else {
            oVar = null;
        }
        if (oVar == null) {
            throw new IndexOutOfBoundsException();
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public MenuItem next() {
        Menu menu = this.$this_iterator;
        int i = this.index;
        this.index = i + 1;
        MenuItem item = menu.getItem(i);
        if (item != null) {
            return item;
        }
        throw new IndexOutOfBoundsException();
    }
}
