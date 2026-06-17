package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.s.c.D;

/* loaded from: classes2.dex */
public final class g extends i {
    public static <T> T A(T[] tArr, int i) {
        kotlin.s.c.l.f(tArr, "<this>");
        if (i < 0 || i > y(tArr)) {
            return null;
        }
        return tArr[i];
    }

    public static final <T, A extends Appendable> A B(Iterable<? extends T> iterable, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, kotlin.s.b.l<? super T, ? extends CharSequence> lVar) {
        kotlin.s.c.l.f(iterable, "<this>");
        kotlin.s.c.l.f(a, "buffer");
        kotlin.s.c.l.f(charSequence, "separator");
        kotlin.s.c.l.f(charSequence2, "prefix");
        kotlin.s.c.l.f(charSequence3, "postfix");
        kotlin.s.c.l.f(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (T t : iterable) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            kotlin.text.a.a(a, t, lVar);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    public static String C(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, kotlin.s.b.l lVar, int i2, Object obj) {
        CharSequence charSequence5 = (i2 & 1) != 0 ? ", " : charSequence;
        CharSequence charSequence6 = (i2 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence7 = (i2 & 4) == 0 ? charSequence3 : "";
        int i3 = (i2 & 8) != 0 ? -1 : i;
        String str = (i2 & 16) != 0 ? "..." : null;
        kotlin.s.b.l lVar2 = (i2 & 32) == 0 ? lVar : null;
        kotlin.s.c.l.f(iterable, "<this>");
        kotlin.s.c.l.f(charSequence5, "separator");
        kotlin.s.c.l.f(charSequence6, "prefix");
        kotlin.s.c.l.f(charSequence7, "postfix");
        kotlin.s.c.l.f(str, "truncated");
        StringBuilder sb = new StringBuilder();
        B(iterable, sb, charSequence5, charSequence6, charSequence7, i3, str, lVar2);
        String sb2 = sb.toString();
        kotlin.s.c.l.e(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static <T> T D(List<? extends T> list) {
        kotlin.s.c.l.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(w(list));
    }

    public static <T> T E(List<? extends T> list) {
        kotlin.s.c.l.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static <T> List<T> F(T t) {
        List<T> singletonList = Collections.singletonList(t);
        kotlin.s.c.l.e(singletonList, "singletonList(element)");
        return singletonList;
    }

    public static <T> List<T> G(T... tArr) {
        kotlin.s.c.l.f(tArr, "elements");
        return tArr.length > 0 ? d(tArr) : l.a;
    }

    public static int H(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static <K, V> Map<K, V> I(kotlin.g<? extends K, ? extends V> gVar) {
        kotlin.s.c.l.f(gVar, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(gVar.c(), gVar.d());
        kotlin.s.c.l.e(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    public static <K, V> Map<K, V> J(kotlin.g<? extends K, ? extends V>... gVarArr) {
        kotlin.s.c.l.f(gVarArr, "pairs");
        if (gVarArr.length <= 0) {
            o();
            return m.a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(H(gVarArr.length));
        kotlin.s.c.l.f(gVarArr, "<this>");
        kotlin.s.c.l.f(linkedHashMap, "destination");
        Q(linkedHashMap, gVarArr);
        return linkedHashMap;
    }

    public static <T> List<T> K(T... tArr) {
        kotlin.s.c.l.f(tArr, "elements");
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new e(tArr, true));
    }

    public static <K, V> Map<K, V> L(kotlin.g<? extends K, ? extends V>... gVarArr) {
        kotlin.s.c.l.f(gVarArr, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(H(gVarArr.length));
        Q(linkedHashMap, gVarArr);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> List<T> M(List<? extends T> list) {
        kotlin.s.c.l.f(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : F(list.get(0)) : l.a;
    }

    public static <T> Set<T> N(Set<? extends T> set, Iterable<? extends T> iterable) {
        kotlin.s.c.l.f(set, "<this>");
        kotlin.s.c.l.f(iterable, "elements");
        kotlin.s.c.l.f(iterable, "<this>");
        Integer valueOf = iterable instanceof Collection ? Integer.valueOf(((Collection) iterable).size()) : null;
        LinkedHashSet linkedHashSet = new LinkedHashSet(H(valueOf != null ? set.size() + valueOf.intValue() : set.size() * 2));
        linkedHashSet.addAll(set);
        a(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static int[] O(int[] iArr, int[] iArr2) {
        kotlin.s.c.l.f(iArr, "<this>");
        kotlin.s.c.l.f(iArr2, "elements");
        int length = iArr.length;
        int length2 = iArr2.length;
        int[] copyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(iArr2, 0, copyOf, length, length2);
        kotlin.s.c.l.e(copyOf, "result");
        return copyOf;
    }

    public static <T> T[] P(T[] tArr, T[] tArr2) {
        kotlin.s.c.l.f(tArr, "<this>");
        kotlin.s.c.l.f(tArr2, "elements");
        int length = tArr.length;
        int length2 = tArr2.length;
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, length + length2);
        System.arraycopy(tArr2, 0, tArr3, length, length2);
        kotlin.s.c.l.e(tArr3, "result");
        return tArr3;
    }

    public static final <K, V> void Q(Map<? super K, ? super V> map, kotlin.g<? extends K, ? extends V>[] gVarArr) {
        kotlin.s.c.l.f(map, "<this>");
        kotlin.s.c.l.f(gVarArr, "pairs");
        for (kotlin.g<? extends K, ? extends V> gVar : gVarArr) {
            map.put(gVar.a(), gVar.b());
        }
    }

    public static <T> boolean R(Iterable<? extends T> iterable, kotlin.s.b.l<? super T, Boolean> lVar) {
        kotlin.s.c.l.f(iterable, "<this>");
        kotlin.s.c.l.f(lVar, "predicate");
        return q(iterable, lVar, true);
    }

    public static <T> boolean S(List<T> list, kotlin.s.b.l<? super T, Boolean> lVar) {
        kotlin.s.c.l.f(list, "<this>");
        kotlin.s.c.l.f(lVar, "predicate");
        if (!(list instanceof RandomAccess)) {
            kotlin.s.c.l.d(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return q(D.b(list), lVar, true);
        }
        o it2 = new kotlin.w.d(0, w(list)).iterator();
        int i = 0;
        while (((kotlin.w.c) it2).hasNext()) {
            int nextInt = it2.nextInt();
            T t = list.get(nextInt);
            if (!lVar.invoke(t).booleanValue()) {
                if (i != nextInt) {
                    list.set(i, t);
                }
                i++;
            }
        }
        if (i >= list.size()) {
            return false;
        }
        int w = w(list);
        if (i > w) {
            return true;
        }
        while (true) {
            list.remove(w);
            if (w == i) {
                return true;
            }
            w--;
        }
    }

    public static <T> List<T> T(Iterable<? extends T> iterable) {
        kotlin.s.c.l.f(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return e0(iterable);
        }
        List<T> j0 = j0(iterable);
        kotlin.s.c.l.f(j0, "<this>");
        Collections.reverse(j0);
        return j0;
    }

    public static final <T> Set<T> U(T t) {
        Set<T> singleton = Collections.singleton(t);
        kotlin.s.c.l.e(singleton, "singleton(element)");
        return singleton;
    }

    public static <T> Set<T> V(T... tArr) {
        kotlin.s.c.l.f(tArr, "elements");
        if (tArr.length <= 0) {
            return n.a;
        }
        kotlin.s.c.l.f(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            return n.a;
        }
        if (length == 1) {
            return U(tArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(H(tArr.length));
        d0(tArr, linkedHashSet);
        return linkedHashSet;
    }

    public static char W(char[] cArr) {
        kotlin.s.c.l.f(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static <T extends Comparable<? super T>> void X(List<T> list) {
        kotlin.s.c.l.f(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> List<T> Y(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        kotlin.s.c.l.f(iterable, "<this>");
        kotlin.s.c.l.f(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List<T> j0 = j0(iterable);
            kotlin.s.c.l.f(j0, "<this>");
            kotlin.s.c.l.f(comparator, "comparator");
            if (j0.size() <= 1) {
                return j0;
            }
            Collections.sort(j0, comparator);
            return j0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return e0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        kotlin.s.c.l.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        kotlin.s.c.l.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.CollectionsKt___CollectionsKt.sortedWith>");
        kotlin.s.c.l.f(array, "<this>");
        kotlin.s.c.l.f(comparator, "comparator");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return d(array);
    }

    public static <T> List<T> Z(Iterable<? extends T> iterable, int i) {
        kotlin.s.c.l.f(iterable, "<this>");
        int i2 = 0;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(e.a.a.a.a.k("Requested element count ", i, " is less than zero.").toString());
        }
        if (i == 0) {
            return l.a;
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return e0(iterable);
            }
            if (i == 1) {
                return F(s(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator<? extends T> it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return M(arrayList);
    }

    public static <T> boolean a(Collection<? super T> collection, Iterable<? extends T> iterable) {
        kotlin.s.c.l.f(collection, "<this>");
        kotlin.s.c.l.f(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z = false;
        Iterator<? extends T> it2 = iterable.iterator();
        while (it2.hasNext()) {
            if (collection.add(it2.next())) {
                z = true;
            }
        }
        return z;
    }

    public static void a0() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static <T> boolean b(Collection<? super T> collection, T[] tArr) {
        kotlin.s.c.l.f(collection, "<this>");
        kotlin.s.c.l.f(tArr, "elements");
        return collection.addAll(d(tArr));
    }

    public static void b0() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static <T> ArrayList<T> c(T... tArr) {
        kotlin.s.c.l.f(tArr, "elements");
        return tArr.length == 0 ? new ArrayList<>() : new ArrayList<>(new e(tArr, true));
    }

    public static final <T, C extends Collection<? super T>> C c0(Iterable<? extends T> iterable, C c2) {
        kotlin.s.c.l.f(iterable, "<this>");
        kotlin.s.c.l.f(c2, "destination");
        Iterator<? extends T> it2 = iterable.iterator();
        while (it2.hasNext()) {
            c2.add(it2.next());
        }
        return c2;
    }

    public static <T> List<T> d(T[] tArr) {
        kotlin.s.c.l.f(tArr, "<this>");
        List<T> asList = Arrays.asList(tArr);
        kotlin.s.c.l.e(asList, "asList(this)");
        return asList;
    }

    public static final <T, C extends Collection<? super T>> C d0(T[] tArr, C c2) {
        kotlin.s.c.l.f(tArr, "<this>");
        kotlin.s.c.l.f(c2, "destination");
        for (T t : tArr) {
            c2.add(t);
        }
        return c2;
    }

    public static <T> int e(Iterable<? extends T> iterable, int i) {
        kotlin.s.c.l.f(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    public static <T> List<T> e0(Iterable<? extends T> iterable) {
        kotlin.s.c.l.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return M(j0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return l.a;
        }
        if (size != 1) {
            return k0(collection);
        }
        return F(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static <T> boolean f(Iterable<? extends T> iterable, T t) {
        int i;
        kotlin.s.c.l.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(t);
        }
        kotlin.s.c.l.f(iterable, "<this>");
        if (!(iterable instanceof List)) {
            Iterator<? extends T> it2 = iterable.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i = -1;
                    break;
                }
                T next = it2.next();
                if (i2 < 0) {
                    b0();
                    throw null;
                }
                if (kotlin.s.c.l.a(t, next)) {
                    i = i2;
                    break;
                }
                i2++;
            }
        } else {
            i = ((List) iterable).indexOf(t);
        }
        return i >= 0;
    }

    public static <T> List<T> f0(T[] tArr) {
        kotlin.s.c.l.f(tArr, "<this>");
        int length = tArr.length;
        return length != 0 ? length != 1 ? l0(tArr) : F(tArr[0]) : l.a;
    }

    public static <T> boolean g(T[] tArr, T t) {
        int i;
        kotlin.s.c.l.f(tArr, "<this>");
        kotlin.s.c.l.f(tArr, "<this>");
        if (t == null) {
            int length = tArr.length;
            i = 0;
            while (i < length) {
                if (tArr[i] == null) {
                    break;
                }
                i++;
            }
            i = -1;
        } else {
            int length2 = tArr.length;
            for (int i2 = 0; i2 < length2; i2++) {
                if (kotlin.s.c.l.a(t, tArr[i2])) {
                    i = i2;
                    break;
                }
            }
            i = -1;
        }
        return i >= 0;
    }

    public static <K, V> Map<K, V> g0(Iterable<? extends kotlin.g<? extends K, ? extends V>> iterable) {
        kotlin.s.c.l.f(iterable, "<this>");
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            o();
            return m.a;
        }
        if (size == 1) {
            return I((kotlin.g) ((List) iterable).get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(H(collection.size()));
        h0(iterable, linkedHashMap);
        return linkedHashMap;
    }

    public static byte[] h(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        kotlin.s.c.l.f(bArr, "<this>");
        kotlin.s.c.l.f(bArr2, "destination");
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
        return bArr2;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M h0(Iterable<? extends kotlin.g<? extends K, ? extends V>> iterable, M m) {
        kotlin.s.c.l.f(iterable, "<this>");
        kotlin.s.c.l.f(m, "destination");
        kotlin.s.c.l.f(m, "<this>");
        kotlin.s.c.l.f(iterable, "pairs");
        for (kotlin.g<? extends K, ? extends V> gVar : iterable) {
            m.put(gVar.a(), gVar.b());
        }
        return m;
    }

    public static final <T> T[] i(T[] tArr, T[] tArr2, int i, int i2, int i3) {
        kotlin.s.c.l.f(tArr, "<this>");
        kotlin.s.c.l.f(tArr2, "destination");
        System.arraycopy(tArr, i2, tArr2, i, i3 - i2);
        return tArr2;
    }

    public static <K, V> Map<K, V> i0(Map<? extends K, ? extends V> map) {
        kotlin.s.c.l.f(map, "<this>");
        int size = map.size();
        if (size == 0) {
            o();
            return m.a;
        }
        if (size == 1) {
            return n0(map);
        }
        kotlin.s.c.l.f(map, "<this>");
        return new LinkedHashMap(map);
    }

    public static /* synthetic */ Object[] j(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        i(objArr, objArr2, i, i2, i3);
        return objArr2;
    }

    public static final <T> List<T> j0(Iterable<? extends T> iterable) {
        kotlin.s.c.l.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return k0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        c0(iterable, arrayList);
        return arrayList;
    }

    public static byte[] k(byte[] bArr, int i, int i2) {
        kotlin.s.c.l.f(bArr, "<this>");
        m(i2, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
        kotlin.s.c.l.e(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    public static <T> List<T> k0(Collection<? extends T> collection) {
        kotlin.s.c.l.f(collection, "<this>");
        return new ArrayList(collection);
    }

    public static int[] l(int[] iArr, int i, int i2) {
        kotlin.s.c.l.f(iArr, "<this>");
        m(i2, iArr.length);
        int[] copyOfRange = Arrays.copyOfRange(iArr, i, i2);
        kotlin.s.c.l.e(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    public static <T> List<T> l0(T[] tArr) {
        kotlin.s.c.l.f(tArr, "<this>");
        kotlin.s.c.l.f(tArr, "<this>");
        return new ArrayList(new e(tArr, false));
    }

    public static final void m(int i, int i2) {
        if (i <= i2) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i2 + ").");
    }

    public static <T> Set<T> m0(Iterable<? extends T> iterable) {
        kotlin.s.c.l.f(iterable, "<this>");
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return n.a;
        }
        if (size == 1) {
            return U(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(H(collection.size()));
        c0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static <T> List<T> n(Iterable<? extends T> iterable, int i) {
        ArrayList arrayList;
        Object obj;
        kotlin.s.c.l.f(iterable, "<this>");
        int i2 = 0;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(e.a.a.a.a.k("Requested element count ", i, " is less than zero.").toString());
        }
        if (i == 0) {
            return e0(iterable);
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size() - i;
            if (size <= 0) {
                return l.a;
            }
            if (size == 1) {
                kotlin.s.c.l.f(iterable, "<this>");
                if (iterable instanceof List) {
                    obj = D((List) iterable);
                } else {
                    Iterator<? extends T> it2 = iterable.iterator();
                    if (!it2.hasNext()) {
                        throw new NoSuchElementException("Collection is empty.");
                    }
                    T next = it2.next();
                    while (it2.hasNext()) {
                        next = it2.next();
                    }
                    obj = next;
                }
                return F(obj);
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    int size2 = collection.size();
                    while (i < size2) {
                        arrayList.add(((List) iterable).get(i));
                        i++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        for (T t : iterable) {
            if (i2 >= i) {
                arrayList.add(t);
            } else {
                i2++;
            }
        }
        return M(arrayList);
    }

    public static final <K, V> Map<K, V> n0(Map<? extends K, ? extends V> map) {
        kotlin.s.c.l.f(map, "<this>");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        kotlin.s.c.l.e(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }

    public static <K, V> Map<K, V> o() {
        m mVar = m.a;
        kotlin.s.c.l.d(mVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return mVar;
    }

    public static <T> void p(T[] tArr, T t, int i, int i2) {
        kotlin.s.c.l.f(tArr, "<this>");
        Arrays.fill(tArr, i, i2, t);
    }

    private static final <T> boolean q(Iterable<? extends T> iterable, kotlin.s.b.l<? super T, Boolean> lVar, boolean z) {
        Iterator<? extends T> it2 = iterable.iterator();
        boolean z2 = false;
        while (it2.hasNext()) {
            if (lVar.invoke(it2.next()).booleanValue() == z) {
                it2.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static <T> List<T> r(T[] tArr) {
        kotlin.s.c.l.f(tArr, "<this>");
        ArrayList arrayList = new ArrayList();
        kotlin.s.c.l.f(tArr, "<this>");
        kotlin.s.c.l.f(arrayList, "destination");
        for (T t : tArr) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static <T> T s(Iterable<? extends T> iterable) {
        kotlin.s.c.l.f(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) t((List) iterable);
        }
        Iterator<? extends T> it2 = iterable.iterator();
        if (it2.hasNext()) {
            return it2.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static <T> T t(List<? extends T> list) {
        kotlin.s.c.l.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static <T> T u(List<? extends T> list) {
        kotlin.s.c.l.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static kotlin.w.d v(Collection<?> collection) {
        kotlin.s.c.l.f(collection, "<this>");
        return new kotlin.w.d(0, collection.size() - 1);
    }

    public static <T> int w(List<? extends T> list) {
        kotlin.s.c.l.f(list, "<this>");
        return list.size() - 1;
    }

    public static int x(float[] fArr) {
        kotlin.s.c.l.f(fArr, "<this>");
        return fArr.length - 1;
    }

    public static <T> int y(T[] tArr) {
        kotlin.s.c.l.f(tArr, "<this>");
        return tArr.length - 1;
    }

    public static <T> T z(List<? extends T> list, int i) {
        kotlin.s.c.l.f(list, "<this>");
        if (i < 0 || i > w(list)) {
            return null;
        }
        return list.get(i);
    }
}
