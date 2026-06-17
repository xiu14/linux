.class public Lcom/google/android/gms/common/util/WorkSourceUtil;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
.end annotation


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    const-class v0, Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "add"

    .line 4
    .line 5
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 6
    .line 7
    const-class v3, Landroid/os/WorkSource;

    .line 8
    .line 9
    invoke-static {}, Landroid/os/Process;->myUid()I

    .line 10
    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x1

    .line 14
    :try_start_0
    new-array v6, v5, [Ljava/lang/Class;

    .line 15
    .line 16
    aput-object v2, v6, v4

    .line 17
    .line 18
    invoke-virtual {v3, v1, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    :catch_0
    const/4 v6, 0x2

    .line 22
    :try_start_1
    new-array v7, v6, [Ljava/lang/Class;

    .line 23
    .line 24
    aput-object v2, v7, v4

    .line 25
    .line 26
    aput-object v0, v7, v5

    .line 27
    .line 28
    invoke-virtual {v3, v1, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 29
    .line 30
    .line 31
    :catch_1
    const/4 v1, 0x0

    .line 32
    :try_start_2
    const-string v7, "size"

    .line 33
    .line 34
    invoke-virtual {v3, v7, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 35
    .line 36
    .line 37
    :catch_2
    :try_start_3
    const-string v7, "get"

    .line 38
    .line 39
    new-array v8, v5, [Ljava/lang/Class;

    .line 40
    .line 41
    aput-object v2, v8, v4

    .line 42
    .line 43
    invoke-virtual {v3, v7, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 44
    .line 45
    .line 46
    :catch_3
    :try_start_4
    const-string v7, "getName"

    .line 47
    .line 48
    new-array v8, v5, [Ljava/lang/Class;

    .line 49
    .line 50
    aput-object v2, v8, v4

    .line 51
    .line 52
    invoke-virtual {v3, v7, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :catch_4
    nop

    .line 57
    :goto_0
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 58
    .line 59
    const/16 v8, 0x1c

    .line 60
    .line 61
    const-string v9, "WorkSourceUtil"

    .line 62
    .line 63
    if-lt v7, v8, :cond_0

    .line 64
    .line 65
    :try_start_5
    const-string v7, "createWorkChain"

    .line 66
    .line 67
    invoke-virtual {v3, v7, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :catch_5
    move-exception v7

    .line 72
    const-string v10, "Missing WorkChain API createWorkChain"

    .line 73
    .line 74
    invoke-static {v9, v10, v7}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 75
    .line 76
    .line 77
    :cond_0
    :goto_1
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 78
    .line 79
    if-lt v7, v8, :cond_1

    .line 80
    .line 81
    :try_start_6
    const-string v7, "android.os.WorkSource$WorkChain"

    .line 82
    .line 83
    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    const-string v10, "addNode"

    .line 88
    .line 89
    new-array v6, v6, [Ljava/lang/Class;

    .line 90
    .line 91
    aput-object v2, v6, v4

    .line 92
    .line 93
    aput-object v0, v6, v5

    .line 94
    .line 95
    invoke-virtual {v7, v10, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6

    .line 96
    .line 97
    .line 98
    goto :goto_2

    .line 99
    :catch_6
    move-exception v0

    .line 100
    const-string v2, "Missing WorkChain class"

    .line 101
    .line 102
    invoke-static {v9, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 103
    .line 104
    .line 105
    :cond_1
    :goto_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 106
    .line 107
    if-lt v0, v8, :cond_2

    .line 108
    .line 109
    :try_start_7
    const-string v0, "isEmpty"

    .line 110
    .line 111
    invoke-virtual {v3, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-virtual {v0, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_7

    .line 116
    .line 117
    .line 118
    :catch_7
    :cond_2
    return-void
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
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
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
