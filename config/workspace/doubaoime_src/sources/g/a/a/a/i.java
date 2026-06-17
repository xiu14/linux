package g.a.a.a;

import java.io.PrintStream;
import java.security.AccessController;
import java.util.Hashtable;

/* loaded from: classes2.dex */
public abstract class i {
    private static PrintStream a;
    private static final String b;

    /* renamed from: c, reason: collision with root package name */
    private static final ClassLoader f10069c;

    /* renamed from: d, reason: collision with root package name */
    protected static Hashtable f10070d;

    /* renamed from: e, reason: collision with root package name */
    protected static volatile i f10071e;

    /* renamed from: f, reason: collision with root package name */
    static /* synthetic */ Class f10072f;

    /* JADX WARN: Can't wrap try/catch for region: R(23:0|1|(1:3)|4|(1:6)(2:70|71)|7|(2:8|9)|(16:11|(1:13)(2:63|(1:65)(1:66))|14|(1:16)|17|(6:19|20|21|22|23|24)|29|30|31|(1:33)|34|35|36|(1:38)|39|(2:41|42)(1:44))|67|14|(0)|17|(0)|29|30|31|(0)|34|35|36|(0)|39|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(24:0|1|(1:3)|4|(1:6)(2:70|71)|7|8|9|(16:11|(1:13)(2:63|(1:65)(1:66))|14|(1:16)|17|(6:19|20|21|22|23|24)|29|30|31|(1:33)|34|35|36|(1:38)|39|(2:41|42)(1:44))|67|14|(0)|17|(0)|29|30|31|(0)|34|35|36|(0)|39|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0120, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0123, code lost:
    
        if ((r3 instanceof java.lang.ThreadDeath) == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0127, code lost:
    
        if ((r3 instanceof java.lang.VirtualMachineError) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x012d, code lost:
    
        if ("org.apache.commons.logging.impl.WeakHashtable".equals(r1) == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0135, code lost:
    
        if (i() != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0137, code lost:
    
        j("[ERROR] LogFactory: Load of custom hashtable failed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x013b, code lost:
    
        java.lang.System.err.println("[ERROR] LogFactory: Load of custom hashtable failed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0157, code lost:
    
        throw ((java.lang.VirtualMachineError) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x015a, code lost:
    
        throw ((java.lang.ThreadDeath) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x010e, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0077 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    static {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.a.a.i.<clinit>():void");
    }

    protected i() {
    }

    static /* synthetic */ Class b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw new NoClassDefFoundError(e2.getMessage());
        }
    }

    protected static Object c(String str, ClassLoader classLoader) {
        Class<?> cls = null;
        try {
            if (classLoader != null) {
                try {
                    try {
                        cls = classLoader.loadClass(str);
                        Class cls2 = f10072f;
                        if (cls2 == null) {
                            cls2 = b("org.apache.commons.logging.LogFactory");
                            f10072f = cls2;
                        }
                        if (cls2.isAssignableFrom(cls)) {
                            if (i()) {
                                StringBuffer stringBuffer = new StringBuffer();
                                stringBuffer.append("Loaded class ");
                                stringBuffer.append(cls.getName());
                                stringBuffer.append(" from classloader ");
                                stringBuffer.append(m(classLoader));
                                j(stringBuffer.toString());
                            }
                        } else if (i()) {
                            StringBuffer stringBuffer2 = new StringBuffer();
                            stringBuffer2.append("Factory class ");
                            stringBuffer2.append(cls.getName());
                            stringBuffer2.append(" loaded from classloader ");
                            stringBuffer2.append(m(cls.getClassLoader()));
                            stringBuffer2.append(" does not extend '");
                            Class cls3 = f10072f;
                            if (cls3 == null) {
                                cls3 = b("org.apache.commons.logging.LogFactory");
                                f10072f = cls3;
                            }
                            stringBuffer2.append(cls3.getName());
                            stringBuffer2.append("' as loaded by this classloader.");
                            j(stringBuffer2.toString());
                            k("[BAD CL TREE] ", classLoader);
                        }
                        return (i) cls.newInstance();
                    } catch (ClassNotFoundException e2) {
                        if (classLoader == f10069c) {
                            if (i()) {
                                StringBuffer stringBuffer3 = new StringBuffer();
                                stringBuffer3.append("Unable to locate any class called '");
                                stringBuffer3.append(str);
                                stringBuffer3.append("' via classloader ");
                                stringBuffer3.append(m(classLoader));
                                j(stringBuffer3.toString());
                            }
                            throw e2;
                        }
                    }
                } catch (ClassCastException unused) {
                    if (classLoader == f10069c) {
                        boolean h = h(cls);
                        StringBuffer stringBuffer4 = new StringBuffer();
                        stringBuffer4.append("The application has specified that a custom LogFactory implementation ");
                        stringBuffer4.append("should be used but Class '");
                        stringBuffer4.append(str);
                        stringBuffer4.append("' cannot be converted to '");
                        Class cls4 = f10072f;
                        if (cls4 == null) {
                            cls4 = b("org.apache.commons.logging.LogFactory");
                            f10072f = cls4;
                        }
                        stringBuffer4.append(cls4.getName());
                        stringBuffer4.append("'. ");
                        if (h) {
                            stringBuffer4.append("The conflict is caused by the presence of multiple LogFactory classes ");
                            stringBuffer4.append("in incompatible classloaders. ");
                            stringBuffer4.append("Background can be found in http://commons.apache.org/logging/tech.html. ");
                            stringBuffer4.append("If you have not explicitly specified a custom LogFactory then it is likely ");
                            stringBuffer4.append("that the container has set one without your knowledge. ");
                            stringBuffer4.append("In this case, consider using the commons-logging-adapters.jar file or ");
                            stringBuffer4.append("specifying the standard LogFactory from the command line. ");
                        } else {
                            stringBuffer4.append("Please check the custom implementation. ");
                        }
                        stringBuffer4.append("Help can be found @http://commons.apache.org/logging/troubleshooting.html.");
                        if (i()) {
                            j(stringBuffer4.toString());
                        }
                        throw new ClassCastException(stringBuffer4.toString());
                    }
                } catch (NoClassDefFoundError e3) {
                    if (classLoader == f10069c) {
                        if (i()) {
                            StringBuffer stringBuffer5 = new StringBuffer();
                            stringBuffer5.append("Class '");
                            stringBuffer5.append(str);
                            stringBuffer5.append("' cannot be loaded");
                            stringBuffer5.append(" via classloader ");
                            stringBuffer5.append(m(classLoader));
                            stringBuffer5.append(" - it depends on some other class that cannot be found.");
                            j(stringBuffer5.toString());
                        }
                        throw e3;
                    }
                }
            }
            if (i()) {
                StringBuffer stringBuffer6 = new StringBuffer();
                stringBuffer6.append("Unable to load factory class via classloader ");
                stringBuffer6.append(m(classLoader));
                stringBuffer6.append(" - trying the classloader associated with this LogFactory.");
                j(stringBuffer6.toString());
            }
            return (i) Class.forName(str).newInstance();
        } catch (Exception e4) {
            if (i()) {
                j("Unable to create LogFactory instance.");
            }
            if (cls != null) {
                Class cls5 = f10072f;
                if (cls5 == null) {
                    cls5 = b("org.apache.commons.logging.LogFactory");
                    f10072f = cls5;
                }
                if (!cls5.isAssignableFrom(cls)) {
                    return new b("The chosen LogFactory implementation does not extend LogFactory. Please check your configuration.", e4);
                }
            }
            return new b(e4.toString(), e4);
        }
    }

    protected static ClassLoader d(Class cls) {
        try {
            return cls.getClassLoader();
        } catch (SecurityException e2) {
            if (i()) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Unable to get classloader for class '");
                stringBuffer.append(cls);
                stringBuffer.append("' due to security restrictions - ");
                stringBuffer.append(e2.getMessage());
                j(stringBuffer.toString());
            }
            throw e2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01f4 A[Catch: RuntimeException -> 0x022b, SecurityException -> 0x0254, TryCatch #9 {SecurityException -> 0x0254, RuntimeException -> 0x022b, blocks: (B:29:0x01ee, B:31:0x01f4, B:33:0x01fa, B:34:0x0216, B:95:0x021b, B:97:0x0221), top: B:28:0x01ee }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x021b A[Catch: RuntimeException -> 0x022b, SecurityException -> 0x0254, TryCatch #9 {SecurityException -> 0x0254, RuntimeException -> 0x022b, blocks: (B:29:0x01ee, B:31:0x01f4, B:33:0x01fa, B:34:0x0216, B:95:0x021b, B:97:0x0221), top: B:28:0x01ee }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static g.a.a.a.a f(java.lang.Class r23) throws g.a.a.a.b {
        /*
            Method dump skipped, instructions count: 938
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.a.a.i.f(java.lang.Class):g.a.a.a.a");
    }

    private static String g(String str, String str2) throws SecurityException {
        return (String) AccessController.doPrivileged(new h(str, null));
    }

    private static boolean h(Class cls) {
        boolean z = false;
        if (cls != null) {
            try {
                ClassLoader classLoader = cls.getClassLoader();
                if (classLoader == null) {
                    j("[CUSTOM LOG FACTORY] was loaded by the boot classloader");
                } else {
                    k("[CUSTOM LOG FACTORY] ", classLoader);
                    z = Class.forName("g.a.a.a.i", false, classLoader).isAssignableFrom(cls);
                    if (z) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("[CUSTOM LOG FACTORY] ");
                        stringBuffer.append(cls.getName());
                        stringBuffer.append(" implements LogFactory but was loaded by an incompatible classloader.");
                        j(stringBuffer.toString());
                    } else {
                        StringBuffer stringBuffer2 = new StringBuffer();
                        stringBuffer2.append("[CUSTOM LOG FACTORY] ");
                        stringBuffer2.append(cls.getName());
                        stringBuffer2.append(" does not implement LogFactory.");
                        j(stringBuffer2.toString());
                    }
                }
            } catch (ClassNotFoundException unused) {
                j("[CUSTOM LOG FACTORY] LogFactory class cannot be loaded by classloader which loaded the custom LogFactory implementation. Is the custom factory in the right classloader?");
            } catch (LinkageError e2) {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("[CUSTOM LOG FACTORY] LinkageError thrown whilst trying to determine whether the compatibility was caused by a classloader conflict: ");
                stringBuffer3.append(e2.getMessage());
                j(stringBuffer3.toString());
            } catch (SecurityException e3) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("[CUSTOM LOG FACTORY] SecurityException thrown whilst trying to determine whether the compatibility was caused by a classloader conflict: ");
                stringBuffer4.append(e3.getMessage());
                j(stringBuffer4.toString());
            }
        }
        return z;
    }

    protected static boolean i() {
        return a != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(String str) {
        PrintStream printStream = a;
        if (printStream != null) {
            printStream.print(b);
            a.println(str);
            a.flush();
        }
    }

    private static void k(String str, ClassLoader classLoader) {
        if (i()) {
            if (classLoader != null) {
                String obj = classLoader.toString();
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(str);
                stringBuffer.append(m(classLoader));
                stringBuffer.append(" == '");
                stringBuffer.append(obj);
                stringBuffer.append("'");
                j(stringBuffer.toString());
            }
            try {
                ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
                if (classLoader != null) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append(str);
                    stringBuffer2.append("ClassLoader tree:");
                    StringBuffer stringBuffer3 = new StringBuffer(stringBuffer2.toString());
                    do {
                        stringBuffer3.append(m(classLoader));
                        if (classLoader == systemClassLoader) {
                            stringBuffer3.append(" (SYSTEM) ");
                        }
                        try {
                            classLoader = classLoader.getParent();
                            stringBuffer3.append(" --> ");
                        } catch (SecurityException unused) {
                            stringBuffer3.append(" --> SECRET");
                        }
                    } while (classLoader != null);
                    stringBuffer3.append("BOOT");
                    j(stringBuffer3.toString());
                }
            } catch (SecurityException unused2) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append(str);
                stringBuffer4.append("Security forbids determining the system classloader.");
                j(stringBuffer4.toString());
            }
        }
    }

    protected static i l(String str, ClassLoader classLoader, ClassLoader classLoader2) throws b {
        Object doPrivileged = AccessController.doPrivileged(new d(str, classLoader));
        if (doPrivileged instanceof b) {
            b bVar = (b) doPrivileged;
            if (!i()) {
                throw bVar;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("An error occurred while loading the factory class:");
            stringBuffer.append(bVar.getMessage());
            j(stringBuffer.toString());
            throw bVar;
        }
        if (i()) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Created object ");
            stringBuffer2.append(m(doPrivileged));
            stringBuffer2.append(" to manage classloader ");
            stringBuffer2.append(m(classLoader2));
            j(stringBuffer2.toString());
        }
        return (i) doPrivileged;
    }

    public static String m(Object obj) {
        if (obj == null) {
            return "null";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(obj.getClass().getName());
        stringBuffer.append("@");
        stringBuffer.append(System.identityHashCode(obj));
        return stringBuffer.toString();
    }

    private static String o(String str) {
        if (str == null) {
            return null;
        }
        return str.trim();
    }

    public abstract a e(Class cls) throws b;

    public abstract void n(String str, Object obj);
}
