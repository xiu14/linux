.class public final Landroidx/appcompat/widget/z2;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# static fields
.field public static final h:Landroid/graphics/PorterDuff$Mode;

.field public static i:Landroidx/appcompat/widget/z2;

.field public static final j:Landroidx/appcompat/widget/x2;


# instance fields
.field public a:Ljava/util/WeakHashMap;

.field public b:Lq/k;

.field public c:Lq/l;

.field public final d:Ljava/util/WeakHashMap;

.field public e:Landroid/util/TypedValue;

.field public f:Z

.field public g:Landroidx/appcompat/widget/a0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 2
    .line 3
    sput-object v0, Landroidx/appcompat/widget/z2;->h:Landroid/graphics/PorterDuff$Mode;

    .line 4
    .line 5
    new-instance v0, Landroidx/appcompat/widget/x2;

    .line 6
    .line 7
    const/4 v1, 0x6

    .line 8
    invoke-direct {v0, v1}, Landroidx/recyclerview/widget/r2;-><init>(I)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Landroidx/appcompat/widget/z2;->j:Landroidx/appcompat/widget/x2;

    .line 12
    .line 13
    return-void
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

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/WeakHashMap;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Ljava/util/WeakHashMap;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroidx/appcompat/widget/z2;->d:Ljava/util/WeakHashMap;

    .line 11
    .line 12
    return-void
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

