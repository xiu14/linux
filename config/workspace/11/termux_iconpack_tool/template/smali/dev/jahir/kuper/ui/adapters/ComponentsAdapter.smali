.class public final Ldev/jahir/kuper/ui/adapters/ComponentsAdapter;
.super Lcom/afollestad/sectionedrecyclerview/d;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/afollestad/sectionedrecyclerview/d;"
    }
.end annotation


# instance fields
.field private components:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ldev/jahir/kuper/data/models/Component;",
            ">;"
        }
    .end annotation
.end field

.field private final onClick:Ld5/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld5/l;"
        }
    .end annotation
.end field

.field private final sectionTitles:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private wallpaper:Landroid/graphics/drawable/Drawable;


# direct methods
.method public constructor <init>(Ld5/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld5/l;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "onClick"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/afollestad/sectionedrecyclerview/d;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Ldev/jahir/kuper/ui/adapters/ComponentsAdapter;->onClick:Ld5/l;

    .line 10
    .line 11
    sget-object p1, Lq4/r;->h:Lq4/r;

    .line 12
    .line 13
    iput-object p1, p0, Ldev/jahir/kuper/ui/adapters/ComponentsAdapter;->components:Ljava/util/List;

    .line 14
    .line 15
    new-instance p1, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Ldev/jahir/kuper/ui/adapters/ComponentsAdapter;->sectionTitles:Ljava/util/ArrayList;

    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    invoke-virtual {p0, p1}, Lcom/afollestad/sectionedrecyclerview/d;->shouldShowHeadersForEmptySections(Z)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p1}, Lcom/afollestad/sectionedrecyclerview/d;->shouldShowFooters(Z)V

    .line 27
    .line 28
    .line 29
    return-void
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method private final getComponentTypeForSection(I)Ldev/jahir/kuper/data/models/Component$Type;
    .locals 1

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p1, v0, :cond_2

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-eq p1, v0, :cond_1

    .line 8
    .line 9
    const/4 v0, 0x3

    .line 10
    if-eq p1, v0, :cond_0

    .line 11
    .line 12
    sget-object p1, Ldev/jahir/kuper/data/models/Component$Type;->UNKNOWN:Ldev/jahir/kuper/data/models/Component$Type;

    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_0
    sget-object p1, Ldev/jahir/kuper/data/models/Component$Type;->WALLPAPER:Ldev/jahir/kuper/data/models/Component$Type;

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_1
    sget-object p1, Ldev/jahir/kuper/data/models/Component$Type;->LOCKSCREEN:Ldev/jahir/kuper/data/models/Component$Type;

    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_2
    sget-object p1, Ldev/jahir/kuper/data/models/Component$Type;->WIDGET:Ldev/jahir/kuper/data/models/Component$Type;

    .line 22
    .line 23
    return-object p1

    .line 24
    :cond_3
    sget-object p1, Ldev/jahir/kuper/data/models/Component$Type;->KOMPONENT:Ldev/jahir/kuper/data/models/Component$Type;

    .line 25
    .line 26
    return-object p1
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


# virtual methods
.method public final getComponents()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ldev/jahir/kuper/data/models/Component;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Ldev/jahir/kuper/ui/adapters/ComponentsAdapter;->components:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
    .line 4
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

.method public getItemCount(I)I
    .locals 5

    .line 1
    iget-object v0, p0, Ldev/jahir/kuper/ui/adapters/ComponentsAdapter;->components:Ljava/util/List;

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    move-object v3, v2

    .line 23
    check-cast v3, Ldev/jahir/kuper/data/models/Component;

    .line 24
    .line 25
    invoke-virtual {v3}, Ldev/jahir/kuper/data/models/Component;->getType()Ldev/jahir/kuper/data/models/Component$Type;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-direct {p0, p1}, Ldev/jahir/kuper/ui/adapters/ComponentsAdapter;->getComponentTypeForSection(I)Ldev/jahir/kuper/data/models/Component$Type;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    if-ne v3, v4, :cond_0

    .line 34
    .line 35
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    return p1
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

.method public getItemViewType(III)I
    .locals 0

    .line 1
    return p1
    .line 2
    .line 3
    .line 4
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

.method public getSectionCount()I
    .locals 1

    .line 1
    invoke-static {}, Ldev/jahir/kuper/data/models/Component$Type;->getEntries()Lw4/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lq4/c;

    .line 6
    .line 7
    invoke-virtual {v0}, Lq4/c;->d()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
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

.method public final getWallpaper$library_release()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/kuper/ui/adapters/ComponentsAdapter;->wallpaper:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    return-object v0
    .line 4
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

