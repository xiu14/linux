.class final Lcom/google/android/gms/internal/play_billing/zzgs;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# static fields
.field public static final c:Lcom/google/android/gms/internal/play_billing/zzgs;


# instance fields
.field public final a:Lcom/google/android/gms/internal/play_billing/zzgd;

.field public final b:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/play_billing/zzgs;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/play_billing/zzgs;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/gms/internal/play_billing/zzgs;->c:Lcom/google/android/gms/internal/play_billing/zzgs;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/google/android/gms/internal/play_billing/zzgs;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    new-instance v0, Lcom/google/android/gms/internal/play_billing/zzgd;

    .line 12
    .line 13
    invoke-direct {v0}, Lcom/google/android/gms/internal/play_billing/zzgd;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/google/android/gms/internal/play_billing/zzgs;->a:Lcom/google/android/gms/internal/play_billing/zzgd;

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)Lcom/google/android/gms/internal/play_billing/zzgv;
    .locals 5

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/play_billing/zzfo;->a:Ljava/nio/charset/Charset;

    .line 2
    .line 3
    if-eqz p1, :cond_3

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/zzgs;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Lcom/google/android/gms/internal/play_billing/zzgv;

    .line 12
    .line 13
    if-nez v1, :cond_2

    .line 14
    .line 15
    iget-object v1, p0, Lcom/google/android/gms/internal/play_billing/zzgs;->a:Lcom/google/android/gms/internal/play_billing/zzgd;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    sget-object v2, Lcom/google/android/gms/internal/play_billing/zzgx;->a:Lcom/google/android/gms/internal/play_billing/zzhj;

    .line 21
    .line 22
    const-class v2, Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 23
    .line 24
    invoke-virtual {v2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 25
    .line 26
    .line 27
    iget-object v1, v1, Lcom/google/android/gms/internal/play_billing/zzgd;->a:Lcom/google/android/gms/internal/play_billing/zzgc;

    .line 28
    .line 29
    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/play_billing/zzgc;->a(Ljava/lang/Class;)Lcom/google/android/gms/internal/play_billing/zzgi;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-interface {v1}, Lcom/google/android/gms/internal/play_billing/zzgi;->c()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_1

    .line 38
    .line 39
    sget v2, Lcom/google/android/gms/internal/play_billing/zzgr;->a:I

    .line 40
    .line 41
    sget v2, Lcom/google/android/gms/internal/play_billing/zzfz;->a:I

    .line 42
    .line 43
    sget-object v2, Lcom/google/android/gms/internal/play_billing/zzgx;->a:Lcom/google/android/gms/internal/play_billing/zzhj;

    .line 44
    .line 45
    invoke-interface {v1}, Lcom/google/android/gms/internal/play_billing/zzgi;->b()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    add-int/lit8 v3, v3, -0x1

    .line 50
    .line 51
    const/4 v4, 0x1

    .line 52
    if-eq v3, v4, :cond_0

    .line 53
    .line 54
    sget-object v3, Lcom/google/android/gms/internal/play_billing/zzex;->a:Lcom/google/android/gms/internal/play_billing/zzew;

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    const/4 v3, 0x0

    .line 58
    :goto_0
    sget v4, Lcom/google/android/gms/internal/play_billing/zzgh;->a:I

    .line 59
    .line 60
    invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/play_billing/zzgo;->v(Lcom/google/android/gms/internal/play_billing/zzgi;Lcom/google/android/gms/internal/play_billing/zzhh;Lcom/google/android/gms/internal/play_billing/zzew;)Lcom/google/android/gms/internal/play_billing/zzgo;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    goto :goto_1

    .line 65
    :cond_1
    sget-object v2, Lcom/google/android/gms/internal/play_billing/zzgx;->a:Lcom/google/android/gms/internal/play_billing/zzhj;

    .line 66
    .line 67
    sget-object v3, Lcom/google/android/gms/internal/play_billing/zzex;->a:Lcom/google/android/gms/internal/play_billing/zzew;

    .line 68
    .line 69
    invoke-interface {v1}, Lcom/google/android/gms/internal/play_billing/zzgi;->a()Lcom/google/android/gms/internal/play_billing/zzgl;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    new-instance v4, Lcom/google/android/gms/internal/play_billing/zzgp;

    .line 74
    .line 75
    invoke-direct {v4, v2, v3, v1}, Lcom/google/android/gms/internal/play_billing/zzgp;-><init>(Lcom/google/android/gms/internal/play_billing/zzhh;Lcom/google/android/gms/internal/play_billing/zzev;Lcom/google/android/gms/internal/play_billing/zzgl;)V

    .line 76
    .line 77
    .line 78
    move-object v1, v4

    .line 79
    :goto_1
    invoke-virtual {v0, p1, v1}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    check-cast p1, Lcom/google/android/gms/internal/play_billing/zzgv;

    .line 84
    .line 85
    if-eqz p1, :cond_2

    .line 86
    .line 87
    return-object p1

    .line 88
    :cond_2
    return-object v1

    .line 89
    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    .line 90
    .line 91
    const-string v0, "messageType"

    .line 92
    .line 93
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw p1
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
.end method
