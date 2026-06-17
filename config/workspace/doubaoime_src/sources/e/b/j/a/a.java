package e.b.j.a;

import android.util.Log;
import androidx.core.location.LocationRequestCompat;
import com.bytedance.apm.t.l.g;
import com.bytedance.apm.y.e;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public class a {

    /* renamed from: e.b.j.a.a$a, reason: collision with other inner class name */
    static class C0438a implements Comparator<g> {
        C0438a() {
        }

        @Override // java.util.Comparator
        public int compare(g gVar, g gVar2) {
            g gVar3 = gVar;
            g gVar4 = gVar2;
            return Integer.compare((gVar4.f3576d + 1) * gVar4.b, (gVar3.f3576d + 1) * gVar3.b);
        }
    }

    public static final class b {
        g a;
        b b;

        /* renamed from: c, reason: collision with root package name */
        LinkedList<b> f9568c = new LinkedList<>();

        b(g gVar, b bVar) {
            this.a = gVar;
            this.b = bVar;
        }
    }

    private static int a(LinkedList<g> linkedList, g gVar) {
        if (com.bytedance.apm.g.B()) {
            Log.v("TraceDataUtils", "method:" + gVar);
        }
        g peek = linkedList.isEmpty() ? null : linkedList.peek();
        if (peek != null && peek.a == gVar.a) {
            int i = peek.f3576d;
            int i2 = gVar.f3576d;
            if (i == i2 && i2 != 0) {
                int i3 = gVar.b;
                if (i3 == 5000) {
                    i3 = peek.b;
                }
                gVar.b = i3;
                peek.f3577e++;
                int i4 = (int) (peek.b + i3);
                peek.b = i4;
                return i4;
            }
        }
        linkedList.push(gVar);
        return gVar.b;
    }

    public static int b(long j) {
        return (int) ((j >> 43) & 1048575);
    }

    public static String c(List<g> list, long j) {
        StringBuilder sb = new StringBuilder();
        long j2 = (long) (j * 0.3f);
        LinkedList linkedList = new LinkedList();
        for (g gVar : list) {
            if (gVar.b >= j2) {
                linkedList.add(gVar);
            }
        }
        Collections.sort(linkedList, new C0438a());
        if (linkedList.isEmpty() && !list.isEmpty()) {
            linkedList.add(list.get(0));
        } else if (linkedList.size() > 1 && ((g) linkedList.peek()).a == 1048574) {
            linkedList.removeFirst();
        }
        Iterator it2 = linkedList.iterator();
        if (it2.hasNext()) {
            sb.append(((g) it2.next()).a + "\n");
        }
        return sb.toString();
    }

    private static boolean d(long j) {
        return ((j >> 63) & 1) == 1;
    }

    public static long e(LinkedList<g> linkedList, StringBuilder sb) {
        Iterator<g> it2 = linkedList.iterator();
        long j = 0;
        while (it2.hasNext()) {
            g next = it2.next();
            sb.append(next.toString());
            sb.append('\n');
            long j2 = next.b;
            if (j < j2) {
                j = j2;
            }
        }
        return j;
    }

    public static void f(long[] jArr, LinkedList<g> linkedList, boolean z, long j) {
        int b2;
        if (jArr == null || jArr.length == 0) {
            return;
        }
        long j2 = LocationRequestCompat.PASSIVE_INTERVAL;
        long j3 = 0;
        if (jArr[jArr.length - 1] != 0) {
            j2 = jArr[jArr.length - 1] & 8796093022207L;
        }
        int i = 0;
        while (i < jArr.length && (jArr[i] & 8796093022207L) >= j2) {
            i++;
        }
        LinkedList linkedList2 = new LinkedList();
        int i2 = 0;
        boolean z2 = false;
        while (i < jArr.length) {
            long j4 = jArr[i];
            if (j3 != j4) {
                if (z) {
                    if (d(j4) && 1048574 == b(j4)) {
                        z2 = true;
                    }
                    if (!z2) {
                        if (b(j4) > 1048000) {
                            e.b("SceneMethodsInfo", "s2 pass this method[%s], isIn [%b] ", Integer.valueOf(b(j4)), Boolean.valueOf(d(j4)));
                        }
                    }
                }
                if (d(j4)) {
                    if (b(j4) == 1048574) {
                        linkedList2.clear();
                        i2 = 0;
                    }
                    i2++;
                    linkedList2.push(Long.valueOf(j4));
                } else {
                    int b3 = b(j4);
                    if (!linkedList2.isEmpty()) {
                        long longValue = ((Long) linkedList2.pop()).longValue();
                        i2--;
                        LinkedList linkedList3 = new LinkedList();
                        linkedList3.push(Long.valueOf(longValue));
                        while (true) {
                            b2 = b(longValue);
                            if (b2 == b3 || linkedList2.isEmpty()) {
                                break;
                            }
                            if (com.bytedance.apm.g.B()) {
                                e.c("TraceDataUtils", "pop inMethodId[%s] to continue match ouMethodId[%s]", Integer.valueOf(b2), Integer.valueOf(b3));
                            }
                            longValue = ((Long) linkedList2.pop()).longValue();
                            i2--;
                            linkedList3.push(Long.valueOf(longValue));
                        }
                        if (b2 == b3 || b2 != 1048574) {
                            long j5 = 8796093022207L;
                            long w = com.bytedance.apm.t.l.e.w() + (j4 & 8796093022207L);
                            while (linkedList3.size() != 0) {
                                long w2 = com.bytedance.apm.t.l.e.w() + (j5 & ((Long) linkedList3.pop()).longValue());
                                long j6 = w - w2;
                                if (j6 < 0) {
                                    if (com.bytedance.apm.g.B()) {
                                        e.a("TraceDataUtils", "[structuredDataToStack] trace during invalid:%d", Long.valueOf(j6));
                                    }
                                    linkedList2.clear();
                                    linkedList.clear();
                                    return;
                                }
                                a(linkedList, new g(b3, (int) j6, w2, i2));
                                j5 = 8796093022207L;
                            }
                        } else {
                            com.bytedance.apm.g.B();
                            linkedList2.addAll(linkedList3);
                            i2 = linkedList2.size() + i2;
                        }
                        j3 = 0;
                    } else if (com.bytedance.apm.g.B()) {
                        e.c("TraceDataUtils", "[structuredDataToStack] method[%s] not found in! ", Integer.valueOf(b3));
                    }
                }
            }
            i++;
        }
        StringBuilder M = e.a.a.a.a.M("structuredDataToStack inner, result.size: ");
        M.append(linkedList.size());
        M.append(", ");
        M.append(linkedList2.size());
        e.b("SceneMethodsInfo", M.toString(), new Object[0]);
        while (!linkedList2.isEmpty()) {
            long longValue2 = ((Long) linkedList2.pop()).longValue();
            int b4 = b(longValue2);
            boolean d2 = d(longValue2);
            long w3 = com.bytedance.apm.t.l.e.w() + (longValue2 & 8796093022207L);
            if (com.bytedance.apm.g.B()) {
                e.c("TraceDataUtils", "[structuredDataToStack] has never out method[%s], isIn:%s, inTime:%s, endTime:%s,rawData size:%s", Integer.valueOf(b4), Boolean.valueOf(d2), Long.valueOf(w3), Long.valueOf(j), Integer.valueOf(linkedList2.size()));
            }
            if (d2) {
                a(linkedList, new g(b4, (int) (j - w3), w3, linkedList2.size()));
            } else if (com.bytedance.apm.g.B()) {
                e.a("TraceDataUtils", "[structuredDataToStack] why has out Method[%s]? is wrong! ", Integer.valueOf(b4));
            }
        }
        b bVar = null;
        b bVar2 = new b(null, null);
        ListIterator<g> listIterator = linkedList.listIterator(0);
        int i3 = 0;
        while (true) {
            if (!listIterator.hasNext()) {
                e.b("SceneMethodsInfo", "[stackToTree] count [%d] ", Integer.valueOf(i3));
                break;
            }
            b bVar3 = new b(listIterator.next(), bVar);
            i3++;
            if (bVar == null) {
                g gVar = bVar3.a;
                if ((gVar == null ? 0 : gVar.f3576d) != 0) {
                    if (com.bytedance.apm.g.B()) {
                        e.a("TraceDataUtils", "[stackToTree] SceneMethodsInfo begin error! why the first node'depth is not 0!", new Object[0]);
                    }
                }
            }
            g gVar2 = bVar3.a;
            int i4 = gVar2 == null ? 0 : gVar2.f3576d;
            if (bVar == null || i4 == 0) {
                bVar2.f9568c.addFirst(bVar3);
            } else {
                g gVar3 = bVar.a;
                if ((gVar3 == null ? 0 : gVar3.f3576d) >= i4) {
                    while (bVar != null) {
                        g gVar4 = bVar.a;
                        if ((gVar4 == null ? 0 : gVar4.f3576d) <= i4) {
                            break;
                        } else {
                            bVar = bVar.b;
                        }
                    }
                    if (bVar != null) {
                        b bVar4 = bVar.b;
                        if (bVar4 != null) {
                            bVar3.b = bVar4;
                            bVar.b.f9568c.addFirst(bVar3);
                        }
                    }
                } else {
                    bVar.f9568c.addFirst(bVar3);
                }
            }
            bVar = bVar3;
        }
        linkedList.clear();
        LinkedList linkedList4 = new LinkedList();
        while (bVar2 != null) {
            g gVar5 = bVar2.a;
            if (gVar5 != null) {
                linkedList.add(gVar5);
            }
            LinkedList<b> linkedList5 = bVar2.f9568c;
            if (!linkedList5.isEmpty()) {
                int size = linkedList5.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        linkedList4.add(linkedList5.get(size));
                    }
                }
            }
            bVar2 = (b) linkedList4.pollLast();
        }
    }
}