.method public static declared-synchronized d()Landroidx/appcompat/widget/z2;
    .locals 2

    .line 1
    const-class v0, Landroidx/appcompat/widget/z2;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Landroidx/appcompat/widget/z2;->i:Landroidx/appcompat/widget/z2;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Landroidx/appcompat/widget/z2;

    .line 9
    .line 10
    invoke-direct {v1}, Landroidx/appcompat/widget/z2;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, Landroidx/appcompat/widget/z2;->i:Landroidx/appcompat/widget/z2;

    .line 14
    .line 15
    invoke-static {v1}, Landroidx/appcompat/widget/z2;->j(Landroidx/appcompat/widget/z2;)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception v1

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    :goto_0
    sget-object v1, Landroidx/appcompat/widget/z2;->i:Landroidx/appcompat/widget/z2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    monitor-exit v0

    .line 24
    return-object v1

    .line 25
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    throw v1
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public static declared-synchronized h(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;
    .locals 4

    .line 1
    const-class v0, Landroidx/appcompat/widget/z2;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Landroidx/appcompat/widget/z2;->j:Landroidx/appcompat/widget/x2;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/16 v2, 0x1f

    .line 10
    .line 11
    add-int v3, v2, p0

    .line 12
    .line 13
    mul-int/lit8 v3, v3, 0x1f

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    add-int/2addr v2, v3

    .line 20
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/r2;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Landroid/graphics/PorterDuffColorFilter;

    .line 29
    .line 30
    if-nez v2, :cond_0

    .line 31
    .line 32
    new-instance v2, Landroid/graphics/PorterDuffColorFilter;

    .line 33
    .line 34
    invoke-direct {v2, p0, p1}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    add-int/2addr p0, v3

    .line 42
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {v1, p0, v2}, Landroidx/recyclerview/widget/r2;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    check-cast p0, Landroid/graphics/PorterDuffColorFilter;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception p0

    .line 54
    goto :goto_1

    .line 55
    :cond_0
    :goto_0
    monitor-exit v0

    .line 56
    return-object v2

    .line 57
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 58
    throw p0
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

.method public static j(Landroidx/appcompat/widget/z2;)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroidx/appcompat/widget/y2;

    .line 8
    .line 9
    const/4 v1, 0x3

    .line 10
    invoke-direct {v0, v1}, Landroidx/appcompat/widget/y2;-><init>(I)V

    .line 11
    .line 12
    .line 13
    const-string v1, "vector"

    .line 14
    .line 15
    invoke-virtual {p0, v1, v0}, Landroidx/appcompat/widget/z2;->a(Ljava/lang/String;Landroidx/appcompat/widget/y2;)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Landroidx/appcompat/widget/y2;

    .line 19
    .line 20
    const/4 v1, 0x2

    .line 21
    invoke-direct {v0, v1}, Landroidx/appcompat/widget/y2;-><init>(I)V

    .line 22
    .line 23
    .line 24
    const-string v1, "animated-vector"

    .line 25
    .line 26
    invoke-virtual {p0, v1, v0}, Landroidx/appcompat/widget/z2;->a(Ljava/lang/String;Landroidx/appcompat/widget/y2;)V

    .line 27
    .line 28
    .line 29
    new-instance v0, Landroidx/appcompat/widget/y2;

    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    invoke-direct {v0, v1}, Landroidx/appcompat/widget/y2;-><init>(I)V

    .line 33
    .line 34
    .line 35
    const-string v1, "animated-selector"

    .line 36
    .line 37
    invoke-virtual {p0, v1, v0}, Landroidx/appcompat/widget/z2;->a(Ljava/lang/String;Landroidx/appcompat/widget/y2;)V

    .line 38
    .line 39
    .line 40
    new-instance v0, Landroidx/appcompat/widget/y2;

    .line 41
    .line 42
    const/4 v1, 0x0

    .line 43
    invoke-direct {v0, v1}, Landroidx/appcompat/widget/y2;-><init>(I)V

    .line 44
    .line 45
    .line 46
    const-string v1, "drawable"

    .line 47
    .line 48
    invoke-virtual {p0, v1, v0}, Landroidx/appcompat/widget/z2;->a(Ljava/lang/String;Landroidx/appcompat/widget/y2;)V

    .line 49
    .line 50
    .line 51
    :cond_0
    return-void
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
.method public final a(Ljava/lang/String;Landroidx/appcompat/widget/y2;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/z2;->b:Lq/k;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lq/k;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, v1}, Lq/k;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Landroidx/appcompat/widget/z2;->b:Lq/k;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/z2;->b:Lq/k;

    .line 14
    .line 15
    invoke-virtual {v0, p1, p2}, Lq/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
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

.method public final declared-synchronized b(Landroid/content/Context;JLandroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p4}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    .line 3
    .line 4
    .line 5
    move-result-object p4

    .line 6
    if-eqz p4, :cond_1

    .line 7
    .line 8
    iget-object v0, p0, Landroidx/appcompat/widget/z2;->d:Ljava/util/WeakHashMap;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lq/i;

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    new-instance v0, Lq/i;

    .line 19
    .line 20
    invoke-direct {v0}, Lq/i;-><init>()V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Landroidx/appcompat/widget/z2;->d:Ljava/util/WeakHashMap;

    .line 24
    .line 25
    invoke-virtual {v1, p1, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception p1

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    :goto_0
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 32
    .line 33
    invoke-direct {p1, p4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p2, p3, p1}, Lq/i;->h(JLjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    monitor-exit p0

    .line 40
    return-void

    .line 41
    :cond_1
    monitor-exit p0

    .line 42
    return-void

    .line 43
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    throw p1
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

.method public final c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/z2;->e:Landroid/util/TypedValue;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/util/TypedValue;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroidx/appcompat/widget/z2;->e:Landroid/util/TypedValue;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/z2;->e:Landroid/util/TypedValue;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-virtual {v1, p2, v0, v2}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    .line 20
    .line 21
    .line 22
    iget v1, v0, Landroid/util/TypedValue;->assetCookie:I

    .line 23
    .line 24
    int-to-long v3, v1

    .line 25
    const/16 v1, 0x20

    .line 26
    .line 27
    shl-long/2addr v3, v1

    .line 28
    iget v1, v0, Landroid/util/TypedValue;->data:I

    .line 29
    .line 30
    int-to-long v5, v1

    .line 31
    or-long/2addr v3, v5

    .line 32
    invoke-virtual {p0, p1, v3, v4}, Landroidx/appcompat/widget/z2;->e(Landroid/content/Context;J)Landroid/graphics/drawable/Drawable;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    return-object v1

    .line 39
    :cond_1
    iget-object v1, p0, Landroidx/appcompat/widget/z2;->g:Landroidx/appcompat/widget/a0;

    .line 40
    .line 41
    const/4 v5, 0x0

    .line 42
    if-nez v1, :cond_2

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    sget v1, Lf/e;->abc_cab_background_top_material:I

    .line 46
    .line 47
    if-ne p2, v1, :cond_3

    .line 48
    .line 49
    new-instance v5, Landroid/graphics/drawable/LayerDrawable;

    .line 50
    .line 51
    sget p2, Lf/e;->abc_cab_background_internal_bg:I

    .line 52
    .line 53
    invoke-virtual {p0, p1, p2}, Landroidx/appcompat/widget/z2;->f(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    sget v1, Lf/e;->abc_cab_background_top_mtrl_alpha:I

    .line 58
    .line 59
    invoke-virtual {p0, p1, v1}, Landroidx/appcompat/widget/z2;->f(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    const/4 v6, 0x2

    .line 64
    new-array v6, v6, [Landroid/graphics/drawable/Drawable;

    .line 65
    .line 66
    const/4 v7, 0x0

    .line 67
    aput-object p2, v6, v7

    .line 68
    .line 69
    aput-object v1, v6, v2

    .line 70
    .line 71
    invoke-direct {v5, v6}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_3
    sget v1, Lf/e;->abc_ratingbar_material:I

    .line 76
    .line 77
    if-ne p2, v1, :cond_4

    .line 78
    .line 79
    sget p2, Lf/d;->abc_star_big:I

    .line 80
    .line 81
    invoke-static {p0, p1, p2}, Landroidx/appcompat/widget/a0;->d(Landroidx/appcompat/widget/z2;Landroid/content/Context;I)Landroid/graphics/drawable/LayerDrawable;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    goto :goto_0

    .line 86
    :cond_4
    sget v1, Lf/e;->abc_ratingbar_indicator_material:I

    .line 87
    .line 88
    if-ne p2, v1, :cond_5

    .line 89
    .line 90
    sget p2, Lf/d;->abc_star_medium:I

    .line 91
    .line 92
    invoke-static {p0, p1, p2}, Landroidx/appcompat/widget/a0;->d(Landroidx/appcompat/widget/z2;Landroid/content/Context;I)Landroid/graphics/drawable/LayerDrawable;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    goto :goto_0

    .line 97
    :cond_5
    sget v1, Lf/e;->abc_ratingbar_small_material:I

    .line 98
    .line 99
    if-ne p2, v1, :cond_6

    .line 100
    .line 101
    sget p2, Lf/d;->abc_star_small:I

    .line 102
    .line 103
    invoke-static {p0, p1, p2}, Landroidx/appcompat/widget/a0;->d(Landroidx/appcompat/widget/z2;Landroid/content/Context;I)Landroid/graphics/drawable/LayerDrawable;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    :cond_6
    :goto_0
    if-eqz v5, :cond_7

    .line 108
    .line 109
    iget p2, v0, Landroid/util/TypedValue;->changingConfigurations:I

    .line 110
    .line 111
    invoke-virtual {v5, p2}, Landroid/graphics/drawable/Drawable;->setChangingConfigurations(I)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0, p1, v3, v4, v5}, Landroidx/appcompat/widget/z2;->b(Landroid/content/Context;JLandroid/graphics/drawable/Drawable;)V

    .line 115
    .line 116
    .line 117
    :cond_7
    return-object v5
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

.method public final declared-synchronized e(Landroid/content/Context;J)Landroid/graphics/drawable/Drawable;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Landroidx/appcompat/widget/z2;->d:Ljava/util/WeakHashMap;

    .line 3
    .line 4
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lq/i;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    monitor-exit p0

    .line 14
    return-object v1

    .line 15
    :cond_0
    :try_start_1
    invoke-virtual {v0, p2, p3}, Lq/i;->e(J)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 20
    .line 21
    if-eqz v2, :cond_2

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Landroid/graphics/drawable/Drawable$ConstantState;

    .line 28
    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {v2, p1}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    .line 36
    .line 37
    .line 38
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    monitor-exit p0

    .line 40
    return-object p1

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    :try_start_2
    iget-object p1, v0, Lq/i;->i:[J

    .line 44
    .line 45
    iget v2, v0, Lq/i;->k:I

    .line 46
    .line 47
    invoke-static {p1, v2, p2, p3}, Lr/a;->b([JIJ)I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-ltz p1, :cond_2

    .line 52
    .line 53
    iget-object p2, v0, Lq/i;->j:[Ljava/lang/Object;

    .line 54
    .line 55
    aget-object p3, p2, p1

    .line 56
    .line 57
    sget-object v2, Lq/j;->a:Ljava/lang/Object;

    .line 58
    .line 59
    if-eq p3, v2, :cond_2

    .line 60
    .line 61
    aput-object v2, p2, p1

    .line 62
    .line 63
    const/4 p1, 0x1

    .line 64
    iput-boolean p1, v0, Lq/i;->h:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 65
    .line 66
    :cond_2
    monitor-exit p0

    .line 67
    return-object v1

    .line 68
    :goto_0
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 69
    throw p1
    .line 70
    .line 71
.end method

.method public final declared-synchronized f(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x0

    .line 3
    :try_start_0
    invoke-virtual {p0, p1, p2, v0}, Landroidx/appcompat/widget/z2;->g(Landroid/content/Context;IZ)Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    monitor-exit p0

    .line 8
    return-object p1

    .line 9
    :catchall_0
    move-exception p1

    .line 10
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 11
    throw p1
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

.method public final declared-synchronized g(Landroid/content/Context;IZ)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Landroidx/appcompat/widget/z2;->f:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Landroidx/appcompat/widget/z2;->f:Z

    .line 9
    .line 10
    sget v0, Li/b;->abc_vector_test:I

    .line 11
    .line 12
    invoke-virtual {p0, p1, v0}, Landroidx/appcompat/widget/z2;->f(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_6

    .line 17
    .line 18
    instance-of v1, v0, Lh2/r;

    .line 19
    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    const-string v1, "android.graphics.drawable.VectorDrawable"

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_6

    .line 37
    .line 38
    :cond_1
    :goto_0
    invoke-virtual {p0, p1, p2}, Landroidx/appcompat/widget/z2;->k(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    if-nez v0, :cond_2

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, Landroidx/appcompat/widget/z2;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    goto :goto_1

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    goto :goto_2

    .line 51
    :cond_2
    :goto_1
    if-nez v0, :cond_3

    .line 52
    .line 53
    invoke-static {p1, p2}, Lc0/a;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    :cond_3
    if-eqz v0, :cond_4

    .line 58
    .line 59
    invoke-virtual {p0, p1, p2, p3, v0}, Landroidx/appcompat/widget/z2;->n(Landroid/content/Context;IZLandroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    :cond_4
    if-eqz v0, :cond_5

    .line 64
    .line 65
    invoke-static {v0}, Landroidx/appcompat/widget/x1;->a(Landroid/graphics/drawable/Drawable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    .line 67
    .line 68
    :cond_5
    monitor-exit p0

    .line 69
    return-object v0

    .line 70
    :cond_6
    const/4 p1, 0x0

    .line 71
    :try_start_1
    iput-boolean p1, p0, Landroidx/appcompat/widget/z2;->f:Z

    .line 72
    .line 73
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 74
    .line 75
    const-string p2, "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."

    .line 76
    .line 77
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw p1

    .line 81
    :goto_2
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 82
    throw p1
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

.method public final declared-synchronized i(Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Landroidx/appcompat/widget/z2;->a:Ljava/util/WeakHashMap;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lq/l;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0, p2}, Lq/l;->d(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Landroid/content/res/ColorStateList;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v0, v1

    .line 23
    :goto_0
    if-nez v0, :cond_5

    .line 24
    .line 25
    iget-object v0, p0, Landroidx/appcompat/widget/z2;->g:Landroidx/appcompat/widget/a0;

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    invoke-virtual {v0, p1, p2}, Landroidx/appcompat/widget/a0;->e(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    :goto_1
    if-eqz v1, :cond_4

    .line 35
    .line 36
    iget-object v0, p0, Landroidx/appcompat/widget/z2;->a:Ljava/util/WeakHashMap;

    .line 37
    .line 38
    if-nez v0, :cond_2

    .line 39
    .line 40
    new-instance v0, Ljava/util/WeakHashMap;

    .line 41
    .line 42
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object v0, p0, Landroidx/appcompat/widget/z2;->a:Ljava/util/WeakHashMap;

    .line 46
    .line 47
    :cond_2
    iget-object v0, p0, Landroidx/appcompat/widget/z2;->a:Ljava/util/WeakHashMap;

    .line 48
    .line 49
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Lq/l;

    .line 54
    .line 55
    if-nez v0, :cond_3

    .line 56
    .line 57
    new-instance v0, Lq/l;

    .line 58
    .line 59
    invoke-direct {v0}, Lq/l;-><init>()V

    .line 60
    .line 61
    .line 62
    iget-object v2, p0, Landroidx/appcompat/widget/z2;->a:Ljava/util/WeakHashMap;

    .line 63
    .line 64
    invoke-virtual {v2, p1, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    :cond_3
    invoke-virtual {v0, p2, v1}, Lq/l;->a(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    .line 69
    .line 70
    :cond_4
    move-object v0, v1

    .line 71
    goto :goto_2

    .line 72
    :catchall_0
    move-exception p1

    .line 73
    goto :goto_3

    .line 74
    :cond_5
    :goto_2
    monitor-exit p0

    .line 75
    return-object v0

    .line 76
    :goto_3
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 77
    throw p1
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

.method public final k(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 10

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/z2;->b:Lq/k;

    .line 2
    .line 3
    if-eqz v0, :cond_9

    .line 4
    .line 5
    invoke-virtual {v0}, Lq/k;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_9

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/appcompat/widget/z2;->c:Lq/l;

    .line 12
    .line 13
    const-string v1, "appcompat_skip_skip"

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0, p2}, Lq/l;->d(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_9

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    iget-object v2, p0, Landroidx/appcompat/widget/z2;->b:Lq/k;

    .line 32
    .line 33
    invoke-virtual {v2, v0}, Lq/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    goto/16 :goto_4

    .line 40
    .line 41
    :cond_0
    new-instance v0, Lq/l;

    .line 42
    .line 43
    invoke-direct {v0}, Lq/l;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, Landroidx/appcompat/widget/z2;->c:Lq/l;

    .line 47
    .line 48
    :cond_1
    iget-object v0, p0, Landroidx/appcompat/widget/z2;->e:Landroid/util/TypedValue;

    .line 49
    .line 50
    if-nez v0, :cond_2

    .line 51
    .line 52
    new-instance v0, Landroid/util/TypedValue;

    .line 53
    .line 54
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 55
    .line 56
    .line 57
    iput-object v0, p0, Landroidx/appcompat/widget/z2;->e:Landroid/util/TypedValue;

    .line 58
    .line 59
    :cond_2
    iget-object v0, p0, Landroidx/appcompat/widget/z2;->e:Landroid/util/TypedValue;

    .line 60
    .line 61
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    const/4 v3, 0x1

    .line 66
    invoke-virtual {v2, p2, v0, v3}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    .line 67
    .line 68
    .line 69
    iget v4, v0, Landroid/util/TypedValue;->assetCookie:I

    .line 70
    .line 71
    int-to-long v4, v4

    .line 72
    const/16 v6, 0x20

    .line 73
    .line 74
    shl-long/2addr v4, v6

    .line 75
    iget v6, v0, Landroid/util/TypedValue;->data:I

    .line 76
    .line 77
    int-to-long v6, v6

    .line 78
    or-long/2addr v4, v6

    .line 79
    invoke-virtual {p0, p1, v4, v5}, Landroidx/appcompat/widget/z2;->e(Landroid/content/Context;J)Landroid/graphics/drawable/Drawable;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    if-eqz v6, :cond_3

    .line 84
    .line 85
    return-object v6

    .line 86
    :cond_3
    iget-object v7, v0, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    .line 87
    .line 88
    if-eqz v7, :cond_7

    .line 89
    .line 90
    invoke-interface {v7}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    const-string v8, ".xml"

    .line 95
    .line 96
    invoke-virtual {v7, v8}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    if-eqz v7, :cond_7

    .line 101
    .line 102
    :try_start_0
    invoke-virtual {v2, p2}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-static {v2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    :goto_0
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 111
    .line 112
    .line 113
    move-result v8

    .line 114
    const/4 v9, 0x2

    .line 115
    if-eq v8, v9, :cond_4

    .line 116
    .line 117
    if-eq v8, v3, :cond_4

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_4
    if-ne v8, v9, :cond_6

    .line 121
    .line 122
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    iget-object v8, p0, Landroidx/appcompat/widget/z2;->c:Lq/l;

    .line 127
    .line 128
    invoke-virtual {v8, p2, v3}, Lq/l;->a(ILjava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    iget-object v8, p0, Landroidx/appcompat/widget/z2;->b:Lq/k;

    .line 132
    .line 133
    invoke-virtual {v8, v3}, Lq/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    check-cast v3, Landroidx/appcompat/widget/y2;

    .line 138
    .line 139
    if-eqz v3, :cond_5

    .line 140
    .line 141
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 142
    .line 143
    .line 144
    move-result-object v8

    .line 145
    invoke-virtual {v3, p1, v2, v7, v8}, Landroidx/appcompat/widget/y2;->a(Landroid/content/Context;Landroid/content/res/XmlResourceParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 146
    .line 147
    .line 148
    move-result-object v6

    .line 149
    goto :goto_1

    .line 150
    :catch_0
    move-exception p1

    .line 151
    goto :goto_2

    .line 152
    :cond_5
    :goto_1
    if-eqz v6, :cond_7

    .line 153
    .line 154
    iget v0, v0, Landroid/util/TypedValue;->changingConfigurations:I

    .line 155
    .line 156
    invoke-virtual {v6, v0}, Landroid/graphics/drawable/Drawable;->setChangingConfigurations(I)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p0, p1, v4, v5, v6}, Landroidx/appcompat/widget/z2;->b(Landroid/content/Context;JLandroid/graphics/drawable/Drawable;)V

    .line 160
    .line 161
    .line 162
    goto :goto_3

    .line 163
    :cond_6
    new-instance p1, Lorg/xmlpull/v1/XmlPullParserException;

    .line 164
    .line 165
    const-string v0, "No start tag found"

    .line 166
    .line 167
    invoke-direct {p1, v0}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 171
    :goto_2
    const-string v0, "ResourceManagerInternal"

    .line 172
    .line 173
    const-string v2, "Exception while inflating drawable"

    .line 174
    .line 175
    invoke-static {v0, v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 176
    .line 177
    .line 178
    :cond_7
    :goto_3
    if-nez v6, :cond_8

    .line 179
    .line 180
    iget-object p1, p0, Landroidx/appcompat/widget/z2;->c:Lq/l;

    .line 181
    .line 182
    invoke-virtual {p1, p2, v1}, Lq/l;->a(ILjava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    :cond_8
    return-object v6

    .line 186
    :cond_9
    :goto_4
    const/4 p1, 0x0

    .line 187
    return-object p1
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

.method public final declared-synchronized l(Landroid/content/Context;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Landroidx/appcompat/widget/z2;->d:Ljava/util/WeakHashMap;

    .line 3
    .line 4
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lq/i;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Lq/i;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    monitor-exit p0

    .line 19
    return-void

    .line 20
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    throw p1
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

.method public final declared-synchronized m(Landroidx/appcompat/widget/a0;)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput-object p1, p0, Landroidx/appcompat/widget/z2;->g:Landroidx/appcompat/widget/a0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-void

    .line 6
    :catchall_0
    move-exception p1

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw p1
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

.method public final n(Landroid/content/Context;IZLandroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    .locals 7

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/appcompat/widget/z2;->i(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    invoke-virtual {p4}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p1}, Le6/d;->Y(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {p1, v0}, Lf0/a;->h(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    .line 17
    .line 18
    .line 19
    iget-object p3, p0, Landroidx/appcompat/widget/z2;->g:Landroidx/appcompat/widget/a0;

    .line 20
    .line 21
    if-nez p3, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    sget p3, Lf/e;->abc_switch_thumb_material:I

    .line 25
    .line 26
    if-ne p2, p3, :cond_1

    .line 27
    .line 28
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    .line 29
    .line 30
    :cond_1
    :goto_0
    if-eqz v1, :cond_2

    .line 31
    .line 32
    invoke-static {p1, v1}, Lf0/a;->i(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    .line 33
    .line 34
    .line 35
    :cond_2
    return-object p1

    .line 36
    :cond_3
    iget-object v0, p0, Landroidx/appcompat/widget/z2;->g:Landroidx/appcompat/widget/a0;

    .line 37
    .line 38
    if-eqz v0, :cond_6

    .line 39
    .line 40
    sget v0, Lf/e;->abc_seekbar_track_material:I

    .line 41
    .line 42
    const v2, 0x102000d

    .line 43
    .line 44
    .line 45
    const v3, 0x102000f

    .line 46
    .line 47
    .line 48
    const/high16 v4, 0x1020000

    .line 49
    .line 50
    if-ne p2, v0, :cond_4

    .line 51
    .line 52
    move-object p2, p4

    .line 53
    check-cast p2, Landroid/graphics/drawable/LayerDrawable;

    .line 54
    .line 55
    invoke-virtual {p2, v4}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;

    .line 56
    .line 57
    .line 58
    move-result-object p3

    .line 59
    sget v0, Lf/a;->colorControlNormal:I

    .line 60
    .line 61
    invoke-static {p1, v0}, Landroidx/appcompat/widget/x3;->c(Landroid/content/Context;I)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    sget-object v1, Landroidx/appcompat/widget/b0;->b:Landroid/graphics/PorterDuff$Mode;

    .line 66
    .line 67
    invoke-static {p3, v0, v1}, Landroidx/appcompat/widget/a0;->g(Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p2, v3}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;

    .line 71
    .line 72
    .line 73
    move-result-object p3

    .line 74
    sget v0, Lf/a;->colorControlNormal:I

    .line 75
    .line 76
    invoke-static {p1, v0}, Landroidx/appcompat/widget/x3;->c(Landroid/content/Context;I)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    invoke-static {p3, v0, v1}, Landroidx/appcompat/widget/a0;->g(Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p2, v2}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    sget p3, Lf/a;->colorControlActivated:I

    .line 88
    .line 89
    invoke-static {p1, p3}, Landroidx/appcompat/widget/x3;->c(Landroid/content/Context;I)I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    invoke-static {p2, p1, v1}, Landroidx/appcompat/widget/a0;->g(Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V

    .line 94
    .line 95
    .line 96
    return-object p4

    .line 97
    :cond_4
    sget v0, Lf/e;->abc_ratingbar_material:I

    .line 98
    .line 99
    if-eq p2, v0, :cond_5

    .line 100
    .line 101
    sget v0, Lf/e;->abc_ratingbar_indicator_material:I

    .line 102
    .line 103
    if-eq p2, v0, :cond_5

    .line 104
    .line 105
    sget v0, Lf/e;->abc_ratingbar_small_material:I

    .line 106
    .line 107
    if-ne p2, v0, :cond_6

    .line 108
    .line 109
    :cond_5
    move-object p2, p4

    .line 110
    check-cast p2, Landroid/graphics/drawable/LayerDrawable;

    .line 111
    .line 112
    invoke-virtual {p2, v4}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;

    .line 113
    .line 114
    .line 115
    move-result-object p3

    .line 116
    sget v0, Lf/a;->colorControlNormal:I

    .line 117
    .line 118
    invoke-static {p1, v0}, Landroidx/appcompat/widget/x3;->b(Landroid/content/Context;I)I

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    sget-object v1, Landroidx/appcompat/widget/b0;->b:Landroid/graphics/PorterDuff$Mode;

    .line 123
    .line 124
    invoke-static {p3, v0, v1}, Landroidx/appcompat/widget/a0;->g(Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p2, v3}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;

    .line 128
    .line 129
    .line 130
    move-result-object p3

    .line 131
    sget v0, Lf/a;->colorControlActivated:I

    .line 132
    .line 133
    invoke-static {p1, v0}, Landroidx/appcompat/widget/x3;->c(Landroid/content/Context;I)I

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    invoke-static {p3, v0, v1}, Landroidx/appcompat/widget/a0;->g(Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p2, v2}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;

    .line 141
    .line 142
    .line 143
    move-result-object p2

    .line 144
    sget p3, Lf/a;->colorControlActivated:I

    .line 145
    .line 146
    invoke-static {p1, p3}, Landroidx/appcompat/widget/x3;->c(Landroid/content/Context;I)I

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    invoke-static {p2, p1, v1}, Landroidx/appcompat/widget/a0;->g(Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V

    .line 151
    .line 152
    .line 153
    return-object p4

    .line 154
    :cond_6
    iget-object v0, p0, Landroidx/appcompat/widget/z2;->g:Landroidx/appcompat/widget/a0;

    .line 155
    .line 156
    const/4 v2, 0x0

    .line 157
    if-eqz v0, :cond_d

    .line 158
    .line 159
    sget-object v3, Landroidx/appcompat/widget/b0;->b:Landroid/graphics/PorterDuff$Mode;

    .line 160
    .line 161
    iget-object v4, v0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v4, [I

    .line 164
    .line 165
    invoke-static {v4, p2}, Landroidx/appcompat/widget/a0;->a([II)Z

    .line 166
    .line 167
    .line 168
    move-result v4

    .line 169
    const/4 v5, 0x1

    .line 170
    const/4 v6, -0x1

    .line 171
    if-eqz v4, :cond_7

    .line 172
    .line 173
    sget p2, Lf/a;->colorControlNormal:I

    .line 174
    .line 175
    :goto_1
    const/4 v0, -0x1

    .line 176
    :goto_2
    const/4 v4, 0x1

    .line 177
    goto :goto_4

    .line 178
    :cond_7
    iget-object v4, v0, Landroidx/appcompat/widget/a0;->d:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v4, [I

    .line 181
    .line 182
    invoke-static {v4, p2}, Landroidx/appcompat/widget/a0;->a([II)Z

    .line 183
    .line 184
    .line 185
    move-result v4

    .line 186
    if-eqz v4, :cond_8

    .line 187
    .line 188
    sget p2, Lf/a;->colorControlActivated:I

    .line 189
    .line 190
    goto :goto_1

    .line 191
    :cond_8
    iget-object v0, v0, Landroidx/appcompat/widget/a0;->e:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v0, [I

    .line 194
    .line 195
    invoke-static {v0, p2}, Landroidx/appcompat/widget/a0;->a([II)Z

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    const v4, 0x1010031

    .line 200
    .line 201
    .line 202
    if-eqz v0, :cond_9

    .line 203
    .line 204
    sget-object v3, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    .line 205
    .line 206
    :goto_3
    const p2, 0x1010031

    .line 207
    .line 208
    .line 209
    goto :goto_1

    .line 210
    :cond_9
    sget v0, Lf/e;->abc_list_divider_mtrl_alpha:I

    .line 211
    .line 212
    if-ne p2, v0, :cond_a

    .line 213
    .line 214
    const p2, 0x42233333    # 40.8f

    .line 215
    .line 216
    .line 217
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 218
    .line 219
    .line 220
    move-result p2

    .line 221
    const v0, 0x1010030

    .line 222
    .line 223
    .line 224
    move v0, p2

    .line 225
    const p2, 0x1010030

    .line 226
    .line 227
    .line 228
    goto :goto_2

    .line 229
    :cond_a
    sget v0, Lf/e;->abc_dialog_material_background:I

    .line 230
    .line 231
    if-ne p2, v0, :cond_b

    .line 232
    .line 233
    goto :goto_3

    .line 234
    :cond_b
    const/4 p2, 0x0

    .line 235
    const/4 v0, -0x1

    .line 236
    const/4 v4, 0x0

    .line 237
    :goto_4
    if-eqz v4, :cond_d

    .line 238
    .line 239
    invoke-virtual {p4}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    invoke-static {p1, p2}, Landroidx/appcompat/widget/x3;->c(Landroid/content/Context;I)I

    .line 244
    .line 245
    .line 246
    move-result p1

    .line 247
    invoke-static {p1, v3}, Landroidx/appcompat/widget/b0;->c(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    invoke-virtual {v2, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 252
    .line 253
    .line 254
    if-eq v0, v6, :cond_c

    .line 255
    .line 256
    invoke-virtual {v2, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 257
    .line 258
    .line 259
    :cond_c
    const/4 v2, 0x1

    .line 260
    :cond_d
    if-nez v2, :cond_e

    .line 261
    .line 262
    if-eqz p3, :cond_e

    .line 263
    .line 264
    return-object v1

    .line 265
    :cond_e
    return-object p4
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
.end method
