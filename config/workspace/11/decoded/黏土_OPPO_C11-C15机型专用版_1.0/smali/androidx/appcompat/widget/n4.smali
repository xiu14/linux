.class public final Landroidx/appcompat/widget/n4;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Landroid/view/View$OnLongClickListener;
.implements Landroid/view/View$OnHoverListener;
.implements Landroid/view/View$OnAttachStateChangeListener;


# static fields
.field public static r:Landroidx/appcompat/widget/n4;

.field public static s:Landroidx/appcompat/widget/n4;


# instance fields
.field public final h:Landroid/view/View;

.field public final i:Ljava/lang/CharSequence;

.field public final j:I

.field public final k:Landroidx/appcompat/widget/m4;

.field public final l:Landroidx/appcompat/widget/m4;

.field public m:I

.field public n:I

.field public o:Landroidx/appcompat/widget/o4;

.field public p:Z

.field public q:Z


# direct methods
.method public constructor <init>(Landroid/view/View;Ljava/lang/CharSequence;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/appcompat/widget/m4;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, Landroidx/appcompat/widget/m4;-><init>(Landroidx/appcompat/widget/n4;I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroidx/appcompat/widget/n4;->k:Landroidx/appcompat/widget/m4;

    .line 11
    .line 12
    new-instance v0, Landroidx/appcompat/widget/m4;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-direct {v0, p0, v1}, Landroidx/appcompat/widget/m4;-><init>(Landroidx/appcompat/widget/n4;I)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Landroidx/appcompat/widget/n4;->l:Landroidx/appcompat/widget/m4;

    .line 19
    .line 20
    iput-object p1, p0, Landroidx/appcompat/widget/n4;->h:Landroid/view/View;

    .line 21
    .line 22
    iput-object p2, p0, Landroidx/appcompat/widget/n4;->i:Ljava/lang/CharSequence;

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-static {p2}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    sget-object v0, Lm0/a1;->a:Ljava/lang/reflect/Method;

    .line 33
    .line 34
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 35
    .line 36
    const/16 v2, 0x1c

    .line 37
    .line 38
    if-lt v0, v2, :cond_0

    .line 39
    .line 40
    invoke-static {p2}, Lm0/y0;->a(Landroid/view/ViewConfiguration;)I

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-virtual {p2}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    div-int/lit8 p2, p2, 0x2

    .line 50
    .line 51
    :goto_0
    iput p2, p0, Landroidx/appcompat/widget/n4;->j:I

    .line 52
    .line 53
    iput-boolean v1, p0, Landroidx/appcompat/widget/n4;->q:Z

    .line 54
    .line 55
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnHoverListener(Landroid/view/View$OnHoverListener;)V

    .line 59
    .line 60
    .line 61
    return-void
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

.method public static b(Landroidx/appcompat/widget/n4;)V
    .locals 3

    .line 1
    sget-object v0, Landroidx/appcompat/widget/n4;->r:Landroidx/appcompat/widget/n4;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, v0, Landroidx/appcompat/widget/n4;->h:Landroid/view/View;

    .line 6
    .line 7
    iget-object v0, v0, Landroidx/appcompat/widget/n4;->k:Landroidx/appcompat/widget/m4;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 10
    .line 11
    .line 12
    :cond_0
    sput-object p0, Landroidx/appcompat/widget/n4;->r:Landroidx/appcompat/widget/n4;

    .line 13
    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Landroidx/appcompat/widget/n4;->h:Landroid/view/View;

    .line 17
    .line 18
    iget-object p0, p0, Landroidx/appcompat/widget/n4;->k:Landroidx/appcompat/widget/m4;

    .line 19
    .line 20
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    int-to-long v1, v1

    .line 25
    invoke-virtual {v0, p0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 26
    .line 27
    .line 28
    :cond_1
    return-void
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
.method public final a()V
    .locals 5

    .line 1
    sget-object v0, Landroidx/appcompat/widget/n4;->s:Landroidx/appcompat/widget/n4;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/appcompat/widget/n4;->h:Landroid/view/View;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ne v0, p0, :cond_2

    .line 7
    .line 8
    sput-object v2, Landroidx/appcompat/widget/n4;->s:Landroidx/appcompat/widget/n4;

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/appcompat/widget/n4;->o:Landroidx/appcompat/widget/o4;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v3, v0, Landroidx/appcompat/widget/o4;->b:Landroid/view/View;

    .line 15
    .line 16
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    if-eqz v4, :cond_0

    .line 21
    .line 22
    iget-object v0, v0, Landroidx/appcompat/widget/o4;->a:Landroid/content/Context;

    .line 23
    .line 24
    const-string v4, "window"

    .line 25
    .line 26
    invoke-virtual {v0, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Landroid/view/WindowManager;

    .line 31
    .line 32
    invoke-interface {v0, v3}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    iput-object v2, p0, Landroidx/appcompat/widget/n4;->o:Landroidx/appcompat/widget/o4;

    .line 36
    .line 37
    const/4 v0, 0x1

    .line 38
    iput-boolean v0, p0, Landroidx/appcompat/widget/n4;->q:Z

    .line 39
    .line 40
    invoke-virtual {v1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const-string v0, "TooltipCompatHandler"

    .line 45
    .line 46
    const-string v3, "sActiveHandler.mPopup == null"

    .line 47
    .line 48
    invoke-static {v0, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    :cond_2
    :goto_0
    sget-object v0, Landroidx/appcompat/widget/n4;->r:Landroidx/appcompat/widget/n4;

    .line 52
    .line 53
    if-ne v0, p0, :cond_3

    .line 54
    .line 55
    invoke-static {v2}, Landroidx/appcompat/widget/n4;->b(Landroidx/appcompat/widget/n4;)V

    .line 56
    .line 57
    .line 58
    :cond_3
    iget-object v0, p0, Landroidx/appcompat/widget/n4;->l:Landroidx/appcompat/widget/m4;

    .line 59
    .line 60
    invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 61
    .line 62
    .line 63
    return-void
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
.end method

.method public final c(Z)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/appcompat/widget/n4;->h:Landroid/view/View;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const/4 v2, 0x0

    .line 13
    invoke-static {v2}, Landroidx/appcompat/widget/n4;->b(Landroidx/appcompat/widget/n4;)V

    .line 14
    .line 15
    .line 16
    sget-object v2, Landroidx/appcompat/widget/n4;->s:Landroidx/appcompat/widget/n4;

    .line 17
    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-virtual {v2}, Landroidx/appcompat/widget/n4;->a()V

    .line 21
    .line 22
    .line 23
    :cond_1
    sput-object v0, Landroidx/appcompat/widget/n4;->s:Landroidx/appcompat/widget/n4;

    .line 24
    .line 25
    move/from16 v2, p1

    .line 26
    .line 27
    iput-boolean v2, v0, Landroidx/appcompat/widget/n4;->p:Z

    .line 28
    .line 29
    new-instance v2, Landroidx/appcompat/widget/o4;

    .line 30
    .line 31
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-direct {v2, v3}, Landroidx/appcompat/widget/o4;-><init>(Landroid/content/Context;)V

    .line 36
    .line 37
    .line 38
    iput-object v2, v0, Landroidx/appcompat/widget/n4;->o:Landroidx/appcompat/widget/o4;

    .line 39
    .line 40
    iget v3, v0, Landroidx/appcompat/widget/n4;->m:I

    .line 41
    .line 42
    iget v4, v0, Landroidx/appcompat/widget/n4;->n:I

    .line 43
    .line 44
    iget-boolean v5, v0, Landroidx/appcompat/widget/n4;->p:Z

    .line 45
    .line 46
    iget-object v6, v2, Landroidx/appcompat/widget/o4;->b:Landroid/view/View;

    .line 47
    .line 48
    invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    const-string v8, "window"

    .line 53
    .line 54
    iget-object v9, v2, Landroidx/appcompat/widget/o4;->a:Landroid/content/Context;

    .line 55
    .line 56
    if-eqz v7, :cond_2

    .line 57
    .line 58
    invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    if-eqz v7, :cond_2

    .line 63
    .line 64
    invoke-virtual {v9, v8}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    check-cast v7, Landroid/view/WindowManager;

    .line 69
    .line 70
    invoke-interface {v7, v6}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    .line 71
    .line 72
    .line 73
    :cond_2
    iget-object v7, v2, Landroidx/appcompat/widget/o4;->c:Landroid/widget/TextView;

    .line 74
    .line 75
    iget-object v10, v0, Landroidx/appcompat/widget/n4;->i:Ljava/lang/CharSequence;

    .line 76
    .line 77
    invoke-virtual {v7, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1}, Landroid/view/View;->getApplicationWindowToken()Landroid/os/IBinder;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    iget-object v10, v2, Landroidx/appcompat/widget/o4;->d:Landroid/view/WindowManager$LayoutParams;

    .line 85
    .line 86
    iput-object v7, v10, Landroid/view/WindowManager$LayoutParams;->token:Landroid/os/IBinder;

    .line 87
    .line 88
    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    sget v11, Lf/d;->tooltip_precise_anchor_threshold:I

    .line 93
    .line 94
    invoke-virtual {v7, v11}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 95
    .line 96
    .line 97
    move-result v7

    .line 98
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 99
    .line 100
    .line 101
    move-result v11

    .line 102
    const/4 v12, 0x2

    .line 103
    if-lt v11, v7, :cond_3

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_3
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    div-int/2addr v3, v12

    .line 111
    :goto_0
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 112
    .line 113
    .line 114
    move-result v11

    .line 115
    if-lt v11, v7, :cond_4

    .line 116
    .line 117
    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 118
    .line 119
    .line 120
    move-result-object v7

    .line 121
    sget v11, Lf/d;->tooltip_precise_anchor_extra_offset:I

    .line 122
    .line 123
    invoke-virtual {v7, v11}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 124
    .line 125
    .line 126
    move-result v7

    .line 127
    add-int v11, v4, v7

    .line 128
    .line 129
    sub-int/2addr v4, v7

    .line 130
    goto :goto_1

    .line 131
    :cond_4
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 132
    .line 133
    .line 134
    move-result v11

    .line 135
    const/4 v4, 0x0

    .line 136
    :goto_1
    const/16 v7, 0x31

    .line 137
    .line 138
    iput v7, v10, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 139
    .line 140
    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 141
    .line 142
    .line 143
    move-result-object v7

    .line 144
    if-eqz v5, :cond_5

    .line 145
    .line 146
    sget v14, Lf/d;->tooltip_y_offset_touch:I

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_5
    sget v14, Lf/d;->tooltip_y_offset_non_touch:I

    .line 150
    .line 151
    :goto_2
    invoke-virtual {v7, v14}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 152
    .line 153
    .line 154
    move-result v7

    .line 155
    invoke-virtual {v1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 156
    .line 157
    .line 158
    move-result-object v14

    .line 159
    invoke-virtual {v14}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 160
    .line 161
    .line 162
    move-result-object v15

    .line 163
    instance-of v13, v15, Landroid/view/WindowManager$LayoutParams;

    .line 164
    .line 165
    if-eqz v13, :cond_6

    .line 166
    .line 167
    check-cast v15, Landroid/view/WindowManager$LayoutParams;

    .line 168
    .line 169
    iget v13, v15, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 170
    .line 171
    if-ne v13, v12, :cond_6

    .line 172
    .line 173
    goto :goto_4

    .line 174
    :cond_6
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 175
    .line 176
    .line 177
    move-result-object v13

    .line 178
    :goto_3
    instance-of v15, v13, Landroid/content/ContextWrapper;

    .line 179
    .line 180
    if-eqz v15, :cond_8

    .line 181
    .line 182
    instance-of v15, v13, Landroid/app/Activity;

    .line 183
    .line 184
    if-eqz v15, :cond_7

    .line 185
    .line 186
    check-cast v13, Landroid/app/Activity;

    .line 187
    .line 188
    invoke-virtual {v13}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 189
    .line 190
    .line 191
    move-result-object v13

    .line 192
    invoke-virtual {v13}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 193
    .line 194
    .line 195
    move-result-object v14

    .line 196
    goto :goto_4

    .line 197
    :cond_7
    check-cast v13, Landroid/content/ContextWrapper;

    .line 198
    .line 199
    invoke-virtual {v13}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 200
    .line 201
    .line 202
    move-result-object v13

    .line 203
    goto :goto_3

    .line 204
    :cond_8
    :goto_4
    if-nez v14, :cond_9

    .line 205
    .line 206
    const-string v2, "TooltipPopup"

    .line 207
    .line 208
    const-string v3, "Cannot find app view"

    .line 209
    .line 210
    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 211
    .line 212
    .line 213
    const/16 v17, 0x1

    .line 214
    .line 215
    goto/16 :goto_7

    .line 216
    .line 217
    :cond_9
    iget-object v15, v2, Landroidx/appcompat/widget/o4;->e:Landroid/graphics/Rect;

    .line 218
    .line 219
    invoke-virtual {v14, v15}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 220
    .line 221
    .line 222
    const/16 v16, 0x2

    .line 223
    .line 224
    iget v12, v15, Landroid/graphics/Rect;->left:I

    .line 225
    .line 226
    if-gez v12, :cond_b

    .line 227
    .line 228
    iget v12, v15, Landroid/graphics/Rect;->top:I

    .line 229
    .line 230
    if-gez v12, :cond_b

    .line 231
    .line 232
    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 233
    .line 234
    .line 235
    move-result-object v12

    .line 236
    const/16 v17, 0x1

    .line 237
    .line 238
    const-string v13, "dimen"

    .line 239
    .line 240
    move/from16 v18, v3

    .line 241
    .line 242
    const-string v3, "android"

    .line 243
    .line 244
    move/from16 v19, v4

    .line 245
    .line 246
    const-string v4, "status_bar_height"

    .line 247
    .line 248
    invoke-virtual {v12, v4, v13, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 249
    .line 250
    .line 251
    move-result v3

    .line 252
    if-eqz v3, :cond_a

    .line 253
    .line 254
    invoke-virtual {v12, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 255
    .line 256
    .line 257
    move-result v3

    .line 258
    goto :goto_5

    .line 259
    :cond_a
    const/4 v3, 0x0

    .line 260
    :goto_5
    invoke-virtual {v12}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 261
    .line 262
    .line 263
    move-result-object v4

    .line 264
    iget v12, v4, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 265
    .line 266
    iget v4, v4, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 267
    .line 268
    const/4 v13, 0x0

    .line 269
    invoke-virtual {v15, v13, v3, v12, v4}, Landroid/graphics/Rect;->set(IIII)V

    .line 270
    .line 271
    .line 272
    goto :goto_6

    .line 273
    :cond_b
    move/from16 v18, v3

    .line 274
    .line 275
    move/from16 v19, v4

    .line 276
    .line 277
    const/4 v13, 0x0

    .line 278
    const/16 v17, 0x1

    .line 279
    .line 280
    :goto_6
    iget-object v3, v2, Landroidx/appcompat/widget/o4;->g:[I

    .line 281
    .line 282
    invoke-virtual {v14, v3}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 283
    .line 284
    .line 285
    iget-object v2, v2, Landroidx/appcompat/widget/o4;->f:[I

    .line 286
    .line 287
    invoke-virtual {v1, v2}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 288
    .line 289
    .line 290
    aget v4, v2, v13

    .line 291
    .line 292
    aget v12, v3, v13

    .line 293
    .line 294
    sub-int/2addr v4, v12

    .line 295
    aput v4, v2, v13

    .line 296
    .line 297
    aget v12, v2, v17

    .line 298
    .line 299
    aget v3, v3, v17

    .line 300
    .line 301
    sub-int/2addr v12, v3

    .line 302
    aput v12, v2, v17

    .line 303
    .line 304
    add-int v4, v4, v18

    .line 305
    .line 306
    invoke-virtual {v14}, Landroid/view/View;->getWidth()I

    .line 307
    .line 308
    .line 309
    move-result v3

    .line 310
    div-int/lit8 v3, v3, 0x2

    .line 311
    .line 312
    sub-int/2addr v4, v3

    .line 313
    iput v4, v10, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 314
    .line 315
    invoke-static {v13, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 316
    .line 317
    .line 318
    move-result v3

    .line 319
    invoke-virtual {v6, v3, v3}, Landroid/view/View;->measure(II)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    .line 323
    .line 324
    .line 325
    move-result v3

    .line 326
    aget v2, v2, v17

    .line 327
    .line 328
    add-int v4, v2, v19

    .line 329
    .line 330
    sub-int/2addr v4, v7

    .line 331
    sub-int/2addr v4, v3

    .line 332
    add-int/2addr v2, v11

    .line 333
    add-int/2addr v2, v7

    .line 334
    if-eqz v5, :cond_d

    .line 335
    .line 336
    if-ltz v4, :cond_c

    .line 337
    .line 338
    iput v4, v10, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 339
    .line 340
    goto :goto_7

    .line 341
    :cond_c
    iput v2, v10, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 342
    .line 343
    goto :goto_7

    .line 344
    :cond_d
    add-int/2addr v3, v2

    .line 345
    invoke-virtual {v15}, Landroid/graphics/Rect;->height()I

    .line 346
    .line 347
    .line 348
    move-result v5

    .line 349
    if-gt v3, v5, :cond_e

    .line 350
    .line 351
    iput v2, v10, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 352
    .line 353
    goto :goto_7

    .line 354
    :cond_e
    iput v4, v10, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 355
    .line 356
    :goto_7
    invoke-virtual {v9, v8}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v2

    .line 360
    check-cast v2, Landroid/view/WindowManager;

    .line 361
    .line 362
    invoke-interface {v2, v6, v10}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v1, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 366
    .line 367
    .line 368
    iget-boolean v2, v0, Landroidx/appcompat/widget/n4;->p:Z

    .line 369
    .line 370
    if-eqz v2, :cond_f

    .line 371
    .line 372
    const-wide/16 v2, 0x9c4

    .line 373
    .line 374
    goto :goto_9

    .line 375
    :cond_f
    sget-object v2, Lm0/w0;->a:Ljava/util/WeakHashMap;

    .line 376
    .line 377
    invoke-virtual {v1}, Landroid/view/View;->getWindowSystemUiVisibility()I

    .line 378
    .line 379
    .line 380
    move-result v2

    .line 381
    and-int/lit8 v2, v2, 0x1

    .line 382
    .line 383
    const/4 v3, 0x1

    .line 384
    if-ne v2, v3, :cond_10

    .line 385
    .line 386
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 387
    .line 388
    .line 389
    move-result v2

    .line 390
    int-to-long v2, v2

    .line 391
    const-wide/16 v4, 0xbb8

    .line 392
    .line 393
    :goto_8
    sub-long v2, v4, v2

    .line 394
    .line 395
    goto :goto_9

    .line 396
    :cond_10
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 397
    .line 398
    .line 399
    move-result v2

    .line 400
    int-to-long v2, v2

    .line 401
    const-wide/16 v4, 0x3a98

    .line 402
    .line 403
    goto :goto_8

    .line 404
    :goto_9
    iget-object v4, v0, Landroidx/appcompat/widget/n4;->l:Landroidx/appcompat/widget/m4;

    .line 405
    .line 406
    invoke-virtual {v1, v4}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 407
    .line 408
    .line 409
    invoke-virtual {v1, v4, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 410
    .line 411
    .line 412
    return-void
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
.end method

.method public final onHover(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    iget-object p1, p0, Landroidx/appcompat/widget/n4;->o:Landroidx/appcompat/widget/o4;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iget-boolean p1, p0, Landroidx/appcompat/widget/n4;->p:Z

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object p1, p0, Landroidx/appcompat/widget/n4;->h:Landroid/view/View;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-string v2, "accessibility"

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Landroid/view/accessibility/AccessibilityManager;

    .line 24
    .line 25
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    const/4 v2, 0x7

    .line 43
    if-eq v1, v2, :cond_3

    .line 44
    .line 45
    const/16 p1, 0xa

    .line 46
    .line 47
    if-eq v1, p1, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    const/4 p1, 0x1

    .line 51
    iput-boolean p1, p0, Landroidx/appcompat/widget/n4;->q:Z

    .line 52
    .line 53
    invoke-virtual {p0}, Landroidx/appcompat/widget/n4;->a()V

    .line 54
    .line 55
    .line 56
    return v0

    .line 57
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->isEnabled()Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_5

    .line 62
    .line 63
    iget-object p1, p0, Landroidx/appcompat/widget/n4;->o:Landroidx/appcompat/widget/o4;

    .line 64
    .line 65
    if-nez p1, :cond_5

    .line 66
    .line 67
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    float-to-int p1, p1

    .line 72
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    float-to-int p2, p2

    .line 77
    iget-boolean v1, p0, Landroidx/appcompat/widget/n4;->q:Z

    .line 78
    .line 79
    if-nez v1, :cond_4

    .line 80
    .line 81
    iget v1, p0, Landroidx/appcompat/widget/n4;->m:I

    .line 82
    .line 83
    sub-int v1, p1, v1

    .line 84
    .line 85
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    iget v2, p0, Landroidx/appcompat/widget/n4;->j:I

    .line 90
    .line 91
    if-gt v1, v2, :cond_4

    .line 92
    .line 93
    iget v1, p0, Landroidx/appcompat/widget/n4;->n:I

    .line 94
    .line 95
    sub-int v1, p2, v1

    .line 96
    .line 97
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-le v1, v2, :cond_5

    .line 102
    .line 103
    :cond_4
    iput p1, p0, Landroidx/appcompat/widget/n4;->m:I

    .line 104
    .line 105
    iput p2, p0, Landroidx/appcompat/widget/n4;->n:I

    .line 106
    .line 107
    iput-boolean v0, p0, Landroidx/appcompat/widget/n4;->q:Z

    .line 108
    .line 109
    invoke-static {p0}, Landroidx/appcompat/widget/n4;->b(Landroidx/appcompat/widget/n4;)V

    .line 110
    .line 111
    .line 112
    :cond_5
    :goto_0
    return v0
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

.method public final onLongClick(Landroid/view/View;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    div-int/lit8 v0, v0, 0x2

    .line 6
    .line 7
    iput v0, p0, Landroidx/appcompat/widget/n4;->m:I

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    div-int/lit8 p1, p1, 0x2

    .line 14
    .line 15
    iput p1, p0, Landroidx/appcompat/widget/n4;->n:I

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/n4;->c(Z)V

    .line 19
    .line 20
    .line 21
    return p1
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

.method public final onViewAttachedToWindow(Landroid/view/View;)V
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
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/n4;->a()V

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
.end method
