.class public synthetic Lp3/z;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Lcom/google/android/gms/internal/play_billing/zzr;
.implements Lh3/j;


# instance fields
.field public h:I

.field public final i:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lp3/z;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(I[Lj0/h;)V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput p1, p0, Lp3/z;->h:I

    .line 12
    iput-object p2, p0, Lp3/z;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 5
    invoke-static {p1, v0}, Landroidx/appcompat/app/r;->e(Landroid/content/Context;I)I

    move-result v0

    invoke-direct {p0, p1, v0}, Lp3/z;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 3

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    new-instance v0, Landroidx/appcompat/app/n;

    new-instance v1, Landroid/view/ContextThemeWrapper;

    .line 8
    invoke-static {p1, p2}, Landroidx/appcompat/app/r;->e(Landroid/content/Context;I)I

    move-result v2

    invoke-direct {v1, p1, v2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    invoke-direct {v0, v1}, Landroidx/appcompat/app/n;-><init>(Landroid/view/ContextThemeWrapper;)V

    iput-object v0, p0, Lp3/z;->i:Ljava/lang/Object;

    .line 9
    iput p2, p0, Lp3/z;->h:I

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp3/z;->i:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lp3/c0;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp3/z;->i:Ljava/lang/Object;

    iput p2, p0, Lp3/z;->h:I

    return-void
.end method


# virtual methods
.method public declared-synchronized a(Lh3/b;)Lh3/c;
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lp3/z;->i:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Ljava/util/ArrayList;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    monitor-exit p0

    .line 16
    return-object v0

    .line 17
    :cond_0
    :try_start_1
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, 0x0

    .line 22
    :goto_0
    if-ge v2, v1, :cond_3

    .line 23
    .line 24
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Lh3/h;

    .line 29
    .line 30
    iget-object v4, v3, Lh3/h;->b:Ljava/lang/ref/WeakReference;

    .line 31
    .line 32
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    check-cast v4, Landroid/graphics/Bitmap;

    .line 37
    .line 38
    if-eqz v4, :cond_1

    .line 39
    .line 40
    new-instance v5, Lh3/c;

    .line 41
    .line 42
    iget-object v3, v3, Lh3/h;->c:Ljava/util/Map;

    .line 43
    .line 44
    invoke-direct {v5, v4, v3}, Lh3/c;-><init>(Landroid/graphics/Bitmap;Ljava/util/Map;)V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :catchall_0
    move-exception p1

    .line 49
    goto :goto_3

    .line 50
    :cond_1
    move-object v5, v0

    .line 51
    :goto_1
    if-eqz v5, :cond_2

    .line 52
    .line 53
    move-object v0, v5

    .line 54
    goto :goto_2

    .line 55
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    :goto_2
    iget p1, p0, Lp3/z;->h:I

    .line 59
    .line 60
    add-int/lit8 v1, p1, 0x1

    .line 61
    .line 62
    iput v1, p0, Lp3/z;->h:I

    .line 63
    .line 64
    const/16 v1, 0xa

    .line 65
    .line 66
    if-lt p1, v1, :cond_4

    .line 67
    .line 68
    invoke-virtual {p0}, Lp3/z;->c()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 69
    .line 70
    .line 71
    :cond_4
    monitor-exit p0

    .line 72
    return-object v0

    .line 73
    :goto_3
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 74
    throw p1
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

.method public declared-synchronized b(I)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    const/16 v0, 0xa

    .line 3
    .line 4
    if-lt p1, v0, :cond_0

    .line 5
    .line 6
    const/16 v0, 0x14

    .line 7
    .line 8
    if-eq p1, v0, :cond_0

    .line 9
    .line 10
    :try_start_0
    invoke-virtual {p0}, Lp3/z;->c()V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    throw p1

    .line 17
    :cond_0
    :goto_0
    monitor-exit p0

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
.end method

.method public c()V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lp3/z;->h:I

    .line 3
    .line 4
    iget-object v1, p0, Lp3/z;->i:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_5

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    const/4 v4, 0x1

    .line 33
    if-gt v3, v4, :cond_2

    .line 34
    .line 35
    invoke-static {v2}, Lq4/i;->t0(Ljava/util/List;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Lh3/h;

    .line 40
    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    iget-object v2, v2, Lh3/h;->b:Ljava/lang/ref/WeakReference;

    .line 44
    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, Landroid/graphics/Bitmap;

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    const/4 v2, 0x0

    .line 55
    :goto_1
    if-nez v2, :cond_0

    .line 56
    .line 57
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    const/4 v4, 0x0

    .line 66
    const/4 v5, 0x0

    .line 67
    :goto_2
    if-ge v4, v3, :cond_4

    .line 68
    .line 69
    sub-int v6, v4, v5

    .line 70
    .line 71
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v7

    .line 75
    check-cast v7, Lh3/h;

    .line 76
    .line 77
    iget-object v7, v7, Lh3/h;->b:Ljava/lang/ref/WeakReference;

    .line 78
    .line 79
    invoke-virtual {v7}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    if-nez v7, :cond_3

    .line 84
    .line 85
    invoke-interface {v2, v6}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    add-int/lit8 v5, v5, 0x1

    .line 89
    .line 90
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_4
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    if-eqz v2, :cond_0

    .line 98
    .line 99
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_5
    return-void
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

.method public d()Landroidx/appcompat/app/r;
    .locals 14

    .line 1
    new-instance v0, Landroidx/appcompat/app/r;

    .line 2
    .line 3
    iget-object v1, p0, Lp3/z;->i:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v3, v1

    .line 6
    check-cast v3, Landroidx/appcompat/app/n;

    .line 7
    .line 8
    iget-object v1, v3, Landroidx/appcompat/app/n;->a:Landroid/view/ContextThemeWrapper;

    .line 9
    .line 10
    iget-object v4, v3, Landroidx/appcompat/app/n;->a:Landroid/view/ContextThemeWrapper;

    .line 11
    .line 12
    iget v2, p0, Lp3/z;->h:I

    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, Landroidx/appcompat/app/r;-><init>(Landroid/view/ContextThemeWrapper;I)V

    .line 15
    .line 16
    .line 17
    iget-object v1, v3, Landroidx/appcompat/app/n;->e:Landroid/view/View;

    .line 18
    .line 19
    iget-object v8, v0, Landroidx/appcompat/app/r;->m:Landroidx/appcompat/app/q;

    .line 20
    .line 21
    const/4 v10, 0x0

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    iput-object v1, v8, Landroidx/appcompat/app/q;->x:Landroid/view/View;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget-object v1, v3, Landroidx/appcompat/app/n;->d:Ljava/lang/CharSequence;

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    iput-object v1, v8, Landroidx/appcompat/app/q;->d:Ljava/lang/CharSequence;

    .line 32
    .line 33
    iget-object v2, v8, Landroidx/appcompat/app/q;->v:Landroid/widget/TextView;

    .line 34
    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    iget-object v1, v3, Landroidx/appcompat/app/n;->c:Landroid/graphics/drawable/Drawable;

    .line 41
    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    iput-object v1, v8, Landroidx/appcompat/app/q;->t:Landroid/graphics/drawable/Drawable;

    .line 45
    .line 46
    iget-object v2, v8, Landroidx/appcompat/app/q;->u:Landroid/widget/ImageView;

    .line 47
    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    invoke-virtual {v2, v10}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 51
    .line 52
    .line 53
    iget-object v2, v8, Landroidx/appcompat/app/q;->u:Landroid/widget/ImageView;

    .line 54
    .line 55
    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 56
    .line 57
    .line 58
    :cond_2
    :goto_0
    iget-object v1, v3, Landroidx/appcompat/app/n;->f:Ljava/lang/CharSequence;

    .line 59
    .line 60
    if-eqz v1, :cond_3

    .line 61
    .line 62
    iput-object v1, v8, Landroidx/appcompat/app/q;->e:Ljava/lang/CharSequence;

    .line 63
    .line 64
    iget-object v2, v8, Landroidx/appcompat/app/q;->w:Landroid/widget/TextView;

    .line 65
    .line 66
    if-eqz v2, :cond_3

    .line 67
    .line 68
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 69
    .line 70
    .line 71
    :cond_3
    iget-object v1, v3, Landroidx/appcompat/app/n;->g:Ljava/lang/CharSequence;

    .line 72
    .line 73
    if-nez v1, :cond_4

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_4
    const/4 v2, -0x1

    .line 77
    iget-object v5, v3, Landroidx/appcompat/app/n;->h:Landroid/content/DialogInterface$OnClickListener;

    .line 78
    .line 79
    invoke-virtual {v8, v2, v1, v5}, Landroidx/appcompat/app/q;->d(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 80
    .line 81
    .line 82
    :goto_1
    iget-object v1, v3, Landroidx/appcompat/app/n;->i:Ljava/lang/CharSequence;

    .line 83
    .line 84
    if-nez v1, :cond_5

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_5
    const/4 v2, -0x2

    .line 88
    iget-object v5, v3, Landroidx/appcompat/app/n;->j:Landroid/content/DialogInterface$OnClickListener;

    .line 89
    .line 90
    invoke-virtual {v8, v2, v1, v5}, Landroidx/appcompat/app/q;->d(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 91
    .line 92
    .line 93
    :goto_2
    iget-object v1, v3, Landroidx/appcompat/app/n;->k:Ljava/lang/CharSequence;

    .line 94
    .line 95
    if-nez v1, :cond_6

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_6
    const/4 v2, -0x3

    .line 99
    iget-object v5, v3, Landroidx/appcompat/app/n;->l:Landroid/content/DialogInterface$OnClickListener;

    .line 100
    .line 101
    invoke-virtual {v8, v2, v1, v5}, Landroidx/appcompat/app/q;->d(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 102
    .line 103
    .line 104
    :goto_3
    iget-object v1, v3, Landroidx/appcompat/app/n;->o:[Ljava/lang/CharSequence;

    .line 105
    .line 106
    const/4 v11, 0x1

    .line 107
    const/4 v12, 0x0

    .line 108
    if-nez v1, :cond_8

    .line 109
    .line 110
    iget-object v1, v3, Landroidx/appcompat/app/n;->y:Landroid/database/Cursor;

    .line 111
    .line 112
    if-nez v1, :cond_8

    .line 113
    .line 114
    iget-object v1, v3, Landroidx/appcompat/app/n;->p:Landroid/widget/ListAdapter;

    .line 115
    .line 116
    if-eqz v1, :cond_7

    .line 117
    .line 118
    goto :goto_4

    .line 119
    :cond_7
    move-object v13, v8

    .line 120
    goto/16 :goto_b

    .line 121
    .line 122
    :cond_8
    :goto_4
    iget-object v1, v3, Landroidx/appcompat/app/n;->b:Landroid/view/LayoutInflater;

    .line 123
    .line 124
    iget v2, v8, Landroidx/appcompat/app/q;->B:I

    .line 125
    .line 126
    invoke-virtual {v1, v2, v12}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    move-object v6, v1

    .line 131
    check-cast v6, Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 132
    .line 133
    iget-boolean v1, v3, Landroidx/appcompat/app/n;->u:Z

    .line 134
    .line 135
    if-eqz v1, :cond_a

    .line 136
    .line 137
    iget-object v1, v3, Landroidx/appcompat/app/n;->y:Landroid/database/Cursor;

    .line 138
    .line 139
    if-nez v1, :cond_9

    .line 140
    .line 141
    new-instance v2, Landroidx/appcompat/app/j;

    .line 142
    .line 143
    iget v5, v8, Landroidx/appcompat/app/q;->C:I

    .line 144
    .line 145
    move-object v7, v6

    .line 146
    iget-object v6, v3, Landroidx/appcompat/app/n;->o:[Ljava/lang/CharSequence;

    .line 147
    .line 148
    invoke-direct/range {v2 .. v7}, Landroidx/appcompat/app/j;-><init>(Landroidx/appcompat/app/n;Landroid/view/ContextThemeWrapper;I[Ljava/lang/CharSequence;Landroidx/appcompat/app/AlertController$RecycleListView;)V

    .line 149
    .line 150
    .line 151
    move-object v1, v7

    .line 152
    move-object v13, v8

    .line 153
    goto :goto_8

    .line 154
    :cond_9
    move-object v7, v6

    .line 155
    new-instance v2, Landroidx/appcompat/app/k;

    .line 156
    .line 157
    iget-object v5, v3, Landroidx/appcompat/app/n;->y:Landroid/database/Cursor;

    .line 158
    .line 159
    move-object v7, v8

    .line 160
    invoke-direct/range {v2 .. v7}, Landroidx/appcompat/app/k;-><init>(Landroidx/appcompat/app/n;Landroid/view/ContextThemeWrapper;Landroid/database/Cursor;Landroidx/appcompat/app/AlertController$RecycleListView;Landroidx/appcompat/app/q;)V

    .line 161
    .line 162
    .line 163
    move-object v1, v6

    .line 164
    move-object v13, v7

    .line 165
    goto :goto_8

    .line 166
    :cond_a
    move-object v1, v6

    .line 167
    move-object v13, v8

    .line 168
    iget-boolean v2, v3, Landroidx/appcompat/app/n;->v:Z

    .line 169
    .line 170
    if-eqz v2, :cond_b

    .line 171
    .line 172
    iget v2, v13, Landroidx/appcompat/app/q;->D:I

    .line 173
    .line 174
    :goto_5
    move v6, v2

    .line 175
    goto :goto_6

    .line 176
    :cond_b
    iget v2, v13, Landroidx/appcompat/app/q;->E:I

    .line 177
    .line 178
    goto :goto_5

    .line 179
    :goto_6
    iget-object v2, v3, Landroidx/appcompat/app/n;->y:Landroid/database/Cursor;

    .line 180
    .line 181
    const v5, 0x1020014

    .line 182
    .line 183
    .line 184
    if-eqz v2, :cond_c

    .line 185
    .line 186
    move-object v5, v4

    .line 187
    const v2, 0x1020014

    .line 188
    .line 189
    .line 190
    new-instance v4, Landroid/widget/SimpleCursorAdapter;

    .line 191
    .line 192
    iget-object v7, v3, Landroidx/appcompat/app/n;->y:Landroid/database/Cursor;

    .line 193
    .line 194
    iget-object v8, v3, Landroidx/appcompat/app/n;->z:Ljava/lang/String;

    .line 195
    .line 196
    filled-new-array {v8}, [Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v8

    .line 200
    filled-new-array {v2}, [I

    .line 201
    .line 202
    .line 203
    move-result-object v9

    .line 204
    invoke-direct/range {v4 .. v9}, Landroid/widget/SimpleCursorAdapter;-><init>(Landroid/content/Context;ILandroid/database/Cursor;[Ljava/lang/String;[I)V

    .line 205
    .line 206
    .line 207
    move-object v2, v4

    .line 208
    goto :goto_8

    .line 209
    :cond_c
    const v2, 0x1020014

    .line 210
    .line 211
    .line 212
    iget-object v5, v3, Landroidx/appcompat/app/n;->p:Landroid/widget/ListAdapter;

    .line 213
    .line 214
    if-eqz v5, :cond_d

    .line 215
    .line 216
    :goto_7
    move-object v2, v5

    .line 217
    goto :goto_8

    .line 218
    :cond_d
    new-instance v5, Landroidx/appcompat/app/p;

    .line 219
    .line 220
    iget-object v7, v3, Landroidx/appcompat/app/n;->o:[Ljava/lang/CharSequence;

    .line 221
    .line 222
    invoke-direct {v5, v4, v6, v2, v7}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;II[Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    goto :goto_7

    .line 226
    :goto_8
    iput-object v2, v13, Landroidx/appcompat/app/q;->y:Landroid/widget/ListAdapter;

    .line 227
    .line 228
    iget v2, v3, Landroidx/appcompat/app/n;->w:I

    .line 229
    .line 230
    iput v2, v13, Landroidx/appcompat/app/q;->z:I

    .line 231
    .line 232
    iget-object v2, v3, Landroidx/appcompat/app/n;->q:Landroid/content/DialogInterface$OnClickListener;

    .line 233
    .line 234
    if-eqz v2, :cond_e

    .line 235
    .line 236
    new-instance v2, Landroidx/appcompat/app/l;

    .line 237
    .line 238
    invoke-direct {v2, v3, v13}, Landroidx/appcompat/app/l;-><init>(Landroidx/appcompat/app/n;Landroidx/appcompat/app/q;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v1, v2}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 242
    .line 243
    .line 244
    goto :goto_9

    .line 245
    :cond_e
    iget-object v2, v3, Landroidx/appcompat/app/n;->x:Landroid/content/DialogInterface$OnMultiChoiceClickListener;

    .line 246
    .line 247
    if-eqz v2, :cond_f

    .line 248
    .line 249
    new-instance v2, Landroidx/appcompat/app/m;

    .line 250
    .line 251
    invoke-direct {v2, v3, v1, v13}, Landroidx/appcompat/app/m;-><init>(Landroidx/appcompat/app/n;Landroidx/appcompat/app/AlertController$RecycleListView;Landroidx/appcompat/app/q;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v1, v2}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 255
    .line 256
    .line 257
    :cond_f
    :goto_9
    iget-boolean v2, v3, Landroidx/appcompat/app/n;->v:Z

    .line 258
    .line 259
    if-eqz v2, :cond_10

    .line 260
    .line 261
    invoke-virtual {v1, v11}, Landroid/widget/AbsListView;->setChoiceMode(I)V

    .line 262
    .line 263
    .line 264
    goto :goto_a

    .line 265
    :cond_10
    iget-boolean v2, v3, Landroidx/appcompat/app/n;->u:Z

    .line 266
    .line 267
    if-eqz v2, :cond_11

    .line 268
    .line 269
    const/4 v2, 0x2

    .line 270
    invoke-virtual {v1, v2}, Landroid/widget/AbsListView;->setChoiceMode(I)V

    .line 271
    .line 272
    .line 273
    :cond_11
    :goto_a
    iput-object v1, v13, Landroidx/appcompat/app/q;->f:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 274
    .line 275
    :goto_b
    iget-object v1, v3, Landroidx/appcompat/app/n;->s:Landroid/view/View;

    .line 276
    .line 277
    if-eqz v1, :cond_12

    .line 278
    .line 279
    iput-object v1, v13, Landroidx/appcompat/app/q;->g:Landroid/view/View;

    .line 280
    .line 281
    iput v10, v13, Landroidx/appcompat/app/q;->h:I

    .line 282
    .line 283
    iput-boolean v10, v13, Landroidx/appcompat/app/q;->i:Z

    .line 284
    .line 285
    goto :goto_c

    .line 286
    :cond_12
    iget v1, v3, Landroidx/appcompat/app/n;->r:I

    .line 287
    .line 288
    if-eqz v1, :cond_13

    .line 289
    .line 290
    iput-object v12, v13, Landroidx/appcompat/app/q;->g:Landroid/view/View;

    .line 291
    .line 292
    iput v1, v13, Landroidx/appcompat/app/q;->h:I

    .line 293
    .line 294
    iput-boolean v10, v13, Landroidx/appcompat/app/q;->i:Z

    .line 295
    .line 296
    :cond_13
    :goto_c
    iget-boolean v1, v3, Landroidx/appcompat/app/n;->m:Z

    .line 297
    .line 298
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 299
    .line 300
    .line 301
    iget-boolean v1, v3, Landroidx/appcompat/app/n;->m:Z

    .line 302
    .line 303
    if-eqz v1, :cond_14

    .line 304
    .line 305
    invoke-virtual {v0, v11}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 306
    .line 307
    .line 308
    :cond_14
    invoke-virtual {v0, v12}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v0, v12}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 312
    .line 313
    .line 314
    iget-object v1, v3, Landroidx/appcompat/app/n;->n:Ll/n;

    .line 315
    .line 316
    if-eqz v1, :cond_15

    .line 317
    .line 318
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 319
    .line 320
    .line 321
    :cond_15
    return-object v0
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
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
.end method

.method public e()Z
    .locals 2

    .line 1
    iget v0, p0, Lp3/z;->h:I

    .line 2
    .line 3
    iget-object v1, p0, Lp3/z;->i:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-ge v0, v1, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
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

.method public f([Ljava/lang/CharSequence;[ZLandroid/content/DialogInterface$OnMultiChoiceClickListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lp3/z;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/appcompat/app/n;

    .line 4
    .line 5
    iput-object p1, v0, Landroidx/appcompat/app/n;->o:[Ljava/lang/CharSequence;

    .line 6
    .line 7
    iput-object p3, v0, Landroidx/appcompat/app/n;->x:Landroid/content/DialogInterface$OnMultiChoiceClickListener;

    .line 8
    .line 9
    iput-object p2, v0, Landroidx/appcompat/app/n;->t:[Z

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    iput-boolean p1, v0, Landroidx/appcompat/app/n;->u:Z

    .line 13
    .line 14
    return-void
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

.method public declared-synchronized g(Lh3/b;Landroid/graphics/Bitmap;Ljava/util/Map;I)V
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lp3/z;->i:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    goto :goto_3

    .line 23
    :cond_0
    :goto_0
    check-cast v1, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-static {p2}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    new-instance v0, Lh3/h;

    .line 30
    .line 31
    new-instance v2, Ljava/lang/ref/WeakReference;

    .line 32
    .line 33
    invoke-direct {v2, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-direct {v0, p1, v2, p3, p4}, Lh3/h;-><init>(ILjava/lang/ref/WeakReference;Ljava/util/Map;I)V

    .line 37
    .line 38
    .line 39
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 40
    .line 41
    .line 42
    move-result p3

    .line 43
    const/4 v2, 0x0

    .line 44
    :goto_1
    if-ge v2, p3, :cond_3

    .line 45
    .line 46
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    check-cast v3, Lh3/h;

    .line 51
    .line 52
    iget v4, v3, Lh3/h;->d:I

    .line 53
    .line 54
    if-lt p4, v4, :cond_2

    .line 55
    .line 56
    iget p3, v3, Lh3/h;->a:I

    .line 57
    .line 58
    if-ne p3, p1, :cond_1

    .line 59
    .line 60
    iget-object p1, v3, Lh3/h;->b:Ljava/lang/ref/WeakReference;

    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    if-ne p1, p2, :cond_1

    .line 67
    .line 68
    invoke-virtual {v1, v2, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_1
    invoke-virtual {v1, v2, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_3
    invoke-interface {v1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    :goto_2
    iget p1, p0, Lp3/z;->h:I

    .line 83
    .line 84
    add-int/lit8 p2, p1, 0x1

    .line 85
    .line 86
    iput p2, p0, Lp3/z;->h:I

    .line 87
    .line 88
    const/16 p2, 0xa

    .line 89
    .line 90
    if-lt p1, p2, :cond_4

    .line 91
    .line 92
    invoke-virtual {p0}, Lp3/z;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    .line 94
    .line 95
    :cond_4
    monitor-exit p0

    .line 96
    return-void

    .line 97
    :goto_3
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 98
    throw p1
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
.end method

.method public h(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lp3/z;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/appcompat/app/n;

    .line 4
    .line 5
    iput-object p1, v0, Landroidx/appcompat/app/n;->g:Ljava/lang/CharSequence;

    .line 6
    .line 7
    iput-object p2, v0, Landroidx/appcompat/app/n;->h:Landroid/content/DialogInterface$OnClickListener;

    .line 8
    .line 9
    return-void
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

.method public i([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lp3/z;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/appcompat/app/n;

    .line 4
    .line 5
    iput-object p1, v0, Landroidx/appcompat/app/n;->o:[Ljava/lang/CharSequence;

    .line 6
    .line 7
    iput-object p3, v0, Landroidx/appcompat/app/n;->q:Landroid/content/DialogInterface$OnClickListener;

    .line 8
    .line 9
    iput p2, v0, Landroidx/appcompat/app/n;->w:I

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    iput-boolean p1, v0, Landroidx/appcompat/app/n;->v:Z

    .line 13
    .line 14
    return-void
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

.method public j(Lcom/google/android/gms/internal/play_billing/zzp;)Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Lp3/z;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lp3/c0;

    .line 4
    .line 5
    iget v1, p0, Lp3/z;->h:I

    .line 6
    .line 7
    :try_start_0
    iget-object v2, v0, Lp3/c0;->E:Lcom/google/android/gms/internal/play_billing/zzau;

    .line 8
    .line 9
    if-eqz v2, :cond_5

    .line 10
    .line 11
    iget-object v2, v0, Lp3/c0;->E:Lcom/google/android/gms/internal/play_billing/zzau;

    .line 12
    .line 13
    iget-object v3, v0, Lp3/c0;->C:Landroid/content/Context;

    .line 14
    .line 15
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    const/4 v4, 0x2

    .line 20
    if-eq v1, v4, :cond_4

    .line 21
    .line 22
    const/4 v4, 0x3

    .line 23
    if-eq v1, v4, :cond_3

    .line 24
    .line 25
    const/4 v4, 0x4

    .line 26
    if-eq v1, v4, :cond_2

    .line 27
    .line 28
    const/4 v4, 0x5

    .line 29
    if-eq v1, v4, :cond_1

    .line 30
    .line 31
    const/4 v4, 0x6

    .line 32
    if-eq v1, v4, :cond_0

    .line 33
    .line 34
    const-string v1, "QUERY_PRODUCT_DETAILS_ASYNC"

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catch_0
    move-exception v1

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    const-string v1, "START_CONNECTION"

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    const-string v1, "IS_FEATURE_SUPPORTED"

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    const-string v1, "CONSUME_ASYNC"

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_3
    const-string v1, "ACKNOWLEDGE_PURCHASE"

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_4
    const-string v1, "LAUNCH_BILLING_FLOW"

    .line 52
    .line 53
    :goto_0
    new-instance v4, Lp3/b0;

    .line 54
    .line 55
    invoke-direct {v4, p1}, Lp3/b0;-><init>(Lcom/google/android/gms/internal/play_billing/zzp;)V

    .line 56
    .line 57
    .line 58
    invoke-interface {v2, v3, v1, v4}, Lcom/google/android/gms/internal/play_billing/zzau;->g0(Ljava/lang/String;Ljava/lang/String;Lp3/b0;)V

    .line 59
    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_5
    const/4 v1, 0x0

    .line 63
    throw v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    :goto_1
    sget-object v2, Lcom/google/android/gms/internal/play_billing/zzie;->Y0:Lcom/google/android/gms/internal/play_billing/zzie;

    .line 65
    .line 66
    const/16 v3, 0x1c

    .line 67
    .line 68
    sget-object v4, Lp3/f0;->p:Lp3/e;

    .line 69
    .line 70
    invoke-virtual {v0, v2, v3, v4}, Lp3/c0;->I(Lcom/google/android/gms/internal/play_billing/zzie;ILp3/e;)V

    .line 71
    .line 72
    .line 73
    const-string v0, "BillingClientTesting"

    .line 74
    .line 75
    const-string v2, "An error occurred while retrieving billing override."

    .line 76
    .line 77
    invoke-static {v0, v2, v1}, Lcom/google/android/gms/internal/play_billing/zzc;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 78
    .line 79
    .line 80
    const/4 v0, 0x0

    .line 81
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/play_billing/zzp;->a(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    :goto_2
    const-string p1, "billingOverrideService.getBillingOverride"

    .line 89
    .line 90
    return-object p1
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
