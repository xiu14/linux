.class public final Lb0/s;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public final a:Landroid/os/Bundle;

.field public b:Landroidx/core/graphics/drawable/IconCompat;

.field public final c:Z

.field public final d:Z

.field public final e:I

.field public final f:Ljava/lang/CharSequence;

.field public final g:Landroid/app/PendingIntent;


# direct methods
.method public constructor <init>(ILjava/lang/String;Landroid/app/PendingIntent;)V
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    move-object p1, v0

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const-string v1, ""

    .line 7
    .line 8
    invoke-static {v0, v1, p1}, Landroidx/core/graphics/drawable/IconCompat;->b(Landroid/content/res/Resources;Ljava/lang/String;I)Landroidx/core/graphics/drawable/IconCompat;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    :goto_0
    new-instance v1, Landroid/os/Bundle;

    .line 13
    .line 14
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    iput-boolean v2, p0, Lb0/s;->d:Z

    .line 22
    .line 23
    iput-object p1, p0, Lb0/s;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 24
    .line 25
    if-eqz p1, :cond_3

    .line 26
    .line 27
    iget v3, p1, Landroidx/core/graphics/drawable/IconCompat;->a:I

    .line 28
    .line 29
    const/4 v4, -0x1

    .line 30
    if-ne v3, v4, :cond_2

    .line 31
    .line 32
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 33
    .line 34
    const/16 v6, 0x17

    .line 35
    .line 36
    if-lt v5, v6, :cond_2

    .line 37
    .line 38
    iget-object v3, p1, Landroidx/core/graphics/drawable/IconCompat;->b:Ljava/lang/Object;

    .line 39
    .line 40
    const-string v6, "Unable to get icon type "

    .line 41
    .line 42
    const-string v7, "IconCompat"

    .line 43
    .line 44
    const/16 v8, 0x1c

    .line 45
    .line 46
    if-lt v5, v8, :cond_1

    .line 47
    .line 48
    invoke-static {v3}, Lf0/e;->c(Ljava/lang/Object;)I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    goto :goto_5

    .line 53
    :cond_1
    :try_start_0
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    const-string v8, "getType"

    .line 58
    .line 59
    invoke-virtual {v5, v8, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    invoke-virtual {v5, v3, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    check-cast v0, Ljava/lang/Integer;

    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 70
    .line 71
    .line 72
    move-result v3
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 73
    goto :goto_5

    .line 74
    :catch_0
    move-exception v0

    .line 75
    goto :goto_1

    .line 76
    :catch_1
    move-exception v0

    .line 77
    goto :goto_2

    .line 78
    :catch_2
    move-exception v0

    .line 79
    goto :goto_3

    .line 80
    :goto_1
    new-instance v5, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-static {v7, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 93
    .line 94
    .line 95
    goto :goto_4

    .line 96
    :goto_2
    new-instance v5, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    invoke-static {v7, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 109
    .line 110
    .line 111
    goto :goto_4

    .line 112
    :goto_3
    new-instance v5, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    invoke-static {v7, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 125
    .line 126
    .line 127
    :goto_4
    const/4 v3, -0x1

    .line 128
    :cond_2
    :goto_5
    const/4 v0, 0x2

    .line 129
    if-ne v3, v0, :cond_3

    .line 130
    .line 131
    invoke-virtual {p1}, Landroidx/core/graphics/drawable/IconCompat;->c()I

    .line 132
    .line 133
    .line 134
    move-result p1

    .line 135
    iput p1, p0, Lb0/s;->e:I

    .line 136
    .line 137
    :cond_3
    invoke-static {p2}, Lb0/t;->a(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    iput-object p1, p0, Lb0/s;->f:Ljava/lang/CharSequence;

    .line 142
    .line 143
    iput-object p3, p0, Lb0/s;->g:Landroid/app/PendingIntent;

    .line 144
    .line 145
    iput-object v1, p0, Lb0/s;->a:Landroid/os/Bundle;

    .line 146
    .line 147
    iput-boolean v2, p0, Lb0/s;->c:Z

    .line 148
    .line 149
    iput-boolean v2, p0, Lb0/s;->d:Z

    .line 150
    .line 151
    return-void
    .line 152
    .line 153
    .line 154
.end method
