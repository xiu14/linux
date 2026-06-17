package com.ss.android.i.a.a.a;

import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
class a {
    private static final String[] a = {"services/", "services/AwemeLive/", "services/AwemeIM/", "services/AwemeReactNative/", "services/AwemePush/", "services/AwemeShare/", "services/AwemeMain/", "services/AwemePlugin/", "services/SdkDebugger/", "services/AwemeMusic/", "services/AwemeVideo/", "services/AwemeFramework/", "services/AwemeCommerce/"};
    private static final Map<String, List<C0375a>> b = Collections.synchronizedMap(new LinkedHashMap());

    /* renamed from: com.ss.android.i.a.a.a.a$a, reason: collision with other inner class name */
    private static class C0375a {
        public final String a;
        public final boolean b;

        /* renamed from: c, reason: collision with root package name */
        public Object f8310c;

        public C0375a(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public static C0375a a(String str) {
            if (str == null || "".equals(str)) {
                return null;
            }
            String[] split = str.split(Constants.COLON_SEPARATOR);
            return new C0375a(split[0], split.length > 1 ? Boolean.parseBoolean(split[1]) : false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b<T> implements Iterator<T> {
        private List<C0375a> a;
        private ClassLoader b;

        /* renamed from: c, reason: collision with root package name */
        private Class f8311c;

        /* renamed from: d, reason: collision with root package name */
        private int f8312d = 0;

        public b(List<C0375a> list, Class<T> cls, ClassLoader classLoader) {
            this.b = classLoader;
            this.f8311c = cls;
            this.a = list;
        }

        private T a(C0375a c0375a) {
            try {
                Class<?> cls = Class.forName(c0375a.a, false, this.b);
                if (!this.f8311c.isAssignableFrom(cls)) {
                    StringBuilder M = e.a.a.a.a.M("source: ");
                    M.append(cls.getName());
                    M.append(", dest: ");
                    M.append(this.f8311c.getName());
                    throw new RuntimeException(new ClassCastException(M.toString()));
                }
                try {
                    Constructor<?> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
                    declaredConstructor.setAccessible(true);
                    return (T) declaredConstructor.newInstance(new Object[0]);
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException(e2);
                } catch (InstantiationException e3) {
                    throw new RuntimeException(e3);
                } catch (NoSuchMethodException e4) {
                    throw new RuntimeException(e4);
                } catch (InvocationTargetException e5) {
                    throw new RuntimeException(e5);
                }
            } catch (ClassNotFoundException e6) {
                throw new RuntimeException(e6);
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            List<C0375a> list = this.a;
            return list != null && this.f8312d < list.size();
        }

        @Override // java.util.Iterator
        public T next() {
            T t;
            C0375a c0375a = this.a.get(this.f8312d);
            this.f8312d++;
            synchronized (c0375a) {
                boolean z = c0375a.b;
                if (z && (t = (T) c0375a.f8310c) != null) {
                    return t;
                }
                if (!z) {
                    return a(c0375a);
                }
                T a = a(c0375a);
                c0375a.f8310c = a;
                return a;
            }
        }
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static <T> Iterator<T> b(Class<T> cls) {
        List<C0375a> list;
        List<C0375a> list2;
        List linkedList;
        ClassLoader classLoader = cls.getClassLoader();
        Map<String, List<C0375a>> map = b;
        synchronized (map) {
            list = map.get(cls.getName());
            if (list == null) {
                LinkedList linkedList2 = new LinkedList();
                for (String str : a) {
                    StringBuilder M = e.a.a.a.a.M(str);
                    M.append(cls.getName());
                    String sb = M.toString();
                    Enumeration<URL> enumeration = null;
                    if (classLoader == null) {
                        try {
                            enumeration = ClassLoader.getSystemResources(sb);
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    } else {
                        try {
                            enumeration = classLoader.getResources(sb);
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    while (enumeration != null && enumeration.hasMoreElements()) {
                        URL nextElement = enumeration.nextElement();
                        int i = 0;
                        while (true) {
                            if (i >= 3) {
                                linkedList = new LinkedList();
                                break;
                            }
                            try {
                                linkedList = c(nextElement);
                                break;
                            } catch (ConcurrentModificationException e4) {
                                if (i >= 2) {
                                    throw e4;
                                }
                                try {
                                    Thread.sleep(2L);
                                } catch (InterruptedException e5) {
                                    e5.printStackTrace();
                                }
                                i++;
                            }
                        }
                        linkedList2.addAll(linkedList);
                    }
                }
                Map<String, List<C0375a>> map2 = b;
                synchronized (map2) {
                    if (map2.containsKey(cls.getName())) {
                        list2 = map2.get(cls.getName());
                    } else {
                        map2.put(cls.getName(), linkedList2);
                        list2 = linkedList2;
                    }
                }
                list = list2;
            }
        }
        return new b(list, cls, classLoader);
    }

    private static List<C0375a> c(URL url) {
        InputStream inputStream;
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        IOException e2;
        LinkedList linkedList = new LinkedList();
        BufferedReader bufferedReader2 = null;
        try {
            inputStream = url.openStream();
            try {
                inputStreamReader = new InputStreamReader(inputStream);
            } catch (IOException e3) {
                bufferedReader = null;
                e2 = e3;
                inputStreamReader = null;
            } catch (Throwable th) {
                th = th;
                inputStreamReader = null;
            }
        } catch (IOException e4) {
            inputStreamReader = null;
            bufferedReader = null;
            e2 = e4;
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            inputStreamReader = null;
        }
        try {
            bufferedReader = new BufferedReader(inputStreamReader);
            try {
                try {
                    for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                        C0375a a2 = C0375a.a(readLine);
                        if (a2 != null) {
                            linkedList.add(a2);
                        }
                    }
                } catch (IOException e5) {
                    e2 = e5;
                    e2.printStackTrace();
                    a(bufferedReader);
                    a(inputStreamReader);
                    a(inputStream);
                    return linkedList;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedReader2 = bufferedReader;
                a(bufferedReader2);
                a(inputStreamReader);
                a(inputStream);
                throw th;
            }
        } catch (IOException e6) {
            bufferedReader = null;
            e2 = e6;
        } catch (Throwable th4) {
            th = th4;
            a(bufferedReader2);
            a(inputStreamReader);
            a(inputStream);
            throw th;
        }
        a(bufferedReader);
        a(inputStreamReader);
        a(inputStream);
        return linkedList;
    }
}
