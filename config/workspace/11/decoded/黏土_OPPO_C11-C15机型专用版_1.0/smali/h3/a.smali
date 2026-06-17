.class public final Lh3/a;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public final a:Landroid/content/Context;

.field public b:D

.field public final c:Z

.field public final d:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh3/a;->a:Landroid/content/Context;

    .line 5
    .line 6
    sget-object v0, Lo3/e;->a:[Landroid/graphics/Bitmap$Config;

    .line 7
    .line 8
    const-wide v0, 0x3fc999999999999aL    # 0.2

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    :try_start_0
    const-class v2, Landroid/app/ActivityManager;

    .line 14
    .line 15
    invoke-static {p1, v2}, Lq3/a;->J(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p1}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    check-cast p1, Landroid/app/ActivityManager;

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/app/ActivityManager;->isLowRamDevice()Z

    .line 25
    .line 26
    .line 27
    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    const-wide v0, 0x3fc3333333333333L    # 0.15

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    :catch_0
    :cond_0
    iput-wide v0, p0, Lh3/a;->b:D

    .line 36
    .line 37
    const/4 p1, 0x1

    .line 38
    iput-boolean p1, p0, Lh3/a;->c:Z

    .line 39
    .line 40
    iput-boolean p1, p0, Lh3/a;->d:Z

    .line 41
    .line 42
    return-void
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
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


# virtual methods
.method public final a()Lh3/e;
    .locals 7

    .line 1
    iget-boolean v0, p0, Lh3/a;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lp3/z;

    .line 6
    .line 7
    invoke-direct {v0}, Lp3/z;-><init>()V

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    new-instance v0, La1/d;

    .line 12
    .line 13
    const/16 v1, 0x17

    .line 14
    .line 15
    invoke-direct {v0, v1}, La1/d;-><init>(I)V

    .line 16
    .line 17
    .line 18
    :goto_0
    iget-boolean v1, p0, Lh3/a;->c:Z

    .line 19
    .line 20
    const/16 v2, 0xc

    .line 21
    .line 22
    if-eqz v1, :cond_4

    .line 23
    .line 24
    iget-wide v3, p0, Lh3/a;->b:D

    .line 25
    .line 26
    const-wide/16 v5, 0x0

    .line 27
    .line 28
    cmpl-double v1, v3, v5

    .line 29
    .line 30
    if-lez v1, :cond_2

    .line 31
    .line 32
    iget-object v1, p0, Lh3/a;->a:Landroid/content/Context;

    .line 33
    .line 34
    sget-object v5, Lo3/e;->a:[Landroid/graphics/Bitmap$Config;

    .line 35
    .line 36
    :try_start_0
    const-class v5, Landroid/app/ActivityManager;

    .line 37
    .line 38
    invoke-static {v1, v5}, Lq3/a;->J(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    invoke-static {v5}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    check-cast v5, Landroid/app/ActivityManager;

    .line 46
    .line 47
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    iget v1, v1, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 52
    .line 53
    const/high16 v6, 0x100000

    .line 54
    .line 55
    and-int/2addr v1, v6

    .line 56
    if-eqz v1, :cond_1

    .line 57
    .line 58
    invoke-virtual {v5}, Landroid/app/ActivityManager;->getLargeMemoryClass()I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    goto :goto_1

    .line 63
    :cond_1
    invoke-virtual {v5}, Landroid/app/ActivityManager;->getMemoryClass()I

    .line 64
    .line 65
    .line 66
    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 67
    goto :goto_1

    .line 68
    :catch_0
    const/16 v1, 0x100

    .line 69
    .line 70
    :goto_1
    int-to-double v5, v1

    .line 71
    mul-double v3, v3, v5

    .line 72
    .line 73
    const/16 v1, 0x400

    .line 74
    .line 75
    int-to-double v5, v1

    .line 76
    mul-double v3, v3, v5

    .line 77
    .line 78
    mul-double v3, v3, v5

    .line 79
    .line 80
    double-to-int v1, v3

    .line 81
    goto :goto_2

    .line 82
    :cond_2
    const/4 v1, 0x0

    .line 83
    :goto_2
    if-lez v1, :cond_3

    .line 84
    .line 85
    new-instance v2, Lu2/u;

    .line 86
    .line 87
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 88
    .line 89
    .line 90
    iput-object v0, v2, Lu2/u;->h:Ljava/lang/Object;

    .line 91
    .line 92
    new-instance v3, Lh3/g;

    .line 93
    .line 94
    invoke-direct {v3, v1, v2}, Lh3/g;-><init>(ILu2/u;)V

    .line 95
    .line 96
    .line 97
    iput-object v3, v2, Lu2/u;->i:Ljava/lang/Object;

    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_3
    new-instance v1, La1/q;

    .line 101
    .line 102
    invoke-direct {v1, v2, v0}, La1/q;-><init>(ILjava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    :goto_3
    move-object v2, v1

    .line 106
    goto :goto_4

    .line 107
    :cond_4
    new-instance v1, La1/q;

    .line 108
    .line 109
    invoke-direct {v1, v2, v0}, La1/q;-><init>(ILjava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    goto :goto_3

    .line 113
    :goto_4
    new-instance v1, Lh3/e;

    .line 114
    .line 115
    invoke-direct {v1, v2, v0}, Lh3/e;-><init>(Lh3/i;Lh3/j;)V

    .line 116
    .line 117
    .line 118
    return-object v1
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