.method public onBindFooterViewHolder(Lcom/afollestad/sectionedrecyclerview/f;I)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
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

.method public onBindHeaderViewHolder(Lcom/afollestad/sectionedrecyclerview/f;IZ)V
    .locals 1

    .line 1
    instance-of p3, p1, Ldev/jahir/frames/ui/viewholders/SectionHeaderViewHolder;

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    check-cast p1, Ldev/jahir/frames/ui/viewholders/SectionHeaderViewHolder;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    if-eqz p1, :cond_3

    .line 10
    .line 11
    iget-object p3, p0, Ldev/jahir/kuper/ui/adapters/ComponentsAdapter;->sectionTitles:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-static {p2, p3}, Lq4/i;->u0(ILjava/util/List;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    check-cast p3, Ljava/lang/String;

    .line 18
    .line 19
    const-string v0, ""

    .line 20
    .line 21
    if-nez p3, :cond_1

    .line 22
    .line 23
    move-object p3, v0

    .line 24
    :cond_1
    if-lez p2, :cond_2

    .line 25
    .line 26
    const/4 p2, 0x1

    .line 27
    goto :goto_1

    .line 28
    :cond_2
    const/4 p2, 0x0

    .line 29
    :goto_1
    invoke-virtual {p1, p3, v0, p2}, Ldev/jahir/frames/ui/viewholders/SectionHeaderViewHolder;->bind(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    :cond_3
    return-void
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

.method public onBindViewHolder(Lcom/afollestad/sectionedrecyclerview/f;III)V
    .locals 4

    .line 1
    instance-of p4, p1, Ldev/jahir/kuper/ui/viewholders/ComponentViewHolder;

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    check-cast p1, Ldev/jahir/kuper/ui/viewholders/ComponentViewHolder;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    if-eqz p1, :cond_3

    .line 10
    .line 11
    iget-object p4, p0, Ldev/jahir/kuper/ui/adapters/ComponentsAdapter;->components:Ljava/util/List;

    .line 12
    .line 13
    new-instance v0, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p4

    .line 22
    :cond_1
    :goto_1
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    move-object v2, v1

    .line 33
    check-cast v2, Ldev/jahir/kuper/data/models/Component;

    .line 34
    .line 35
    invoke-virtual {v2}, Ldev/jahir/kuper/data/models/Component;->getType()Ldev/jahir/kuper/data/models/Component$Type;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-direct {p0, p2}, Ldev/jahir/kuper/ui/adapters/ComponentsAdapter;->getComponentTypeForSection(I)Ldev/jahir/kuper/data/models/Component$Type;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    if-ne v2, v3, :cond_1

    .line 44
    .line 45
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    check-cast p2, Ldev/jahir/kuper/data/models/Component;

    .line 54
    .line 55
    iget-object p3, p0, Ldev/jahir/kuper/ui/adapters/ComponentsAdapter;->wallpaper:Landroid/graphics/drawable/Drawable;

    .line 56
    .line 57
    iget-object p4, p0, Ldev/jahir/kuper/ui/adapters/ComponentsAdapter;->onClick:Ld5/l;

    .line 58
    .line 59
    invoke-virtual {p1, p2, p3, p4}, Ldev/jahir/kuper/ui/viewholders/ComponentViewHolder;->bind(Ldev/jahir/kuper/data/models/Component;Landroid/graphics/drawable/Drawable;Ld5/l;)V

    .line 60
    .line 61
    .line 62
    :cond_3
    return-void
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

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/i2;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Ldev/jahir/kuper/ui/adapters/ComponentsAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/afollestad/sectionedrecyclerview/f;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/afollestad/sectionedrecyclerview/f;
    .locals 4

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-ltz p2, :cond_0

    .line 2
    new-instance p2, Ldev/jahir/kuper/ui/viewholders/ComponentViewHolder;

    sget v3, Ldev/jahir/kuper/R$layout;->item_component:I

    invoke-static {p1, v3, v2, v1, v0}, Ldev/jahir/frames/extensions/views/ViewKt;->inflate$default(Landroid/view/ViewGroup;IZILjava/lang/Object;)Landroid/view/View;

    move-result-object p1

    invoke-direct {p2, p1}, Ldev/jahir/kuper/ui/viewholders/ComponentViewHolder;-><init>(Landroid/view/View;)V

    return-object p2

    .line 3
    :cond_0
    new-instance p2, Ldev/jahir/frames/ui/viewholders/SectionHeaderViewHolder;

    sget v3, Ldev/jahir/frames/R$layout;->item_section_header:I

    invoke-static {p1, v3, v2, v1, v0}, Ldev/jahir/frames/extensions/views/ViewKt;->inflate$default(Landroid/view/ViewGroup;IZILjava/lang/Object;)Landroid/view/View;

    move-result-object p1

    invoke-direct {p2, p1}, Ldev/jahir/frames/ui/viewholders/SectionHeaderViewHolder;-><init>(Landroid/view/View;)V

    return-object p2
.end method

.method public final setComponents(Ljava/util/List;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NotifyDataSetChanged"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ldev/jahir/kuper/data/models/Component;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Ldev/jahir/kuper/ui/adapters/ComponentsAdapter;->components:Ljava/util/List;

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/recyclerview/widget/c1;->notifyDataSetChanged()V

    .line 9
    .line 10
    .line 11
    return-void
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

.method public final setWallpaper$library_release(Landroid/graphics/drawable/Drawable;)V
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NotifyDataSetChanged"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Ldev/jahir/kuper/ui/adapters/ComponentsAdapter;->wallpaper:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/c1;->notifyDataSetChanged()V

    .line 4
    .line 5
    .line 6
    return-void
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
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final updateSectionTitles$library_release(Landroid/content/Context;)V
    .locals 8
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NotifyDataSetChanged"
        }
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Ldev/jahir/kuper/ui/adapters/ComponentsAdapter;->sectionTitles:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    :goto_0
    return-void

    .line 13
    :cond_1
    iget-object v0, p0, Ldev/jahir/kuper/ui/adapters/ComponentsAdapter;->sectionTitles:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Ldev/jahir/kuper/ui/adapters/ComponentsAdapter;->sectionTitles:Ljava/util/ArrayList;

    .line 19
    .line 20
    sget v1, Ldev/jahir/kuper/R$string;->komponents:I

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    const/4 v3, 0x2

    .line 24
    invoke-static {p1, v1, v2, v3, v2}, Ldev/jahir/frames/extensions/context/ContextKt;->string$default(Landroid/content/Context;I[Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Ldev/jahir/kuper/ui/adapters/ComponentsAdapter;->sectionTitles:Ljava/util/ArrayList;

    .line 32
    .line 33
    sget v1, Ldev/jahir/kuper/R$string;->x_templates:I

    .line 34
    .line 35
    sget v4, Ldev/jahir/kuper/R$string;->kwgt:I

    .line 36
    .line 37
    invoke-static {p1, v4, v2, v3, v2}, Ldev/jahir/frames/extensions/context/ContextKt;->string$default(Landroid/content/Context;I[Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    const/4 v5, 0x1

    .line 42
    new-array v6, v5, [Ljava/lang/Object;

    .line 43
    .line 44
    const/4 v7, 0x0

    .line 45
    aput-object v4, v6, v7

    .line 46
    .line 47
    invoke-static {p1, v1, v6}, Ldev/jahir/frames/extensions/context/ContextKt;->string(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Ldev/jahir/kuper/ui/adapters/ComponentsAdapter;->sectionTitles:Ljava/util/ArrayList;

    .line 55
    .line 56
    sget v1, Ldev/jahir/kuper/R$string;->x_templates:I

    .line 57
    .line 58
    sget v4, Ldev/jahir/kuper/R$string;->klck:I

    .line 59
    .line 60
    invoke-static {p1, v4, v2, v3, v2}, Ldev/jahir/frames/extensions/context/ContextKt;->string$default(Landroid/content/Context;I[Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    new-array v6, v5, [Ljava/lang/Object;

    .line 65
    .line 66
    aput-object v4, v6, v7

    .line 67
    .line 68
    invoke-static {p1, v1, v6}, Ldev/jahir/frames/extensions/context/ContextKt;->string(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    iget-object v0, p0, Ldev/jahir/kuper/ui/adapters/ComponentsAdapter;->sectionTitles:Ljava/util/ArrayList;

    .line 76
    .line 77
    sget v1, Ldev/jahir/kuper/R$string;->x_templates:I

    .line 78
    .line 79
    sget v4, Ldev/jahir/kuper/R$string;->klwp:I

    .line 80
    .line 81
    invoke-static {p1, v4, v2, v3, v2}, Ldev/jahir/frames/extensions/context/ContextKt;->string$default(Landroid/content/Context;I[Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    new-array v3, v5, [Ljava/lang/Object;

    .line 86
    .line 87
    aput-object v2, v3, v7

    .line 88
    .line 89
    invoke-static {p1, v1, v3}, Ldev/jahir/frames/extensions/context/ContextKt;->string(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Landroidx/recyclerview/widget/c1;->notifyDataSetChanged()V

    .line 97
    .line 98
    .line 99
    return-void
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
