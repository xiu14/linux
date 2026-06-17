.class public final Lu2/i;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Lw2/a;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    new-instance v0, Ll0/c;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Ll0/c;-><init>(I)V

    iput-object v0, p0, Lu2/i;->a:Ljava/lang/Object;

    .line 21
    new-instance v0, Lq/k;

    const/4 v1, 0x0

    .line 22
    invoke-direct {v0, v1}, Lq/k;-><init>(I)V

    .line 23
    iput-object v0, p0, Lu2/i;->b:Ljava/lang/Object;

    .line 24
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lu2/i;->c:Ljava/lang/Object;

    .line 25
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lu2/i;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Typeface;Lb1/b;)V
    .locals 7

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lu2/i;->d:Ljava/lang/Object;

    .line 34
    iput-object p2, p0, Lu2/i;->a:Ljava/lang/Object;

    .line 35
    new-instance p1, La1/a0;

    const/16 v0, 0x400

    invoke-direct {p1, v0}, La1/a0;-><init>(I)V

    iput-object p1, p0, Lu2/i;->c:Ljava/lang/Object;

    const/4 p1, 0x6

    .line 36
    invoke-virtual {p2, p1}, Lb1/c;->a(I)I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 37
    iget v2, p2, Lb1/c;->h:I

    add-int/2addr v0, v2

    .line 38
    iget-object v2, p2, Lb1/c;->k:Ljava/lang/Object;

    check-cast v2, Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    add-int/2addr v2, v0

    .line 39
    iget-object v0, p2, Lb1/c;->k:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x2

    .line 40
    new-array v0, v0, [C

    iput-object v0, p0, Lu2/i;->b:Ljava/lang/Object;

    .line 41
    invoke-virtual {p2, p1}, Lb1/c;->a(I)I

    move-result p1

    if-eqz p1, :cond_1

    .line 42
    iget v0, p2, Lb1/c;->h:I

    add-int/2addr p1, v0

    .line 43
    iget-object v0, p2, Lb1/c;->k:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    add-int/2addr v0, p1

    .line 44
    iget-object p1, p2, Lb1/c;->k:Ljava/lang/Object;

    check-cast p1, Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    const/4 p2, 0x0

    :goto_2
    if-ge p2, p1, :cond_6

    .line 45
    new-instance v0, La1/d0;

    invoke-direct {v0, p0, p2}, La1/d0;-><init>(Lu2/i;I)V

    .line 46
    invoke-virtual {v0}, La1/d0;->b()Lb1/a;

    move-result-object v2

    const/4 v3, 0x4

    .line 47
    invoke-virtual {v2, v3}, Lb1/c;->a(I)I

    move-result v3

    if-eqz v3, :cond_2

    iget-object v4, v2, Lb1/c;->k:Ljava/lang/Object;

    check-cast v4, Ljava/nio/ByteBuffer;

    iget v2, v2, Lb1/c;->h:I

    add-int/2addr v3, v2

    invoke-virtual {v4, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    goto :goto_3

    :cond_2
    const/4 v2, 0x0

    .line 48
    :goto_3
    iget-object v3, p0, Lu2/i;->b:Ljava/lang/Object;

    check-cast v3, [C

    mul-int/lit8 v4, p2, 0x2

    invoke-static {v2, v3, v4}, Ljava/lang/Character;->toChars(I[CI)I

    .line 49
    invoke-virtual {v0}, La1/d0;->b()Lb1/a;

    move-result-object v2

    const/16 v3, 0x10

    .line 50
    invoke-virtual {v2, v3}, Lb1/c;->a(I)I

    move-result v4

    if-eqz v4, :cond_3

    .line 51
    iget v5, v2, Lb1/c;->h:I

    add-int/2addr v4, v5

    .line 52
    iget-object v5, v2, Lb1/c;->k:Ljava/lang/Object;

    check-cast v5, Ljava/nio/ByteBuffer;

    invoke-virtual {v5, v4}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v5

    add-int/2addr v5, v4

    .line 53
    iget-object v2, v2, Lb1/c;->k:Ljava/lang/Object;

    check-cast v2, Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v5}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    goto :goto_4

    :cond_3
    const/4 v2, 0x0

    :goto_4
    const/4 v4, 0x1

    if-lez v2, :cond_4

    const/4 v2, 0x1

    goto :goto_5

    :cond_4
    const/4 v2, 0x0

    .line 54
    :goto_5
    const-string v5, "invalid metadata codepoint length"

    invoke-static {v5, v2}, Lq3/a;->j(Ljava/lang/String;Z)V

    .line 55
    iget-object v2, p0, Lu2/i;->c:Ljava/lang/Object;

    check-cast v2, La1/a0;

    .line 56
    invoke-virtual {v0}, La1/d0;->b()Lb1/a;

    move-result-object v5

    .line 57
    invoke-virtual {v5, v3}, Lb1/c;->a(I)I

    move-result v3

    if-eqz v3, :cond_5

    .line 58
    iget v6, v5, Lb1/c;->h:I

    add-int/2addr v3, v6

    .line 59
    iget-object v6, v5, Lb1/c;->k:Ljava/lang/Object;

    check-cast v6, Ljava/nio/ByteBuffer;

    invoke-virtual {v6, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v6

    add-int/2addr v6, v3

    .line 60
    iget-object v3, v5, Lb1/c;->k:Ljava/lang/Object;

    check-cast v3, Ljava/nio/ByteBuffer;

    invoke-virtual {v3, v6}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v3

    goto :goto_6

    :cond_5
    const/4 v3, 0x0

    :goto_6
    sub-int/2addr v3, v4

    .line 61
    invoke-virtual {v2, v0, v1, v3}, La1/a0;->a(La1/d0;II)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_2

    :cond_6
    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/d1;Landroidx/lifecycle/c1;Lj1/b;)V
    .locals 1

    const-string v0, "store"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultExtras"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lu2/i;->a:Ljava/lang/Object;

    .line 14
    iput-object p2, p0, Lu2/i;->b:Ljava/lang/Object;

    .line 15
    iput-object p3, p0, Lu2/i;->c:Ljava/lang/Object;

    .line 16
    new-instance p1, La1/d;

    const/16 p2, 0x1d

    .line 17
    invoke-direct {p1, p2}, La1/d;-><init>(I)V

    .line 18
    iput-object p1, p0, Lu2/i;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/work/impl/WorkDatabase_Impl;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lu2/i;->a:Ljava/lang/Object;

    .line 3
    new-instance v0, Lu2/b;

    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, p1, v1}, Lu2/b;-><init>(Landroidx/room/r0;I)V

    .line 5
    iput-object v0, p0, Lu2/i;->b:Ljava/lang/Object;

    .line 6
    new-instance v0, Lu2/h;

    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p1, v1}, Lu2/h;-><init>(Landroidx/room/r0;I)V

    .line 8
    iput-object v0, p0, Lu2/i;->c:Ljava/lang/Object;

    .line 9
    new-instance v0, Lu2/h;

    const/4 v1, 0x1

    .line 10
    invoke-direct {v0, p1, v1}, Lu2/h;-><init>(Landroidx/room/r0;I)V

    .line 11
    iput-object v0, p0, Lu2/i;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/ExecutorService;)V
    .locals 2

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lu2/i;->c:Ljava/lang/Object;

    .line 28
    new-instance v0, Ll6/a;

    invoke-direct {v0, p0}, Ll6/a;-><init>(Lu2/i;)V

    iput-object v0, p0, Lu2/i;->d:Ljava/lang/Object;

    .line 29
    new-instance v0, Landroidx/room/c1;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Landroidx/room/c1;-><init>(Ljava/util/concurrent/Executor;I)V

    iput-object v0, p0, Lu2/i;->a:Ljava/lang/Object;

    .line 30
    invoke-static {v0}, Ln5/x;->i(Ljava/util/concurrent/Executor;)Ln5/r;

    move-result-object p1

    iput-object p1, p0, Lu2/i;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ls3/c;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu2/i;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/HashSet;)V
    .locals 4

    .line 1
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p3, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_2

    .line 13
    .line 14
    invoke-virtual {p3, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lu2/i;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Lq/k;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lq/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Ljava/util/ArrayList;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    const/4 v2, 0x0

    .line 34
    :goto_0
    if-ge v2, v1, :cond_1

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {p0, v3, p2, p3}, Lu2/i;->a(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/HashSet;)V

    .line 41
    .line 42
    .line 43
    add-int/lit8 v2, v2, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    invoke-virtual {p3, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    .line 54
    .line 55
    const-string p2, "This graph contains cyclic dependencies"

    .line 56
    .line 57
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p1
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
.end method

.method public b(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lu2/i;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/room/c1;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroidx/room/c1;->execute(Ljava/lang/Runnable;)V

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
.end method

.method public c(Lu2/j;)Lu2/g;
    .locals 5

    .line 1
    const-string v0, "id"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Lu2/j;->a:Ljava/lang/String;

    .line 7
    .line 8
    iget p1, p1, Lu2/j;->b:I

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    const-string v2, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?"

    .line 12
    .line 13
    invoke-static {v1, v2}, Landroidx/room/w0;->a(ILjava/lang/String;)Landroidx/room/w0;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const/4 v3, 0x1

    .line 18
    invoke-virtual {v2, v3, v0}, Landroidx/room/w0;->t(ILjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    int-to-long v3, p1

    .line 22
    invoke-virtual {v2, v1, v3, v4}, Landroidx/room/w0;->i(IJ)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lu2/i;->a:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p1, Landroidx/work/impl/WorkDatabase_Impl;

    .line 28
    .line 29
    invoke-virtual {p1}, Landroidx/room/r0;->assertNotSuspendingTransaction()V

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-static {p1, v2, v0}, Lu2/f;->C(Landroidx/room/r0;Lz1/h;Z)Landroid/database/Cursor;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    :try_start_0
    const-string v0, "work_spec_id"

    .line 38
    .line 39
    invoke-static {p1, v0}, Lq3/a;->G(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    const-string v1, "generation"

    .line 44
    .line 45
    invoke-static {p1, v1}, Lq3/a;->G(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    const-string v3, "system_id"

    .line 50
    .line 51
    invoke-static {p1, v3}, Lq3/a;->G(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-eqz v4, :cond_0

    .line 60
    .line 61
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getInt(I)I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    new-instance v4, Lu2/g;

    .line 74
    .line 75
    invoke-direct {v4, v0, v1, v3}, Lu2/g;-><init>(Ljava/lang/String;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :catchall_0
    move-exception v0

    .line 80
    goto :goto_1

    .line 81
    :cond_0
    const/4 v4, 0x0

    .line 82
    :goto_0
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2}, Landroidx/room/w0;->b()V

    .line 86
    .line 87
    .line 88
    return-object v4

    .line 89
    :goto_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2}, Landroidx/room/w0;->b()V

    .line 93
    .line 94
    .line 95
    throw v0
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

.method public d(Lkotlin/jvm/internal/d;Ljava/lang/String;)Landroidx/lifecycle/z0;
    .locals 4

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lu2/i;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, La1/d;

    .line 9
    .line 10
    monitor-enter v0

    .line 11
    :try_start_0
    iget-object v1, p0, Lu2/i;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Landroidx/lifecycle/d1;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object v1, v1, Landroidx/lifecycle/d1;->a:Ljava/util/LinkedHashMap;

    .line 19
    .line 20
    invoke-virtual {v1, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Landroidx/lifecycle/z0;

    .line 25
    .line 26
    invoke-virtual {p1, v1}, Lkotlin/jvm/internal/d;->d(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    iget-object p1, p0, Lu2/i;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p1, Landroidx/lifecycle/c1;

    .line 35
    .line 36
    instance-of p2, p1, Landroidx/lifecycle/w0;

    .line 37
    .line 38
    if-eqz p2, :cond_0

    .line 39
    .line 40
    check-cast p1, Landroidx/lifecycle/w0;

    .line 41
    .line 42
    invoke-static {v1}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-object p2, p1, Landroidx/lifecycle/w0;->d:Landroidx/lifecycle/p;

    .line 46
    .line 47
    if-eqz p2, :cond_0

    .line 48
    .line 49
    iget-object p1, p1, Landroidx/lifecycle/w0;->e:Lw1/f;

    .line 50
    .line 51
    invoke-static {p1}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    invoke-static {v1, p1, p2}, Landroidx/lifecycle/t0;->a(Landroidx/lifecycle/z0;Lw1/f;Landroidx/lifecycle/p;)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :catchall_0
    move-exception p1

    .line 59
    goto :goto_4

    .line 60
    :cond_0
    :goto_0
    const-string p1, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel"

    .line 61
    .line 62
    invoke-static {v1, p1}, Lkotlin/jvm/internal/j;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_1
    new-instance v1, Lj1/c;

    .line 67
    .line 68
    iget-object v2, p0, Lu2/i;->c:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v2, Lj1/b;

    .line 71
    .line 72
    invoke-direct {v1, v2}, Lj1/c;-><init>(Lj1/b;)V

    .line 73
    .line 74
    .line 75
    sget-object v2, Landroidx/lifecycle/t0;->e:La1/d;

    .line 76
    .line 77
    iget-object v3, v1, Lj1/b;->a:Ljava/util/LinkedHashMap;

    .line 78
    .line 79
    invoke-interface {v3, v2, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    iget-object v2, p0, Lu2/i;->b:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v2, Landroidx/lifecycle/c1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    .line 86
    :try_start_1
    invoke-interface {v2, p1, v1}, Landroidx/lifecycle/c1;->b(Lkotlin/jvm/internal/d;Lj1/c;)Landroidx/lifecycle/z0;

    .line 87
    .line 88
    .line 89
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/AbstractMethodError; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 90
    :goto_1
    move-object v1, p1

    .line 91
    goto :goto_2

    .line 92
    :catch_0
    :try_start_2
    invoke-static {p1}, Le6/d;->n(Lj5/c;)Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-interface {v2, v3, v1}, Landroidx/lifecycle/c1;->c(Ljava/lang/Class;Lj1/c;)Landroidx/lifecycle/z0;

    .line 97
    .line 98
    .line 99
    move-result-object p1
    :try_end_2
    .catch Ljava/lang/AbstractMethodError; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 100
    goto :goto_1

    .line 101
    :catch_1
    :try_start_3
    invoke-static {p1}, Le6/d;->n(Lj5/c;)Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-interface {v2, p1}, Landroidx/lifecycle/c1;->a(Ljava/lang/Class;)Landroidx/lifecycle/z0;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    goto :goto_1

    .line 110
    :goto_2
    iget-object p1, p0, Lu2/i;->a:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast p1, Landroidx/lifecycle/d1;

    .line 113
    .line 114
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    const-string v2, "viewModel"

    .line 118
    .line 119
    invoke-static {v1, v2}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    iget-object p1, p1, Landroidx/lifecycle/d1;->a:Ljava/util/LinkedHashMap;

    .line 123
    .line 124
    invoke-interface {p1, p2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    check-cast p1, Landroidx/lifecycle/z0;

    .line 129
    .line 130
    if-eqz p1, :cond_2

    .line 131
    .line 132
    invoke-virtual {p1}, Landroidx/lifecycle/z0;->clear$lifecycle_viewmodel_release()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 133
    .line 134
    .line 135
    :cond_2
    :goto_3
    monitor-exit v0

    .line 136
    return-object v1

    .line 137
    :goto_4
    monitor-exit v0

    .line 138
    throw p1
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
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
.end method

.method public e(Lu2/g;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lu2/i;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/work/impl/WorkDatabase_Impl;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/room/r0;->assertNotSuspendingTransaction()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/room/r0;->beginTransaction()V

    .line 9
    .line 10
    .line 11
    :try_start_0
    iget-object v1, p0, Lu2/i;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Lu2/b;

    .line 14
    .line 15
    invoke-virtual {v1, p1}, Lu2/b;->e(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Landroidx/room/r0;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Landroidx/room/r0;->endTransaction()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    invoke-virtual {v0}, Landroidx/room/r0;->endTransaction()V

    .line 27
    .line 28
    .line 29
    throw p1
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method
