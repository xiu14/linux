.class public final synthetic Ly2/d;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ld5/a;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Landroidx/lifecycle/a1;


# direct methods
.method public synthetic constructor <init>(Landroidx/lifecycle/a1;I)V
    .locals 0

    .line 1
    iput p2, p0, Ly2/d;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Ly2/d;->i:Landroidx/lifecycle/a1;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
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
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
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
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Ly2/d;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ly2/d;->i:Landroidx/lifecycle/a1;

    .line 7
    .line 8
    sget-object v1, Lo3/k;->a:Lo3/k;

    .line 9
    .line 10
    iget-object v0, v0, Landroidx/lifecycle/a1;->i:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Landroid/content/Context;

    .line 13
    .line 14
    monitor-enter v1

    .line 15
    :try_start_0
    sget-object v2, Lo3/k;->b:Lb3/j;

    .line 16
    .line 17
    if-nez v2, :cond_1

    .line 18
    .line 19
    new-instance v2, Lb3/a;

    .line 20
    .line 21
    invoke-direct {v2}, Lb3/a;-><init>()V

    .line 22
    .line 23
    .line 24
    sget-object v3, Lo3/e;->a:[Landroid/graphics/Bitmap$Config;

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, La5/a;->T(Ljava/io/File;)Ljava/io/File;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sget-object v3, Lj6/z;->i:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {v0}, La1/d;->p(Ljava/io/File;)Lj6/z;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iput-object v0, v2, Lb3/a;->a:Lj6/z;

    .line 46
    .line 47
    invoke-virtual {v2}, Lb3/a;->a()Lb3/j;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    sput-object v2, Lo3/k;->b:Lb3/j;

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catchall_0
    move-exception v0

    .line 55
    goto :goto_1

    .line 56
    :cond_0
    const-string v0, "cacheDir == null"

    .line 57
    .line 58
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 59
    .line 60
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    :cond_1
    :goto_0
    monitor-exit v1

    .line 65
    return-object v2

    .line 66
    :goto_1
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 67
    throw v0

    .line 68
    :pswitch_0
    iget-object v0, p0, Ly2/d;->i:Landroidx/lifecycle/a1;

    .line 69
    .line 70
    new-instance v1, Lh3/a;

    .line 71
    .line 72
    iget-object v0, v0, Landroidx/lifecycle/a1;->i:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v0, Landroid/content/Context;

    .line 75
    .line 76
    invoke-direct {v1, v0}, Lh3/a;-><init>(Landroid/content/Context;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1}, Lh3/a;->a()Lh3/e;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    return-object v0

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
