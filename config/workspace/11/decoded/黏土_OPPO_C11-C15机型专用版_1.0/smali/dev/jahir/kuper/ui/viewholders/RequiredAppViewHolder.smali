.class public final Ldev/jahir/kuper/ui/viewholders/RequiredAppViewHolder;
.super Lcom/afollestad/sectionedrecyclerview/f;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field private final button$delegate:Lp4/c;

.field private final description$delegate:Lp4/c;

.field private final icon$delegate:Lp4/c;

.field private final title$delegate:Lp4/c;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 3

    .line 1
    const-string v0, "itemView"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/i2;-><init>(Landroid/view/View;)V

    .line 7
    .line 8
    .line 9
    sget v0, Ldev/jahir/kuper/R$id;->stat_icon:I

    .line 10
    .line 11
    new-instance v1, Ldev/jahir/kuper/ui/viewholders/RequiredAppViewHolder$special$$inlined$findView$default$1;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-direct {v1, p1, v0, v2}, Ldev/jahir/kuper/ui/viewholders/RequiredAppViewHolder$special$$inlined$findView$default$1;-><init>(Landroid/view/View;IZ)V

    .line 15
    .line 16
    .line 17
    invoke-static {v1}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Ldev/jahir/kuper/ui/viewholders/RequiredAppViewHolder;->icon$delegate:Lp4/c;

    .line 22
    .line 23
    sget v0, Ldev/jahir/kuper/R$id;->stat_title:I

    .line 24
    .line 25
    new-instance v1, Ldev/jahir/kuper/ui/viewholders/RequiredAppViewHolder$special$$inlined$findView$default$2;

    .line 26
    .line 27
    invoke-direct {v1, p1, v0, v2}, Ldev/jahir/kuper/ui/viewholders/RequiredAppViewHolder$special$$inlined$findView$default$2;-><init>(Landroid/view/View;IZ)V

    .line 28
    .line 29
    .line 30
    invoke-static {v1}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, Ldev/jahir/kuper/ui/viewholders/RequiredAppViewHolder;->title$delegate:Lp4/c;

    .line 35
    .line 36
    sget v0, Ldev/jahir/kuper/R$id;->stat_description:I

    .line 37
    .line 38
    new-instance v1, Ldev/jahir/kuper/ui/viewholders/RequiredAppViewHolder$special$$inlined$findView$default$3;

    .line 39
    .line 40
    invoke-direct {v1, p1, v0, v2}, Ldev/jahir/kuper/ui/viewholders/RequiredAppViewHolder$special$$inlined$findView$default$3;-><init>(Landroid/view/View;IZ)V

    .line 41
    .line 42
    .line 43
    invoke-static {v1}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iput-object v0, p0, Ldev/jahir/kuper/ui/viewholders/RequiredAppViewHolder;->description$delegate:Lp4/c;

    .line 48
    .line 49
    sget v0, Ldev/jahir/kuper/R$id;->required_app_button:I

    .line 50
    .line 51
    new-instance v1, Ldev/jahir/kuper/ui/viewholders/RequiredAppViewHolder$special$$inlined$findView$default$4;

    .line 52
    .line 53
    invoke-direct {v1, p1, v0, v2}, Ldev/jahir/kuper/ui/viewholders/RequiredAppViewHolder$special$$inlined$findView$default$4;-><init>(Landroid/view/View;IZ)V

    .line 54
    .line 55
    .line 56
    invoke-static {v1}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    iput-object p1, p0, Ldev/jahir/kuper/ui/viewholders/RequiredAppViewHolder;->button$delegate:Lp4/c;

    .line 61
    .line 62
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
.end method

.method public static synthetic a(Ld5/l;Ldev/jahir/kuper/data/models/RequiredApp;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ldev/jahir/kuper/ui/viewholders/RequiredAppViewHolder;->bind$lambda$0(Ld5/l;Ldev/jahir/kuper/data/models/RequiredApp;Landroid/view/View;)V

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

.method private static final bind$lambda$0(Ld5/l;Ldev/jahir/kuper/data/models/RequiredApp;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Ld5/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

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

.method private final getButton()Landroidx/appcompat/widget/v;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/kuper/ui/viewholders/RequiredAppViewHolder;->button$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/appcompat/widget/v;

    .line 8
    .line 9
    return-object v0
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

.method private final getDescription()Landroid/widget/TextView;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/kuper/ui/viewholders/RequiredAppViewHolder;->description$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/widget/TextView;

    .line 8
    .line 9
    return-object v0
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

.method private final getIcon()Landroidx/appcompat/widget/AppCompatImageView;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/kuper/ui/viewholders/RequiredAppViewHolder;->icon$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/appcompat/widget/AppCompatImageView;

    .line 8
    .line 9
    return-object v0
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

.method private final getTitle()Landroid/widget/TextView;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/kuper/ui/viewholders/RequiredAppViewHolder;->title$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/widget/TextView;

    .line 8
    .line 9
    return-object v0
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


# virtual methods
.method public final bind(Ldev/jahir/kuper/data/models/RequiredApp;Ld5/l;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldev/jahir/kuper/data/models/RequiredApp;",
            "Ld5/l;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "app"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "listener"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ldev/jahir/kuper/ui/viewholders/RequiredAppViewHolder;->getIcon()Landroidx/appcompat/widget/AppCompatImageView;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-static {p0}, Ldev/jahir/frames/extensions/views/ViewHolderKt;->getContext(Landroidx/recyclerview/widget/i2;)Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {p1}, Ldev/jahir/kuper/data/models/RequiredApp;->getIcon()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/4 v3, 0x0

    .line 26
    const/4 v4, 0x2

    .line 27
    invoke-static {v1, v2, v3, v4, v3}, Ldev/jahir/frames/extensions/context/ContextKt;->drawable$default(Landroid/content/Context;ILandroid/graphics/drawable/Drawable;ILjava/lang/Object;)Landroid/graphics/drawable/Drawable;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    invoke-static {p0}, Ldev/jahir/frames/extensions/views/ViewHolderKt;->getContext(Landroidx/recyclerview/widget/i2;)Landroid/content/Context;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    sget v5, Lcom/google/android/material/R$attr;->colorOnSurface:I

    .line 38
    .line 39
    invoke-static {p0}, Ldev/jahir/frames/extensions/views/ViewHolderKt;->getContext(Landroidx/recyclerview/widget/i2;)Landroid/content/Context;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    sget v7, Ldev/jahir/frames/R$color;->onSurface:I

    .line 44
    .line 45
    const/4 v8, 0x0

    .line 46
    invoke-static {v6, v7, v8, v4, v3}, Ldev/jahir/frames/extensions/context/ContextKt;->color$default(Landroid/content/Context;IIILjava/lang/Object;)I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    invoke-static {v2, v5, v3}, Ldev/jahir/frames/extensions/context/ContextKt;->resolveColor(Landroid/content/Context;II)I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    invoke-static {v1, v2}, Ldev/jahir/frames/extensions/resources/DrawableKt;->tint(Landroid/graphics/drawable/Drawable;I)Landroid/graphics/drawable/Drawable;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    :cond_0
    invoke-virtual {v0, v3}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 59
    .line 60
    .line 61
    :cond_1
    invoke-direct {p0}, Ldev/jahir/kuper/ui/viewholders/RequiredAppViewHolder;->getTitle()Landroid/widget/TextView;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    if-eqz v0, :cond_2

    .line 66
    .line 67
    invoke-virtual {p1}, Ldev/jahir/kuper/data/models/RequiredApp;->getName()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 72
    .line 73
    .line 74
    :cond_2
    invoke-direct {p0}, Ldev/jahir/kuper/ui/viewholders/RequiredAppViewHolder;->getDescription()Landroid/widget/TextView;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    if-eqz v0, :cond_3

    .line 79
    .line 80
    invoke-virtual {p1}, Ldev/jahir/kuper/data/models/RequiredApp;->getDescription()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 85
    .line 86
    .line 87
    :cond_3
    invoke-direct {p0}, Ldev/jahir/kuper/ui/viewholders/RequiredAppViewHolder;->getButton()Landroidx/appcompat/widget/v;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    if-eqz v0, :cond_4

    .line 92
    .line 93
    new-instance v1, Lcom/google/android/material/snackbar/a;

    .line 94
    .line 95
    const/16 v2, 0xc

    .line 96
    .line 97
    invoke-direct {v1, v2, p2, p1}, Lcom/google/android/material/snackbar/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 101
    .line 102
    .line 103
    :cond_4
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
